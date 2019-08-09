package com.example.Explore.service;

import com.example.Explore.domain.TeamEntity;
import com.example.Explore.dto.Team;
import com.example.Explore.repo.RobotRepo;
import com.example.Explore.repo.TeamRepo;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Collections;
import java.util.Optional;

@Service
@Slf4j
public class TeamService {

    private Mapper mapper;

    private TeamRepo teamRepo;

    private RobotService robotService;

    private RobotRepo robotRepo;

    public TeamService(Mapper mapper, TeamRepo teamRepo, RobotService robotService, RobotRepo robotRepo) {
        this.mapper = mapper;
        this.teamRepo = teamRepo;
        this.robotService = robotService;
        this.robotRepo = robotRepo;
    }

    public Team createTeam(Team team) {
        TeamEntity teamEntity = mapper.map(team, TeamEntity.class);
        TeamEntity savedTeamEntity = teamRepo.save(teamEntity);
        savedTeamEntity.setRobots(Collections.emptyList());
        return mapper.map(savedTeamEntity, Team.class);
    }

    public Team getTeam(Long id) {
        Optional<TeamEntity> teamOptional = teamRepo.findById(id);
        TeamEntity teamEntity = teamOptional.orElseThrow(() -> new EntityNotFoundException("Team with id: " + id + " not found"));
        return mapper.map(teamEntity, Team.class);
    }

    public Team updateTeam(Team team) {
        TeamEntity teamEntity = mapper.map(team, TeamEntity.class);
        TeamEntity savedTeamEntity = teamRepo.save(teamEntity);
        return mapper.map(savedTeamEntity, Team.class);
    }

    public void deleteTeam(Long id) {
        teamRepo.deleteById(id);
    }
}
