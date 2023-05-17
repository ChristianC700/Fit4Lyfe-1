package com.example.Fit4Lyfe.services;

import com.example.Fit4Lyfe.dtos.UserRequest;
import com.example.Fit4Lyfe.models.User;
import com.example.Fit4Lyfe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//UserService handles business logic for the User resource
@Service
public class UserService {

    @Autowired //injects userRepository bean from the application context
    private UserRepository userRepository;

    public void createUser(UserRequest userRequest) {
        User user = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail()).build();

        userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
