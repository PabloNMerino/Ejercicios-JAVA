package com.PabloMerino.Dining.App.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="DINING_REVIEW")
@Getter @Setter
public class DiningReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewId;

    @Column(name="REVIEWED_BY")
    private String name;

    @Column(name="RESTAURANT_ID")
    private Long restaurantId;

    @Column(name="PEANUT_SCORE")
    private double peanutScore;

    @Column(name="EGG_SCORE")
    private double eggScore;

    @Column(name="DAIRY_SCORE")
    private double dairyScore;

    @Column(name="COMMENTARY")
    private String commentary;

    @Column(name="SUBMIT_STATUS")
    @Enumerated(EnumType.STRING)
    private AdminReviewAction SubmitStatus;

    // CONSTRUCTOR

    public DiningReview(String name, Long restaurantId, double peanutScore, double eggScore, double dairyScore, String commentary) {
        this.name = name;
        this.restaurantId = restaurantId;
        this.peanutScore = peanutScore;
        this.eggScore= eggScore;
        this.dairyScore= dairyScore;
        this.commentary= commentary;
    }

}
