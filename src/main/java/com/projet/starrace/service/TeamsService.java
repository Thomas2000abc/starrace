package com.projet.starrace.service;

import com.projet.starrace.entity.Team;
import com.projet.starrace.entity.Tournaments;
import com.projet.starrace.repository.PlayersRepository;
import com.projet.starrace.repository.TeamsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsService {
    private TeamsRepository teamsRepository;


    public TeamsService(TeamsRepository teamsRepository) {
        this.teamsRepository = teamsRepository;
    }

    public List<Team> getAll() {
        return teamsRepository.findAll();
    }
}