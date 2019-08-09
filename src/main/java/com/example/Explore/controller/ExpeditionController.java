package com.example.Explore.controller;

import com.example.Explore.dto.Expedition;
import com.example.Explore.service.ExpeditionService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/expedition")
public class ExpeditionController {

    private ExpeditionService expeditionService;

    public ExpeditionController(ExpeditionService expeditionService) {
        this.expeditionService = expeditionService;
    }

    @GetMapping(value = "/{id}")
    public Expedition getExpedition(@PathVariable(value = "id") Long id) {
        return expeditionService.getExpedition(id);
    }

    @PostMapping
    public Expedition createExpedition(@RequestBody @NonNull Expedition expedition) {
        return expeditionService.createExpedition(expedition);
    }

    @PutMapping
    public Expedition updateExpedition(@RequestBody @NonNull Expedition expedition) {
        return expeditionService.updateExpedition(expedition);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteExpedition(@PathVariable(value = "id") Long id) {
        expeditionService.deleteExpedition(id);
    }
}
