package com.projet.starrace.service;

import com.projet.starrace.entity.Match;
import com.projet.starrace.repository.MatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public void add(Match match){
        this.matchRepository.save(match);
    }

    public List<Match> getAll(){
        return this.matchRepository.findAll();
    }

    public Match getById(int id){
        return this.matchRepository.findById(id);
    }

    public void setById(int id,Match match){
        this.getById(id).setAwayGoals(match.getAwayGoals());
        this.getById(id).setHomeGoals(match.getHomeGoals());
        this.getById(id).setAwayTeam(match.getAwayTeam());
        this.getById(id).setHomeTeam(match.getHomeTeam());
        this.getById(id).setTournament(match.getTournament());
        this.matchRepository.save(this.getById(id));

    }

    public void removeById(int id){
        this.matchRepository.deleteById(id);
    }
}