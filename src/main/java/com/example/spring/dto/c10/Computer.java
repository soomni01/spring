package com.example.spring.dto.c10;

public class Computer {
    private int id;
    private String name;
    private String type;
    private boolean expired;

    // property는 메소드로 결정됨
    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isExpired() {
        return expired;
    }

    // property가 boolean 타입이면 get 메소든 is로 시작
    public void setModel(String type) {
        this.type = type;
    }

    public String getModel() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
