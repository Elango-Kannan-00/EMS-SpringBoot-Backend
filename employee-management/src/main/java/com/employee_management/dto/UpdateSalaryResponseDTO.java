package com.employee_management.dto;

public class UpdateSalaryResponseDTO {
    private String fullName;
    private Double salary;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
