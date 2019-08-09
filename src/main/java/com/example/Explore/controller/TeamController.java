package com.example.Explore.controller;

import com.example.Explore.dto.Team;
import com.example.Explore.service.TeamService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/team")
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping(value = "/{id}")
    public Team getTeam(@PathVariable(value = "id") Long id) {
        return teamService.getTeam(id);
    }

    @PostMapping
    public Team createTeam(@RequestBody @NonNull Team team) {
        return teamService.createTeam(team);
    }

    @PutMapping
    public Team updateTeam(@RequestBody @NonNull Team team) {
        return teamService.updateTeam(team);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTeam(@PathVariable(value = "id") Long id) {
        teamService.deleteTeam(id);
    }
}
