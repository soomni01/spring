package com.example.spring.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("main16")
public class Controller16 {
    @RequestMapping("sub1")
    public void sub1(Model model, HttpSession session) {
        // session : 하나의 브라우저에서 오는 요청(request)들이
        //            공유하는 객체
        int r = (int) (Math.random() * 100000000);
        System.out.println("r = " + r);
        model.addAttribute("attr1", "hello attr" + r);

        session.setAttribute("attr2", "hello session attr" + r);
    }

    @RequestMapping("sub2")
    public void sub2(Model model) {

    }

    @RequestMapping("sub3")
    public void sub3(Model model) {
    }

    @RequestMapping("sub4")
    public void sub4(Model model) {
    }

    @RequestMapping("sub5")
    public void sub5(
            @RequestParam(value = "id", required = false) String id,
            Model model,
            HttpSession session) {
        if (id != null && !id.isEmpty()) {
            System.out.println("id = " + id);
            session.setAttribute("userid", id);
        }
    }

    @RequestMapping("sub6")
    public void sub6(Model model, HttpSession session) {
    }

    @RequestMapping("sub7")
    public void sub7(Model model, HttpSession session) {
        session.invalidate(); // 세션 삭제
    }

    @RequestMapping("sub9")
    public String sub9(Model model, HttpSession session) {
        session.invalidate();

        return "redirect:/main16/sub5";
    }

}