package com.example.spring.api;

import com.example.spring.dto.a6.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/main6")
@RequiredArgsConstructor
public class ApiController6 {
    private final CustomerService service;

    @GetMapping("sub1/{customerId}")
    @ResponseBody
    public Customer get(@PathVariable Integer customerId) {
        System.out.println(customerId);
        return service.getCustomer(customerId);
    }
}