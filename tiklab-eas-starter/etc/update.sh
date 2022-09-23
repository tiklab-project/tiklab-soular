DIR=$(dirname "$PWD")

APP_NAME=eas

IP=172.12.1.30

JAR=tiklab-update-starter-1.0.0-SNAPSHOT.jar

cd ${DIR}/bin && sh shutdown.sh

cd ${DIR}/lib && java -jar ${JAR} ${IP} ${APP_NAME} ${DIR}
