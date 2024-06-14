package com.example.Hotel.controller;

import com.example.Hotel.entities.Billing;
import com.example.Hotel.services.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billing")
public class BillingControllerMediaTypeVersion {

    @Autowired
    private BillingService billingService;

    @PostMapping(value = "/create", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Billing> createBillingV1(@RequestBody Billing billing) {
        Billing createdBilling = billingService.createBilling(billing);
        return ResponseEntity.ok(createdBilling);
    }

    @PutMapping(value = "/update", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Billing> updateBillingV1(@RequestBody Billing billing) {
        Billing updatedBilling = billingService.updateBilling(billing);
        return ResponseEntity.ok(updatedBilling);
    }

    @GetMapping(value = "/{id}", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Billing> getBillingByIdV1(@PathVariable Integer id) {
        Billing billing = billingService.getBillingById(id);
        return ResponseEntity.ok(billing);
    }

    @DeleteMapping(value = "/delete/{id}", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Void> deleteBillingV1(@PathVariable Integer id) {
        billingService.deleteBilling(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/", produces = "application/vnd.example.v1+json")
    public ResponseEntity<List<Billing>> getAllBillingsV1() {
        List<Billing> billings = billingService.getAllBillings();
        return ResponseEntity.ok(billings);
    }
}
