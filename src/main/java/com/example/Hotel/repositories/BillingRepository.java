package com.example.Hotel.repositories;

import com.example.Hotel.entities.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Integer> {
}
