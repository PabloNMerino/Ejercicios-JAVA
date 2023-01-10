package com.PabloMerino.Dining.App.Controller;


import com.PabloMerino.Dining.App.Repositories.RestaurantRepository;
import com.PabloMerino.Dining.App.Repositories.UserRepository;
import com.PabloMerino.Dining.App.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/Restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private UserRepository userRepository;

    // Constructor

    public RestaurantController(RestaurantRepository restaurantRepository, UserRepository userRepository) {
        this.restaurantRepository = restaurantRepository;
        this.userRepository = userRepository;
    }


    // Ver Restaurantes

    @GetMapping()
    public Iterable <Restaurant> verRestaurantes() {
        return this.restaurantRepository.findAll();
    }

    // Agregar nuevo restaurante

    @PostMapping("/New-Restaurant")
    public Restaurant submitNewRestaurant(@RequestBody Restaurant restaurant) {
        Optional <Restaurant> newRestaurantOptional = this.restaurantRepository.findByNameAndZipCode(restaurant.getName(), restaurant.getZipCode());
        if(newRestaurantOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A restaurant with this name and postcode already exists");
        }

        return this.restaurantRepository.save(restaurant);
    }



    // Ver restaurante por ID

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable("restaurantId") long restaurantId) {
        Optional <Restaurant> restaurantByIdOptional = restaurantRepository.findById(restaurantId);

        if(restaurantByIdOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This restaurant does not exist");
        }

        return restaurantByIdOptional.get();
    }





}
