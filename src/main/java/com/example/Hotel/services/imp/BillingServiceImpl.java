package com.example.Hotel.services.imp;

import com.example.Hotel.entities.Billing;
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
        return billingRepository.save(billing);
    }

    @Override
    public Billing updateBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    @Override
    public Billing getBillingById(Integer id) {
        Optional<Billing> billing = billingRepository.findById(id);
        return billing.orElse(null);
    }

    @Override
    public void deleteBilling(Integer id) {
        billingRepository.deleteById(id);
    }

    @Override
    public List<Billing> getAllBillings() {
        return billingRepository.findAll(); // Fetch all billing records from the repository
    }
}
