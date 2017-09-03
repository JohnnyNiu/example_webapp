package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public @ResponseBody String HelloWorldController() {

        return "Hello World";
    }

    @RequestMapping("/helloTemplate")
    public String serveViaTemplate(Model model) {
        model.addAttribute("name", "niu");
        return "hello";
    }
}
