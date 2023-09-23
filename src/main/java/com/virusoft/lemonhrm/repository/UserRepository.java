package com.virusoft.lemonhrm.repository;

import com.virusoft.lemonhrm.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserName(String userName);

}
