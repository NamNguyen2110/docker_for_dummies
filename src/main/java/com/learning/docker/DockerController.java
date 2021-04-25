package com.learning.docker;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DockerController {

    @GetMapping("")
    public String helloDocker() {
        return "Deploy to Heroku";
    }
}
