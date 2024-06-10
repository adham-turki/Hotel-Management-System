package com.example.Hotel.controller;

import com.example.Hotel.entities.ReservationRoom;
import com.example.Hotel.services.ReservationRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation-rooms")
public class ReservationRoomController {

    @Autowired
    private ReservationRoomService reservationRoomService;

    @PostMapping("/")
    public ResponseEntity<ReservationRoom> createReservationRoom(@RequestBody ReservationRoom reservationRoom) {
        ReservationRoom createdReservationRoom = reservationRoomService.createReservationRoom(reservationRoom);
        return ResponseEntity.ok(createdReservationRoom);
    }

    @GetMapping("/{roomId}/{reservationId}")
    public ResponseEntity<ReservationRoom> getReservationRoomById(@PathVariable Integer roomId, @PathVariable Integer reservationId) {
        ReservationRoom reservationRoom = reservationRoomService.getReservationRoomById(roomId, reservationId);
        return ResponseEntity.ok(reservationRoom);
    }

    @GetMapping("/")
    public ResponseEntity<List<ReservationRoom>> getAllReservationRooms() {
        List<ReservationRoom> reservationRooms = reservationRoomService.getAllReservationRooms();
        return ResponseEntity.ok(reservationRooms);
    }

    @DeleteMapping("/{roomId}/{reservationId}")
    public ResponseEntity<Void> deleteReservationRoom(@PathVariable Integer roomId, @PathVariable Integer reservationId) {
        reservationRoomService.deleteReservationRoom(roomId, reservationId);
        return ResponseEntity.noContent().build();
    }
}
