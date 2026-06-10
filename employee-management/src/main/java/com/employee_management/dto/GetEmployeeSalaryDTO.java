package com.employee_management.dto;

public class GetEmployeeSalaryDTO {
    private String fullName;
    private String empId;
    private double salary;

    // Parameterized Constructor.
    public GetEmployeeSalaryDTO(String fullName, String empId, double salary) {
        this.fullName = fullName;
        this.empId = empId;
        this.salary = salary;
    }

    // Getters and Setters.
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
