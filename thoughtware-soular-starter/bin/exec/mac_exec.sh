#!/bin/bash
# cd "$(dirname "$0")" || exit
DIRS="$(dirname "$(dirname "$0")")"
cd "${DIRS}" || exit

APP_MAIN="io.thoughtware.arbess.starter.ArbessEeApplication"

YAML=${DIRS}/conf/application.yaml
ip_address=$(ifconfig | grep -Eo 'inet (addr:)?([0-9]*\.){3}[0-9]*' | grep -Eo '([0-9]*\.){3}[0-9]*' | grep -v '127.0.0.1' | head -n 1)
server_port=$(awk -F": *" '/^server:/ {
      inf=1
      next
  }
  inf && /^  port:/ {
      print $2
      exit
  }' "${YAML}")
echo "Apply Server Port: ${server_port}"

JDK_VERSION=jdk-16.0.2
valid_jdk(){
  if [ -d "${DIRS}/embbed/${JDK_VERSION}" ]; then
      echo "user embbed jdk ${JAVA_HOME}"
      JAVA_HOME="${DIRS}/embbed/${JDK_VERSION}"
  else
      echo "Unable to find embbed jdk!"
      exit 1;
  fi
}

valid_jdk

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
  # shellcheck disable=SC2164
  cd "${DIRS}/bin" ; sh startup.sh

  # shellcheck disable=SC2034
  for i in $(seq 6); do
       printf "."
       sleep 1
   done
  open "http://${ip_address}:${server_port}"
}

db_port="0"
pg_port(){
    db_port=$(awk -F": *" '/^postgresql:/ {
        inf=1
        next
    }
    inf && /^  db:/ {
        db=1
        next
    }
    db && /^    port:/ {
        print $2
        exit
    }' "${YAML}")

   echo "PostgreSQL start Port: ${db_port}"
}

db_enable="false"
pg_enable(){
    db_enable=$(awk -F": *" '/^postgresql:/ {
        inf=1
        next
    }
    inf && /^  embbed:/ {
        embbed=1
        next
    }
    embbed && /^    enable:/ {
        print $2
        exit
    }' "${YAML}")

   echo "PostgreSQL embbed enable: ${db_enable}"
}

valid_pgsql(){
  result=$(lsof -i :${db_port} -sTCP:LISTEN)
  # shellcheck disable=SC2039
  if [[ -n "$result" ]]; then
     # shellcheck disable=SC2164
     echo echo "数据库端口${db_port}被占用!"
     exit 1
  fi
}

pgsql(){
  pg_enable
  if [ "${db_enable}" = "true" ]; then
       pg_port
        if [ "${db_port}" = "0" ]; then
            echo "find pgsql port error!"
            exit 1
        fi

        result=$(lsof -i :${db_port} -sTCP:LISTEN)
        # shellcheck disable=SC2039
        if [[ -n "$result" ]]; then
             # shellcheck disable=SC2164
             cd "${DIRS}/bin" ; sh shutdown.sh
        fi
        valid_pgsql
  fi
}

is_not_start(){
  result=$(lsof -i :${server_port} -sTCP:LISTEN)

  # shellcheck disable=SC2039
  if [[ -n "$result" ]]; then
      echo "${server_port}端口被占用"
  else
      pgsql
      startup
  fi
}

getPID
if [ $PID -ne 0 ]; then
    open "http://${ip_address}:${server_port}"
else
    is_not_start
fi
