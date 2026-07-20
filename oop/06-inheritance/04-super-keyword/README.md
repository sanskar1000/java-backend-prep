# Super Keyword (`super`) in Java

## Overview

This module explains the **`super` keyword** in Java inheritance.

The `super` keyword is used by a child class to access members of its parent class. It allows the child class to reuse existing functionality while extending or customizing behavior.

Understanding `super` is essential for writing clean, reusable, and maintainable object-oriented programs.

---

## Learning Objectives

After completing this module, I learned:

- What the `super` keyword is
- Difference between `super` and `this`
- Calling a parent constructor using `super(...)`
- Calling a parent method using `super.method()`
- Constructor chaining
- Code reuse in inheritance
- Extending parent behavior

---

## Programs

### PersonDemo.java

**Concepts Covered**

- Constructor chaining
- Calling parent constructor using `super(...)`
- Method overriding
- Calling parent methods using `super.method()`
- Code reuse

---

### AnimalDemo.java

**Concepts Covered**

- Inheritance
- `super(...)`
- `super.method()`
- Method overriding
- Parent and child behavior
- Reusing parent functionality

---

## What is `super`?

`super` is a reference to the immediate parent class.

It is used inside a child class to access the parent class members.

---

## Uses of `super`

### 1. Call Parent Constructor

```java
super(name, age);
```

Used to initialize parent class fields.

---

### 2. Call Parent Method

```java
super.displayDetails();
```

Used when a child class wants to reuse the parent's implementation.

---

### 3. Access Parent Field

```java
super.name;
```

Works only if the field is accessible (for example, `protected` or `public`).

---

## `this` vs `super`

| `this` | `super` |
|---------|----------|
| Refers to the current object | Refers to the parent part of the current object |
| Accesses current class members | Accesses parent class members |
| Calls another constructor in the same class | Calls the parent constructor |

---

## Constructor Execution Flow

```text
Create Child Object
        │
        ▼
Child Constructor
        │
        ▼
super(...)
        │
        ▼
Parent Constructor
        │
        ▼
Parent Initialization
        │
        ▼
Return to Child Constructor
        │
        ▼
Child Initialization
        │
        ▼
Object Ready
```

---

## Advantages of `super`

- Reuses parent code
- Avoids duplication
- Ensures proper object initialization
- Improves maintainability
- Makes inheritance easier to understand

---

## Key Takeaways

- `super` refers to the immediate parent class.
- `super()` calls the parent constructor.
- `super.method()` calls a parent method.
- `super.field` accesses a parent field (if accessible).
- `super()` must be the first statement in a constructor.
- `super` helps extend existing behavior instead of rewriting it.

---

## Folder Structure

```text
06-inheritance/
└── 04-super-keyword/
    ├── PersonDemo.java
    ├── AnimalDemo.java
    ├── README.md
    └── InterviewQuestions.md
```

---

## Author

**Aradhya Thakur**

Learning Java OOP step by step with industry-level best practices.
