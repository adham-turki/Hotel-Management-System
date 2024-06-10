package com.example.Hotel.services.imp;

import com.example.Hotel.entities.ReservationRoom;
import com.example.Hotel.repositories.ReservationRoomRepository;
import com.example.Hotel.services.ReservationRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationRoomServiceImpl implements ReservationRoomService {

    @Autowired
    private ReservationRoomRepository reservationRoomRepository;

    @Override
    public ReservationRoom createReservationRoom(ReservationRoom reservationRoom) {
        return reservationRoomRepository.save(reservationRoom);
    }

    @Override
    public ReservationRoom getReservationRoomById(Integer roomId, Integer reservationId) {
        Optional<ReservationRoom> reservationRoom = reservationRoomRepository.findById(new ReservationRoom.ReservationRoomId(roomId, reservationId));
        return reservationRoom.orElse(null);
    }

    @Override
    public List<ReservationRoom> getAllReservationRooms() {
        return reservationRoomRepository.findAll();
    }

    @Override
    public void deleteReservationRoom(Integer roomId, Integer reservationId) {
        reservationRoomRepository.deleteById(new ReservationRoom.ReservationRoomId(roomId, reservationId));
    }
}
