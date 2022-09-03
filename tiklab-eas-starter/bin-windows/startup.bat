
@echo off

set CurrentPath=%~dp0

set P1Path=

:begin
for /f "tokens=1,* delims=\" %%i in ("%CurrentPath%") do (set content=%%i&&set CurrentPath=%%j)
if "%P1Path%%content%\" == "%~dp0" goto end

set P1Path=%P1Path%%content%\

goto begin

:end

set DIRS=%P1Path%
set JAVA_HOME=%4

if %5 equ 1 (set JAVA_HOME="/usr/local/jdk-16.0.2")

echo %DIRS%

set APP_MAIN=com.tiklab.eas.EasApplication

set APP_HOME=%DIRS%

set APP_CONFIG=%DIRS%conf\application-dev.properties

set CLASSPATH=%DIRS%conf\

set APP_LOG=%DIRS%logs\

set JAVA_OPTS=-server -Xms512m -Xmx512m -Xmn128m -XX:ParallelGCThreads=20 -XX:+UseParallelGC -XX:MaxGCPauseMillis=850 -Xloggc:%APP_LOG%gc.log
set JAVA_OPTS=%JAVA_OPTS% --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.sql/java.sql=ALL-UNNAMED  -classpath

set public=%DIRS%lib\
@echo off & setlocal enabledelayedexpansion
for /f "delims=" %%i in ('dir /b /s "%public%"') do (set s=!s!%public%%%~nxi;)

set comment=%DIRS%co\
@echo off & setlocal enabledelayedexpansion
for /f "delims=" %%i in ('dir /b /s "%comment%"') do (set st=!st!%comment%%%~nxi;)

set CLASSPATH=%st%%s%

set PID=0

set EAS_CONFIG_ARRAY= "--server.port=%6 --jdbc.url=%1 --jdbc.username=%2 --jdbc.password=%3 --jdbc.driverClassName=$7"

for /f "usebackq tokens=1-2" %%a in (`jps -l ^| findstr %APP_MAIN%`) do (
set PID=%%a
)

if %PID% == 0 (
    cd %JAVA_HOME%\bin
    start /b .\java.exe %JAVA_OPTS%  %CLASSPATH%  %APP_MAIN%  %EAS_CONFIG_ARRAY%>> %DIRS%info.log

    echo %APP_MAIN% START STARTING.............

) else (
    echo ================================================================================================================
    echo %APP_MAIN% already started(PID=%PID%)
   )

for /l %%i in (1,1,100000) do echo %%i>>nul

set state=
    for /f "usebackq tokens=1-2" %%c in (`jps -l ^| findstr %APP_MAIN%`) do (
    set state=%%c
    )

  if %state% == 0 (
    echo ================================================================================================================
    echo %APP_MAIN% START FAIL(PID=%state%)
    ) else (
    echo ================================================================================================================
    echo %APP_MAIN% START SUCCESS(PID=%state%)
    )
  echo ================================================================================================================

















