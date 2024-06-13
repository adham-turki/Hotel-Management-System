package com.example.Hotel.services.imp;

import com.example.Hotel.entities.Employee;
import com.example.Hotel.entities.Reservation;
import com.example.Hotel.exception.BadRequestException;
import com.example.Hotel.exception.ResourceNotFoundException;
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

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        if (employee == null || employee.getName() == null) {
            throw new BadRequestException("Employee", "Employee details");
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        if (employee == null || employee.getId() == null) {
            throw new BadRequestException("Employee", "ID");
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "ID", id));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(Integer id) {
        if (!employeeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Employee", "ID", id);
        }
        employeeRepository.deleteById(id);
    }

    @Override
    public Reservation updateReservationStatus(Integer reservationId, String newStatus) {
        if (newStatus == null || newStatus.isEmpty()) {
            throw new BadRequestException("Reservation", "Status");
        }

        Reservation reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation", "ID", reservationId));

        // Assuming there's a check to ensure the user is an employee
        reservation.setStatus(newStatus);
        return reservationRepository.save(reservation);
    }
}
