package com.example.Hotel.repositories;

import com.example.Hotel.entities.Employee;
import com.example.Hotel.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
