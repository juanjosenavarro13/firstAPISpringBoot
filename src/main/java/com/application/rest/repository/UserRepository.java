package com.application.rest.repository;

import org.springframework.data.repository.CrudRepository;

import com.application.rest.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
