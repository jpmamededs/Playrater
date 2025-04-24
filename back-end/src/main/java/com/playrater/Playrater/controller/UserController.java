package com.playrater.Playrater.controller;

import com.playrater.Playrater.entity.User;
import com.playrater.Playrater.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("user/{id}")
  public ResponseEntity<User> getUserById(@PathVariable int id) {
    User user = userService.findUserById(id);
    if (user != null) {
      return ResponseEntity.ok(user);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

}
