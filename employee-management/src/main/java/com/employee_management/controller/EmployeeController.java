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

import com.employee_management.service.EmployeeService;
import com.employee_management.dto.EmployeeRequestDTO;
import com.employee_management.dto.EmployeeResponseDTO;
import com.employee_management.dto.GetEmployeeSalaryDTO;
import com.employee_management.dto.UpdateEmployeeSalaryDTO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService service;

    // HTTP POST
    @PostMapping
    private EmployeeResponseDTO addEmployee(@RequestBody EmployeeRequestDTO request) {
        return service.addEmployee(request);
    }

    // HTTP GET
    @GetMapping
    private List<EmployeeResponseDTO> getAllEmployee() {
        return service.getAllEmployee();
    }

    // HTTP PUT
    @PutMapping("{/id}")
    private EmployeeResponseDTO editEmploye(@RequestBody EmployeeRequestDTO request, @PathVariable long id) {
        return service.editEmployee(request, id);
    }

    // HTTP DELETE BY ID
    @DeleteMapping
    private String deleteById(@PathVariable long id){
        return service.deleteById(id);
    }

    // HTTP DELETE ALL
    @DeleteMapping
    private String deleteAll() {
        return service.deleteAll();
    }

    // HTTP GET EMPLOYEE SALARY
    @GetMapping("{/id}") 
    private GetEmployeeSalaryDTO getSalary(@RequestBody EmployeeRequestDTO request, @PathVariable long id) {
        return service.getEmployeeSalary(request, id);
    }

    // HTTP EDIT EMPLOYEE SALARY
    @PutMapping("{/id}") 
    private UpdateEmployeeSalaryDTO editSalary(@RequestBody EmployeeRequestDTO requestDTO, @PathVariable long id) {
        return service.editSalary(request, id);
    }
}
