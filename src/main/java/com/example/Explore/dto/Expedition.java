package com.example.Explore.dto;

import com.example.Explore.domain.PlanetEntity;
import com.example.Explore.domain.TeamEntity;

public class Expedition {

    private Long id;

    private String name;

    private String description;

    private TeamEntity team;

    private PlanetEntity planet;

    public PlanetEntity getPlanet() {
        return planet;
    }

    public void setPlanet(PlanetEntity planet) {
        this.planet = planet;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TeamEntity getTeam() {
        return team;
    }

    public void setTeam(TeamEntity team) {
        this.team = team;
    }
}
