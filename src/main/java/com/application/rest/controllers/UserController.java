package com.application.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.rest.entities.User;
import com.application.rest.service.IUserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private IUserService userService;

  @GetMapping("/findAll")
  ResponseEntity<List<User>> findAll() {
    return ResponseEntity.ok(userService.findAll());
  }

  @GetMapping("/find/{id}")
  ResponseEntity<User> findById(@PathVariable Long id) {
    Optional<User> userOptional = userService.findById(id);

    return userOptional.isPresent() ? ResponseEntity.ok(userOptional.get()) : ResponseEntity.notFound().build();
  }

}
