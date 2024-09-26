package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("main8")
public class Controller08 {

    @RequestMapping("sub1")
    public String sub1(Model model) {
        // 1. 요청 분석/가공
        // 2. 비지니스 로직 실행
        // 3. Model 에 일한 결과 넣고 (넣은 값-attribute)
        model.addAttribute("result1", "Hello World");

        // 4. View로 포워딩

        return null;
    }

    // 할 일1
    // /main8/sub2 로 요청 오면
    // model에 address 라는 이름의 "서울" 값(attribute)을 넣고
    // /WEB-INF/view/main8/sub2.jsp 로 포워드

    // 할 일2
    // /WEB-INF/view/main8/sub2.jsp 에서
    // address라는 attribute 꺼내서 HTML 완성해서 응답하기

    @RequestMapping("sub2")
    public String sub2(Model model) {
        model.addAttribute("address", "서울");
        model.addAttribute("email", "gmail");

        // attribute는 아무것이나 넣을 수 있음(Object 타입이라서)
        model.addAttribute("age", 44);
        model.addAttribute("point", 4.123);
        model.addAttribute("married", true);
        model.addAttribute("some1", List.of("java", "css"));
        model.addAttribute("some2", Set.of("java", "css"));
        model.addAttribute("some3", Map.of("java", "css"));

        // 주로 사용하는 것
        // String, 기본타입(Wrapper), 배열, List, Map, JavaBeans

        return null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model) {
        // 배열
        model.addAttribute("langs", new String[] { "java", "css" });
        return null;
    }

    @RequestMapping("sub4")
    public String sub4(Model model) {
        model.addAttribute("countries", new String[] { "korea", "japan", "us" });
        model.addAttribute("islands", new String[] { "제주", "울릉도", "독도" });
        model.addAttribute("points", new double[] { 3.14, 9.4321, 8.0101 });
        return null;
    }
    
    @RequestMapping("sub5")
    public String sub5(Model model) {
         model.addAttribute("names", new String[] { "손흥민", "홍명보" });
         model.addAttribute("classes", new String[] { "자바", "react" });
         model.addAttribute("address", "신촌");

         return null;
    }

    @RequestMapping("sub6")
    public String sub6(Model model) {
        // attribute에 List 넣기
        model.addAttribute("names", List.of("명보", "몽규", "흥민"));

        return null;
    }

    @RequestMapping("sub7")
    public String sub7(Model model) {
        List<String> jobs = List.of("의사", "개발자", "강사");
        List<Integer> points = List.of(4, 2, 1);

        model.addAttribute("jobs", jobs);
        model.addAttribute("pointList", points);

        return null;
    }

    @RequestMapping("sub8")
    public String sub8(Model model) {
        model.addAttribute("students", List.of("문성", "몽규", "명보"));
        model.addAttribute("num", 0);
        model.addAttribute("index", 1);
        model.addAttribute("point", 2);

        return null;
    }

    @RequestMapping("sub9")
    public String sub9(Model model) {
        model.addAttribute("people", List.of("donald", "harris", "biden"));
        model.addAttribute("address", List.of("ny", "la"));
        model.addAttribute("second", 1);
        model.addAttribute("next", 2);
        model.addAttribute("zero", 0);
        model.addAttribute("one", 1);

        return null;
    }
}