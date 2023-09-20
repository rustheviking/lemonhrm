package com.virusoft.controllers;

import com.virusoft.models.User;
import com.virusoft.services.UserServiceImpl;

public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    public void createUser(User user){

        //User createUser = userService.createUser(user);

        // Handling the response, such as displaying the user or updating UI

    }

    public void getUserById(Integer id){

        //User getUserById = userService.getUserById(id);

        // Handling the response, such as displaying the user or updating UI

    }

    public void findByUsername(String username){

        User findByUsername = userService.findByUsername(username);

        // Handling the response, such as displaying the user or updating UI

    }

    // Other methods for updating, deleting, and retrieving users

}
