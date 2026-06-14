package com.employee_management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SalaryRequestDTO {
    @NotBlank
    private String fullName;

    @NotBlank
    private String empId;

    @NotNull
    private Double salary;

    public SalaryRequestDTO() {
    }

    public SalaryRequestDTO(String fullName, String empId, Double salary) {
        this.fullName = fullName;
        this.empId = empId;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
