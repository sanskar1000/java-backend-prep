# Camera Utility Demo

## Project Overview

This project demonstrates the use of **static methods in Java interfaces**.

The `Camera` interface defines:

- One abstract method (`takePhoto()`)
- One static utility method (`showPhotographyTips()`)

The `Smartphone` class implements the `Camera` interface and provides its own implementation of `takePhoto()`.

The program also demonstrates proper encapsulation, constructor validation, and method overriding.

---

## Features

- Interface implementation
- Static interface methods
- Method overriding
- Encapsulation
- Constructor validation
- Getters
- Utility methods
- Clean object-oriented design

---

## Project Structure

08-interfaces/
└── 04-static-methods/
    ├── CameraUtilityDemo.java
    ├── README.md
    └── InterviewQuestions.md

---

## OOP Concepts Used

- Interface
- Abstraction
- Encapsulation
- Method Overriding
- Static Methods in Interfaces

---

## Expected Output

- Smartphone details are displayed.
- The smartphone captures a photo.
- Photography tips are displayed using the static interface method.

---

## Abstract vs Default vs Static Methods

| Feature | Abstract | Default | Static |
|----------|----------|----------|--------|
| Has a body | No | Yes | Yes |
| Must be implemented | Yes | No | No |
| Can be overridden | Yes | Yes | No |
| Inherited | Yes | Yes | No |
| Called using | Object | Object | Interface name |

---

## Why Static Methods Were Added

Static methods allow interfaces to provide utility or helper methods that belong to the interface itself instead of any object.

They improve code organization and eliminate the need for separate utility classes in many cases.

---

## Key Learnings

- Static interface methods belong to the interface.
- They are not inherited.
- They cannot be overridden.
- They must be called using the interface name.
- Static methods are useful for common helper functionality.
