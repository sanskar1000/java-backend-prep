# Open/Closed Principle (OCP) — Salary Calculator

This project demonstrates the Open/Closed Principle (OCP) using employee salary calculation in Java.

## What is OCP?

The Open/Closed Principle states:

> Software entities should be open for extension but closed for modification.

In simple words:

- Open for extension → New behavior can be added.
- Closed for modification → Existing stable code should not need to be changed repeatedly.

## Objective

The goal is to design a salary calculation system where different salary calculation rules can be added without modifying the existing SalaryProcessor.

## Project Structure

08-solid-ocp/
├── SalaryOCPDemo.java
├── README.md
└── InterviewQuestions.md

## Class Design

                    SalaryCalculator
                           ▲
              ┌────────────┼────────────┐
              │            │            │
              ↓            ↓            ↓
        FullTime       Contract       Intern
        Calculator     Calculator     Calculator
              │            │            │
              └────────────┼────────────┘
                           ↓
                    SalaryProcessor

## Classes and Responsibilities

### 1. Employee

Represents employee information.

Fields:

- employeeId
- name
- salary

Responsibilities:

- Store employee data.
- Validate constructor input.
- Provide getters.

### 2. SalaryCalculator

An abstraction for salary calculation.

Method:

    double calculate(Employee employee);

It defines what every salary calculator must do.

### 3. FullTimeSalaryCalculator

Calculates annual salary for a full-time employee.

Formula:

    Annual Salary = Monthly Salary × 12

### 4. ContractSalaryCalculator

Calculates contract salary.

Formula:

    Contract Salary = Monthly Salary × 6

### 5. InternSalaryCalculator

Calculates intern salary.

Formula:

    Intern Salary = Monthly Salary × 3

### 6. SalaryProcessor

Depends on the SalaryCalculator interface instead of a concrete calculator.

Field:

    private SalaryCalculator calculator;

The calculator is supplied through constructor injection.

This allows SalaryProcessor to work with any implementation of SalaryCalculator.

### 7. EmployeePrinter

Responsible only for displaying employee information.

This also supports the Single Responsibility Principle (SRP).

## Polymorphism

A SalaryCalculator reference can refer to different implementations.

Examples:

    SalaryCalculator fullTime = new FullTimeSalaryCalculator();

    SalaryCalculator contract = new ContractSalaryCalculator();

    SalaryCalculator intern = new InternSalaryCalculator();

The method:

    calculator.calculate(employee);

executes the appropriate implementation at runtime.

## Dependency Injection

SalaryProcessor receives its dependency through its constructor.

Example:

    SalaryProcessor processor = new SalaryProcessor(fullTime);

The dependency is created outside SalaryProcessor and injected through the constructor.

This reduces coupling and makes the system easier to extend.

## Bad Design

A tightly coupled design might use a large if/else structure:

    if (type.equals("FULL_TIME")) {
        return employee.getSalary() * 12;
    }

    if (type.equals("CONTRACT")) {
        return employee.getSalary() * 6;
    }

    if (type.equals("INTERN")) {
        return employee.getSalary() * 3;
    }

If a new salary type is introduced, the existing class must be modified.

This makes the class harder to maintain and violates the intended design of OCP.

## OCP Design

The improved design uses an interface:

    interface SalaryCalculator {
        double calculate(Employee employee);
    }

Different salary rules are implemented in separate classes.

For example:

    class FreelancerSalaryCalculator implements SalaryCalculator {

        @Override
        public double calculate(Employee employee) {
            return employee.getSalary() * 4;
        }
    }

A new salary calculation strategy can be added without modifying SalaryProcessor.

## Key Learning

The design follows this flow:

    OCP
     ↓
    Abstraction
     ↓
    Interface
     ↓
    Polymorphism
     ↓
    Dependency Injection
     ↓
    Loose Coupling
     ↓
    Easy Extension

## Example Output

For a monthly salary of ₹50,000:

    Full Time : 600000.0
    Contract  : 300000.0
    Intern    : 150000.0

Calculations:

    Full Time = ₹50,000 × 12 = ₹600,000
    Contract  = ₹50,000 × 6  = ₹300,000
    Intern    = ₹50,000 × 3  = ₹150,000

## Technologies

- Java
- Object-Oriented Programming
- Interfaces
- Abstraction
- Polymorphism
- Dependency Injection
- SOLID Principles

## SOLID Progress

- [x] S — Single Responsibility Principle
- [x] O — Open/Closed Principle
- [ ] L — Liskov Substitution Principle
- [ ] I — Interface Segregation Principle
- [ ] D — Dependency Inversion Principle

## Possible Extensions

New salary calculation implementations can be added:

- FreelancerSalaryCalculator
- PartTimeSalaryCalculator
- ConsultantSalaryCalculator
- CommissionSalaryCalculator
- BonusSalaryCalculator

The existing SalaryProcessor should continue working without modification.

## Author

Aradhya

Java Backend Development — OOP & SOLID Practice
