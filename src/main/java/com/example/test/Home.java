package com.example.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = "com/example/test")
public class Home {


    @GetMapping("/")
    public String hello(){
        return "WELCOME TO SPRING BOOT APP";
    }
}
