package com.PabloMerino.Dining.App.Controller;


import com.PabloMerino.Dining.App.Model.AdminReviewAction;
import com.PabloMerino.Dining.App.Model.DiningReview;
import com.PabloMerino.Dining.App.Model.Restaurant;
import com.PabloMerino.Dining.App.Repositories.DiningReviewRepository;
import com.PabloMerino.Dining.App.Repositories.RestaurantRepository;
import com.PabloMerino.Dining.App.Repositories.UserRepository;
import com.PabloMerino.Dining.App.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/Dining-Review")
public class DiningReviewController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DiningReviewRepository diningReviewRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;


    // Constructor

    public DiningReviewController(UserRepository userRepository, DiningReviewRepository diningReviewRepository, RestaurantRepository restaurantRepository) {
        this.userRepository = userRepository;
        this.diningReviewRepository = diningReviewRepository;
        this.restaurantRepository = restaurantRepository;
    }

    // Ver todos los reviews

    @GetMapping()
    public Iterable<DiningReview> getAllDiningReviews() {
        return this.diningReviewRepository.findAll();
    }

    // Hacer nuevo review

    @PostMapping()
    public DiningReview newDiningRewiew(@RequestBody DiningReview diningReview) {
        Optional<Restaurant> getRestaurantByIdOptional = this.restaurantRepository.findById(diningReview.getRestaurantId());
        Optional<User> getUserByNameOptional = this.userRepository.findByName(diningReview.getName());

        if (getRestaurantByIdOptional.isEmpty() || getUserByNameOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "An error occurred");
        }

        return diningReviewRepository.save(diningReview);
    }

    // Ver reviews que faltan aprobar o rechazar

    @GetMapping("/Admin/Pending")
    public Optional<DiningReview> getPendingReviews() {
        return diningReviewRepository.findBySubmitStatus(AdminReviewAction.PENDING);
    }

    // Aprobar review

    @PutMapping("/Admin/{id}/Approve")
    public DiningReview approveReview(@PathVariable("reviewId") long reviewId) {
        Optional<DiningReview> diningReviewOptional = diningReviewRepository.findById(reviewId);

        if (diningReviewOptional.isEmpty()) {
            return null;
        }

        DiningReview newDiningReview = diningReviewOptional.get();
        newDiningReview.setSubmitStatus(AdminReviewAction.ACCEPTED);
        return diningReviewRepository.save(newDiningReview);
    }

    // Rechazar review

    @PutMapping("/Admin/{id}/Reject")
    public DiningReview rejectReview(@PathVariable("reviewId") long reviewId) {
        Optional<DiningReview> diningReviewOptional = diningReviewRepository.findById(reviewId);

        if (diningReviewOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This review does not exist");
        }

        DiningReview newDiningReview = diningReviewOptional.get();
        newDiningReview.setSubmitStatus(AdminReviewAction.REJECTED);
        return diningReviewRepository.save(newDiningReview);
    }


    // Mostrar reviews aceptados por restaurante

    @GetMapping("/{id}/Accepted-Reviews")
    public Optional<DiningReview> acceptedReviewsByRestaurant(@PathVariable("restaurantId") long restaurantId) {

        Optional <Restaurant> getRestaurantIdOptional = restaurantRepository.findById(restaurantId);
        if (getRestaurantIdOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This review does not exist");
        }

        return diningReviewRepository.findByIdAndSubmitStatus(restaurantId, AdminReviewAction.ACCEPTED);
    }







}