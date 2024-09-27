package com.example.spring.dto.c14;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private String publisher;
    private Integer pages;
    private Integer price;

}
