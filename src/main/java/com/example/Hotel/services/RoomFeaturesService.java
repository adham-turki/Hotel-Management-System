package com.example.Hotel.services;

import com.example.Hotel.entities.RoomFeatures;

public interface RoomFeaturesService {
    RoomFeatures createRoomFeature(RoomFeatures roomFeatures);
    RoomFeatures updateRoomFeature(RoomFeatures roomFeatures);
    RoomFeatures getRoomFeatureById(Integer id);
    void deleteRoomFeature(Integer id);
}
