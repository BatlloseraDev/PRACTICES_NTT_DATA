package com.gradle2.gradle2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @GetMapping
    public String hola(){
        return "Hello world GRADLE";
    }
}
