package com.virusoft.controllers;

import com.virusoft.models.User;
import com.virusoft.services.UserService;

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    public void createUser(User user){

        User createUser = userService.createUser(user);

        // Handling the response, such as displaying the user or updating UI

    }

    public void getUserById(Integer id){

        User getUserById = userService.getUserById(id);

        // Handling the response, such as displaying the user or updating UI

    }

    // Other methods for updating, deleting, and retrieving users

}
