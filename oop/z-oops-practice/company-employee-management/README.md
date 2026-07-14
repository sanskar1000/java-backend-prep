# Company Employee Management System

A console-based Java application built to practice **Object-Oriented Programming (OOP)** fundamentals using Core Java.

This project demonstrates how a company manages employees through object-oriented design, encapsulation, constructors, object composition, and arrays of objects.

---

## Features

- Create a company
- Create employee objects
- Hire employees
- Prevent duplicate employee IDs
- Search employees by employee ID
- Increase employee salary
- Remove employees
- Display all employee details
- Validate input data

---

## OOP Concepts Demonstrated

- Classes and Objects
- Constructors
- Encapsulation
- Object Composition (Has-A Relationship)
- Arrays of Objects
- Data Validation
- Instance Methods
- Getter Methods

---

## Project Structure

```text
company-employee-management/
│
├── Company.java
├── Employee.java
├── Main.java
└── README.md
```

---

## Class Design

### Employee

**Fields**

- employeeId
- name
- salary

**Responsibilities**

- Store employee information
- Validate employee data
- Increase salary
- Display employee details

---

### Company

**Fields**

- companyName
- Employee[] employees
- employeeCount

**Responsibilities**

- Hire employees
- Search employees
- Remove employees
- Display all employees
- Prevent duplicate employee IDs

---

## Sample Workflow

```text
Create Company
      │
      ▼
Create Employees
      │
      ▼
Hire Employees
      │
      ▼
Display Employees
      │
      ▼
Increase Salary
      │
      ▼
Search Employee
      │
      ▼
Remove Employee
      │
      ▼
Display Updated Employee List
```

---

## Time Complexity

| Operation | Complexity |
|----------|------------|
| Hire Employee | O(n) |
| Search Employee | O(n) |
| Remove Employee | O(n) |
| Display Employees | O(n) |
| Increase Salary | O(1) |

---

## Space Complexity

```text
O(n)
```

where **n** is the maximum number of employees.

---

## Sample Output

```text
=========================================
Company Employee Management System
=========================================

Raj hired successfully.
Raminta hired successfully.
Ram hired successfully.

===== All Employees =====

Company : Google

Employee Details
----------------
Name   : Raj
ID     : E101
Salary : ₹50000.00

Employee Details
----------------
Name   : Raminta
ID     : E102
Salary : ₹70000.00

Employee Details
----------------
Name   : Ram
ID     : E103
Salary : ₹80000.00
```

---

## Future Improvements

- Use `ArrayList` instead of arrays
- Add department management
- Add employee update functionality
- Add exception handling
- Store data in files
- Build a menu-driven application
- Apply inheritance and polymorphism
- Connect to a database using JDBC

---

## Technologies Used

- Java
- Object-Oriented Programming
- IntelliJ IDEA / VS Code
- Git & GitHub

---

## Author

**Aradhya Thakur**

Learning Java Backend Development one project at a time.
