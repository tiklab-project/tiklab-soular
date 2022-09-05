#!/bin/sh
#-------------------------------------------------------------------------------------------------------------
#该脚本的使用方式为-->[sh startup-enable.sh]
#该脚本可在服务器上的任意目录下执行,不会影响到日志的输出位置等
#-------------------------------------------------------------------------------------------------------------
#export JAVA_HOME=$4

DIRS=$(dirname "$PWD")

echo "启动应用程序"

JDK_HOME=$(dirname "$PWD")
JAVA_HOME=${JDK_HOME}/jdk-16.0.2
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.0.2.jdk/Contents/Home
#-------------------------------------------------------------------------------------------------------------
#       系统运行参数
#-------------------------------------------------------------------------------------------------------------
APP_MAIN="com.tiklab.eas.enable.EasInlineApplication"

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


#-------------------------------------------------------------------------------------------------------------
#       拼接shell脚本参数
#-------------------------------------------------------------------------------------------------------------
$(> temp)
# shellcheck disable=SC2068
for i in $@; do
    echo ${i} " " >> temp
done

# str取temp文本里的字符串
eas_shell=$(cat temp)
# 将字符串最后的一个空格去掉
eas_shell=${eas_shell%*" "}


echo "读取遍历的参数======="
echo $eas_shell

#EAS_CONFIG_ARRAY=("--server.port=$1" "--jdbc.url=$2" "--jdbc.username=$3" "--jdbc.password=$4" "--jdbc.driverClassName=$5" "--eas.embbed.enable=$6" "--mysql.embbed.enable=$7" "--mysql.name=$8" "--eas.web.address=$9" "--eas.address=$10")
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
#        nohup $JAVA_HOME/bin/java $JAVA_opens $JAVA_OPTS -classpath $CLASSPATH $APP_MAIN --jdbc.url="jdbc:mysql://172.10.1.10:3306/tiklab_eas?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true" --server.port=8086 --jdbc.username=root --jdbc.password=darth2020 --jdbc.driverClassName="com.mysql.cj.jdbc.Driver" --eas.embbed.enable=false --mysql.embbed.enable=true --mysql.name=tiklab_eas --eas.web.address="http:lodalhost:3305" --eas.address="http:lodalhost:3305"> eas.log 2>&1 &
        nohup $JAVA_HOME/bin/java $JAVA_opens $JAVA_OPTS -classpath $CLASSPATH $APP_MAIN $eas_shell
        # shellcheck disable=SC2034
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