package com.employee_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import jakarta.validation.Valid;
import com.employee_management.service.EmployeeService;
import com.employee_management.dto.EmployeeRequestDTO;
import com.employee_management.dto.EmployeeResponseDTO;
import com.employee_management.dto.GetEmployeeSalaryDTO;
import com.employee_management.dto.SalaryRequestDTO;
import com.employee_management.dto.UpdateSalaryResponseDTO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService service;

    // HTTP POST
    @PostMapping
    public EmployeeResponseDTO addEmployee(@Valid @RequestBody EmployeeRequestDTO request) {
        return service.addEmployee(request);
    }

    // HTTP GET
    @GetMapping
    public List<EmployeeResponseDTO> getAllEmployee() {
        return service.getAllEmployees();
    }

    // HTTP PUT
    @PutMapping("/{id}")
    public EmployeeResponseDTO editEmploye(@Valid @RequestBody EmployeeRequestDTO request, @PathVariable long id) {
        return service.editEmployee(request, id);
    }

    // HTTP DELETE BY ID
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id){
        return service.deleteById(id);
    }

    // HTTP DELETE ALL
    @DeleteMapping
    public String deleteAll() {
        return service.deleteAll();
    }

    // HTTP GET EMPLOYEE SALARY
    @GetMapping("/{id}/salary") 
    public GetEmployeeSalaryDTO getSalary(@PathVariable long id) {
        return service.getEmployeeSalary(id);
    }

    // HTTP EDIT EMPLOYEE SALARY
    @PutMapping("/{id}/salary") 
    public UpdateSalaryResponseDTO editSalary(@Valid @RequestBody SalaryRequestDTO request, @PathVariable long id) {
        return service.editSalary(request, id);
    }
}
