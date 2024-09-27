package com.example.spring.dto.c14;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Actor {
    private String name;
    private String agency;
    private String birth;
    private String mbti;
    private List<String> works;
}
