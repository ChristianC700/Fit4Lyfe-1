package com.example.Fit4Lyfe.controllers;

import com.example.Fit4Lyfe.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//UserController enables request and response handling for the User resource
@RestController //annotation which injects this bean into the Spring Container/Application Context
@RequestMapping("/api/v1/users") //path to UserController
public class UserController {
    @Autowired //injects userService bean from the application context
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
