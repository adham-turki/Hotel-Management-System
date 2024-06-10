package com.example.Hotel.services.imp;

import com.example.Hotel.entities.Room;
import com.example.Hotel.repositories.RoomRepository;
import com.example.Hotel.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room getRoomById(Integer id) {
        Optional<Room> room = roomRepository.findById(id);
        return room.orElse(null);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public void deleteRoom(Integer id) {
        roomRepository.deleteById(id);
    }
    @Override
    public List<Room> getAvailableRooms() {
        return roomRepository.findByAvailable(true);
    }
}
