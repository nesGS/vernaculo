package com.nesGS.vernaculo.repository;

import com.nesGS.vernaculo.model.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Long> {
}
