package com.virusoft.services;

import com.virusoft.models.User;
import com.virusoft.repositories.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {

        // Add any validation or business logic before saving the user

        return userRepository.save(user);

    }

    public User getUserById(Integer id){

        return userRepository.findById(id).orElse(null);

    }

    // Other methods for updating, deleting, and retrieving users

}
