package com.example.Fit4Lyfe.repositories;

import com.example.Fit4Lyfe.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
