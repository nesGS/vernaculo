package com.nesGS.vernaculo.service.serviceImp;

import com.nesGS.vernaculo.model.Club;
import com.nesGS.vernaculo.service.ClubService;

import java.util.Optional;

public class ClubServiceImpl implements ClubService {


    @Override
    public Iterable<Club> getAllClub() {
        return null;
    }

    @Override
    public Optional<Club> getClubById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Club> createClub(Club club) {
        return Optional.empty();
    }

    @Override
    public Optional<Club> updateClub(Long id, Club club) {
        return Optional.empty();
    }

    @Override
    public void deleteClub(Long id) {

    }
}
