package com.jorgezevallos.helloword.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
    
    @GetMapping("/hello")
    public String wellcome(){
        return "Welcome Spring boot wirh VSCode";
    }
}
