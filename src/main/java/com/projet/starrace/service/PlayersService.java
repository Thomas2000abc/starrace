package com.projet.starrace.service;

import com.projet.starrace.entity.Players;
import org.springframework.stereotype.Service;
import com.projet.starrace.repository.PlayersRepository;
import java.util.List;

@Service
public class PlayersService {

    private PlayersRepository playersRepository;


    public PlayersService(PlayersRepository playersRepository) {
        this.playersRepository = playersRepository;
    }


    public List<Players> getAll() {
        return playersRepository.findAll();
    }

}