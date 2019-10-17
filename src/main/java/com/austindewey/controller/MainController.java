package com.austindewey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final String message = "Thanks for watching this s2i demo!";

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", message);
        return "hello";
    }
}
