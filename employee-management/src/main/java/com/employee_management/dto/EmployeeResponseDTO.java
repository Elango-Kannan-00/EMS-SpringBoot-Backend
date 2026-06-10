package com.employee_management.dto;

public class EmployeeResponseDTO {
    private String empId;
    private String fullName;
    private String phoneNo;

    // Parameterized Constructor.
    public EmployeeResponseDTO(String empId, String fullName, String phoneNo) {
        this.empId = empId;
        this.fullName = fullName;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters.
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
