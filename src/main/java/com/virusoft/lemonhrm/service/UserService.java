package com.virusoft.lemonhrm.service;

import com.virusoft.lemonhrm.entity.User;

public interface UserService {

    User findByUserName(String userName);

}
