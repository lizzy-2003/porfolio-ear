FROM amazoncorretto:11-alpine-jdk
MAINTAINER EAR
COPY target/EAR-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
