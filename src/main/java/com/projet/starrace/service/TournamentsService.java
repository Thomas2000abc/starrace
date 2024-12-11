package com.projet.starrace.service;

import com.projet.starrace.entity.Account;
import com.projet.starrace.entity.Tournaments;
import com.projet.starrace.repository.AccountRepository;
import com.projet.starrace.repository.TournamentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentsService {
    private TournamentsRepository tournamentsRepository;

    public TournamentsService(TournamentsRepository tournamentsRepository) {
        this.tournamentsRepository = tournamentsRepository;
    }

    public List<Tournaments> getAll() {
        return tournamentsRepository.findAll();
    }


    public void add(Tournaments tournaments) {
        tournamentsRepository.save(tournaments);
    }


    public Tournaments getById(int id) {
        return tournamentsRepository.findById(id);
    }

    public void setById(int id, Tournaments tournaments){
        Tournaments updatedTournaments = this.getById(id);
        updatedTournaments.setTournamentName(tournaments.getTournamentName());/*
        updatedTournaments.setTournamentType(tournaments.getTournamentType());*/
        updatedTournaments.setTournamentCode(tournaments.getTournamentCode());
        updatedTournaments.setTournamentDescription(tournaments.getTournamentDescription());
        this.tournamentsRepository.save(updatedTournaments);
    }

    public void removeById(int id){
        this.tournamentsRepository.deleteById(id);
    }
}