package com.example.spring.dto.c12;

import lombok.Data;

@Data // Getter, Setter, ToString, EqualsAndHashCode, RequiredArgsConstructor
public class Car {
    private String make;
    private String model;
    private int year;
}
