package com.example.Hotel.services.imp;

import com.example.Hotel.entities.RoomFeaturesRelation;
import com.example.Hotel.repositories.RoomFeatureRelationRepository;
import com.example.Hotel.services.RoomFeaturesRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomFeaturesRelationServiceImpl implements RoomFeaturesRelationService {

    @Autowired
    private RoomFeatureRelationRepository roomFeaturesRelationRepository;

    @Override
    public RoomFeaturesRelation createRoomFeaturesRelation(RoomFeaturesRelation roomFeaturesRelation) {
        return roomFeaturesRelationRepository.save(roomFeaturesRelation);
    }

    @Override
    public void deleteRoomFeaturesRelation(RoomFeaturesRelation roomFeaturesRelation) {
        roomFeaturesRelationRepository.delete(roomFeaturesRelation);
    }
}
