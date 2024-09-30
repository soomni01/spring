package com.example.spring.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main17")
public class Controller17 {
    @RequestMapping("sub1")
    public void sub1(Model model,
                     HttpSession session,
                     String id) {
        session.setAttribute("userid", id);

    }

    @RequestMapping("sub2")
    public void sub2(Model model) {
    }

    @RequestMapping("sub3")
    public void sub3(Model model) {
    }

    @RequestMapping("sub4")
    public String sub4(Model model, HttpSession session) {
        session.invalidate();

        return "redirect:/main17/sub1";
    }


}
