package com.example.spring.controller;

import com.example.spring.dto.c11.Car;
import com.example.spring.dto.c11.Person;
import com.example.spring.dto.c11.Student;
import com.example.spring.dto.c11.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main11")
public class Controller11 {
    @RequestMapping("sub1")
    public String sub1(Model model) {
        // String, 기본타입, 배열, List, Map, JavaBeans
        var data = List.of(
                Map.of(
                        "name", "흥민",
                        "team", "토트넘"
                ),
                Map.of(
                        "country", "korea",
                        "location", "강남"
                ),
                Map.of(
                        "price", 6000,
                        "model", "truck"
                )
        );

        model.addAttribute("data", data);

        return null;
    }

    @RequestMapping("sub2")
    public String sub2(Model model) {
        var data = List.of(
                Map.of(
                        "team", "자이언츠",
                        "price", 10000,
                        "number", 4567
                ),

                Map.of(
                        "location", "제주",
                        "name", "바이든"
                ),

                Map.of(
                        "company", "삼성"
                )
        );
        model.addAttribute("list1", data);

        return null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model) {

        model.addAttribute("data", Map.of(
                "list1", List.of("tesla", "volvo", "kia"),
                "languages", List.of("java", "js", "c++", "python")
        ));

        return null;

    }

    @RequestMapping("sub4")
    public String sub4(Model model) {
        model.addAttribute("car", Map.of(
                "hyundai", List.of("소나타", "아반떼", "제네시스")
        ));
        model.addAttribute("student", Map.of(
                "son", List.of(80, 90, 99)
        ));
        return null;
    }

    @RequestMapping("sub5")
    public String sub5(Model model) {
        // List 내의 JavaBeans
        List<Student> students = List.of(
                new Student(1, "son", 33, 98.1234, "gmail"),
                new Student(5, "hong", 55, 77.33, "yahoo"),
                new Student(7, "messi", 66, 88.44, "daum"),
                new Student(10, "otani", 22, 66.11, "naver"));


        model.addAttribute("students", students);
        return null;
    }

    @RequestMapping("sub6")
    public String sub6(Model model) {
        List<Car> cars = List.of(
                new Car("a", 10000, true),
                new Car("b", 20000, false),
                new Car("c", 30000, false)
        );

        model.addAttribute("carList", cars);
        return null;
    }

    @RequestMapping("sub7")
    public String sub7(Model model) {
        // JavaBeans 내의 List
        model.addAttribute("person"
                , new Person("donald", "trump", 77, List.of("game", "soccer", "golf")));

        return null;
    }

    @RequestMapping("sub8")
    public String sub8(Model model) {
        model.addAttribute("player",
                new Player("donald", "trump", "yahoo", true,
                        List.of("토트넘", "맨시티", "다저스"),
                        List.of(3.14, 5.12, 6.34, 7.56)));
        return null;

    }
}
