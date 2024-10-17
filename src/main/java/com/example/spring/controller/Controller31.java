package com.example.spring.controller;

import com.example.spring.mapper.Mapper01;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main31")
public class Controller31 {
    final Mapper01 mapper01;

    @RequestMapping("sub1")
    public void sub1() {
        // 요청분석/가공

        // 비즈니스 로직 (crud)
        String name = mapper01.selectName();
        System.out.println("name = " + name);

        // model
        // forward
    }

    @GetMapping("sub2")
    public void sub2() {
        String productName = mapper01.selectProductName();
        System.out.println("productName = " + productName);
    }

    @GetMapping("sub3")
    public void sub3() {
        String employeeName = mapper01.selectEmployeeName();
        System.out.println("employeeName = " + employeeName);
    }

}
