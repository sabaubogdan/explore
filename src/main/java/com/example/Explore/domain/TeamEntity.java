package com.example.Explore.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "team")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "team_name")
    private String teamName;

    @OneToOne(mappedBy = "teamEntity")
    private CaptainEntity captainEntity;

    @OneToMany(mappedBy = "teams")
    private List<RobotEntity> robots;

    @OneToOne
    @JoinColumn(name = "expedition_id", referencedColumnName = "id")
    @JsonIgnore
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public CaptainEntity getCaptainEntity() {
        return captainEntity;
    }

    public void setCaptainEntity(CaptainEntity captainEntity) {
        this.captainEntity = captainEntity;
    }

    public List<RobotEntity> getRobots() {
        return robots;
    }

    public void setRobots(List<RobotEntity> robots) {
        this.robots = robots;
    }
}
