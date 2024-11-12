package com.example.spring.dto.a2;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Player {
    private String name;
    private Integer age;
    private Boolean married;
    private List<String> items;
    private Team team;
}
