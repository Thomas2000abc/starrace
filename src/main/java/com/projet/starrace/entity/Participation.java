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
    private Tournaments tournamentId;

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

    public Tournaments getTournament() {
        return tournamentId;
    }

    public void setTournament(Tournaments tournament) {
        this.tournamentId = tournament;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
