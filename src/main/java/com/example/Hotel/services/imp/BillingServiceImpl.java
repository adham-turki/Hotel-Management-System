package com.example.Hotel.services.imp;

import com.example.Hotel.entities.Billing;
import com.example.Hotel.exception.BadRequestException;
import com.example.Hotel.exception.ResourceNotFoundException;
import com.example.Hotel.repositories.BillingRepository;
import com.example.Hotel.services.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillingServiceImpl implements BillingService {

    @Autowired
    private BillingRepository billingRepository;

    @Override
    public Billing createBilling(Billing billing) {
        if (billing == null || billing.getId() == null || billing.getAmount() <= 0) {
            throw new BadRequestException("Billing", "Amount");
        }
        return billingRepository.save(billing);
    }

    @Override
    public Billing updateBilling(Billing billing) {
        if (billing == null || billing.getId() == null) {
            throw new BadRequestException("Billing", "ID");
        }
        return billingRepository.save(billing);
    }

    @Override
    public Billing getBillingById(Integer id) {
        return billingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Billing", "ID", id));
    }

    @Override
    public void deleteBilling(Integer id) {
        if (!billingRepository.existsById(id)) {
            throw new ResourceNotFoundException("Billing", "ID", id);
        }
        billingRepository.deleteById(id);
    }

    @Override
    public List<Billing> getAllBillings() {
        return billingRepository.findAll();
    }
}
