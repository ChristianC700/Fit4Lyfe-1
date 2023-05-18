package com.example.Fit4Lyfe.dtos;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private double weight;
    private LocalDate dateOfBirth;
    private double height;
}
