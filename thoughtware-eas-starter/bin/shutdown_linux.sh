#!/bin/sh

DIRS=$(dirname "$PWD")
JAVA_HOME="/usr/local/jdk-17.0.7"

JDK_VERSION=jdk-16.0.2

#判断是否自定义jdk
JAVA_HOME="/usr/local/${JDK_VERSION}"
if [ -e "${DIRS}/embbed/${JDK_VERSION}" ]; then
      JAVA_HOME="${DIRS}/embbed/${JDK_VERSION}"
fi

APP_MAIN="io.thoughtware.eas.starter.EasApplication"

PID=0
getPID(){
    javaps=`$JAVA_HOME/bin/jps -l | grep $APP_MAIN`
    if [ -n "$javaps" ]; then
        PID=`echo $javaps | awk '{print $1}'`
    else
        PID=0
    fi
}

shutdown(){
    getPID
    echo "================================================================================================================"
    if [ $PID -ne 0 ]; then
        echo -n "stopping $APP_MAIN(PID=$PID)..."
        kill -9 $PID
        if [ $? -eq 0 ]; then
            echo "[success]"
            echo "================================================================================================================"
        else
            echo "[failed]"
            echo "================================================================================================================"
        fi

        getPID

        if [ $PID -ne 0 ]; then
            shutdown
        fi
    else
        echo "$APP_MAIN is not running"
        echo "================================================================================================================"
    fi
}

shutdown














