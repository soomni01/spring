package com.example.spring.dto.c12;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@AllArgsConstructor // 모든 필드를 받는 생성자
//@NoArgsConstructor // 아규먼트없는 생성자
@RequiredArgsConstructor // final 필드 받는 생성자
public class Player {
    private final int age;
    private final String name;
    private Boolean married;
}
