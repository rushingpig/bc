@echo off
rem /**
rem  * clean��Ŀ
rem  * author : pigo��
rem  * email : rushingpig@163.com
rem  * datetime : 2015-08-19
rem  */
echo.
echo [===��Ϣ===] clean��Ŀ
echo.

echo.

cd %~dp0
cd..

call mvn clean -X -Dmaven.test.skip=true 

cd bin
pause