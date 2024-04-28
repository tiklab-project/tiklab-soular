#!/bin/sh
#-------------------------------------------------------------------------------------------------------------
DIRS=$(dirname "$PWD")

APP_MAIN="io.thoughtware.eas.starter.EasApplication"

JDK_VERSION=jdk-16.0.2
PGSQL_VERSION=pgsql-10.23
if [ -d "${DIRS}/embbed/${JDK_VERSION}" ]; then
    echo "使用内嵌jdk"
    JAVA_HOME="${DIRS}/embbed/${JDK_VERSION}"
else
    JAVA_HOME="/usr/local/jdk-17.0.7"
fi


echo "解压文件....."
tar -xvf "${DIRS}/embbed/${PGSQL_VERSION}/${PGSQL_VERSION}.tar.gz" -C "${DIRS}/embbed"
echo "解压完成!"

#-------------------------------------------------------------------------------------------------------------
#       系统运行参数
#-------------------------------------------------------------------------------------------------------------

DIR=$(cd "$(dirname "$0")"; pwd)
APP_HOME=${DIR}/..
APP_CONFIG=${APP_HOME}/conf/application-${env}.properties
APP_LOG=${APP_HOME}/logs

export APP_HOME
#export app.home=$APP_HOME

JAVA_OPTS="$JAVA_OPTS -server -Xms512m -Xmx512m -Xmn128m -XX:ParallelGCThreads=20 -XX:+UseParallelGC -XX:MaxGCPauseMillis=850 -Xloggc:$APP_LOG/gc.log -Dfile.encoding=UTF-8"
JAVA_OPTS="$JAVA_OPTS -DlogPath=$APP_LOG -Duser.timezone=GMT+08"
JAVA_OPTS="$JAVA_OPTS -Dconf.config=file:${APP_CONFIG}"
JAVA_OPTS="$JAVA_OPTS --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.sql/java.sql=ALL-UNNAMED  -classpath"

CLASSPATH=${APP_HOME}/conf

#加载私有依赖
for appJar in "$APP_HOME"/lib/*.jar;
do
   CLASSPATH="$CLASSPATH":"$appJar"
done
#加载公共依赖
for appJar in "$DIRS"/comment/*.jar;
do
   CLASSPATH="$CLASSPATH":"$appJar"
done


echo "JAVA_HOME="$JAVA_HOME
echo "JAVA_OPTS="$JAVA_OPTS
echo "CLASSPATH="$CLASSPATH
echo "APP_HOME="$APP_HOME
echo "APP_MAIN="$APP_MAIN

#-------------------------------------------------------------------------------------------------------------
#   程序开始
#-------------------------------------------------------------------------------------------------------------

PID=0

getPID(){
    javaps=`$JAVA_HOME/bin/jps -l | grep $APP_MAIN`
    if [ -n "$javaps" ]; then
        PID=`echo $javaps | awk '{print $1}'`
    else
        PID=0
    fi
}

startup(){
    getPID
    echo "================================================================================================================"
    if [ $PID -ne 0 ]; then
        echo "$APP_MAIN already started(PID=$PID)"
        echo "================================================================================================================"
    else
        echo -n "starting $APP_MAIN"
        if [ ! -d "$APP_LOG" ]; then
            mkdir "$APP_LOG"
        fi

#        nohup $JAVA_HOME/bin/java $JAVA_OPTS $CLASSPATH $APP_MAIN  > info.log 2>&1 &
        nohup $JAVA_HOME/bin/java $JAVA_OPTS $CLASSPATH $APP_MAIN > /dev/null 2>&1 &

        for i in $(seq 5)
        do
          sleep 0.8
          echo -e  ".\c"
        done

        getPID

        if [ $PID -ne 0 ]; then
            echo "(PID=$PID)...[success]"
            echo "================================================================================================================"
        else
            echo "[failed]"
            echo "================================================================================================================"
        fi
    fi
}

startup

