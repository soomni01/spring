package com.example.spring.controller;

import com.example.spring.mapper.Mapper03;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main33")
public class Controller33 {
    private final Mapper03 mapper03;

    @GetMapping("sub1")
    public void sub1() {
        String categoryName = mapper03.getCategoryName();
        System.out.println(categoryName);
    }

}
