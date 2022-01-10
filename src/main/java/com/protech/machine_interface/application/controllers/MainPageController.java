package com.protech.machine_interface.application.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @GetMapping("/home")
    public String MainPageController(){
        return "MainPage";
    }
    @GetMapping("/")
    public String OtherMainPageController(){
        return "MainPage";
    }
}
