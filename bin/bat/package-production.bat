@echo off
rem /**
rem  * ���벢�����Ŀ
rem  * author : pigo��
rem  * email : rushingpig@163.com
rem  * datetime : 2015-08-19
rem  */
echo.
echo [===��Ϣ===] ���벢�����Ŀ������production����war�ļ�
echo.

echo.

cd %~dp0
cd..

call mvn clean package -Dmaven.test.skip=true -P production

cd bin
pause