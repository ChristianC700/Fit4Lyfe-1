package com.example.Fit4Lyfe.repositories;

import com.example.Fit4Lyfe.models.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SetRepository extends JpaRepository<Set, Long> {
}
