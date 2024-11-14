package com.projet.starrace.service;

import com.projet.starrace.entity.Teams;
import com.projet.starrace.repository.TeamsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsService {
    private TeamsRepository teamsRepository;

    public TeamsService(TeamsRepository teamsRepository) {
        this.teamsRepository = teamsRepository;
    }

    public List<Teams> getAll() {
        return teamsRepository.findAll();
    }

    public Teams getById(int id) {
        return teamsRepository.findById(id);
    }
}