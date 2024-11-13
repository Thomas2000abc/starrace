package com.projet.starrace.entity;

import com.projet.starrace.enumeration.Position;
import com.projet.starrace.enumeration.Rarity;
import jakarta.persistence.*;

@Entity
public class Players {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "player_first_name")
    private String firstName;

    @Column(name = "player_last_name")
    private String lastName;

    @Column(name = "player_image")
    private String image;

    @Column(name = "rarity")
    private Rarity rarity;

    @Column(name = "position")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "team_id")
    @Column(name = "team_id")
    private Teams team;

    public Players(String firstName, String lastName, String image, Rarity rarity, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.rarity = rarity;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Teams getTeam() {
        return team;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }
}