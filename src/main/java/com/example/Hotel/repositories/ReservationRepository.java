package com.example.Hotel.repositories;

import com.example.Hotel.entities.Reservation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Reservation r SET r.status = :status WHERE r.id = :reservationId")
    Reservation updateReservationStatus(Integer reservationId);

    // Method to find reservations by customer ID
    List<Reservation> findByCustomerId(Integer customerId);
}
