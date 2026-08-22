# Liskov Substitution Principle (LSP)

## Overview

The Liskov Substitution Principle is the "L" in SOLID.

Definition:

A subclass should be usable wherever its parent class is expected without breaking the expected behavior of the program.

In simple words:

A child class should properly behave like its parent class.

---

## Project

This project demonstrates LSP using a Bird hierarchy.

The hierarchy is:

Bird
├── Sparrow
└── Penguin

Sparrow implements Flyable because Sparrow can fly.

Penguin does not implement Flyable because Penguin cannot fly.

---

## Why the Design Matters

A poor design would place fly() directly inside Bird.

That creates a problem:

Bird
├── Sparrow → can fly
└── Penguin → cannot fly

If Penguin inherited fly(), it would either:

1. Throw an exception.
2. Provide meaningless behavior.
3. Violate the expected behavior of Bird.

Therefore, flying should not be a universal Bird behavior.

---

## Correct Design

The common behavior belongs to Bird:

- eat()

The flying capability belongs to Flyable:

- fly()

The Penguin-specific behavior belongs to Penguin:

- swim()

Structure:

Bird
├── Sparrow
│   └── Flyable
└── Penguin
    └── swim()

---

## Classes and Interfaces

### Bird

Responsibilities:

- Store bird name.
- Validate name.
- Provide getName().
- Provide eat().

### Flyable

Responsibility:

- Define fly() behavior for objects that can fly.

### Sparrow

Responsibilities:

- Extend Bird.
- Implement Flyable.
- Provide flying behavior.

### Penguin

Responsibilities:

- Extend Bird.
- Provide swimming behavior.
- Does not implement Flyable.

---

## Important Concept

The following is valid:

Bird bird = new Sparrow("Sparrow");

because Sparrow is a Bird.

The following is also valid:

Bird bird = new Penguin("Penguin");

because Penguin is a Bird.

Both objects can safely perform:

bird.eat();

However, only a Flyable object should be expected to perform:

fly();

Therefore:

Flyable flyingBird = new Sparrow("Sparrow");

is valid.

---

## Key Lesson

Do not put a behavior in a parent class simply because some subclasses need it.

First ask:

"Is this behavior valid for every subclass?"

If the answer is no, separate that behavior into a suitable abstraction or interface.

---

## SOLID Principle Demonstrated

L — Liskov Substitution Principle

A subclass must be able to substitute its parent without breaking the expected behavior of the program.

---

## Technologies

- Java
- Object-Oriented Programming
- Inheritance
- Interfaces
- Polymorphism
- SOLID Principles

---

## Learning Outcome

After completing this project, you should understand:

- What LSP means.
- Why incorrect inheritance can violate LSP.
- How interfaces can separate capabilities.
- Why Sparrow can implement Flyable.
- Why Penguin should not implement Flyable.
- How polymorphism works with the corrected hierarchy.
