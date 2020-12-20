Для подключения зависимости:

mvn install:install-file -Dfile=src\lib\dummy-connector.jar -DgroupId=com.h -DartifactId=dummy-connector -Dversion=1.0 -Dpackaging=jar

Для запуска первой задачи:

java -jar .\target\homeworkMaven-1.0_2-jar-with-dependencies.jar

Для запуска второй задачи: 

java -jar .\target\homeworkMaven-1.0_1-jar-with-dependencies.jar "path-file"
