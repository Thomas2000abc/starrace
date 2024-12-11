package com.projet.starrace.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_match")
    private int id;
    @Column(name = "home_goals")
    private int homeGoals;
    @Column(name = "away_goals")
    private int awayGoals;
    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;
    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;
    @ManyToOne
    @JoinColumn(name = "tournament_id")
    private Tournaments tournaments;

    public int getId() {
        return id;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Tournaments getTournament() {
        return tournaments;
    }

    public void setTournament(Tournaments tournaments) {
        this.tournaments = tournaments;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }
}
