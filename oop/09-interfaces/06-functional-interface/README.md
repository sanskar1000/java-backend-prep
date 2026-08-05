# Functional Interface Demonstration

## Overview

This project demonstrates the concept of a **Functional Interface** in Java using the `@FunctionalInterface` annotation.

A functional interface contains exactly **one abstract method** (Single Abstract Method - SAM). It can also contain default, static, and private methods.

The project uses a `Printer` functional interface and a `LaserPrinter` class to demonstrate modern Java interface features introduced in Java 8 and Java 9.

---

## Features

- Functional Interface (`@FunctionalInterface`)
- Single Abstract Method (SAM)
- Default Method
- Private Interface Method (Java 9)
- Static Interface Method
- Private Static Interface Method (Java 9)
- Runtime Polymorphism
- Encapsulation
- Constructor Validation
- Method Overriding

---

## Project Structure

```
08-interfaces/
└── 06-functional-interface/
    ├── PrinterDemo.java
    ├── README.md
    └── InterviewQuestions.md
```

---

## Class Diagram

```
                 +----------------------+
                 |      Printer         |
                 |----------------------|
                 | + print()            |
                 | + printStatus()      |
                 | + showPrinterGuide() |
                 |----------------------|
                 | - initializePrinter()|
                 | - printHeader()      |
                 +----------^-----------+
                            |
                            |
                implements
                            |
                 +----------------------+
                 |    LaserPrinter      |
                 |----------------------|
                 | - brand              |
                 | - model              |
                 | - printSpeed         |
                 |----------------------|
                 | + print()            |
                 | + displayPrinterDetails() |
                 +----------------------+
```

---

# Functional Interface

A Functional Interface is an interface that contains exactly **one abstract method**.

Example:

```java
@FunctionalInterface
interface Printer {
    void print();
}
```

---

# Single Abstract Method (SAM)

SAM stands for **Single Abstract Method**.

A Functional Interface must contain only one abstract method.

Valid:

```java
@FunctionalInterface
interface Printer {
    void print();
}
```

Invalid:

```java
@FunctionalInterface
interface Printer {
    void print();
    void scan();
}
```

---

# Default Method

Default methods provide an implementation inside the interface.

Example:

```java
default void printStatus() {
    initializePrinter();
    System.out.println("Printer is ready.");
}
```

---

# Static Method

Static methods belong to the interface.

Example:

```java
Printer.showPrinterGuide();
```

---

# Private Method (Java 9)

Private methods are helper methods used inside the interface.

Example:

```java
private void initializePrinter() {
    ...
}
```

Purpose:

- Reduce code duplication
- Improve encapsulation
- Hide implementation details

---

# Private Static Method (Java 9)

Private static methods are helper methods used by static interface methods.

Example:

```java
private static void printHeader() {
    ...
}
```

---

# Runtime Polymorphism

```java
Printer printer = new LaserPrinter(
        "HP",
        "LaserJet Pro",
        35
);

printer.print();
```

The reference type is `Printer`, while the actual object is `LaserPrinter`.

---

# Expected Output

```
LaserPrinter constructor executed.

------- Printer Details -------
Brand       : HP
Model       : LaserJet Pro
Print Speed : 35 pages/minute.

HP LaserJet Pro printed a document at 35 pages/minute.

Initializing printer...
Checking ink...
Checking paper...

Printer is ready.

=== Printer Guide ===

1. Load paper correctly.
2. Keep ink cartridges full.
3. Clean the printer regularly.
```

---

# Key Learnings

- Functional Interfaces contain exactly one abstract method.
- `@FunctionalInterface` provides compile-time checking.
- Default methods allow code reuse.
- Static methods belong to the interface.
- Private methods reduce duplicate code.
- Private static methods support static interface methods.
- Runtime polymorphism allows programming using interface references.
- Encapsulation protects object state using private fields.

---

# Technologies Used

- Java 17+
- IntelliJ IDEA
- Object-Oriented Programming (OOP)
- Functional Interfaces
- Java 8 Features
- Java 9 Features

---

# Author

**Aradhya Thakur**

Java Backend Developer Journey (2026)
