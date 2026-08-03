# Default Methods in Interfaces

## Overview

This project demonstrates **default methods** introduced in Java 8.

Default methods allow interfaces to provide method implementations. This enables interfaces to evolve without breaking existing classes that implement them.

The project contains two demonstrations:

- CameraDemo
- ConflictDemo

---

## Features

### CameraDemo

- Interface with abstract method
- Interface with default method
- Inherited default method
- Runtime polymorphism
- Encapsulation
- Input validation

### ConflictDemo

- Multiple interface implementation
- Default method conflict
- Method overriding
- Calling interface default methods using `InterfaceName.super.method()`
- Runtime polymorphism

---

## Folder Structure

```text
03-default-methods/
├── CameraDemo.java
├── ConflictDemo.java
├── README.md
└── InterviewQuestions.md
```

---

## OOP Concepts Used

- Interface
- Abstract Method
- Default Method
- Method Overriding
- Runtime Polymorphism
- Encapsulation
- Multiple Interface Implementation
- Interface Default Method Conflict
- Interface-specific super

---

## Expected Learning

After completing this project, you will understand:

- Why Java introduced default methods
- How classes inherit default methods
- How to override default methods
- How Java resolves conflicts when multiple interfaces define the same default method
- The difference between abstract and default methods

---

## Abstract Method vs Default Method

| Abstract Method | Default Method |
|-----------------|----------------|
| No implementation | Has implementation |
| Must be overridden | May be overridden |
| Declared without body | Declared using `default` keyword |
| Mandatory implementation | Optional implementation |

---

## Why Default Methods Were Added

Before Java 8, adding a new method to an interface would break every existing implementation because all implementing classes had to provide that method.

Default methods solve this problem by allowing interfaces to provide a default implementation, enabling interfaces to evolve without breaking existing code.

---

## Resolving Default Method Conflicts

If two interfaces provide a default method with the same signature, the implementing class must override the method.

Example:

```java
Camera.super.start();
MusicPlayer.super.start();
```

This explicitly specifies which interface's default method should be executed.

---

## Key Takeaways

- Interfaces can contain default methods.
- Default methods have implementations.
- Classes inherit default methods automatically.
- Classes may override default methods.
- Conflicts between multiple default methods must be resolved by overriding.
- `InterfaceName.super.method()` calls a specific interface's default implementation.
