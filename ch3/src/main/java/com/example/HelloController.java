package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {

    @Value("${target:local}")
    String target;

    @GetMapping("/") 
    public String hello()
    {
        return String.format("scd-on-gcp app running in target: %s !!", target);
    }
}
