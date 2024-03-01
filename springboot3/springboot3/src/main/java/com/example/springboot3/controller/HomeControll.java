package com.example.springboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControll {
    @GetMapping("/")
    public String home(){
        return "hello,home";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello ,secured";
    }

}
