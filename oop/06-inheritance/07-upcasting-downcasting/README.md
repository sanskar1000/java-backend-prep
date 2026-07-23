# 07 - Upcasting and Downcasting

## Overview

This module demonstrates one of the most important concepts in Java Object-Oriented Programming: **Upcasting and Downcasting**.

Upcasting allows a child object to be referenced by a parent reference, enabling runtime polymorphism.

Downcasting converts a parent reference back to a child reference so that child-specific methods can be accessed safely.

This project also demonstrates how to prevent `ClassCastException` using the `instanceof` operator.

---

## Learning Objectives

After completing this module, you will understand:

- What is Upcasting
- What is Downcasting
- Why Upcasting is automatic
- Why Downcasting requires an explicit cast
- Runtime Polymorphism
- Safe Downcasting using `instanceof`
- `ClassCastException`
- Parent reference vs Child object
- Method Overriding with Upcasting

---

## Project Structure

```
07-upcasting-downcasting/
├── AnimalDemo.java
├── DogDemo.java
├── README.md
└── InterviewQuestions.md
```

---

## Programs

### AnimalDemo.java

Demonstrates:

- Parent reference
- Child object
- Runtime Polymorphism
- Method Overriding
- Upcasting

---

### DogDemo.java

Demonstrates:

- Upcasting
- Safe Downcasting
- `instanceof`
- Child-specific methods
- Runtime type checking

---

## Key Concepts

### Upcasting

```java
Animal animal = new Dog();
```

- Automatic
- Safe
- Parent reference stores a child object

---

### Downcasting

```java
Dog dog = (Dog) animal;
```

- Explicit
- Requires casting
- Used to access child-specific methods

---

### Safe Downcasting

```java
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
}
```

Using `instanceof` prevents `ClassCastException`.

---

## Memory Concept

```
Stack
------
Animal animal
      |
      |
      V

Heap
------
Dog Object
```

Reference Type

- Animal

Runtime Object

- Dog

---

## Output

Example

```
Animal constructor executed.
Dog constructor executed.

Name    : Bruno
Age     : 10
Breed   : Golden Retriever

Dog is fetching the ball.
```

---

## Skills Practiced

- Inheritance
- Upcasting
- Downcasting
- Runtime Polymorphism
- Method Overriding
- `instanceof`
- Constructor Chaining
- Encapsulation
- Object-Oriented Design

---

## Author

**Aradhya Thakur**

Java Backend Developer Journey • 2026
