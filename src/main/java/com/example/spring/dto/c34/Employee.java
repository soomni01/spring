package com.example.spring.dto.c34;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}