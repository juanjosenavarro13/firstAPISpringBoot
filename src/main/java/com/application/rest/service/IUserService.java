package com.application.rest.service;

import java.util.List;
import java.util.Optional;

import com.application.rest.entities.User;

public interface IUserService {

  List<User> findAll();

  Optional<User> findById(Long id);

  void save(User user);

  void deleteById(Long id);

}
