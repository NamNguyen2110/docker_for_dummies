package com.learning.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("")
    public String helloDocker() {
        System.out.println("Hello Docker");
        return "Hello Docker !!";
    }
}
