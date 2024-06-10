package com.example.Hotel.controller;

import com.example.Hotel.entities.Employee;
import com.example.Hotel.entities.Reservation;
import com.example.Hotel.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.ok(createdEmployee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @PutMapping("/")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/confirm/{id}")
    public ResponseEntity<Reservation> confirmReservation(@PathVariable Integer id) {
        Reservation updatedReservation = employeeService.updateReservationStatus(id, "confirmed");
        if (updatedReservation != null) {
            return ResponseEntity.ok(updatedReservation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
