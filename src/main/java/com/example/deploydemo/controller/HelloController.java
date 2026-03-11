package com.example.deploydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Deployed automatically via Jenkins to Tomcat 10!");
        return "hello"; // This matches the .jsp file name we are about to create
    }
}