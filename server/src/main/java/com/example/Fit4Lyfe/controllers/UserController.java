package com.example.Fit4Lyfe.controllers;

import com.example.Fit4Lyfe.dtos.UserRequest;
import com.example.Fit4Lyfe.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//UserController enables request and response handling for the User resource
@RestController //annotation which injects this bean into the Spring Container/Application Context
@RequestMapping("/api/v1/users") //path to UserController
@Slf4j //enables logging capabilities
public class UserController {
    @Autowired //injects userService bean from the application context
    private UserService userService;

    @PostMapping("")
    @SuppressWarnings("UnusedReturnValue")
    public ResponseEntity<?> createUser(@RequestBody UserRequest userRequest) {
        return ResponseEntity.ok().body(userService.createUser(userRequest));
    }

    @GetMapping("")
    @SuppressWarnings("UnusedReturnValue")
    public ResponseEntity<?> getAllUsers() {
        try {
            return ResponseEntity.ok().body(userService.getAllUsers());
        } catch (EntityNotFoundException e) {
            return ResponseEntity.badRequest().body("No users found.");
        }
    }
}
