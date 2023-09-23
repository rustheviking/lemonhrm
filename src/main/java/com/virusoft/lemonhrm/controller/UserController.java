package com.virusoft.lemonhrm.controller;

import com.virusoft.lemonhrm.entity.User;
import com.virusoft.lemonhrm.service.UserServiceImpl;

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

    public void findByUserName(String userName){

        User findByUserName = userService.findByUserName(userName);

        // Handling the response, such as displaying the user or updating UI

    }

    // Other methods for updating, deleting, and retrieving users

}
