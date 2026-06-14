package com.employee_management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeRequestDTO {
    private Long id;
    @NotBlank
    private String fullName;
    @NotBlank
    private String empId;
    @NotBlank
    private String dob;
    @NotBlank
    private String gender;
    @NotBlank
    private String emailId;
    @NotNull
    private Long phoneNo;
    @NotNull
    private Double salary;

    public EmployeeRequestDTO() {}
    
    // Parameterized Constructor. 
    public EmployeeRequestDTO(Long id, 
                    String fullName, 
                    String empId, 
                    String dob, 
                    String gender, 
                    String emailId, 
                    Long phoneNo,
                    Double salary) {
        this.id = id;
        this.fullName = fullName;
        this.empId = empId;
        this.dob = dob;
        this.gender = gender;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.salary = salary;
    }

    // Getters and Setters.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
