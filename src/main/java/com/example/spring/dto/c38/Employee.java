package com.example.spring.dto.c38;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {
    private Integer id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String photo;
    private String notes;
}
