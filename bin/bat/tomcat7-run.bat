@echo off
rem /**
rem  * ���벢�����Ŀ
rem  * author : pigo��
rem  * email : rushingpig@163.com
rem  * datetime : 2015-08-19
rem  */
echo.
echo [===��Ϣ===] ���벢�����Ŀ������war�ļ�
echo.

echo.

cd %~dp0
cd..

set MAVEN_OPTS=%MAVEN_OPTS% -Xms256m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m
call mvn tomcat7:run

cd bin
pause
