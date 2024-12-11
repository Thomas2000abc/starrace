package com.projet.starrace.service;

import com.projet.starrace.entity.Team;
import com.projet.starrace.repository.TeamsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsService {

    TeamsRepository teamsRepository;

    public TeamsService(TeamsRepository teamsRepository) {
        this.teamsRepository = teamsRepository;
    }

    public void add(Team team){
        this.teamsRepository.save(team);
    }

    public List<Team> getAll(){
        return this.teamsRepository.findAll();
    }

    public Team getById(int id){
        return this.teamsRepository.findById(id);
    }

    public void setById(int id,Team team){
        this.getById(id).setTeamName(team.getTeamName());
        this.getById(id).setTeamLogo(team.getTeamLogo());
        this.getById(id).setValidity(team.isValidity());
        this.getById(id).setAccount(team.getAccount());
        this.getById(id).setOrder(team.getOrder());
        this.teamsRepository.save(this.getById(id));
    }

    public void removeById(int id){
        this.teamsRepository.deleteById(id);
    }

}
