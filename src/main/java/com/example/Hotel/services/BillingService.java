package com.example.Hotel.services;

import com.example.Hotel.entities.Billing;

import java.util.List;

public interface BillingService {
    Billing createBilling(Billing billing);
    Billing updateBilling(Billing billing);
    Billing getBillingById(Integer id);
    void deleteBilling(Integer id);
    List<Billing> getAllBillings(); // New method declaration

}
