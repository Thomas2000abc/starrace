package com.projet.starrace.controller;

import com.projet.starrace.entity.Tournaments;
import com.projet.starrace.service.TournamentsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("tournaments")
public class TournamentsController {


    private TournamentsService tournamentsService;
    public TournamentsController(TournamentsService tournamentsService){
        this.tournamentsService = tournamentsService;
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path="all", produces = APPLICATION_JSON_VALUE)
    public List<Tournaments> getAll(){
        return tournamentsService.getAll();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "id/{id}", produces = APPLICATION_JSON_VALUE)
    public Tournaments getById(@PathVariable int id) {
        return tournamentsService.getById(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void add(@RequestBody Tournaments tournament) {
        this.tournamentsService.add(tournament);
    }


    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PutMapping(path = "{id}" ,consumes = APPLICATION_JSON_VALUE)
    public void setById(@PathVariable int id, @RequestBody Tournaments tournament){
        this.tournamentsService.setById(id, tournament);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void removeById(@PathVariable int id){
        this.tournamentsService.removeById(id);
    }



}