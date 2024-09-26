package com.example.spring.dto.c12;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private String description;
}
