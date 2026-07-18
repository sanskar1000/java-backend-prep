# Inheritance - `extends` Keyword

## Overview

This module introduces **Inheritance**, one of the four fundamental pillars of Object-Oriented Programming (OOP).

Inheritance allows a child class to reuse the fields and methods of an existing parent class, promoting code reuse and reducing duplication.

The `extends` keyword is used to create an inheritance relationship in Java.

---

## Learning Objectives

After completing this module, I learned:

- What inheritance is
- Why inheritance is used
- How the `extends` keyword works
- Parent (Superclass) and Child (Subclass)
- Code reusability
- IS-A relationship
- Accessing inherited fields and methods
- Designing simple inheritance hierarchies

---

## Programs

### VehicleDemo.java

**Concepts Covered**

- Parent class
- Child class
- `extends` keyword
- Constructor initialization
- Inherited methods
- Child-specific methods

---

### EmployeeDemo.java

**Concepts Covered**

- Inheritance
- Code reuse
- Parent and child constructors
- Common vs specialized behavior
- Real-world class design

---

## Important Concepts

### Parent Class

A class whose members are inherited by another class.

### Child Class

A class that extends another class and inherits its accessible members.

### Syntax

```java
class Parent {

}

class Child extends Parent {

}
```

---

## IS-A Relationship

Inheritance should be used only when an **IS-A** relationship exists.

Examples:

- Car IS-A Vehicle
- Dog IS-A Animal
- Developer IS-A Employee

Incorrect examples:

- Car HAS-A Engine
- Student HAS-A Laptop

These represent composition, not inheritance.

---

## Advantages of Inheritance

- Code reusability
- Reduced code duplication
- Easier maintenance
- Better organization
- Supports hierarchical design

---

## Key Takeaways

- Use `extends` to inherit from another class.
- Child classes automatically inherit accessible members.
- Constructors are **not inherited**.
- A child class can define additional fields and methods.
- Inheritance models an **IS-A** relationship.

---

## Folder Structure

```
06-inheritance/
└── 02-extends-keyword/
    ├── VehicleDemo.java
    ├── EmployeeDemo.java
    ├── README.md
    └── InterviewQuestions.md
```

---

## Author

**Aradhya Thakur**

Learning Java OOP step by step with industry-level best practices.
