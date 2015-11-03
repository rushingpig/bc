@echo off
rem /**
rem  * clean项目
rem  * author : pigo残
rem  * email : rushingpig@163.com
rem  * datetime : 2015-08-19
rem  */
echo.
echo [===信息===] clean项目
echo.

echo.

cd %~dp0
cd..

call mvn clean -X -Dmaven.test.skip=true 

cd bin
pause