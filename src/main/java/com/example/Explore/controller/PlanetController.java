package com.example.Explore.controller;

import com.example.Explore.dto.Planet;
import com.example.Explore.service.PlanetService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/planet")
public class PlanetController {

    private PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @GetMapping(value = "/{id}")
    public Planet getPlanet(@PathVariable(value = "id") Long id) {
        return planetService.getPlanet(id);
    }

    @PostMapping
    public Planet createPlanet(@RequestBody @NonNull Planet planet) {
        return planetService.createPlanet(planet);
    }

    @PutMapping
    public Planet updatePlanet(@RequestBody @NonNull Planet planet) {
        return planetService.updatePlanet(planet);
    }

    @DeleteMapping(value = "/{id}")
    public void deletePlanet(@PathVariable(value = "id") Long id) {
        planetService.deletePlanet(id);
    }
}
