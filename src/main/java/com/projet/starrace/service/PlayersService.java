package com.projet.starrace.service;

import com.projet.starrace.entity.Players;
import com.projet.starrace.entity.Team;
import com.projet.starrace.entity.Tournaments;
import org.springframework.stereotype.Service;
import com.projet.starrace.repository.PlayersRepository;

import java.util.List;

@Service
public class PlayersService {

    private PlayersRepository playersRepository;

    private TeamsService teamService;

    public PlayersService(PlayersRepository playersRepository, TeamsService teamService) {
        this.playersRepository = playersRepository;
        this.teamService = teamService;
    }


    public List<Players> getAll() {
        return playersRepository.findAll();
    }

    public Players getById(int id) {
        return playersRepository.findById(id);
    }

    public void add(Players player) {
        playersRepository.save(player);
    }

    public void setById(int id, Players player) {
        Players updatedPlayer = this.getById(id);
        updatedPlayer.setFirstName(player.getFirstName());
        updatedPlayer.setLastName(player.getLastName());
        updatedPlayer.setParagraph(player.getParagraph());
        updatedPlayer.setImage(player.getImage());
        updatedPlayer.setCardImage(player.getCardImage());
        updatedPlayer.setRarity(player.getRarity());
        updatedPlayer.setPosition(player.getPosition());
        int teamId = player.getTeam().getId();
        Team targetTeam = teamService.getById(teamId);
        this.getById(id).setTeam(targetTeam);
        this.playersRepository.save(updatedPlayer);
    }

    public void removeById(int id) {
        this.playersRepository.deleteById(id);
    }
}