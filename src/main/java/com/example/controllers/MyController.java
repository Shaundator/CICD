package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("page2")
    public String index2(){return "index2";}


}
