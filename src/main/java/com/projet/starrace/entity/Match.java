package com.projet.starrace.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_match")
    private int idMatch;
    @Column(name = "home_team_id")
    private int homeTeamId;
    @Column(name = "away_team_id")
    private int awayTeamId;
    @Column(name = "tournament_id")
    private int tournamentId;
    @Column(name = "home_goals")
    private int homeGoals;
    @Column(name = "away_goals")
    private int awayGoals;
}
