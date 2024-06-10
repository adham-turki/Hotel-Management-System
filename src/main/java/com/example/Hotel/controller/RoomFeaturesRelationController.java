package com.example.Hotel.controller;

import com.example.Hotel.entities.RoomFeaturesRelation;
import com.example.Hotel.services.RoomFeaturesRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room-features-relation")
public class RoomFeaturesRelationController {

    @Autowired
    private RoomFeaturesRelationService roomFeaturesRelationService;

    @PostMapping("/create")
    public ResponseEntity<RoomFeaturesRelation> createRoomFeaturesRelation(@RequestBody RoomFeaturesRelation roomFeaturesRelation) {
        RoomFeaturesRelation createdRoomFeaturesRelation = roomFeaturesRelationService.createRoomFeaturesRelation(roomFeaturesRelation);
        return ResponseEntity.ok(createdRoomFeaturesRelation);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteRoomFeaturesRelation(@RequestBody RoomFeaturesRelation roomFeaturesRelation) {
        roomFeaturesRelationService.deleteRoomFeaturesRelation(roomFeaturesRelation);
        return ResponseEntity.noContent().build();
    }
}
