@echo off
chcp 65001 > nul

REM 获取系统文件地址
set CurrentPath=%~dp0
set P1Path=
:begin
for /f "tokens=1,* delims=\" %%i in ("%CurrentPath%") do (set content=%%i&&set CurrentPath=%%j)
if "%P1Path%%content%\" == "%~dp0" goto end

set P1Path=%P1Path%%content%\

goto begin

:end

set DIRS=%P1Path%
REM 输出基本文件地址
echo DIRS:%DIRS%

REM 内嵌应用地址
set EMBEDDED_DIR=%DIRS%embbed
echo EMBEDDED_DIR:%EMBEDDED_DIR%

REM JDK路径
set JAVA_HOME=%EMBEDDED_DIR%\jdk-16.0.2
echo JAVA_HOME:%JAVA_HOME%
if not exist "%JAVA_HOME%" (
    echo Unable to obtain the JAVA_HOME path!
    goto :start_error
)

set JAR_DIR=

for /r "%DIR%\lib" %%f in (*tiklab-install-starter*.jar) do (
  set JAR_DIR=%%f
)

if "%JAR_DIR%"=="" (
  echo 没有找到升级程序！
)

cd %JAVA_HOME%\bin

.\java.exe -jar -Dfiledir="%DIR%" "%JAR_DIR%"

cd %DIR%\bin