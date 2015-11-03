@echo off
rem /**
rem  * 编译并打包项目
rem  * author : pigo残
rem  * email : rushingpig@163.com
rem  * datetime : 2015-08-19
rem  */
echo.
echo [===信息===] 编译并打包项目，生成production环境war文件
echo.

echo.

cd %~dp0
cd..

call mvn clean package -Dmaven.test.skip=true -P production

cd bin
pause