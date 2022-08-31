#!/bin/sh
#-------------------------------------------------------------------------------------------------------------
#该脚本的使用方式为-->[sh startup-enable.sh]
#该脚本可在服务器上的任意目录下执行,不会影响到日志的输出位置等
#-------------------------------------------------------------------------------------------------------------
export JAVA_HOME=$4
#if [ ! -n "$JAVA_HOME" ]; then
#    export JAVA_HOME="/usr/local/jdk-16.0.2"
#fi

if [ $5 == 1 ]; then
    export JAVA_HOME="/usr/local/jdk-16.0.2"
fi
#-------------------------------------------------------------------------------------------------------------
#       系统运行参数
#-------------------------------------------------------------------------------------------------------------
APP_MAIN="com.tiklab.eas.EasApplication"

DIR=$(cd "$(dirname "$0")"; pwd)
APP_HOME=${DIR}/..
APP_CONFIG=${APP_HOME}/conf/application-${env}.properties
APP_LOG=${APP_HOME}/logs

export APP_HOME

JAVA_OPTS="$JAVA_OPTS -server -Xms512m -Xmx512m -Xmn128m -XX:ParallelGCThreads=20 -XX:+UseParallelGC -XX:MaxGCPauseMillis=850 -Xloggc:$APP_LOG/gc.log -Dfile.encoding=UTF-8"
JAVA_OPTS="$JAVA_OPTS -DlogPath=$APP_LOG"
JAVA_OPTS="$JAVA_OPTS -Dconf.config=file:${APP_CONFIG}"
JAVA_opens="--add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.sql/java.sql=ALL-UNNAMED"

CLASSPATH=${APP_HOME}/conf
for appJar in "$APP_HOME"/lib/*.jar;
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

# shellcheck disable=SC2120
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

        if [ $5 -eq 1 ]; then
            nohup $JAVA_HOME/bin/java $JAVA_opens $JAVA_OPTS -classpath $CLASSPATH $APP_MAIN > info.log 2>&1 &
        else
          nohup $JAVA_HOME/bin/java $JAVA_opens $JAVA_OPTS -classpath $CLASSPATH $APP_MAIN "--jdbc.url=$1 --jdbc.username=$2 --jdbc.password=$3"> info.log 2>&1 &
        fi
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