@echo off
rem /**
rem  * ����mybatis-generator�����ļ�
rem  * author : pigo��
rem  * email : rushingpig@163.com
rem  * datetime : 2015-08-19
rem  */
echo.
echo [===��Ϣ===] �Զ�����mybatis����Ӧ�ļ�...
echo.

echo.

cd %~dp0
cd..
cd mybatis-generator

call java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite

cd ..
cd bin
pause
