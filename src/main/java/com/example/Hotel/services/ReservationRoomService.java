package com.example.Hotel.services;

import com.example.Hotel.entities.ReservationRoom;

import java.util.List;

public interface ReservationRoomService {
    ReservationRoom createReservationRoom(ReservationRoom reservationRoom);
    ReservationRoom getReservationRoomById(Integer roomId, Integer reservationId);
    List<ReservationRoom> getAllReservationRooms();
    void deleteReservationRoom(Integer roomId, Integer reservationId);
}
