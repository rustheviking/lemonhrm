package com.virusoft.services;

import com.virusoft.models.User;

public interface UserService {

    User findByUsername(String username);

}
