package com.PabloMerino.Dining.App.Repositories;

import com.PabloMerino.Dining.App.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository <User, String> {

    Optional <User> findByName(String name);

}
