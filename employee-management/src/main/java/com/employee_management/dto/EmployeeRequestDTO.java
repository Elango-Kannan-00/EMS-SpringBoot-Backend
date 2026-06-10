package com.employee_management.dto;

public class EmployeeRequestDTO {
    private long id;
    private String fullName;
    private String empId;
    private String dob;
    private String gender;
    private String emailId;
    private double phoneNo;
    private double salary;

    // Parameterized Constructor. 
    public EmployeeRequestDTO(long id, 
                    String fullName, 
                    String empId, 
                    String dob, 
                    String gender, 
                    String emailId, 
                    double phoneNo,
                    double salary) {
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
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
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

    public double getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
