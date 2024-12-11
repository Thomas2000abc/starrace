package com.projet.starrace.controller;
import com.projet.starrace.entity.Players;

import com.projet.starrace.entity.Tournaments;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import com.projet.starrace.service.PlayersService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "player")
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

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "id/{id}", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public Players getById(@PathVariable int id) {
        return playersService.getById(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public void add(@RequestBody Players player) {
        this.playersService.add(player);
    }


    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PutMapping(path = "{id}" ,consumes = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public void setById(@PathVariable int id, @RequestBody Players player){
        this.playersService.setById(id, player);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void removeById(@PathVariable int id){
        this.playersService.removeById(id);
    }


}