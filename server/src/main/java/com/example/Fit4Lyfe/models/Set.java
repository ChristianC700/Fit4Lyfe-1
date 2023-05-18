package com.example.Fit4Lyfe.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity(name = "Set")
@Table(name = "sets")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Set {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "NumReps")
    private int numOfReps;

    //@Column(name = "Excercise")
    //private Exercise exercise; //To have excercises model
}