#!/bin/bash

#全局参数
dir=""
backups_dir=""
type=""

#服务器
ip=""
port=""

#登录信息
username=""
password=""

#数据库信息
db=""
schema=""


#解析参数
echo "Parse startup parameters"
for arg in "$@"; do
  case $arg in
    -d)
      dir=$2
      shift 2
      ;;
    -t)
      type=$2
      shift 2
      ;;
    -u)
      username=$2
      shift 2
      ;;
    -p)
      password=$2
      shift 2
      ;;
    -i)
      ip=$2
      shift 2
      ;;
    -P)
      port=$2
      shift 2
      ;;
    -B)
      backups_dir=$2
      shift 2
      ;;
    -D)
      db=$2
      shift 2
      ;;
    -s)
      schema=$2
      shift 2
      ;;
  esac
done

#数据库可执行文件地址
#db_dir=${dir}/embbed/pgsql-10.23/bin
db_dir=/usr/bin

#效验参数
valid_overall_parameters(){
  if [ -z "${dir}" ]; then
    echo "The script address cannot be empty"
    exit 1
  fi
  if [ -z "${type}" ]; then
      echo "Execution type cannot be empty"
      exit 1
  fi
}

#效验备份数据
valid_parameters(){
  if [ -z "${username}" ]; then
    echo "The script address cannot be empty!"
    exit 1
  fi
  if [ -z "${password}" ]; then
      echo "Backup data database password cannot be empty!"
      exit 1
  fi
  if [ -z "${db}" ]; then
      echo "Backup data database db cannot be empty!"
      exit 1
  fi
  if [ -z "${db_dir}" ]; then
    echo "Backup data database db_dir cannot be empty!"
    exit 1
  fi
  if [ -z "${ip}" ]; then
      echo "Backup data database ip cannot be empty!"
      exit 1
  fi
  if [ -z "${port}" ]; then
      echo "Backup data database port cannot be empty!"
      exit 1
  fi
  if [ -z "${backups_dir}" ]; then
      echo "Backup data database backups_dir cannot be empty!"
      exit 1
  fi
}

backups(){
  valid_parameters
  echo " export PGPASSWORD=${password} && ${db_dir}/pg_dump -U ${username} -d ${db} -n ${schema} -h ${ip} -p ${port} -f ${backups_dir}"
  export PGPASSWORD=${password} && ${db_dir}/pg_dump -U ${username} -d ${db} -n ${schema} -h ${ip} -p ${port} -f ${backups_dir}
}

restore(){
  valid_parameters
  export PGPASSWORD=${password} &&  ${db_dir}/psql -U ${username} -d ${db} -n ${schema} -h ${ip} -p ${port} -f ${backups_dir}
}

if [ "${type}" = "backups" ]; then
  echo "begin backups......"
  backups
else
  echo "begin restore......"
  restore
fi




















