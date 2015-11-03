@echo off
rem /**
rem  * 利用mybatis-generator生成文件
rem  * author : pigo残
rem  * email : rushingpig@163.com
rem  * datetime : 2015-08-19
rem  */
echo.
echo [===信息===] 自动生成mybatis的相应文件...
echo.

echo.

cd %~dp0
cd..
cd mybatis-generator

call java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite

cd ..
cd bin
pause
