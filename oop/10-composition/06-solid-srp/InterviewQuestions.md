# SOLID — Single Responsibility Principle (SRP)
# Interview Questions

## Basic Questions

### 1. What does SOLID stand for?

SOLID is a set of five object-oriented design principles:

- S — Single Responsibility Principle
- O — Open/Closed Principle
- L — Liskov Substitution Principle
- I — Interface Segregation Principle
- D — Dependency Inversion Principle

---

### 2. What is SRP?

SRP stands for Single Responsibility Principle.

It states:

> A class should have one reason to change.

A simpler explanation is:

> A class should have one main responsibility.

---

### 3. Who introduced the Single Responsibility Principle?

The principle is associated with Robert C. Martin (Uncle Bob).

---

### 4. Does SRP mean a class can have only one method?

No.

A class can have multiple methods as long as those methods belong to the same responsibility.

---

### 5. What is a responsibility?

A responsibility is a specific job or reason for which a class exists.

For example:

`Employee` → employee data

`SalaryCalculator` → salary calculation

`EmployeePrinter` → employee display

---

### 6. What is a sign that a class violates SRP?

If a class has multiple unrelated reasons to change, it may be violating SRP.

For example:

Employee class handles:

- Employee data
- Salary calculation
- Database operations
- Email
- Report generation

This indicates multiple responsibilities.

---

### 7. Why is SRP important?

SRP improves:

- Maintainability
- Readability
- Testability
- Reusability
- Modularity
- Separation of concerns

---

## Code-Based Questions

### 8. What is the responsibility of the Employee class in this project?

The `Employee` class represents and manages employee data.

It contains:

- Employee ID
- Name
- Salary

---

### 9. What is the responsibility of SalaryCalculator?

`SalaryCalculator` is responsible for calculating annual salary.

---

### 10. What is the responsibility of EmployeePrinter?

`EmployeePrinter` is responsible for displaying employee information.

---

### 11. Why shouldn't Employee calculate its annual salary?

Because salary calculation is a separate responsibility.

Keeping it in `SalaryCalculator` keeps the `Employee` class focused on employee data.

---

### 12. Why shouldn't EmployeePrinter be inside Employee?

Because displaying employee information is a separate responsibility from representing employee data.

Separating it improves cohesion and maintainability.

---

### 13. What happens if salary calculation rules change?

Only `SalaryCalculator` should normally need to change.

The `Employee` class and `EmployeePrinter` can remain unchanged.

---

### 14. What happens if the employee display format changes?

`EmployeePrinter` can be changed without modifying the employee data model.

---

## Scenario Questions

### 15. Is this class following SRP?

```text
Employee
├── employee data
├── calculate salary
├── save to database
└── send email
