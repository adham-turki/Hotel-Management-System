// BillingController.java
package com.example.Hotel.controller;

import com.example.Hotel.entities.Billing;
import com.example.Hotel.services.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping("/create")
    public ResponseEntity<Billing> createBilling(@RequestBody Billing billing) {
        Billing createdBilling = billingService.createBilling(billing);
        return ResponseEntity.ok(createdBilling);
    }

    @PutMapping("/update")
    public ResponseEntity<Billing> updateBilling(@RequestBody Billing billing) {
        Billing updatedBilling = billingService.updateBilling(billing);
        return ResponseEntity.ok(updatedBilling);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Billing> getBillingById(@PathVariable Integer id) {
        Billing billing = billingService.getBillingById(id);
        return ResponseEntity.ok(billing);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBilling(@PathVariable Integer id) {
        billingService.deleteBilling(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/")
    public ResponseEntity<List<Billing>> getAllBillings() {
        List<Billing> billings = billingService.getAllBillings();
        return ResponseEntity.ok(billings);
    }
}
