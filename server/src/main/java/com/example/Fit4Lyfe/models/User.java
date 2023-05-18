package com.example.Fit4Lyfe.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "User")
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "First Name")
    private String firstName;

    @Column(name = "Last Name")
    private String lastName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Weight")
    private double weight;

    @Column(name = "DOB")
    private LocalDate dateOfBirth;

    @Column(name = "Height")
    private double height;

}
