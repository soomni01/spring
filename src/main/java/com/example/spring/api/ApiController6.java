package com.example.spring.api;

import com.example.spring.dto.a6.Customer;
import com.example.spring.dto.a6.Supplier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/main6")
@RequiredArgsConstructor
@ResponseBody
public class ApiController6 {
    private final Service6 service;

    @GetMapping("sub2/{supplierId}")
    public Supplier getSupplier(@PathVariable Integer supplierId) {
        return service.getSupplier(supplierId);
    }

    @GetMapping("sub1/{customerId}")
    public Customer get(@PathVariable Integer customerId) {
        return service.getCustomer(customerId);
    }
}