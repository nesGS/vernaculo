package com.nesGS.vernaculo.service.serviceImp;

import com.nesGS.vernaculo.model.Match;
import com.nesGS.vernaculo.service.MatchService;

import java.util.Optional;

public class MatchServiceImpl implements MatchService {


    @Override
    public Iterable<Match> getAllMatch() {
        return null;
    }

    @Override
    public Optional<Match> getMatchById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Match> createMatch(Match match) {
        return Optional.empty();
    }

    @Override
    public Optional<Match> updateMatch(Long id, Match match) {
        return Optional.empty();
    }

    @Override
    public void deleteMatch(Long id) {

    }
}
