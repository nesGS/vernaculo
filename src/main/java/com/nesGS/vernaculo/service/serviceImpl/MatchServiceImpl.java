package com.nesGS.vernaculo.service.serviceImpl;

import com.nesGS.vernaculo.model.Match;
import com.nesGS.vernaculo.repository.MatchRepository;
import com.nesGS.vernaculo.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class MatchServiceImpl implements MatchService {


    @Autowired
    public MatchRepository matchRepository;

    @Transactional
    @Override
    public Iterable<Match> getAllMatch() {
        return matchRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Match> getMatchById(Long id) {
        return matchRepository.findById(id);
    }

    @Override
    public Optional<Match> createMatch(Match match) {
        Match newMatch = matchRepository.save(match);
        return Optional.of(newMatch);
    }

    @Override
    public Optional<Match> updateMatch(Long id, Match updatedMatch) {
        updatedMatch.setId(id);
        Match savedMatch = matchRepository.save(updatedMatch);
        return Optional.of(savedMatch);
    }

    @Override
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);

    }
}
