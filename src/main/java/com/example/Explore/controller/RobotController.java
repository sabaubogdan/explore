package com.example.Explore.controller;

import com.example.Explore.dto.Robot;
import com.example.Explore.service.RobotService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/robot")
public class RobotController {

    private RobotService robotService;

    public RobotController(RobotService robotService) {
        this.robotService = robotService;
    }

    @GetMapping(value = "/{id}")
    public Robot getRobot(@PathVariable(value = "id") Long id) {
        return robotService.getRobot(id);
    }

    @PostMapping
    public Robot createRobot(@RequestBody @NonNull Robot robot) {
        return robotService.createRobot(robot);
    }

    @PutMapping
    public Robot updateRobot(@RequestBody @NonNull Robot robot) {
        return robotService.updateRobot(robot);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteRobot(@PathVariable(value = "id") Long id) {
        robotService.deleteRobot(id);
    }
}
