package com.example.spring.dto.c10;

public class Car {
    private String model;
    private String company;
    private Integer price;

    // 읽기 property : model, company, price
    // 쓰기 property : model, company, price

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
