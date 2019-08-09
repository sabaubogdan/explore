package com.example.Explore.service;

import com.example.Explore.domain.ExpeditionEntity;
import com.example.Explore.dto.Expedition;
import com.example.Explore.repo.ExpeditionRepo;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@Slf4j
public class ExpeditionService {

    private Mapper mapper;

    private ExpeditionRepo expeditionRepo;

    public ExpeditionService(Mapper mapper, ExpeditionRepo expeditionRepo) {
        this.mapper = mapper;
        this.expeditionRepo = expeditionRepo;
    }

    public Expedition createExpedition(Expedition expedition) {
        ExpeditionEntity expeditionEntity = mapper.map(expedition, ExpeditionEntity.class);
        ExpeditionEntity savedExpeditionEntity = expeditionRepo.save(expeditionEntity);
        return mapper.map(savedExpeditionEntity, Expedition.class);
    }

    public Expedition getExpedition(Long id) {
        Optional<ExpeditionEntity> expeditionOptional = expeditionRepo.findById(id);
        ExpeditionEntity expeditionEntity = expeditionOptional.orElseThrow(() -> new EntityNotFoundException("Expedition with id " + id + " not found"));
        return mapper.map(expeditionEntity, Expedition.class);
    }

    public Expedition updateExpedition(Expedition expedition) {
        ExpeditionEntity expeditionEntity = mapper.map(expedition, ExpeditionEntity.class);
        ExpeditionEntity savedExpeditionEntitu = expeditionRepo.save(expeditionEntity);

        return mapper.map(savedExpeditionEntitu, Expedition.class);
    }

    public void deleteExpedition(Long id) {
        expeditionRepo.deleteById(id);
    }
}
