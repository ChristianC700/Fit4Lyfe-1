package com.example.Fit4Lyfe.services;

import com.example.Fit4Lyfe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

//UserService handles business logic for the User resource
@Component
public class UserService {

    @Autowired //injects userRepository bean from the application context
    private UserRepository userRepository;

    public ResponseEntity<?> getAllUsers() {
        if(userRepository.findAll().isEmpty()) {
            return ResponseEntity.badRequest().body("No users found.");
        }

        return ResponseEntity.ok().body("Successfully retrieved all users.");
    }
}
