package com.example.Hotel.services;

import com.example.Hotel.entities.HouseKeeping;

public interface HouseKeepingService {
    HouseKeeping addHouseKeeping(HouseKeeping houseKeeping);
    HouseKeeping getHouseKeepingById(Integer id);
    HouseKeeping updateHouseKeeping(HouseKeeping houseKeeping);
    void deleteHouseKeeping(Integer id);
}
