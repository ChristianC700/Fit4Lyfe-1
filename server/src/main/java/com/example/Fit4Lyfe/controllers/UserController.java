package com.example.Fit4Lyfe.controllers;

import com.example.Fit4Lyfe.models.User;
import com.example.Fit4Lyfe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//UserController enables request and response handling for the User resource
@RestController //annotation which injects this bean into the Spring Container/Application Context
@RequestMapping("/api/v1/users") //path to UserController
public class UserController {
    @Autowired //injects userRepository bean from the application context
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }
}
