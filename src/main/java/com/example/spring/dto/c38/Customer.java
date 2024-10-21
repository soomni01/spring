package com.example.spring.dto.c38;

import lombok.Data;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

@Data
public class Customer {
    private String name;
    private String contactName;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private Integer id;
}
