docker-compose kill hello-docker
mvn package
docker image rm -f hello-docker
docker-compose up hello-docker
