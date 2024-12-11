package com.projet.starrace.controller;

import com.projet.starrace.entity.Match;
import com.projet.starrace.service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("match")
public class MatchController {
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public void postTeam(@RequestBody Match match){
        matchService.add(match);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path ="/all",produces = APPLICATION_JSON_VALUE )
    public List<Match> getAll(){
        return matchService.getAll();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "{id}",produces = APPLICATION_JSON_VALUE)
    public Match findById(@PathVariable int id){
        return this.matchService.getById(id);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void removeById(@PathVariable int id){
        this.matchService.removeById(id);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PutMapping(path ="{id}",consumes = APPLICATION_JSON_VALUE)
    public void setById(@PathVariable int id,@RequestBody Match match){
        this.matchService.setById(id,match);
    }
}