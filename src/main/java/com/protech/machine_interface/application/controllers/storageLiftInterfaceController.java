package com.protech.machine_interface.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class storageLiftInterfaceController {
    @GetMapping("/storageLiftInterface")
    public String storageLiftInterfaceController(){
        return "storageLiftInterface";
    }
}
