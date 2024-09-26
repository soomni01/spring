package com.example.spring.dto.c11;

public class Student {
    private int number;
    private String name;
    private Integer age;
    private Double score;
    private String email;

    public Student(int number, String name, Integer age, Double score, String email) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.score = score;
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getScore() {
        return score;
    }

    public String getEmail() {
        return email;
    }
}
