package com.projet.starrace.controller;

import com.projet.starrace.entity.Team;
import com.projet.starrace.repository.TeamsRepository;
import com.projet.starrace.service.TeamsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("team")
public class TeamsController {

    private TeamsService teamsService;

    public TeamsController(TeamsService teamsService) {
        this.teamsService = teamsService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public void postTeam(@RequestBody Team team){
        teamsService.add(team);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path ="/all",produces = APPLICATION_JSON_VALUE )
    public List<Team> getAll(){
        return teamsService.getAll();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "{id}",produces = APPLICATION_JSON_VALUE)
    public Team findById(@PathVariable int id){
        return this.teamsService.getById(id);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void removeById(@PathVariable int id){
        this.teamsService.removeById(id);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PutMapping(path ="{id}",consumes = APPLICATION_JSON_VALUE)
    public void setById(@PathVariable int id,@RequestBody Team team){
        this.teamsService.setById(id,team);
    }

}
