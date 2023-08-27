FROM openjdk:17-jdk-slim-buster
LABEL authors="liuzhijun"
WORKDIR /usr/local/webapps/docker_example/
ADD docker_example-0.0.1-SNAPSHOT.jar .
ADD application.properties .
EXPOSE 8080
CMD ["java", "-jar", "docker_example-0.0.1-SNAPSHOT.jar"]
