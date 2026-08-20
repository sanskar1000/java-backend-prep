# SOLID — Single Responsibility Principle (SRP)

## 📌 Overview

This project demonstrates the **Single Responsibility Principle (SRP)** using a simple Employee management example.

The goal is to understand how responsibilities should be separated into different classes instead of putting unrelated responsibilities into one large class.

---

## 📁 Project Structure

07-solid-srp/
├── EmployeeSRPDemo.java
├── README.md
└── InterviewQuestions.md

---

## 🎯 Learning Objectives

After completing this project, you should understand:

- What SOLID principles are.
- What the Single Responsibility Principle means.
- What a responsibility means in OOP.
- Why large classes become difficult to maintain.
- How to separate responsibilities into different classes.
- How SRP improves maintainability and readability.
- How SRP reduces unnecessary changes between unrelated parts of a program.

---

# 🧠 What is SRP?

SRP stands for:

**Single Responsibility Principle**

Definition:

> A class should have one reason to change.

A simpler way to remember it:

> One class should have one main responsibility.

SRP is the first principle of SOLID.

---

# ❌ Example of Poor Design

A class should not try to handle everything:

Employee
├── Store employee data
├── Calculate salary
├── Print employee details
├── Save employee to database
└── Send employee email

This creates a class with multiple responsibilities.

If salary calculation changes, the class changes.

If printing changes, the class changes.

If database logic changes, the class changes.

Therefore, the class has multiple reasons to change.

---

# ✅ SRP Design

The responsibilities are separated:

Employee
↓
Stores employee data

SalaryCalculator
↓
Calculates annual salary

EmployeePrinter
↓
Displays employee information

Each class has a focused responsibility.

---

# 👨‍💼 Employee

The `Employee` class represents employee data.

### Fields

- `employeeId`
- `name`
- `salary`

The fields are private to demonstrate encapsulation.

### Responsibilities

The `Employee` class is responsible for:

- Storing employee information.
- Validating employee information during construction.
- Providing access through getters.

It does not calculate annual salary or print employee reports.

---

# 💰 SalaryCalculator

The `SalaryCalculator` class is responsible for salary calculations.

It provides:

`calculateAnnualSalary(Employee employee)`

The calculation is:

Monthly Salary × 12

For example:

Monthly Salary = ₹50,000

Annual Salary = ₹600,000

If salary calculation rules change, this class can be modified without changing the `Employee` class.

---

# 🖨️ EmployeePrinter

The `EmployeePrinter` class is responsible for displaying employee information.

It provides:

`printEmployee(Employee employee)`

It displays:

- Employee ID
- Name
- Salary

Printing logic is separated from employee data.

---

# 🔄 Program Flow

Employee object is created.

↓

Employee data is stored inside `Employee`.

↓

`SalaryCalculator` receives the Employee.

↓

Annual salary is calculated.

↓

`EmployeePrinter` receives the Employee.

↓

Employee details are displayed.

---

# 🧩 Class Responsibility Diagram

Employee
│
├── employeeId
├── name
├── salary
└── getters

SalaryCalculator
│
└── calculateAnnualSalary()

EmployeePrinter
│
└── printEmployee()

Each class has a clear responsibility.

---

# 💡 Why SRP is Important

SRP provides several benefits:

### 1. Maintainability

Changes to one responsibility are less likely to affect unrelated code.

### 2. Readability

Classes are smaller and easier to understand.

### 3. Testability

Each responsibility can be tested independently.

### 4. Reusability

A class such as `SalaryCalculator` can be reused by other parts of the application.

### 5. Reduced Coupling

Unrelated responsibilities are not unnecessarily connected.

---

# ⚠️ Important Understanding

SRP does NOT mean:

> A class can have only one method.

A class can contain multiple methods as long as those methods belong to the same responsibility.

For example:

Employee:

- `getName()`
- `getSalary()`
- `getEmployeeId()`

These methods all relate to employee data.

Therefore, they are compatible with SRP.

---

# 🔍 Reason to Change

A useful way to identify SRP violations is to ask:

> "How many different reasons could make this class change?"

For example:

If one class contains:

- Employee data
- Salary calculation
- Printing
- Database operations

then it has multiple reasons to change.

That is a strong sign that responsibilities should be separated.

---

# 🧠 Memory Trick

Remember:

**SRP = One class, one main responsibility.**

Or:

**One responsibility → One reason to change.**

---

# 🎓 Concepts Practiced

- [x] Classes
- [x] Objects
- [x] Encapsulation
- [x] Constructors
- [x] Validation
- [x] Getters
- [x] Separation of responsibilities
- [x] Single Responsibility Principle
- [x] SOLID fundamentals
- [x] Loose coupling
- [x] Cohesive class design

---

# 🚀 Future Improvements

This project can later be extended with:

- Employee repository
- Database persistence
- Email service
- Salary strategies
- Interfaces
- Dependency Injection
- Unit testing
- Spring Boot services

These extensions will help connect basic OOP principles with real-world backend architecture.

---

# ⭐ Key Takeaway

Bad design:

One class does everything.

Good design:

Each class has a clear and focused responsibility.

The main lesson is:

**Separate responsibilities so that a change in one responsibility does not unnecessarily affect another.**

This makes Java applications easier to understand, test, maintain, and extend.
