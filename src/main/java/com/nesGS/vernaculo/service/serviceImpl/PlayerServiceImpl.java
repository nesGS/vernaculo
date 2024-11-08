package com.nesGS.vernaculo.service.serviceImpl;

import com.nesGS.vernaculo.model.Player;
import com.nesGS.vernaculo.repository.PlayerRepository;
import com.nesGS.vernaculo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class PlayerServiceImpl implements PlayerService {


    @Autowired
    public PlayerRepository playerRepository;

    @Transactional
    @Override
    public Iterable<Player> getAllPlayer() {
        return playerRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public Optional<Player> createPlayer(Player player) {
        Player newPlayer = playerRepository.save(player);
        return Optional.of(newPlayer);
    }

    @Override
    public Optional<Player> updatePlayer(Long id, Player updatedPlayer) {
        updatedPlayer.setId(id);
        Player savedPlayer = playerRepository.save(updatedPlayer);
        return Optional.of(savedPlayer);
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);

    }
}
