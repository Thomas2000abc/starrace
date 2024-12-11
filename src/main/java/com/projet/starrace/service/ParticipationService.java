package com.projet.starrace.service;

import com.projet.starrace.entity.Account;
import com.projet.starrace.entity.Participation;
import com.projet.starrace.entity.Team;
import com.projet.starrace.entity.Tournaments;
import com.projet.starrace.repository.AccountRepository;
import com.projet.starrace.repository.ParticipationRepository;
import com.projet.starrace.repository.TournamentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipationService {
    private ParticipationRepository participationRepository;

    private TeamsService teamService;
    private TournamentsService tournamentService;
    public ParticipationService(ParticipationRepository participationRepository, TeamsService teamService, TournamentsService tournamentService) {
        this.participationRepository = participationRepository;
        this.teamService = teamService;
        this.tournamentService = tournamentService;
    }

    public List<Participation> getAll() {
        return participationRepository.findAll();
    }


    public void add(Participation participation) {
        participationRepository.save(participation);
    }


    public Participation getById(int id) {
        return participationRepository.findById(id);
    }

    public void setById(int id, Participation participation){
        Participation updatedParticipation = this.getById(id);
        int teamId = participation.getTeam().getId();
        Team targetTeam = teamService.getById(teamId);
        this.getById(id).setTeam(targetTeam);
        int tournamentId = participation.getTournaments().getId();
        Tournaments targetTournament = tournamentService.getById(tournamentId);
        this.getById(id).setTournaments(targetTournament);
        updatedParticipation.setValidity(participation.getValidity());
        this.participationRepository.save(updatedParticipation);
    }

    public void removeById(int id){
        this.participationRepository.deleteById(id);
    }
}