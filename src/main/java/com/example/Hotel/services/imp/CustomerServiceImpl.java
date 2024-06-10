package com.example.Hotel.services.imp;

import com.example.Hotel.entities.Customer;
import com.example.Hotel.repositories.CustomerRepository;
import com.example.Hotel.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer registerCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}
