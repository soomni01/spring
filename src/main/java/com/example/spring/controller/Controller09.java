package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main9")
public class Controller09 {

    @RequestMapping("sub1")
    public String sub1() {
        return null;
    }
}
