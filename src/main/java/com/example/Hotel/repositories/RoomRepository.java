package com.example.Hotel.repositories;

import com.example.Hotel.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    List<Room> findByAvailable(boolean available);

}
