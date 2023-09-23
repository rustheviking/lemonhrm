package com.virusoft.lemonhrm.repository;

import com.virusoft.lemonhrm.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByname(String name);

}
