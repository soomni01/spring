package com.example.spring.controller;

import com.example.spring.mapper.Mapper06;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("main36")
public class Controller36 {
    final Mapper06 mapper06;

    @GetMapping("sub1")
    public void sub1() {
        String name = mapper06.select01(1);
        System.out.println("name = " + name);

        System.out.println(mapper06.select01(2));
        System.out.println(mapper06.select01(3));
        System.out.println(mapper06.select01(4));

        System.out.println();
        // 상품번호를 받아서 상품명을 조회/출력
        // select02
        String n1 = mapper06.select02(1);
        String n2 = mapper06.select02(2);
        String n3 = mapper06.select02(3);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
    }

    @GetMapping("sub2")
    public void sub2() {
        List<String> list = mapper06.select03("Germany", "USA");
        list.forEach(System.out::println);

        System.out.println();
        List<String> l = mapper06.select04(50, 200);
        l.forEach(System.out::println);

        System.out.println();
        // 두 날짜를 입력받아서 두 날짜사이에 태어난 직원이름들 조회/출력
        // select05
        List<String> n = mapper06.select05(LocalDate.parse("1950-01-01"), LocalDate.parse("1959-12-31"));
        n.forEach(System.out::println);

        System.out.println();
        // 두 도시를 입력받아서 두 도시에 있는 고객명들 조회/출력
        // select06
        List<String> l1 = mapper06.select06("Berlin", "London");
        l1.forEach(System.out::println);
        System.out.println();
        List<String> l2 = mapper06.select06("Madrid", "São Paulo");
        l2.forEach(System.out::println);
    }

    // /main36/sub3?id=5
    @GetMapping("sub3")
    public void sub3(Integer id) {
        String name = mapper06.select01(id);
        System.out.println("name = " + name);
    }

    // /main36/sub4?city1=germany&city2=usa
    // select03 실행 후 조회결과 출력하는 4번째 메소드 작성
    @GetMapping("sub4")
    public void method4(String city1, String city2) {
        mapper06.select03(city1, city2)
                .forEach(System.out::println);

    }


}