package com.example.Hotel.repositories;

import com.example.Hotel.entities.HouseKeeping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseKeepingRepository extends JpaRepository<HouseKeeping, Integer> {
}
