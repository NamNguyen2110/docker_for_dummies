DOCKERFILE 
1. mvn package
This command line allows maven creates a jar file which was built for java application and located in target folder
2. Dockerfile 
This helps docker to know what library, or the images need for Spring Boot application
   Let me explain some elements in Dockerfile:
   - FROM adoptopenjdk/openjdk11:alpine-jre
    Pull java image from docker hub, because all java application must be compiled on Java Virtual Machine. It means your
     application needs to have the environment for Java running, so that why wants it
   - ARG JAR_FILE=target/docker-0.0.1-SNAPSHOT.jar
    Pick jar file up from target folder and assigned to JAR_FILE
   - COPY ${JAR_FILE} hello-docker.jar
   - ENTRYPOINT ["java","-jar","hello-docker.jar"]
    Get entrypoint from your application and use docker command line with hello-docker.jar
3. Docker build 
   - Docker build has the responsibility building your application to an image and package it  
    docker build -t hello-docker . 
     Note: "."
4. Docker run
   - After the application had become an image, it changes to container
    docker run -d -p 8080:8080 hello-docker
------------------------------------------------------------------------------------------------------------------------
DOCKER_COMPOSE


    
