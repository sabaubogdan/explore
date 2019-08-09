package com.example.Explore.repo;

import com.example.Explore.domain.CaptainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaptainRepo extends JpaRepository<CaptainEntity, Long> {
}
