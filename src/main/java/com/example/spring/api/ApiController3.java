package com.example.spring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/api/main3")
public class ApiController3 {

    @DeleteMapping("sub8")
    public void sub8(@RequestBody Map<String, Object> map) {
        System.out.println(map);
    }

    @PutMapping("sub7")
    public void sub7(@RequestBody Map<String, Object> map) {
        System.out.println(map);
    }

    @DeleteMapping("sub6")
    public void sub6(@RequestBody Map<String, Object> map) {
        System.out.println(map);
    }

    @DeleteMapping("sub5")
    public void sub5() {
        System.out.println("ApiController3.sub5");
    }

    @PutMapping("sub4")
    public void sub4(@RequestBody Map<String, Object> map) {
        System.out.println(map);

    }

    @PutMapping("sub3")
    public void sub3() {
        System.out.println("ApiController3.sub3");
    }

    @PostMapping("sub2")
    public void sub2(@RequestBody Map<String, Object> map) {
        System.out.println(map);
    }

    @GetMapping("sub1")
    public void sub1() {
        System.out.println("ApiController3.sub1");
    }
}