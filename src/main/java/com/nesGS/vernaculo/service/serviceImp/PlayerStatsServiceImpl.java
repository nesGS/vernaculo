package com.nesGS.vernaculo.service.serviceImp;

import com.nesGS.vernaculo.model.PlayerStats;
import com.nesGS.vernaculo.service.PlayerStatsService;

import java.util.Optional;

public class PlayerStatsServiceImpl implements PlayerStatsService {


    @Override
    public Iterable<PlayerStats> getAllPlayerStats() {
        return null;
    }

    @Override
    public Optional<PlayerStats> getPlayerStatsById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<PlayerStats> createPlayerStats(PlayerStats playerStats) {
        return Optional.empty();
    }

    @Override
    public Optional<PlayerStats> updatePlayerStats(Long id, PlayerStats playerStats) {
        return Optional.empty();
    }

    @Override
    public void deletePlayerStats(Long id) {

    }
}
