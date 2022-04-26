package com.example.nlp_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NlpProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(NlpProjectApplication.class, args);
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the NLP Project!";
    }
}
