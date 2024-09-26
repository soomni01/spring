package com.example.spring.dto.c11;

import java.util.List;

public class Player {
    private String name;
    private String nickName;
    private String email;
    private Boolean married;
    private List<String> teams;
    private List<Double> scores;

    public Player(String name, String nickName, String email, Boolean married, List<String> teams, List<Double> scores) {
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.married = married;
        this.teams = teams;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getMarried() {
        return married;
    }

    public List<String> getTeams() {
        return teams;
    }

    public List<Double> getScores() {
        return scores;
    }
}