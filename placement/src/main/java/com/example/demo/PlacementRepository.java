package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
    // No extra methods needed now. JPA handles everything.
}
