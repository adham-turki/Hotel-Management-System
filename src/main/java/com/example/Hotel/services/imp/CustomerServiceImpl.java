package com.example.Hotel.services.imp;

import com.example.Hotel.entities.Customer;
import com.example.Hotel.exception.BadRequestException;
import com.example.Hotel.exception.ResourceNotFoundException;
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
        if (customer == null || customer.getName() == null || customer.getPhoneNumber() == null) {
            throw new BadRequestException("Customer", "Customer details");
        }
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        if (customer == null || customer.getId() == null) {
            throw new BadRequestException("Customer", "ID");
        }
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer", "ID", id));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomer(Integer id) {
        if (!customerRepository.existsById(id)) {
            throw new ResourceNotFoundException("Customer", "ID", id);
        }
        customerRepository.deleteById(id);
    }
}
