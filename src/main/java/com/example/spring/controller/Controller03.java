package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller03 {
    
    // /main3/sub1?name=son
    @RequestMapping("/main3/sub1")
    public void method1(@RequestParam(name="name") String param) {
        System.out.println("name = " + param);
        System.out.println("Controller03.method1");
    }
    
    // /main3/sub2?address=seoul
    @RequestMapping("/main3/sub2")
    public void method2(@RequestParam(name="address") String param) {
        System.out.println("param = " + param);
    }
    
    // /main3/sub3?address=seoul
    @RequestMapping("/main3/sub3")
    public void method3(@RequestParam(value="address") String param) {
        System.out.println("param = " + param);
    }


    // /main3/sub4?address=seoul
    @RequestMapping("/main3/sub4")
    public void method4(@RequestParam("address") String param) {
        System.out.println("param = " + param);
    }
    
    // /main3/sub5?email=gmail&location=us
    @RequestMapping("/main3/sub5")
    // request handler method
    public void method5(@RequestParam("email") String param1, 
                        @RequestParam("location") String param2) {
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
    }

    // /main3/sub6?email=yahoo
    // 파라미터 이름과 일치할 경우 @RequestParam 생략 가능
    @RequestMapping("/main3/sub6")
    public void method6(String email){
        System.out.println("param1 = " + email);
    }

    // /main3/sub7?address=seoul
    // : seoul 출력
    // @RequestParam 어노테이션과 value 속성의 값 명시
    @RequestMapping("/main3/sub7")
    public void method7(@RequestParam("address") String param){
        System.out.println("param = " + param);
    }

    // /main3/sub8?address=seoul
    // :seoul 출력
    // @RequestParam 어노테이션 명시 (단, value 속성값 생략)
    @RequestMapping("/main3/sub8")
    public void method8(@RequestParam String param){
        System.out.println("param = " + param);
    }

    // /main3/sub8?address=seoul
    // : seoul 출력
    // @RequestParam 어노테이션 생략
    @RequestMapping("/main3/sub9")
    public void method9(String address){
        System.out.println("param = " + address);
    }
}
