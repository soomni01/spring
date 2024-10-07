package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

@Controller
@RequestMapping("main19")
public class Controller19 {

    @RequestMapping("sub1")
    public void sub1(String address, String nick) {
        System.out.println("address = " + address);
        System.out.println("nick = " + nick);
    }

    @RequestMapping("sub2")
    public void sub2(String name, Integer age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    // sub1.jsp 에 새 form 요소(와 input 요소들)을 작성해서
    // 전송 버튼을 클릭하면
    // /main19/sub3?food=피자&email=yahoo&city=인천
    // 요청되게 작성하고

    // Controller19.sub3 메소드 작성해서 food, email, city
    //  요청 파라미터를 받아서 출력하는 코드 작성

    @RequestMapping("sub3")
    public void sub3(String food,
                     String email,
                     String city) {
        System.out.println("food = " + food);
        System.out.println("email = " + email);
        System.out.println("city = " + city);

    }

    @RequestMapping("sub4")
    public void sub4(String food, String name, String memo) {
        System.out.println("food = " + food);
        System.out.println("name = " + name);
        System.out.println("memo = " + memo);
    }

    @RequestMapping("sub5")
    public void sub5(String[] city) {
        System.out.println("city = " + Arrays.toString(city));
    }

    @RequestMapping("sub6")
    public void sub6(Boolean accept) {
        System.out.println("accept = " + accept);
    }

    @RequestMapping("sub7")
    public void sub7(String location) {
        System.out.println("location = " + location);
    }

    @RequestMapping("sub8")
    public void sub8(LocalDate birth,
                     LocalDateTime now,
                     String some) {
        System.out.println("birth = " + birth);
        System.out.println("now = " + now);
        System.out.println("some = " + some);
    }

    @RequestMapping("sub10")
    public void sub10(String address,
                      String[] foods,
                      String choice,
                      LocalDate birthDate,
                      LocalDateTime startDateTime,
                      String select,
                      String note) {
        System.out.println("address = " + address);
        System.out.println("foods = " + Arrays.toString(foods));
        System.out.println("choice = " + choice);
        System.out.println("birthDate = " + birthDate);
        System.out.println("startDateTime = " + startDateTime);
        System.out.println("select = " + select);
        System.out.println("note = " + note);


    }

}