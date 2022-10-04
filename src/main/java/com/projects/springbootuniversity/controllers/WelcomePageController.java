package com.projects.springbootuniversity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomePageController {

    @GetMapping
    public String welcome(){
        return "Welcome to University page!";
    }
}
