package com.example.Hotel.controller;

import com.example.Hotel.entities.RoomFeatures;
import com.example.Hotel.services.RoomFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room-features")
public class RoomFeaturesController {

    @Autowired
    private RoomFeaturesService roomFeaturesService;

    @PostMapping("/create")
    public ResponseEntity<RoomFeatures> createRoomFeature(@RequestBody RoomFeatures roomFeatures) {
        RoomFeatures createdRoomFeature = roomFeaturesService.createRoomFeature(roomFeatures);
        return ResponseEntity.ok(createdRoomFeature);
    }

    @PutMapping("/update")
    public ResponseEntity<RoomFeatures> updateRoomFeature(@RequestBody RoomFeatures roomFeatures) {
        RoomFeatures updatedRoomFeature = roomFeaturesService.updateRoomFeature(roomFeatures);
        return ResponseEntity.ok(updatedRoomFeature);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomFeatures> getRoomFeatureById(@PathVariable Integer id) {
        RoomFeatures roomFeature = roomFeaturesService.getRoomFeatureById(id);
        return ResponseEntity.ok(roomFeature);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRoomFeature(@PathVariable Integer id) {
        roomFeaturesService.deleteRoomFeature(id);
        return ResponseEntity.noContent().build();
    }
}
