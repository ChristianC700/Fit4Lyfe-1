package com.example.Fit4Lyfe.controllers;

import com.example.Fit4Lyfe.models.User;
import com.example.Fit4Lyfe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }
}
