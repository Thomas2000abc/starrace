package com.projet.starrace.entity;

import jakarta.persistence.*;

@Entity
public class Participation {
    @Id
    @GeneratedValue
    @Column(name = "id_participation")
    private int id;

    @Column(name = "validity")
    private int validity;

    @ManyToOne
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name = "teams_id")
    private Team team;

    public Participation(int validity) {
        this.validity = validity;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
