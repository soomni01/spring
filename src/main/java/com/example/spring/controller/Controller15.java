package com.example.spring.controller;

import com.example.spring.dto.c15.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main15")
public class Controller15 {
    @RequestMapping("sub1")
    public void sub1() {

    }

    @RequestMapping("sub2")
    public void sub2() {

    }

    @RequestMapping("sub4")
    public void sub4() {
    }

    @RequestMapping("sub5")
    public void sub5() {
    }

    @RequestMapping("sub7")
    public void sub7() {
    }

    @RequestMapping("sub9")
    public void sub9(Model model) {
        model.addAttribute("some1", "hello import tag");

    }

    @RequestMapping("sub11")
    public void sub11(Model model) {
        model.addAttribute("attr1", "hello request");

    }

    @RequestMapping("sub13")
    public void sub13(Model model) {
        model.addAttribute("productList",
                List.of(new Product(5, "책", 5000),
                        new Product(9, "자동차", 10000),
                        new Product(13, "컴퓨터", 6000)));
    }

    @RequestMapping("sub16")
    public void sub16(Model model) {
    }

    @RequestMapping("sub18")
    public void sub18(Model model) {

    }

    @RequestMapping("sub19")
    public void sub19(Model model) {

    }

}