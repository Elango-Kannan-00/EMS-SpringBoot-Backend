package com.employee_management.dto;

public class UpdateEmployeeSalaryDTO {
    private String empName;
    private double salary;

    // Parameterized Constructor.
    public UpdateEmployeeSalaryDTO(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    // Getters and Setters.
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
