package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main25")
public class Controller25 {
    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void sub1(Model model, String country) {
        String sql = STR."""
                SELECT CustomerName
                From Customers
                WHERE Country = '\{country}'
                """;

        System.out.println();
        System.out.println(country + "에 있는 고객들");
        List<String> list = new ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            try (conn; stmt; rs) {
                while (rs.next()) {
                    String name = rs.getString("CustomerName");
                    list.add(name);
                }
                model.addAttribute("nameList", list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 특정 가격인 상품명 조회
    // 메소드, jsp
    @GetMapping("sub2")
    public void sub2(Model model, String price) {
        String sql = STR."""
                SELECT ProductName
                FROM Products
                WHERE Price = \{price}
                """;

        System.out.println();
        System.out.println(price + "원인 상품명");

        List<String> list = new ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            try (conn; stmt; rs) {
                while (rs.next()) {
                    String name = rs.getString("ProductName");
                    list.add(name);
                }
                model.addAttribute("productList", list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
