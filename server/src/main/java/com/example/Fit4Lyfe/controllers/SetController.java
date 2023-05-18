package com.example.Fit4Lyfe.controllers;

import com.example.Fit4Lyfe.dtos.SetRequest;
import com.example.Fit4Lyfe.services.SetService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//UserController enables request and response handling for the User resource
@RestController //annotation which injects this bean into the Spring Container/Application Context
@RequestMapping("/api/v1/sets") //path to UserController
@Slf4j //enables logging capabilities
public class SetController {
    @Autowired //injects setService bean from the application context
    private SetService setService;

    @PostMapping("")
    @Transactional
    @SuppressWarnings("UnusedReturnValue")
    public ResponseEntity<?> createSet(@RequestBody SetRequest setRequest) {
        return ResponseEntity.ok().body(setService.createSet(setRequest));
    }

    @GetMapping("")
    @SuppressWarnings("UnusedReturnValue")
    public ResponseEntity<?> getAllSets() {
        return ResponseEntity.ok().body(setService.getAllSets());
    }

    @GetMapping("/{id}")
    @SuppressWarnings("UnusedReturnValue")
    public ResponseEntity<?> getSetById(@PathVariable long id) {
        try {
            return ResponseEntity.ok().body(setService.getSetById(id));
        } catch (EntityNotFoundException e) {
            log.error("Set with id: {} not found", id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Set with id: " + id + " not found.");
        }
    }
}
