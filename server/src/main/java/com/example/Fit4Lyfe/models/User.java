package com.example.Fit4Lyfe.models;

import jakarta.persistence.*;

@Entity(name = "User")
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
