package com.projet.starrace.controller;

import com.projet.starrace.entity.Team;
import com.projet.starrace.entity.Tournaments;
import com.projet.starrace.service.TeamsService;
import com.projet.starrace.service.TournamentsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "teams")
public class TeamsController {

    private TeamsService teamsService;
    public TeamsController(TeamsService teamsService){
        this.teamsService = teamsService;
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path="all", produces = APPLICATION_JSON_VALUE)
    public List<Team> getAll(){
        return teamsService.getAll();
    }
}