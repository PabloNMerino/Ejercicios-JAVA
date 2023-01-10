package com.PabloMerino.Dining.App.Repositories;

import com.PabloMerino.Dining.App.Model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RestaurantRepository extends CrudRepository <Restaurant, Long>{

    Optional <Restaurant> findByNameAndZipCode(String name, String zipCode);
    Optional <Restaurant> findById(Long id);
    Optional <Restaurant> findByZipCode(String zipCode);

}
