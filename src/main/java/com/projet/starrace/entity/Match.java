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
    private Teams homeTeam;
    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private Teams awayTeam;
    @ManyToOne
    @JoinColumn(name = "tournament_id")
    private Tournaments tournament;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Tournaments getTournament() {
        return tournament;
    }

    public void setTournament(Tournaments tournament) {
        this.tournament = tournament;
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
