package com.example.spring.dto.c26;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String supplierId;
    private String categoryId;
    private String unit;
    private String price;
}
