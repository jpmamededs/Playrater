package com.playrater.Playrater.service;

import com.playrater.Playrater.entity.User;
import com.playrater.Playrater.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User findUserById(int id) {
    Optional<User> optionalUser = userRepository.findById(id);
    return optionalUser.orElse(null);
  }
}
