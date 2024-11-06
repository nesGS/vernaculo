package com.nesGS.vernaculo.repository;

import com.nesGS.vernaculo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
