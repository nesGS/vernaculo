package com.nesGS.vernaculo.service;


import com.nesGS.vernaculo.model.Player;

import java.util.Optional;

public interface PlayerService {

    public Iterable<Player> getAllPlayer();

    public Optional<Player> getPlayerById(Long id);

    public Optional<Player> createPlayer(Player player);

    public Optional<Player> updatePlayer(Long id, Player player);

    public void deletePlayer(Long id);

}
