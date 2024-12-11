package com.projet.starrace.entity;

import com.projet.starrace.enumeration.TournamentType;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tournaments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tournaments")
    private int id;
    @Column(name="tournament_name")
    private String tournamentName;
    @Enumerated(EnumType.STRING)
    @Column(name="tournament_type")
    private TournamentType tournamentType;
    @Column(name="tournament_code")
    private int tournamentCode;
    @Column(name="tournament_description")
    private String tournamentDescription;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public TournamentType getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(TournamentType tournamentType) {
        this.tournamentType = tournamentType;
    }

    public int getTournamentCode() {
        return tournamentCode;
    }

    public void setTournamentCode(int tournamentCode) {
        this.tournamentCode = tournamentCode;
    }

    public String getTournamentDescription() {
        return tournamentDescription;
    }

    public void setTournamentDescription(String tournamentDescription) {
        this.tournamentDescription = tournamentDescription;
    }
}