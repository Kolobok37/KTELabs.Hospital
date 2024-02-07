FROM amazoncorretto:17-alpine-jdk
ARG JAR_FILE=target/ewm-service-0.0.1-SNAPSHOT.jar
COPY target/*.jar app.jar
WORKDIR /java
ENTRYPOINT ["java","-jar","/app.jar"]