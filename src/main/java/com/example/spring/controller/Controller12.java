package com.example.spring.controller;

import com.example.spring.dto.c12.Book;
import com.example.spring.dto.c12.Car;
import com.example.spring.dto.c12.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("main12")
public class Controller12 {
    @RequestMapping("sub1")
    public String sub1(Model model) {
        Book book = new Book();
        book.setAuthor("linus");
        book.setPrice(500);
        book.setTitle("git");

        Book book2 = new Book("java", "shin", 600);

        model.addAttribute("books", List.of(book, book2));

        return null;
    }

    @RequestMapping("sub2")
    public String sub2(Model model) {
        Car car = new Car();
        car.setMake("tesla");
        car.setYear(2024);
        car.setModel("truck");

        car.getMake();
        car.getYear();
        car.getModel();

        System.out.println("car = " + car);

        return null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model) {

        model.addAttribute("num1", 99);
        model.addAttribute("num2", 88);
        model.addAttribute("num3", 77);

        model.addAttribute("attr1", "");
        model.addAttribute("attr2", List.of());
        model.addAttribute("attr3", Set.of());
        model.addAttribute("attr4", Map.of());
        model.addAttribute("attr5", null);
//        model.addAttribute("attr6", null);
        return null;
    }

    @RequestMapping("sub4")
    public String sub4(Model model) {
        model.addAttribute("productList", List.of(
                new Product(3, "컴퓨터", 500, 1, "인텔 컴퓨터"),
                new Product(6, "스마트폰", 600, 3, "아이폰"),
                new Product(7, "자동차", 700, 0, "테슬라"),
                new Product(12, "모니터", 200, 6, "LG FHD")
        ));
        return null;
    }
}
