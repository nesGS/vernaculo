package com.nesGS.vernaculo.service.serviceImp;

import com.nesGS.vernaculo.model.Competition;
import com.nesGS.vernaculo.service.CompetitionService;

import java.util.Optional;

public class CompetitionServiceImpl implements CompetitionService {


    @Override
    public Iterable<Competition> getAllCompetition() {
        return null;
    }

    @Override
    public Optional<Competition> getCompetitionById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Competition> createCompetition(Competition competition) {
        return Optional.empty();
    }

    @Override
    public Optional<Competition> updateCompetition(Long id, Competition competition) {
        return Optional.empty();
    }

    @Override
    public void deleteCompetition(Long id) {

    }
}
