package com.nesGS.vernaculo.service;


import com.nesGS.vernaculo.model.Team;

import java.util.Optional;

public interface TeamService {

    public Iterable<Team> getAllTeam();

    public Optional<Team> getTeamById(Long id);

    public Optional<Team> createTeam(Team team);

    public Optional<Team> updateTeam(Long id, Team team);

    public void deleteTeam(Long id);

}
