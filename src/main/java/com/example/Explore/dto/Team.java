package com.example.Explore.dto;

import com.example.Explore.domain.CaptainEntity;
import com.example.Explore.domain.ExpeditionEntity;
import com.example.Explore.domain.RobotEntity;

import java.util.List;

public class Team {

    private Long id;

    private String teamName;

    private CaptainEntity captainEntity;

    private List<RobotEntity> robots;

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
