package com.example.Explore.dto;

import com.example.Explore.domain.TeamEntity;

public class Robot {

    private Long id;

    private String name;

    private String model;

    private TeamEntity teams;

    public TeamEntity getTeams() {
        return teams;
    }

    public void setTeams(TeamEntity teams) {
        this.teams = teams;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
