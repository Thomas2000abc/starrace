package com.projet.starrace.entity;

import com.projet.starrace.enumeration.TournamentType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tournaments")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tournaments")
    private int id;
    @Column(name="tournament_name")
    private String tournamentName;
    @Column(name="tournament_type")
    private TournamentType tournamentType;
    @Column(name="tournament_code")
    private int tournamentCode;
    @Column(name="tournament_description")
    private String tournamentDescription;
    @OneToMany(mappedBy = "tournament")
    private List<Participation> participations;
    @OneToMany(mappedBy = "tournament")
    private List<Match> matches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
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
