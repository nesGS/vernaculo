package com.nesGS.vernaculo.service.serviceImp;

import com.nesGS.vernaculo.model.Player;
import com.nesGS.vernaculo.service.PlayerService;

import java.util.Optional;

public class PlayerServiceImpl implements PlayerService {


    @Override
    public Iterable<Player> getAllPlayer() {
        return null;
    }

    @Override
    public Optional<Player> getPlayerById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Player> createPlayer(Player player) {
        return Optional.empty();
    }

    @Override
    public Optional<Player> updatePlayer(Long id, Player player) {
        return Optional.empty();
    }

    @Override
    public void deletePlayer(Long id) {

    }
}
