package com.example.spring.dto.c35;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Dto59 {
    private Integer studentId;
    private Integer modelNumber;
    private String productName;
    private LocalDate birthDate;
    private LocalDateTime inserted;
    private Double score;
}