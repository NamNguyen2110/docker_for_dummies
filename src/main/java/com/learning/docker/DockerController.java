package com.learning.docker;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DockerController {
    private final DockerRepository dockerRepo;

    @GetMapping("")
    public List<Docker> helloDocker() {
        List<Docker> dockers = Arrays.asList(
                new Docker(1, "hello-docker", "hello-docker"),
                new Docker(2, "mysql:5.7", "mysql_database"),
                new Docker(3, "portainer/portainer-ce:2.0.0", "portainer")
        );
        return dockerRepo.saveAll(dockers);
    }
}
