package com.example.Explore.repo;

import com.example.Explore.domain.PlanetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepo extends JpaRepository<PlanetEntity, Long> {
}
