FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /app/vsap
ARG JAR_FILE=target/docker-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} vsap.jar
ENTRYPOINT ["java","-jar","docker.jar"]
