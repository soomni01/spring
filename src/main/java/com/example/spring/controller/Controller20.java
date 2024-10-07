package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;

@Controller
@RequestMapping("main20")
public class Controller20 {
    @RequestMapping("sub1")
    public void sub1() {

    }

    @RequestMapping("sub2")
    public void sub2(String name,
                     String pw,
                     String note) {
        System.out.println("name = " + name);
        System.out.println("pw = " + pw);
        System.out.println("note = " + note);

    }

    @RequestMapping("sub3")
    public void sub3(String[] sel,
                     LocalDate birth,
                     Integer age) {
        System.out.println("Arrays.toString(sel) = " + Arrays.toString(sel));
        System.out.println("birth = " + birth);
        System.out.println("age = " + age);

    }

    //@RequestMapping(path = "sub4", method = RequestMethod.GET)
    @GetMapping("sub4")
    public void get4() {
        System.out.println("get 전송 방식");
    }

    //@RequestMapping(path = "sub4", method = RequestMethod.POST)
    @PostMapping("sub4")
    public void post4() {
        System.out.println("post 전송 방식");
    }

    // /main20/sub5 경로로 get 방식 요청이 올 때
    // 실행되는 메소드 get5 작성
//    @RequestMapping(path = "sub5", method = RequestMethod.GET)
    @GetMapping("sub5")
    public void get5() {
    }

    // /main20/sub5 경로로 post 방식 요청이 올 때
    // 실행되는 메소드 post5 작성
//    @RequestMapping(path = "sub5", method = RequestMethod.POST)
    @PostMapping("sub5")
    public void post5() {
    }

    /*
    @RequestMapping(method = RequestMethod.PATCH)
    @PatchMapping

    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping

    @RequestMapping(method = RequestMethod.DELETE)
    @DeleteMapping
     */
}