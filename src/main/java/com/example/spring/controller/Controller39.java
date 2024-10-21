package com.example.spring.controller;

import com.example.spring.service.Service01;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main39")
@RequiredArgsConstructor
public class Controller39 {
    private final Service01 service01;

    @GetMapping("sub1")
    public void method1(Integer money) {
        service01.transferMoney1(money);
    }

    @GetMapping("sub2")
    public void method2(Integer money) {
        service01.transferMoney2(money); // runtime exception
    }

    @GetMapping("sub3")
    public void method3(Integer money) throws ClassNotFoundException {
        service01.transferMoney3(money); // checked exception
    }

    @GetMapping("sub4")
    public void method4(Integer money) {
        service01.transferMoney4(money);
    }
}