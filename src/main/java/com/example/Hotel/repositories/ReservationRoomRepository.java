package com.example.Hotel.repositories;

import com.example.Hotel.entities.ReservationRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservationRoomRepository extends JpaRepository<ReservationRoom, Integer> {
    Optional<ReservationRoom> findById(ReservationRoom.ReservationRoomId reservationRoomId);

    void deleteById(ReservationRoom.ReservationRoomId reservationRoomId);
}
