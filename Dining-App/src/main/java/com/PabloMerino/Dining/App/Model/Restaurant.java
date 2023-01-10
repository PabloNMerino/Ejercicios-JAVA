package com.PabloMerino.Dining.App.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "RESTAURANT")
@Setter @Getter
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long restaurantId;

    @Column(name="NAME")
    private String name;

    @Column(name="CITY")
    private String city;

    @Column(name="STATE")
    private String state;

    @Column(name="ZIP_CODE")
    private String zipCode;


    /* --- Scores --- */

    @Column(name="PEANUT")
    private double peanutScore;

    @Column(name="EGG")
    private double eggScore;

    @Column(name="DIARY")
    private double diaryScore;

    @Column(name="SCORE")
    private double score;


    // Constructor

    public Restaurant(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
        peanutScore = 0.0;
        eggScore = 0.0;
        diaryScore = 0.0;
        score = 0.0;
    }

}
