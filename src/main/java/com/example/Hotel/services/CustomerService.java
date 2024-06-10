package com.example.Hotel.services;

import com.example.Hotel.entities.Customer;

import java.util.List;

public interface CustomerService {
    Customer registerCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    Customer getCustomerById(Integer id);
    List<Customer> getAllCustomers();
    void deleteCustomer(Integer id);
}
