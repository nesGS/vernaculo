package com.nesGS.vernaculo.service.serviceImp;

import com.nesGS.vernaculo.model.Team;
import com.nesGS.vernaculo.service.TeamService;

import java.util.Optional;

public class TeamServiceImpl implements TeamService {


    @Override
    public Iterable<Team> getAllTeam() {
        return null;
    }

    @Override
    public Optional<Team> getTeamById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Team> createTeam(Team team) {
        return Optional.empty();
    }

    @Override
    public Optional<Team> updateTeam(Long id, Team team) {
        return Optional.empty();
    }

    @Override
    public void deleteTeam(Long id) {

    }
}
