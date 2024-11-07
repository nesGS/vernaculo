package com.nesGS.vernaculo.service.serviceImpl;

import com.nesGS.vernaculo.model.Competition;
import com.nesGS.vernaculo.repository.CompetitionRepository;
import com.nesGS.vernaculo.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class CompetitionServiceImpl implements CompetitionService {


    @Autowired
    public CompetitionRepository competitionRepository;

    @Transactional
    @Override
    public Iterable<Competition> getAllCompetition() {
        return competitionRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Competition> getCompetitionById(Long id) {
        return competitionRepository.findById(id);
    }

    @Override
    public Optional<Competition> createCompetition(Competition competition) {
        Competition newCompetition = competitionRepository.save(competition);
        return Optional.of(newCompetition);
    }

    @Override
    public Optional<Competition> updateCompetition(Long id, Competition updatedCompetition) {
        updatedCompetition.setId(id);
        Competition savedCompetition = competitionRepository.save(updatedCompetition);
        return Optional.of(savedCompetition);
    }

    @Override
    public void deleteCompetition(Long id) {
        competitionRepository.deleteById(id);

    }
}
