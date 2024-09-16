package com.example.springkubernetetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class SpringkubernetetestApplication {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World! You are running Spring Boot using Kubernetes";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringkubernetetestApplication.class, args);
    }

}
