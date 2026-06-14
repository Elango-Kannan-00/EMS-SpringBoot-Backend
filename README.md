# Employee Management System (EMS) - Spring Boot Backend

## Overview

Employee Management System (EMS) is a RESTful backend application developed using Spring Boot and PostgreSQL. The application provides APIs to manage employee records, including employee creation, retrieval, update, deletion, and salary management.

This project follows a layered architecture using Controller, Service, Repository, DTO, and Entity layers.

---

## Features

* Add a new employee
* View all employees
* Update employee details
* Delete employee by ID
* Delete all employees
* View employee salary details
* Update employee salary
* Input validation using Jakarta Validation
* PostgreSQL database integration
* DTO-based request and response handling

---

## Technology Stack

| Technology         | Version |
| ------------------ | ------- |
| Java               | 21      |
| Spring Boot        | 4.0.6   |
| Spring Data JPA    | Latest  |
| PostgreSQL         | Latest  |
| Maven              | Latest  |
| Jakarta Validation | Latest  |

---

## Project Structure

```text
employee-management
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.employee_management
│   │   │
│   │   │   ├── controller
│   │   │   │   └── EmployeeController.java
│   │   │   │
│   │   │   ├── service
│   │   │   │   └── EmployeeService.java
│   │   │   │
│   │   │   ├── repository
│   │   │   │   └── EmployeeRepository.java
│   │   │   │
│   │   │   ├── entity
│   │   │   │   └── Employee.java
│   │   │   │
│   │   │   ├── dto
│   │   │   │   ├── EmployeeRequestDTO.java
│   │   │   │   ├── EmployeeResponseDTO.java
│   │   │   │   ├── SalaryRequestDTO.java
│   │   │   │   ├── GetEmployeeSalaryDTO.java
│   │   │   │   └── UpdateSalaryResponseDTO.java
│   │   │   │
│   │   │   ├── exception
│   │   │   │   └── EmployeeException.java
│   │   │   │
│   │   │   └── EmployeeManagementApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│       └── EmployeeManagementApplicationTests.java
│
├── pom.xml
└── README.md
```

---

## Database Configuration

Configure PostgreSQL in `application.properties`.

```properties
spring.application.name=employee-management

spring.datasource.url=jdbc:postgresql://localhost:5432/employeedb
spring.datasource.username=postgres
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Employee Entity

```java
Employee
{
    id          : Long
    fullname    : String
    empId       : String
    dob         : String
    gender      : String
    emailId     : String
    phoneNo     : Long
    salary      : Double
}
```

---

# API Documentation

Base URL:

```http
http://localhost:8080/employee
```

---

## 1. Add Employee

### Request

```http
POST /employee
```

### Request Body

```json
{
  "fullName": "John Doe",
  "empId": "EMP101",
  "dob": "15-08-2000",
  "gender": "Male",
  "emailId": "john@example.com",
  "phoneNo": 9876543210,
  "salary": 45000
}
```

### Response

```json
{
  "empId": "EMP101",
  "fullName": "John Doe",
  "phoneNo": 9876543210
}
```

---

## 2. Get All Employees

### Request

```http
GET /employee
```

### Response

```json
[
  {
    "empId": "EMP101",
    "fullName": "John Doe",
    "phoneNo": 9876543210
  },
  {
    "empId": "EMP102",
    "fullName": "Jane Smith",
    "phoneNo": 9876543211
  }
]
```

---

## 3. Update Employee

### Request

```http
PUT /employee/{id}
```

Example:

```http
PUT /employee/1
```

### Request Body

```json
{
  "fullName": "John Updated",
  "empId": "EMP101",
  "dob": "15-08-2000",
  "gender": "Male",
  "emailId": "johnupdated@example.com",
  "phoneNo": 9876543210,
  "salary": 50000
}
```

### Response

```json
{
  "empId": "EMP101",
  "fullName": "John Updated",
  "phoneNo": 9876543210
}
```

---

## 4. Delete Employee By ID

### Request

```http
DELETE /employee/{id}
```

Example:

```http
DELETE /employee/1
```

### Response

```text
Employee deleted successfully!
```

---

## 5. Delete All Employees

### Request

```http
DELETE /employee
```

### Response

```text
All Employees Deleted!
```

or

```text
No Employee Found.
```

---

## 6. Get Employee Salary

### Request

```http
GET /employee/{id}/salary
```

Example:

```http
GET /employee/1/salary
```

### Response

```json
{
  "fullName": "John Doe",
  "empId": "EMP101",
  "salary": 45000
}
```

---

## 7. Update Employee Salary

### Request

```http
PUT /employee/{id}/salary
```

Example:

```http
PUT /employee/1/salary
```

### Request Body

```json
{
  "fullName": "John Doe",
  "empId": "EMP101",
  "salary": 60000
}
```

### Response

```json
{
  "fullName": "John Doe",
  "salary": 60000
}
```

---

## Validation Rules

### EmployeeRequestDTO

| Field    | Validation |
| -------- | ---------- |
| fullName | Not Blank  |
| empId    | Not Blank  |
| dob      | Not Blank  |
| gender   | Not Blank  |
| emailId  | Not Blank  |
| phoneNo  | Not Null   |
| salary   | Not Null   |

### SalaryRequestDTO

| Field    | Validation |
| -------- | ---------- |
| fullName | Not Blank  |
| empId    | Not Blank  |
| salary   | Not Null   |

---

## Running the Application

### Clone Repository

```bash
git clone https://github.com/Elango-Kannan-00/employee-management.git
```

### Navigate to Project

```bash
cd employee-management
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

---

## Testing with Postman

Import the following requests:

| Method | Endpoint              |
| ------ | --------------------- |
| POST   | /employee             |
| GET    | /employee             |
| PUT    | /employee/{id}        |
| DELETE | /employee/{id}        |
| DELETE | /employee             |
| GET    | /employee/{id}/salary |
| PUT    | /employee/{id}/salary |

---

## Future Enhancements

* Swagger/OpenAPI Documentation
* Global Exception Handling
* Authentication & Authorization using Spring Security
* Pagination & Sorting
* Search Employee by Name
* Email Notifications
* Docker Support
* Unit & Integration Testing

---

## Author

Elango Kannan


