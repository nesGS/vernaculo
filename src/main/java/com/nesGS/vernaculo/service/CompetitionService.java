package com.nesGS.vernaculo.service;


import com.nesGS.vernaculo.model.Competition;

import java.util.Optional;

public interface CompetitionService {

    public Iterable<Competition> getAllCompetition();

    public Optional<Competition> getCompetitionById(Long id);

    public Optional<Competition> createCompetition(Competition competition);

    public Optional<Competition> updateCompetition(Long id, Competition competition);

    public void deleteCompetition(Long id);

}
