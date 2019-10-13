package com.austindewey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final String message = "Hello World!";

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", message);
        return "hello";
    }
}
