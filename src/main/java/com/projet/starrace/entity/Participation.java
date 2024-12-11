package com.projet.starrace.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "participation")
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_participation")
    private int id;

    @Column(name = "validity")
    private int validity;

    @ManyToOne
    @JoinColumn(name = "tournament_id")
    private Tournaments tournaments;

    @ManyToOne
    @JoinColumn(name = "teams_id")
    private Team team;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public Tournaments getTournaments() {
        return tournaments;
    }

    public void setTournaments(Tournaments tournaments) {
        this.tournaments = tournaments;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
