FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER namnguyen2110
ARG JAR_FILE=target/docker-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} hello-docker.jar
ENTRYPOINT ["java","-jar","hello-docker.jar"]
