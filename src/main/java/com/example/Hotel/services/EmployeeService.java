package com.example.Hotel.services;

import com.example.Hotel.entities.Employee;
import com.example.Hotel.entities.Reservation;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    List<Employee> getAllEmployees();
    void deleteEmployee(Integer id);

    Reservation updateReservationStatus(Integer reservationId,String newStatus);

}
