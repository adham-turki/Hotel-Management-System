package com.example.Hotel.services.imp;

import com.example.Hotel.entities.HouseKeeping;
import com.example.Hotel.repositories.HouseKeepingRepository;
import com.example.Hotel.services.HouseKeepingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseKeepingServiceImpl implements HouseKeepingService {

    @Autowired
    private HouseKeepingRepository houseKeepingRepository;

    @Override
    public HouseKeeping addHouseKeeping(HouseKeeping houseKeeping) {
        return houseKeepingRepository.save(houseKeeping);
    }

    @Override
    public HouseKeeping getHouseKeepingById(Integer id) {
        return houseKeepingRepository.findById(id).orElse(null);
    }

    @Override
    public HouseKeeping updateHouseKeeping(HouseKeeping houseKeeping) {
        return houseKeepingRepository.save(houseKeeping);
    }

    @Override
    public void deleteHouseKeeping(Integer id) {
        houseKeepingRepository.deleteById(id);
    }
}
