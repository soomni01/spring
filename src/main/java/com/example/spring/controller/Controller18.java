package com.example.spring.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("main18")
public class Controller18 {

    @RequestMapping("sub1")
    public String sub1() {
        // redirect(redirection) : 다른 곳으로 가라는 응답
        // 브라우저는 이 응답을 받으면 새 요청을 보냄

        System.out.println("Controller18.sub1");
        // "/main18/sub2로 다시 요청 보내라" 라는 응답
        return "redirect:/main18/sub2";
    }

    @RequestMapping("sub2")
    public String sub2() {
        System.out.println("Controller18.sub2");
        return null;
    }

    @RequestMapping("sub3")
    public String sub3() {
        // 다음 요청에 데이터 전달 하기
        // 1. request parameter 사용

        // 2. session attribute 사용

        return "redirect:/main18/sub4?name=son&age=44";
    }

    @RequestMapping("sub4")
    public String sub4(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "age", required = false) String age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        return null;
    }

    @RequestMapping("sub5")
    public String sub5(RedirectAttributes rttr) {
        // 1. request parameter 이용
        rttr.addAttribute("name", "흥민");
        rttr.addAttribute("address", "런던");

        return "redirect:/main18/sub6";
    }

    @RequestMapping("sub6")
    public String sub6(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "address", required = false) String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        return null;
    }

    @RequestMapping("sub7")
    public String sub7(HttpSession session) {
        // 2. session attribute 이용 하는 방법
        session.setAttribute("productList", List.of("css", "desk", "chair"));

        return "redirect:/main18/sub8";
    }

    @RequestMapping("sub8")
    public String sub8(HttpSession session) {
        Object o = session.getAttribute("productList");
        if (o instanceof List productList) {
            System.out.println("productList.get(0) = " + productList.get(0));
            System.out.println("productList.get(0) = " + productList.get(1));
            System.out.println("productList.get(0) = " + productList.get(2));
        }
        return null;
    }

    @RequestMapping("sub9")
    public String sub9(RedirectAttributes rttr) {
        // 2. session attribute 를 이용
        // 단, 직접 HttpSession 객체를 사용하지 않고
        // RedirectAttributes 객체의 addFlashAttribute 메소드 사용할 것!!
        rttr.addFlashAttribute("foodList", List.of("pizza", "burger", "coffee"));
        return "redirect:/main18/sub10";
    }

    @RequestMapping("sub10")
    public String sub10(Model model) {
        Object attr = model.getAttribute("foodList");
        if (attr instanceof List foods) {
            System.out.println("foods.get(0) = " + foods.get(0));
            System.out.println("foods.get(1) = " + foods.get(1));
            System.out.println("foods.get(2) = " + foods.get(2));

        }
        return null;
    }
}
