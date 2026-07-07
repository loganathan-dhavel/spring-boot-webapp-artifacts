package com.twinkle.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebappController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title","WebApp for the CI/CD Automation");
        model.addAttribute("msg","Application developed by the Twinkle.org");
        return "index";
    }

    @GetMapping("/healthz")
    @ResponseBody
    public String health(){
        return "Ok";
    }
}