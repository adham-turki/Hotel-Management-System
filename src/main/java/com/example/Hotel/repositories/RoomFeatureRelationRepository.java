package com.example.Hotel.repositories;

import com.example.Hotel.entities.RoomFeaturesRelation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomFeatureRelationRepository extends JpaRepository<RoomFeaturesRelation, Integer> {
}
