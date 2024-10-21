package com.example.spring.controller;

import com.example.spring.mapper.Mapper07;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main37")
@RequiredArgsConstructor
public class Controller37 {
    final Mapper07 mapper07;

    @GetMapping("sub1")
    public void sub1(Integer id) {
        int cnt = mapper07.delete1(id);
        System.out.println(cnt + "개 행 삭제됨");
    }

    // /main37/sub2?id=5
    // 요청 파라미터 id 값에 해당하는 상품 삭제하는
    // 2번째 메소드, mapper에 delete2 메소드 작성
    @GetMapping("sub2")
    public void sub2(Integer id) {
        int cnt = mapper07.delete2(id);
        System.out.println(cnt + "개 상품 데이터 삭제됨");
    }

    // /main37/sub3?name=lee&city=paris&country=france
    @GetMapping("sub3")
    public void sub3(String name,
                     String city,
                     String country) {

//        name = "son";
//        city = "seoul";
//        country = "korea";

        int cnt = mapper07.insert1(name, city, country);
        System.out.println(cnt + "명 고객 정보 입력됨");
    }

    // 새 상품(상품명, 가격)을 입력하는 코드 작성
    // 4번째 메소드, mapper.insert2 메소드
    @GetMapping("sub4")
    public void sub4(String name,
                     Double price) {
        int c = mapper07.insert2(name, price);
        System.out.println(c + "개 상품 정보 입력됨");
    }

    @GetMapping("sub5")
    public void sub5(Model model) {
        List<Map<String, Object>> customers = mapper07.select2();
        model.addAttribute("customerList", customers);
    }

    @PostMapping("sub5")
    public String sub5(String name, String city, String country,
                       RedirectAttributes rttr) {
        int c = mapper07.insert1(name, city, country);

        rttr.addFlashAttribute("message", c + "명 고객 정보 등록됨");
        return "redirect:/main37/sub5";
    }


    // 새상품 등록하는 로직 작성
    // /main37/sub6
    @GetMapping("sub6")
    public void sub6(Model model) {
        model.addAttribute("productList", mapper07.select3());
    }

    @PostMapping("sub6")
    public String sub6(String name, Double price, RedirectAttributes rttr) {
        int i = mapper07.insert2(name, price);

        rttr.addFlashAttribute("message", i + "개 상품 등록됨");

        return "redirect:/main37/sub6";

    }

}