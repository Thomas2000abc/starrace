package com.projet.starrace.controller;
import com.projet.starrace.entity.Players;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projet.starrace.service.PlayersService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "players")
public class PlayersController {

    private PlayersService playersService;

    public PlayersController(PlayersService playersService) {
        this.playersService = playersService;
    }


    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path="all", produces = APPLICATION_JSON_VALUE)
    public List<Players> getAll() {
        return playersService.getAll();
    }
}