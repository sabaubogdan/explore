package com.example.Explore.repo;

import com.example.Explore.domain.RobotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotRepo extends JpaRepository<RobotEntity, Long> {

}
