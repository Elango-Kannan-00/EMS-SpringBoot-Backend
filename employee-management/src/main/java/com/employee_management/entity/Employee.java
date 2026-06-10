package com.employee_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private long id;
    private String fullname;
    private String empId;
    private String dob;
    private String gender;
    private String emailId;
    private double phoneNo;

    // Parameterized Constructor. 
    public Employee(long id, String fullname, String empId, String dob, String gender, String emailId, double phoneNo) {
        this.id = id;
        this.fullname = fullname;
        this.empId = empId;
        this.dob = dob;
        this.gender = gender;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters.
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
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

}
