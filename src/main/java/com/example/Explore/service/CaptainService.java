package com.example.Explore.service;

import com.example.Explore.domain.CaptainEntity;
import com.example.Explore.dto.Captain;
import com.example.Explore.repo.CaptainRepo;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@Slf4j
public class CaptainService {

    private Mapper mapper;

    private CaptainRepo captainRepo;

    public CaptainService(Mapper mapper, CaptainRepo captainRepo) {
        this.mapper = mapper;
        this.captainRepo = captainRepo;
    }

    public Captain createCaptain(Captain captain) {
        CaptainEntity captainEntity = mapper.map(captain, CaptainEntity.class);
        CaptainEntity savedCaptainEntity = captainRepo.save(captainEntity);
        return mapper.map(savedCaptainEntity, Captain.class);
    }

    public Captain getCaptain(Long id) {
        Optional<CaptainEntity> captainOptional = captainRepo.findById(id);
        CaptainEntity captainEntity = captainOptional.orElseThrow(() -> new EntityNotFoundException("Captain with id " + id + " notfound"));
        return mapper.map(captainEntity, Captain.class);
    }

    public Captain updateCaptain(Captain captain) {
        CaptainEntity captainEntity = mapper.map(captain, CaptainEntity.class);
        CaptainEntity savedCaptainEntity = captainRepo.save(captainEntity);
        return mapper.map(savedCaptainEntity, Captain.class);
    }

    public void deleteCaptain(Long id) {
        captainRepo.deleteById(id);
    }
}
