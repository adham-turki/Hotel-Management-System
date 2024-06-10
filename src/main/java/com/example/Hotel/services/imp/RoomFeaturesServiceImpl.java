package com.example.Hotel.services.imp;

import com.example.Hotel.entities.RoomFeatures;
import com.example.Hotel.repositories.RoomFeaturesRepository;
import com.example.Hotel.services.RoomFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomFeaturesServiceImpl implements RoomFeaturesService {

    @Autowired
    private RoomFeaturesRepository roomFeaturesRepository;

    @Override
    public RoomFeatures createRoomFeature(RoomFeatures roomFeatures) {
        return roomFeaturesRepository.save(roomFeatures);
    }

    @Override
    public RoomFeatures updateRoomFeature(RoomFeatures roomFeatures) {
        return roomFeaturesRepository.save(roomFeatures);
    }

    @Override
    public RoomFeatures getRoomFeatureById(Integer id) {
        Optional<RoomFeatures> roomFeatures = roomFeaturesRepository.findById(id);
        return roomFeatures.orElse(null);
    }

    @Override
    public void deleteRoomFeature(Integer id) {
        roomFeaturesRepository.deleteById(id);
    }
}
