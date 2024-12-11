package com.projet.starrace.controller;

import com.projet.starrace.entity.Participation;
import com.projet.starrace.entity.Players;
import com.projet.starrace.service.ParticipationService;
import com.projet.starrace.service.PlayersService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "participation")
public class ParticipationController {

    private ParticipationService participationService;
    public ParticipationController(ParticipationService participationService) {
        this.participationService = participationService;
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path="all", produces = APPLICATION_JSON_VALUE)
    public List<Participation> getAll() {
        return participationService.getAll();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "id/{id}", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public Participation getById(@PathVariable int id) {
        return participationService.getById(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public void add(@RequestBody Participation participation) {
        this.participationService.add(participation);
    }


    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PutMapping(path = "{id}" ,consumes = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public void setById(@PathVariable int id, @RequestBody Participation participation){
        this.participationService.setById(id, participation);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void removeById(@PathVariable int id){
        this.participationService.removeById(id);
    }

}
