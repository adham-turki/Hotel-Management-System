package com.example.Hotel.services;

import com.example.Hotel.entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    Reservation getReservationById(Integer id);
    List<Reservation> getAllReservations();
    void deleteReservation(Integer id);
    List<Reservation> findByCustomerId(Integer customerId);
    Reservation updateReservationStatus(Integer reservationId,String newStatus);


}
