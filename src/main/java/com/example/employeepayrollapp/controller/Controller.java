package com.example.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/get")
    public String displayMessage(){
        return "Hello World!";
    }

}
