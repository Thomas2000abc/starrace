package com.projet.starrace.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_team")
    private int id;
    @Column(name="team_name")
    private String teamName;
    @Column(name="team_logo")
    private String teamLogo;
    private boolean validity;

    @Column(name ="team_order")
    private int order;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;
    @OneToMany(mappedBy = "team")
    private List<Participation> participations;

    @OneToMany(mappedBy = "team")
    private List<Players> players;

    @OneToMany(mappedBy = "homeTeam")
    private List<Match> homeTeams;

    @OneToMany(mappedBy = "awayTeam")
    private List<Match> awayTeams;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public void setHomeTeams(List<Match> homeTeams) {
        this.homeTeams = homeTeams;
    }

    public void setAwayTeams(List<Match> awayTeams) {
        this.awayTeams = awayTeams;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(String teamLogo) {
        this.teamLogo = teamLogo;
    }

    public boolean isValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccountId(Account account) {
        this.account = account;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
