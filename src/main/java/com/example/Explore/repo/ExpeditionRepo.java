package com.example.Explore.repo;

import com.example.Explore.domain.ExpeditionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpeditionRepo extends JpaRepository<ExpeditionEntity, Long> {
}
