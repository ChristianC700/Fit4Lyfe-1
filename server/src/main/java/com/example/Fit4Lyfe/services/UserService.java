package com.example.Fit4Lyfe.services;

import com.example.Fit4Lyfe.dtos.UserRequest;
import com.example.Fit4Lyfe.dtos.UserResponse;
import com.example.Fit4Lyfe.models.User;
import com.example.Fit4Lyfe.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//UserService handles business logic for the User resource
@Service //Essentially a @Component annotation
@Slf4j //Enables logging capabilities
public class UserService {

    @Autowired //injects userRepository bean from the application context
    private UserRepository userRepository;

    public UserResponse createUser(UserRequest userRequest) {
        User user = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail()).build();

        userRepository.save(user);
        log.info("User {} created.", user.getId());

        return this.mapToUserResponse(user);
    }
    public List<UserResponse> getAllUsers() {
        log.info("Successfully retrieved all users.");
        return userRepository.findAll().stream().map(this::mapToUserResponse).toList();
    }

    public UserResponse getUserById(long id) {
        return userRepository.findById(id).map(this::mapToUserResponse).orElseThrow(EntityNotFoundException::new);
    }

    private UserResponse mapToUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail()).build();
    }
}
