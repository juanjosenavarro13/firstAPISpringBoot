package com.application.rest.persistence.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.application.rest.entities.User;
import com.application.rest.persistence.IUserDAO;
import com.application.rest.repository.UserRepository;

@Component
public class UserDAOImpl implements IUserDAO {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> findAll() {
    return (List<User>) this.userRepository.findAll();
  }

  @Override
  public Optional<User> findById(Long id) {
    return this.userRepository.findById(id);
  }

  @Override
  public void save(User user) {
    this.userRepository.save(user);
  }

  @Override
  public void deleteById(Long id) {
    this.userRepository.deleteById(id);
  }

}
