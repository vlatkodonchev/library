package com.library.service;

import com.library.entity.User;
import com.library.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Set<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findById(int userId) {
    }
}
