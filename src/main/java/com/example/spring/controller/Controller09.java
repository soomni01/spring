package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main9")
public class Controller09 {

    @RequestMapping("sub1")
    public String sub1() {
        return null;
    }

    @RequestMapping("sub2")
    public String sub2(Model model) {

        var map = Map.of(
                "name", "son",
                "age", 33,
                "team", "토트넘");
        model.addAttribute("attr1", map);
        model.addAttribute("attr2", List.of("java", "emmet"));

        return null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model) {
        model.addAttribute("person", Map.of(
                "name", "도널드",
                "address", "뉴욕",
                "e mail", "지메일"
        ));
        return null;
    }

    @RequestMapping("sub4")
    public String sub4(Model model) {
        model.addAttribute("student", Map.of(
                "name", "홍길동",
                "score", 88,
                "집 주소", "korea",
                "student number", 0
        ));

        model.addAttribute("player", Map.of(
                "email", "abc",
                "address", "ny",
                "team", "one"
        ));

        model.addAttribute("home", Map.of(
                "address", "aa",
                "location", "la",
                "price", 3
        ));
        return null;
    }
}
