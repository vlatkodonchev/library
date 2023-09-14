package com.library.controller;

import com.library.entity.User;
import com.library.repository.UserRepository;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/library/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private UserService userService;

    public ResponseEntity createUser

    @GetMapping("allUsers")
    public ResponseEntity<Set<User>> getAllUsers() {
        Set<User> allUsers = userService.getAllUsers();

        if (!allUsers.isEmpty()) {
            return new ResponseEntity<>(allUsers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(int userId, @PathVariable int id) {
        User user = userService.findById(userId);

        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
