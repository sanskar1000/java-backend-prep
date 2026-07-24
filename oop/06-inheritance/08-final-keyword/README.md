# Final Keyword in Java

## 📌 Objective

This module demonstrates how the `final` keyword works in Java.

The `final` keyword is used to prevent modification. It can be applied to:

- Variables
- Methods
- Classes

This module focuses on **final variables** and **final reference variables**.

---

# Topics Covered

- final variable
- Constant variables
- final reference variable
- Mutable objects
- Encapsulation
- Constructor validation
- Getter and Setter methods

---

# Project Structure

```
08-final-keyword/
├── FinalVariableDemo.java
├── README.md
└── InterviewQuestions.md
```

---

# Concepts Learned

## 1. Final Variable

A variable declared with `final` can be assigned only once.

Example:

```java
final int MAX_STUDENTS = 100;
```

Trying to reassign it results in a compile-time error.

---

## 2. Final Reference Variable

A final reference cannot point to another object.

```java
final Student s1 = new Student("Yasir", "Java");
```

This is not allowed:

```java
s1 = new Student("Aradhya", "Python");
```

Compile-time Error

However, modifying the object's state is allowed.

```java
s1.setCourse("Java Backend");
```

The reference remains the same while the object changes.

---

# Key Difference

| Final Reference | Object |
|----------------|--------|
| Cannot change | Can change |
| Fixed reference | Mutable state |

---

# Naming Convention

Constants should be written using **UPPER_SNAKE_CASE**.

Example:

```java
final double PI = 3.14159;
final int MAX_STUDENTS = 100;
final String INSTITUTE_NAME = "Indian Institutes of Technology";
```

---

# Key Takeaways

- `final` variables cannot be reassigned.
- `final` references cannot point to another object.
- A `final` object reference can still modify the object's state.
- Constants follow the UPPER_SNAKE_CASE naming convention.
- `final` helps write safer and more maintainable code.

---

# Author

**Aradhya Thakur**

Java Backend Developer Journey (2026)
