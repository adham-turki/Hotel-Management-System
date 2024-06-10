package com.example.Hotel.controller;

import com.example.Hotel.entities.HouseKeeping;
import com.example.Hotel.services.HouseKeepingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/house-keeping")
public class HouseKeepingController {

    @Autowired
    private HouseKeepingService houseKeepingService;

    @PostMapping("/add")
    public ResponseEntity<HouseKeeping> addHouseKeeping(@RequestBody HouseKeeping houseKeeping) {
        HouseKeeping savedHouseKeeping = houseKeepingService.addHouseKeeping(houseKeeping);
        return ResponseEntity.ok(savedHouseKeeping);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HouseKeeping> getHouseKeepingById(@PathVariable Integer id) {
        HouseKeeping houseKeeping = houseKeepingService.getHouseKeepingById(id);
        return ResponseEntity.ok(houseKeeping);
    }

    @PutMapping("/update")
    public ResponseEntity<HouseKeeping> updateHouseKeeping(@RequestBody HouseKeeping houseKeeping) {
        HouseKeeping updatedHouseKeeping = houseKeepingService.updateHouseKeeping(houseKeeping);
        return ResponseEntity.ok(updatedHouseKeeping);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHouseKeeping(@PathVariable Integer id) {
        houseKeepingService.deleteHouseKeeping(id);
        return ResponseEntity.noContent().build();
    }
}
