package com.nesGS.vernaculo.service;


import com.nesGS.vernaculo.model.Club;

import java.util.Optional;

public interface ClubService {

    public Iterable<Club> getAllClub();

    public Optional<Club> getClubById(Long id);

    public Optional<Club> createClub(Club club);

    public Optional<Club> updateClub(Long id, Club club);

    public void deleteClub(Long id);

}
