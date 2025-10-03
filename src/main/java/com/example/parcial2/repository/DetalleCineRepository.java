package com.example.parcial2.repository;

import com.example.parcial2.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetalleCineRepository extends JpaRepository<DetalleCine, Long> {
    Optional<DetalleCine> findByEmail(String email);
}
