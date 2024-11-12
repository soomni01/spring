package com.example.spring.api;

import com.example.spring.dto.a6.Customer;
import com.example.spring.dto.a6.Supplier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController // Controller+ResponseBody
@RequestMapping("/api/main6")
@RequiredArgsConstructor
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