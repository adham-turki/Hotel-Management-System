package com.example.Hotel.services.imp;

import com.example.Hotel.entities.HouseKeeping;
import com.example.Hotel.exception.BadRequestException;
import com.example.Hotel.exception.ResourceNotFoundException;
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
        if (houseKeeping == null || houseKeeping.getEmployee() == null) {
            throw new BadRequestException("HouseKeeping", "HouseKeeping details");
        }
        return houseKeepingRepository.save(houseKeeping);
    }

    @Override
    public HouseKeeping getHouseKeepingById(Integer id) {
        return houseKeepingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HouseKeeping", "ID", id));
    }

    @Override
    public HouseKeeping updateHouseKeeping(HouseKeeping houseKeeping) {
        if (houseKeeping == null || houseKeeping.getId() == null) {
            throw new BadRequestException("HouseKeeping", "ID");
        }
        return houseKeepingRepository.save(houseKeeping);
    }

    @Override
    public void deleteHouseKeeping(Integer id) {
        if (!houseKeepingRepository.existsById(id)) {
            throw new ResourceNotFoundException("HouseKeeping", "ID", id);
        }
        houseKeepingRepository.deleteById(id);
    }
}
