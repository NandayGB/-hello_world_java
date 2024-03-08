package com.helloworldnanday.helloworldnanday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsms")
    public List<String> getBSMs() {
        return Arrays.asList("BSM1", "BSM2", "BSM3");
    }

    @GetMapping("/objectives")
    public List<String> getLearningObjectives() {
        return Arrays.asList("Aprender a usar Spring Boot", "Estudar mais sobre MySQL", "Terminar todos os exercícios");
    }
}