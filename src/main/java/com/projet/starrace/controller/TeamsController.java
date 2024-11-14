package com.projet.starrace.controller;

import com.projet.starrace.entity.Teams;
import com.projet.starrace.service.TeamsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("teams")
public class TeamsController {

    private TeamsService teamService;

    public TeamsController(TeamsService teamService) {
        this.teamService = teamService;
    }

    @GetMapping(path = "all", produces = APPLICATION_JSON_VALUE)
    public List<Teams> getAll() {
        return teamService.getAll();
    }

    @GetMapping(path = "id/{id}", produces = APPLICATION_JSON_VALUE)
    public Teams getById(@PathVariable int id) {
        return teamService.getById(id);
    }
}