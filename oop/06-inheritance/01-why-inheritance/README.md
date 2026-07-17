# Why Inheritance in Java

## Overview

Inheritance is one of the four fundamental pillars of Object-Oriented Programming (OOP).

It allows a class to acquire the properties and behaviors of another class, promoting **code reusability**, **maintainability**, and a logical class hierarchy.

Before learning the `extends` keyword, it is important to understand **why inheritance exists** and **when it should be used**.

---

# Why Was Inheritance Introduced?

Without inheritance, common fields and methods must be repeated in multiple classes.

Example:

- Employee
- Manager
- Developer
- Tester

Each class may contain:

- name
- age
- salary
- work()

This leads to **code duplication**.

Inheritance solves this problem by placing common members in a parent class and allowing child classes to reuse them.

---

# Problems Without Inheritance

- Duplicate code
- Difficult maintenance
- Higher chance of bugs
- Larger codebase
- Violates the DRY (Don't Repeat Yourself) principle

---

# Benefits of Inheritance

- Code reusability
- Reduced duplication
- Easier maintenance
- Better organization
- Logical class hierarchy
- Easier extension of existing classes

---

# IS-A Relationship

Inheritance represents an **IS-A** relationship.

Examples:

- Car **IS-A** Vehicle
- Dog **IS-A** Animal
- Manager **IS-A** Employee
- Sparrow **IS-A** Bird

If the sentence makes sense, inheritance is usually appropriate.

---

# HAS-A Relationship

Not every relationship should use inheritance.

Examples:

- Car **HAS-A** Engine
- Student **HAS-A** Laptop
- Mobile **HAS-A** Battery
- Library **HAS-A** Books

These relationships use **composition**, not inheritance.

---

# IS-A vs HAS-A

| IS-A (Inheritance) | HAS-A (Composition) |
|--------------------|---------------------|
| Dog → Animal | Car → Engine |
| Car → Vehicle | Student → Laptop |
| Manager → Employee | Mobile → Battery |
| Sparrow → Bird | Library → Books |

---

# When to Use Inheritance

Use inheritance when:

- There is a genuine IS-A relationship.
- The child is a specialized version of the parent.
- The child should inherit common fields and methods.

---

# When NOT to Use Inheritance

Do not use inheritance simply to reuse code.

If one object contains another object, it is a HAS-A relationship and composition should be preferred.

Example:

- House HAS-A Room
- Computer HAS-A Keyboard
- Phone HAS-A Charger

---

# Real-World Example

```
                Employee
          ┌────────┼────────┐
          │        │        │
      Manager  Developer  Tester
```

Common members belong in the `Employee` class.

Each child class adds only its own specialized behavior.

---

# Interview Questions

### Why was inheritance introduced?

To eliminate code duplication, promote code reuse, improve maintainability, and model IS-A relationships.

---

### What problem does inheritance solve?

It reduces repeated code by allowing child classes to reuse common fields and methods from a parent class.

---

### What is an IS-A relationship?

An IS-A relationship means one class is a specialized form of another class.

Example:

- Dog IS-A Animal
- Car IS-A Vehicle

---

### What is a HAS-A relationship?

A HAS-A relationship means one object contains or uses another object.

Example:

- Car HAS-A Engine
- Student HAS-A Laptop

---

# Key Takeaways

- Inheritance promotes code reuse.
- Inheritance models IS-A relationships.
- Composition models HAS-A relationships.
- Always verify the relationship before using inheritance.
- Prefer clear class hierarchies over unnecessary inheritance.

---

# Folder Structure

```
06-inheritance/
└── 01-why-inheritance/
    ├── README.md
    ├── InterviewQuestions.md
    └── Notes.md
```

---

# Next Topic

**Module 2 — The `extends` Keyword**

- Superclass (Parent Class)
- Subclass (Child Class)
- First inheritance program
- Memory diagrams
- Interview questions
