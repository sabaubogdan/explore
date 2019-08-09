package com.example.Explore.controller;

import com.example.Explore.dto.Captain;
import com.example.Explore.service.CaptainService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/captain")
public class CaptainController {

    private CaptainService captainService;

    public CaptainController(CaptainService captainService) {
        this.captainService = captainService;
    }

    @GetMapping(value = "/{id}")
    public Captain getCaptain(@PathVariable(value = "id") Long id) {
        return captainService.getCaptain(id);
    }

    @PostMapping
    public Captain createCaptain(@RequestBody @NonNull Captain captain) {
        return captainService.createCaptain(captain);
    }

    @PutMapping
    public Captain updateCaptain(@RequestBody @NonNull Captain captain) {
        return captainService.updateCaptain(captain);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCaptain(@PathVariable(value = "id") Long id) {
        captainService.deleteCaptain(id);
    }

}
