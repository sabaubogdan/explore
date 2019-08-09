package com.example.Explore.service;

import com.example.Explore.domain.PlanetEntity;
import com.example.Explore.dto.Planet;
import com.example.Explore.repo.PlanetRepo;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@Slf4j
public class PlanetService {

    private Mapper mapper;

    private PlanetRepo planetRepo;

    public PlanetService(Mapper mapper, PlanetRepo planetRepo) {
        this.mapper = mapper;
        this.planetRepo = planetRepo;
    }

    public Planet createPlanet(Planet planet) {
        PlanetEntity planetEntity = mapper.map(planet, PlanetEntity.class);
        PlanetEntity savedPlanetEntity = planetRepo.save(planetEntity);
        return mapper.map(savedPlanetEntity, Planet.class);
    }

    public Planet getPlanet(Long id) {
        Optional<PlanetEntity> planetOptional = planetRepo.findById(id);
        PlanetEntity planetEntity = planetOptional.orElseThrow(() -> new EntityNotFoundException("Planet with id " + id + " not found"));
        return mapper.map(planetEntity, Planet.class);
    }

    public Planet updatePlanet(Planet planet) {
        PlanetEntity planetEntity = mapper.map(planet, PlanetEntity.class);
        PlanetEntity savedPlanetEntity = planetRepo.save(planetEntity);

        return mapper.map(savedPlanetEntity, Planet.class);
    }

    public void deletePlanet(Long id) {
        planetRepo.deleteById(id);
    }
}
