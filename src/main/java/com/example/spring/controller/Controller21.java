package com.example.spring.controller;

import com.example.spring.dto.c21.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("main21")
public class Controller21 {
    @GetMapping("sub1")
    public void g1() {
    }

    @PostMapping("sub1")
    public void p1(@ModelAttribute(name = "some1") Object o) {

    }

    @GetMapping("sub2")
    public String g2(@ModelAttribute("some1") Object o) {
        return "/main21/sub1";
    }

    // @ModelAttribute 을 붙인 메소드 아규먼트(객체)는
    // request parameter 가 객체의 property에 binding 된다.
    @GetMapping("sub3")
    public void g3() {
    }

    @PostMapping("sub3")
    public void p3(@ModelAttribute("some") MyBean b) {
        System.out.println("b = " + b);
    }

    @GetMapping("sub4")
    public void g4(@ModelAttribute("data") MyBean4 b) {
        System.out.println("b = " + b);
    }

    @PostMapping("sub5")
    public void p5(@ModelAttribute("values") MyBean5 b) {
        System.out.println("b = " + b);
    }


    // ModelAttribute의 name(value) element를 생략하면
    // 클래스명을 lowerCamelCase로 바꾼 이름으로 결정됨
    @GetMapping("sub6")
    public void g6(@ModelAttribute MyBean6 a,
                   Model model) {
        System.out.println("a = " + a);
        // jsp : ${book.title}
//        Object m = model.getAttribute("book");
        Object m = model.getAttribute("myBean6");
        System.out.println("m = " + m);
        System.out.println("a = " + System.identityHashCode(a));
        System.out.println("m = " + System.identityHashCode(m));
    }

    @GetMapping("sub7")
    public void g7(MyBean6 a,
                   Model model) {
        System.out.println("a = " + a);
        // jsp : ${book.title}
//        Object m = model.getAttribute("book");
        Object m = model.getAttribute("myBean6");
        System.out.println("m = " + m);
        System.out.println("a = " + System.identityHashCode(a));
        System.out.println("m = " + System.identityHashCode(m));
    }

    // sub8.jsp
    // : 전송버튼 클릭시 post 방식으로 sub9 경로로 요청하는 코드

    // sub9.jsp
    // : model에 있는 attribute의 각 property를 출력하는 코드
    @GetMapping("sub8")
    public void g8() {
    }

    @PostMapping("sub9")
    public void p9(MyBean8 p) {
        System.out.println("p = " + p);
    }

    @GetMapping("sub10")
    public String g10(RedirectAttributes rttr) {
        MyBean8 m = new MyBean8("범근", 22, 3.14);
//        m.setAge(22);
//        m.setUserName("범근");
//        m.setScore(3.14);
        rttr.addFlashAttribute("data", m);
        return "redirect:/main21/sub11";
    }


    // @ModelAttribute 가 적용된 메소드 아규먼트를
    // Model에서 찾고 있으면 Model에서 꺼내서 사용

    // 없으면 객체를 생성한 후 사용
    // , 이 때 사용하는 생성자는 유일한 생성자 이거나 기본 생성자

    // 특별한 이유가 없다면 ModelAttribute로 사용되는
    // 메소드 아규먼트는 기본생성자(no-args)가 있어야함
    @GetMapping("sub11")
    public String g11(@ModelAttribute("data") MyBean8 p) {
        System.out.println("data = " + p);
        return null;
    }

}