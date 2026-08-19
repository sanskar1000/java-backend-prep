# Dependency Injection — Order Service

## 📌 Overview

This project demonstrates **Dependency** and **Constructor Dependency Injection** using Java.

The example uses an `OrderService` that depends on a `PaymentService` to process payments.

The main goal is to understand how one class can receive its dependency from outside instead of creating that dependency itself.

---

## 📁 Project Structure

05-dependency/
├── OrderServiceDemo.java
├── README.md
└── InterviewQuestions.md

---

## 🎯 Learning Objectives

After completing this project, you should understand:

1. What a dependency is.
2. What Dependency Injection means.
3. What Constructor Injection is.
4. Why dependencies should be provided from outside.
5. How Dependency Injection reduces tight coupling.
6. How constructor validation protects required dependencies.
7. How one service can use another service.
8. How Dependency Injection prepares code for interface-based design.

---

## 🧠 What Is a Dependency?

A dependency exists when one class needs another class to perform its responsibility.

In this project:

```text
OrderService
      │
      │ depends on
      ▼
PaymentService
