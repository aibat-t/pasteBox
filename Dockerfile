FROM amazoncorretto:11
EXPOSE 8000
MAINTAINER Aibat Tozhybayev
COPY target/paste-box.jar paste-box.jar
ENTRYPOINT ["java", "-jar", "/paste-box.jar"]