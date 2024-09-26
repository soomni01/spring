package com.example.spring.dto.c11;

public class Car {
    private String modelName;
    private Integer price;
    private Boolean expired;

    public Car(String modelName, Integer price, Boolean expired) {
        this.modelName = modelName;
        this.price = price;
        this.expired = expired;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getPrice() {
        return price;
    }

    public Boolean getExpired() {
        return expired;
    }
}
