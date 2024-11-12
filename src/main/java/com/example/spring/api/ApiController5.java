package com.example.spring.api;

import com.example.spring.dto.a5.Book;
import com.example.spring.dto.a5.Company;
import com.example.spring.dto.a5.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/main5")
public class ApiController5 {

    @GetMapping("sub10")
    @ResponseBody
    public List<Book> sub10() {
        List<Book> books = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setTitle("Book 1");
        book1.setAuthor("Author 1");
        book1.setContent("Content 1");
        book1.setPrice(3000);

        Book book2 = new Book();
        book2.setTitle("Book 2");
        book2.setAuthor("Author 2");
        book2.setContent("Content 2");
        book2.setPrice(4000);

        Book book3 = new Book();
        book3.setTitle("Book 3");
        book3.setAuthor("Author 3");
        book3.setContent("Content 3");
        book3.setPrice(5000);

        return List.of(book1, book2, book3);
    }

    @GetMapping("sub9")
    @ResponseBody
    public Member sub9() {

        Company company = new Company();
        company.setName("토트넘");
        company.setLocation("런던");

        Member member = new Member();
        member.setName("흥민");
        member.setAddress("서울");
        member.setMarried(true);
        member.setCompany(company);
        member.setItems(List.of("공", "신발", "유니폼"));
        return member;
    }


    @GetMapping("sub8")
    @ResponseBody
    public Book sub8() {
        Book book = new Book();
        book.setPrice(50000);
        book.setAuthor("한강");
        book.setContent("소설");
        book.setTitle("제목");
        return book;
    }

    @GetMapping("sub7")
    @ResponseBody
    public Map<String, Object> sub7() {
        return Map.of("product", Map.of("name", "kim", "price", 5000,
                "location", List.of("seoul", "busan"), "quantity", 5));
    }

    @GetMapping("sub6")
    @ResponseBody
    public Map<String, Object> sub6() {
        return Map.of("name", "son", "items", List.of("치킨", "돈까스", "떡볶이"),
                "team", Map.of("name", "토트넘", "location", "런던"));
    }

    @GetMapping("sub5")
    @ResponseBody
    public Map<String, Object> sub5() {
        return Map.of("title", "책제목", "content", "책 내용",
                "price", 15000, "available", true);
    }

    @GetMapping("sub4")
    @ResponseBody
    public Map<String, Object> sub4() {
        return Map.of("name", "kim", "age", 44);
    }

    @GetMapping("sub3")
    @ResponseBody
    public String method() {

        return "seoul";
    }

    @GetMapping("sub1")
    @ResponseBody
    public String method1() {
        System.out.println("ApiController5.method1");
        return "sub1";
    }
}
