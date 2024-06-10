package com.example.Hotel.services;

import com.example.Hotel.entities.Room;

import java.util.List;

public interface RoomService {
    Room createRoom(Room room);
    Room updateRoom(Room room);
    Room getRoomById(Integer id);
    List<Room> getAllRooms();
    void deleteRoom(Integer id);
    List<Room> getAvailableRooms();

}
