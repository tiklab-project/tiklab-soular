#!/bin/sh
if [ ! -n "$JAVA_HOME" ]; then
    export JAVA_HOME="/export/server/jdk1.8.0_141"
fi

#APP_MAIN=${application.main.class}
APP_MAIN="com.doublekit.portal.MessageApplication"

PID=0
getPID(){
    javaps=`$JAVA_HOME/bin/jps -l | grep $APP_MAIN`
    if [ -n "$javaps" ]; then
        PID=`echo $javaps | awk '{print $1}'`
    else
        PID=0
    fi
}

status(){
    getPID
    echo "================================================================================================================"
    if [ $PID -ne 0 ]; then
        echo "$APP_MAIN is running(PID=$PID)"
        echo "================================================================================================================"
    else
        echo "$APP_MAIN is not running"
        echo "================================================================================================================"
    fi
}

status