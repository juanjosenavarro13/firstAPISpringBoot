package com.application.rest.persistence;

import java.util.List;
import java.util.Optional;

import com.application.rest.entities.User;

public interface IUserDAO {
  List<User> findAll();

  Optional<User> findById(Long id);

  void save(User user);

  void deleteById(Long id);
}
