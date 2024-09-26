package com.example.spring.dto.c11;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> hobbies;

    public Person(String firstName, String lastName, int age, List<String> hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
