package com.protech.machine_interface.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class storageLiftInterfaceController {
    @GetMapping("/machine/{id}")
    public String storageLiftInterfaceController(@PathVariable("id") Long id, Model model){
        model.addAttribute("id", id);
        return "Machine";
    }
}
