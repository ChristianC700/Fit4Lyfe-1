package com.example.Fit4Lyfe.models;

import jakarta.persistence.*;
import lombok.Builder;

@Entity(name = "User")
@Table(name = "users")
@Builder
public class User {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;
    @Column(name = "First Name")
    private String firstName;
    @Column(name = "Last Name")
    private String lastName;
    @Column(name = "Email")
    private String email;

}
