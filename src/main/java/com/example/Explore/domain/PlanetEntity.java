package com.example.Explore.domain;

import javax.persistence.*;

@Entity
@Table(name = "planet")
public class PlanetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "planet_name")
    private String planetName;

    @Column(name = "path_to_image")
    private String pathToImage;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @OneToOne(mappedBy = "planet", cascade = CascadeType.ALL)
    private ExpeditionEntity expedition;

    public ExpeditionEntity getExpedition() {
        return expedition;
    }

    public void setExpedition(ExpeditionEntity expedition) {
        this.expedition = expedition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
