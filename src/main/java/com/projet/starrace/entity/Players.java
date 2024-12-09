package com.projet.starrace.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Players {
    @Id
    @GeneratedValue
    @Column(name = "id_players")
    private int id;

    @Column(name = "player_first_name")
    private String firstName;

    @Column(name = "player_last_name")
    private String lastName;

    @Column(name = "player_paragraph")
    private String paragraph;

    @Column(name = "player_image")
    private String image;
    @Column(name = "player_card_image")
    private String cardImage;

    @Column(name = "rarity")
    private String rarity;

    @Column(name = "position")
    private String position;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    /*
    public Players(String firstName, String lastName, String paragraph, String image, String cardImage, Rarity rarity, Position position, Teams team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.paragraph = paragraph;
        this.image = image;
        this.cardImage = cardImage;
        this.rarity = rarity;
        this.position = position;
        this.team = team;
    }

    public Players() {

    }*/

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getCardImage() {
        return cardImage;
    }

    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
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

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}