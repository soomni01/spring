package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("main7")
public class Controller07 {

    @RequestMapping("sub1")
    public void sub1(WebRequest request) {

        // attribute - 포워드 시 전달해주는 값
        request.setAttribute("data", "손흥민", RequestAttributes.SCOPE_REQUEST);
        // /WEB-INF/view/main7/sub1.jsp 로 request forwarding
    }

    @RequestMapping("sub2")
    public void sub2(Model model) {
        model.addAttribute("person", "이강인");
    }
}
