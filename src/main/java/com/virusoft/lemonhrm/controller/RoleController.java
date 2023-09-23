package com.virusoft.lemonhrm.controller;

import com.virusoft.lemonhrm.entity.Role;
import com.virusoft.lemonhrm.service.RoleServiceImpl;

public class RoleController {

    private final RoleServiceImpl roleService;

    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    public void findByname(String name){

        Role findByname = roleService.findByname(name);

        // Handling the response, such as displaying the user or updating UI

    }

}
