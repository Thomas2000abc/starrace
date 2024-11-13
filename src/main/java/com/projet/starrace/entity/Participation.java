package com.projet.starrace.entity;

import com.projet.starrace.enumeration.Position;
import com.projet.starrace.enumeration.Rarity;
import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

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
    private Teams team;

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

    public Teams getTeam() {
        return team;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }
}
