package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.StringTemplate.STR;

@Controller
@RequestMapping("main6")
public class Controller06 {
    @RequestMapping("sub1")
    @ResponseBody
    public String sub1(String search) {
        String result = search + "를 검색한 결과"; //

        String html = STR."""
                <html>
                    <body>
                        <p>\{result}</p>
                    </body>
                </html>
                """;

        return html;
    }

    // /main6/sub2
    @RequestMapping("sub2")
    public String method2() {
        // 1. 요청 정보 분석/가공
        // 2. 비즈니스 로직 실행

        // 3. 응답(html)

        // 앞에 /WEB-INF/view/
        // 뒤에 .jsp
        return "world"; // view 이름

        // 최종 jsp 위치
        // /WEB-INF/view/world.jsp
    }

    @RequestMapping("sub3")
    public String method3() {

        // /WEB-INF/view/hello.jsp
        return "/hello";
    }

    // /main6/sub4 으로 요청왔을 때
    // /WEB-INF/view/hi.jsp 의 내용이 응답

    // 메소드 작성, jsp 만들기

    @RequestMapping("sub4")
    public String method4() {

        // /WEB-INF/view/hi.jsp
        return "hi";
    }

    // /main6/sub5
    @RequestMapping("sub5")
    public String method5() {

        // jsp의 위치는 요청 경로와 같은 경우가 많음
        // /WEB-INF/view/main6/sub5.jsp
        return "/main6/sub5";
    }

    @RequestMapping("sub6")
    public String  method6() {

        // return이 null이면 요청경로와 같은 view로 결정
        // /WEB-INF/view/main6/sub6.jsp
        return null;
    }

    @RequestMapping("sub7")
    public void method7() {

        // return이 void면 요청경로와 같은 view로 결정
        // /WEB-INF/view/main6/sub7.jsp
    }

    // /main6/sub8 로 요청 왔을 때
    // /WEB-INF/view/main6/sub8.jsp 가 응답되도록

    // 8번째 메소드와, jsp를 작성해보세요.
    @RequestMapping("sub8")
    public void method8() {}
}