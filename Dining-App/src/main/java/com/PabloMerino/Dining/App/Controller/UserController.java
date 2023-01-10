package com.PabloMerino.Dining.App.Controller;

import com.PabloMerino.Dining.App.Repositories.UserRepository;
import com.PabloMerino.Dining.App.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@RestController
@RequestMapping("/Users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //Constructor

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Obtener todos los usuarios

    @GetMapping()
    public Iterable <User> getAllUsers() {
        return this.userRepository.findAll();
    }

    // Agregar usuario

    @PostMapping()
    public User addUser(@RequestBody User user) {;
        return this.userRepository.save(user);
    }

    // Buscar usuario
    @GetMapping("/{userName}")
    public User getUserName(@PathVariable("userName") String userName) {
        Optional <User> getUserByNameOptional = this.userRepository.findByName(userName);
        if(getUserByNameOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This user does not exist");
        }

        return getUserByNameOptional.get();
    }

    // Actualizar datos de usuario

    @PutMapping("/{userName}")
    public User updateUser(@PathVariable("userName") String userName, @RequestBody User userUpdates) {
        Optional <User> userToUpdateOptional = this.userRepository.findByName(userName);
        if(userToUpdateOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This use does not exist");
        }

        User userToUpdate = userToUpdateOptional.get();

        userToUpdate.setUserCity(userUpdates.getUserCity());
        userToUpdate.setUserState(userUpdates.getUserState());
        userToUpdate.setUserZipCode(userUpdates.getUserZipCode());
        userToUpdate.setIntPeanut(userUpdates.isIntPeanut());
        userToUpdate.setIntEgg(userUpdates.isIntEgg());
        userToUpdate.setIntDairy(userUpdates.isIntDairy());

        this.userRepository.save(userToUpdate);
        return userToUpdate;
    }


}
