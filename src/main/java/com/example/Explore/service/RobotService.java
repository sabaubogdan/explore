package com.example.Explore.service;

import com.example.Explore.domain.RobotEntity;
import com.example.Explore.dto.Robot;
import com.example.Explore.repo.RobotRepo;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@Slf4j
public class RobotService {

    private Mapper mapper;

    private RobotRepo robotRepo;

    public RobotService(Mapper mapper, RobotRepo robotRepo) {
        this.mapper = mapper;
        this.robotRepo = robotRepo;
    }

    public Robot createRobot(Robot robot) {
        RobotEntity robotEntity = mapper.map(robot, RobotEntity.class);
        RobotEntity savedRobotEntity = robotRepo.save(robotEntity);
        return mapper.map(savedRobotEntity, Robot.class);
    }

    public Robot getRobot(Long id) {
        Optional<RobotEntity> robotOptional = robotRepo.findById(id);
        RobotEntity robotEntity = robotOptional.orElseThrow(() -> new EntityNotFoundException("Robot with id " + id + " not found"));
        return mapper.map(robotEntity, Robot.class);
    }

    public Robot updateRobot(Robot robot) {
        RobotEntity robotEntity = mapper.map(robot, RobotEntity.class);
        RobotEntity savedRobotEntity = robotRepo.save(robotEntity);
        return mapper.map(savedRobotEntity, Robot.class);
    }

    public void deleteRobot(Long id) {
        robotRepo.deleteById(id);
    }

}
