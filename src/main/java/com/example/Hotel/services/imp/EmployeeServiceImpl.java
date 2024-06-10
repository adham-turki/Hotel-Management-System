package com.example.Hotel.services.imp;

import com.example.Hotel.entities.Employee;
import com.example.Hotel.entities.Reservation;
import com.example.Hotel.repositories.EmployeeRepository;
import com.example.Hotel.repositories.ReservationRepository;
import com.example.Hotel.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    private ReservationRepository reservationRepository;



    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
    @Override
    public Reservation updateReservationStatus(Integer reservationId, String newStatus) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(reservationId);
        if (optionalReservation.isPresent()) {
            Reservation reservation = optionalReservation.get();
            // Check if the user is an employee before updating the status
            // For example, you can add a check here based on the logged-in user's role
            // For now, let's assume the user is an employee
            reservation.setStatus(newStatus);
            return reservationRepository.save(reservation);
        } else {
            // Handle case when reservation is not found
            return null;
        }
    }

}
