package com.PabloMerino.Dining.App.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "USER")
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="USER_CITY")
    private String userCity;

    @Column(name="USER_STATE")
    private String userState;

    @Column(name="USER_ZIP_CODE")
    private String userZipCode;

    @Column(name="INTEREST_PEANUT")
    private boolean intPeanut;

    @Column(name="INTEREST_EGG")
    private boolean intEgg;

    @Column(name="INTEREST_DAIRY")
    private boolean intDairy;

    // CONSTRUCTOR

    public User(String userName, String userCity, String userState, String userZipCode, boolean intPeanut, boolean intEgg, boolean intDairy) {
        this.userName=userName;
        this.userCity=userCity;
        this.userState=userState;
        this.userZipCode=userZipCode;
        this.intPeanut=intPeanut;
        this.intEgg=intEgg;
        this.intDairy=intDairy;
    }




}
