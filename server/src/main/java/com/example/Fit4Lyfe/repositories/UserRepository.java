package com.example.Fit4Lyfe.repositories;

import com.example.Fit4Lyfe.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
