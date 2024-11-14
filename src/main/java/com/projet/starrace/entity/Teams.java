package com.projet.starrace.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="teams")
public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_team")
    private int id;
    @Column(name="team_name")
    private String teamName;
    @Column(name="team_logo")
    private String teamLogo;
    private boolean validity;
    private int order;

    /*
    @ManyToOne
    @JoinColumn(name="account_id")
    private Account accountId;
*/
    @Column(name="account_id")
    private int accountId;
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

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
