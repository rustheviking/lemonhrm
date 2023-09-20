package com.virusoft.repositories;

import jakarta.persistence.EntityManager;

public abstract class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;

    public UserRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
