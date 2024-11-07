package com.nesGS.vernaculo.service.serviceImpl;

import com.nesGS.vernaculo.model.Club;
import com.nesGS.vernaculo.repository.ClubRepository;
import com.nesGS.vernaculo.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class ClubServiceImpl implements ClubService {


    @Autowired
    private  ClubRepository clubRepository;


    @Transactional
    @Override
    public Iterable<Club> getAllClub() {
        return clubRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Club> getClubById(Long id) {
        return clubRepository.findById(id);
    }

    @Override
    public Optional<Club> createClub(Club club) {
        Club newClub = clubRepository.save(club);
        return Optional.of(newClub);
    }

    @Override
    public Optional<Club> updateClub(Long id, Club updatedClub) {
        updatedClub.setId(id);
        Club savedClub = clubRepository.save(updatedClub);
        return Optional.of(savedClub);
    }

    @Override
    public void deleteClub(Long id) {
        clubRepository.deleteById(id);

    }

}

/* Es posible que en create y update no sea necesario la implementación de Optional */