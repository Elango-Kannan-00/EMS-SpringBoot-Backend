package com.employee_management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_management.entity.Employee;
import com.employee_management.dto.EmployeeRequestDTO;
import com.employee_management.dto.EmployeeResponseDTO;
import com.employee_management.exception.EmployeeException;
import com.employee_management.repository.EmployeeRepository;
import com.employee_management.dto.GetEmployeeSalaryDTO;
import com.employee_management.dto.SalaryRequestDTO;
import com.employee_management.dto.UpdateSalaryResponseDTO;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository repository;

    public EmployeeResponseDTO addEmployee(EmployeeRequestDTO request) {
        // Employee object for storing incoming data
        Employee employee = new Employee();

        employee.setFullname(request.getFullName());
        employee.setEmpId(request.getEmpId());
        employee.setEmailId(request.getEmailId());
        employee.setDob(request.getDob());
        employee.setGender(request.getGender());
        employee.setPhoneNo(request.getPhoneNo());
        employee.setSalary(request.getSalary());

        Employee savedEmployee = repository.save(employee);

        EmployeeResponseDTO response = new EmployeeResponseDTO();

        response.setEmpId(savedEmployee.getEmpId());
        response.setFullName(savedEmployee.getFullname());
        response.setPhoneNo(savedEmployee.getPhoneNo());

        return response;

    }

    public List<EmployeeResponseDTO> getAllEmployees() {
        List<Employee> employees = repository.findAll();

        List<EmployeeResponseDTO> response = new ArrayList<>();

        for (Employee employee : employees) {
            EmployeeResponseDTO dto = new EmployeeResponseDTO();

            dto.setEmpId(employee.getEmpId());
            dto.setFullName(employee.getFullname());
            dto.setPhoneNo(employee.getPhoneNo());

            response.add(dto);
        }
        return response;
    }

    public EmployeeResponseDTO editEmployee(EmployeeRequestDTO request, long id) {
        Employee employee = repository.findById(id)
                                      .orElseThrow(() -> new EmployeeException("No Employee with id " + id + "is found!"));

        employee.setEmpId(request.getEmpId());
        employee.setFullname(request.getFullName());
        employee.setEmailId(request.getEmailId());
        employee.setDob(request.getDob());
        employee.setGender(request.getGender());
        employee.setPhoneNo(request.getPhoneNo());

        Employee updatedEmployee = repository.save(employee);

        EmployeeResponseDTO response = new EmployeeResponseDTO();

        response.setEmpId(updatedEmployee.getEmpId());
        response.setFullName(updatedEmployee.getFullname());
        response.setPhoneNo(updatedEmployee.getPhoneNo());

        return response;
    }
    
    public String deleteById(long id) {
        Employee employee = repository.findById(id)
                                      .orElseThrow(() -> new RuntimeException("No Employee found with id " + id +"is found!"));
        
        repository.delete(employee);

        return "Employee deleted successfully!";
    }

    public String deleteAll() {
        if (repository.count() == 0) {
            return "No Employee Found.";
        } else {
            repository.deleteAll();
        }

        return "All Employees Deleted!";
    }

    public GetEmployeeSalaryDTO getEmployeeSalary(long id) {
        Employee employee = repository.findById(id)
                                      .orElseThrow(() -> new RuntimeException("No Employee found with id " + id +"is found!"));

        return new GetEmployeeSalaryDTO(employee.getFullname(), employee.getEmpId(), employee.getSalary());
    }

    public UpdateSalaryResponseDTO editSalary(SalaryRequestDTO request, long id) {
        Employee employee = repository.findById(id)
                                      .orElseThrow(() -> new RuntimeException("No Employee found with id " + id +"is found!"));
        
        employee.setFullname(request.getFullName());
        employee.setEmpId(request.getEmpId());
        employee.setSalary(request.getSalary());

        Employee updatedSalary = repository.save(employee);

        UpdateSalaryResponseDTO response = new UpdateSalaryResponseDTO();

        response.setFullName(updatedSalary.getFullname());
        response.setSalary(updatedSalary.getSalary());

        return response;
    }
}
