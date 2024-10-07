package com.example.spring.dto.c21;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class MyBean5 {
    //    private String[] select;
    private List<String> select;
    private LocalDateTime now;
    private String note;
    private String id;
}