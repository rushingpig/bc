#/bin/bash

#编译工程项目

maven=`which mvn`

mvn clean -Dskip.test=true