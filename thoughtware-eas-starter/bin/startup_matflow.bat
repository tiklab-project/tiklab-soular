
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

set APP_MAIN=net.tiklab.matflow.MatFlowApplication

set JAVA_HOME=%DIRS%jdk-16.0.2

echo %DIRS%

IF EXIST %DIR%temp (
  cd %DIRS%
  md logs
  xcopy /E %DIRS%temp\*.* %DIRS%
) else (
   echo ""
)

set APP_HOME=%DIRS%

set CLASSPATH=%DIRS%conf\

set APP_LOG=%DIRS%logs\

set JAVA_OPTS=-server -Xms512m -Xmx512m -Xmn128m -XX:ParallelGCThreads=20 -XX:+UseParallelGC -XX:MaxGCPauseMillis=850 -Xloggc:%APP_LOG%gc.log
set JAVA_OPTS=%JAVA_OPTS% --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.sql/java.sql=ALL-UNNAMED  -classpath

set public=%DIRS%lib\
@echo off & setlocal enabledelayedexpansion
for /f "delims=" %%i in ('dir /b /s "%public%"') do (set s=!s!%public%%%~nxi;)

set comment=%DIRS%tiklab-eas\comment\
@echo off & setlocal enabledelayedexpansion
for /f "delims=" %%i in ('dir /b /s "%comment%"') do (set st=!st!%comment%%%~nxi;)

set CLASSPATH=%st%%s%

echo %CLASSPATH%
call:judge
call:status

:GetPID
set PID=0
for /f "usebackq tokens=1-2" %%a in (`jps -l ^| findstr %APP_MAIN%`) do (set PID=%%a)
goto:eof

:judge
call:GetPID
if %PID%==0 (
    call:start
    for /l %%i in (1,1,100000) do echo %%i>>nul
) else (
    echo ================================================================================================================
    echo %APP_MAIN% already started(PID=%PID%)
)
goto:eof

:start
cd %JAVA_HOME%\bin
start /b .\java.exe %JAVA_OPTS%  %CLASSPATH%  %APP_MAIN% >> %DIRS%info.log
echo %APP_MAIN% START STARTING.............
goto:eof

:status
call:GetPID
if %PID%==0 (
     echo ================================================================================================================
     echo %APP_MAIN% START FAIL
) else (
     echo %APP_MAIN% START SUCCESS(PID=%state%)
)
goto:eof




















