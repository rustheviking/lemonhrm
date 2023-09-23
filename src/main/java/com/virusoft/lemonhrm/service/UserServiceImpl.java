package com.virusoft.lemonhrm.service;

import com.virusoft.lemonhrm.entity.User;
import com.virusoft.lemonhrm.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    // Other methods for updating, deleting, and retrieving users

}
