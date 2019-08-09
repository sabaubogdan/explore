package com.example.Explore.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "expedition")
public class ExpeditionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToOne(mappedBy = "expedition", cascade = CascadeType.ALL)
    private TeamEntity team;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "planet_id", referencedColumnName = "id")
    @JsonIgnore
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
