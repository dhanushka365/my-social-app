package com.mycompany.mysocialapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SocialController {

    @GetMapping("/greet")
    public String greet(){
        return "welcome to Home";
    }
}
