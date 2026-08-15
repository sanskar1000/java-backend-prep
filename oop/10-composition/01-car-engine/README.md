# Car-Engine Composition

## 📌 Overview

This project demonstrates the **HAS-A relationship** in Java using composition.

A `Car` contains an `Engine` object. Therefore:

Car HAS-A Engine.

The project demonstrates how objects can be combined to build more complex objects.

---

## 📁 Project Structure

09-composition/
└── 01-car-engine/
    ├── CarEngineDemo.java
    ├── README.md
    └── InterviewQuestions.md

---

## 🎯 Learning Objectives

After completing this program, you should understand:

1. What composition means in OOP.
2. What a HAS-A relationship is.
3. How one class can contain another class as a field.
4. How constructor injection works.
5. How objects can collaborate with each other.
6. How encapsulation works with composed objects.
7. How method delegation works.

---

## 🧠 What is Composition?

Composition is an OOP relationship where one class contains an object of another class.

Example:

Car contains Engine.

Therefore:

Car HAS-A Engine.

In Java:

    class Car {

        private Engine engine;
    }

The `engine` field represents the relationship between `Car` and `Engine`.

---

## 🔗 Relationship

    Car
     |
     | HAS-A
     ↓
    Engine

A `Car` uses an `Engine` to perform engine-related operations.

---

## 🚗 Engine Class

The `Engine` class represents an engine.

### Field

    private int engineNumber;

The engine number is private to maintain encapsulation.

### Constructor

The constructor validates the engine number.

If the engine number is invalid, a default value is assigned.

### Method

    start()

The `start()` method represents starting the engine.

---

## 🚘 Car Class

The `Car` class represents a car.

### Fields

    private String brand;
    private String model;
    private Engine engine;

The `engine` field demonstrates the HAS-A relationship.

### Constructor Injection

The `Engine` object is passed into the `Car` constructor.

Example:

    Engine engine = new Engine(2345);

    Car car = new Car(
        "BMW",
        "M5",
        engine
    );

This is called constructor injection.

The `Car` receives the `Engine` object instead of creating it internally.

---

## 🔄 Method Delegation

The `Car` class contains a `start()` method.

The car delegates engine-specific behavior to the `Engine` object.

Conceptually:

    car.start()
        ↓
    engine.start()
        ↓
    Engine starts

This is called delegation.

The `Car` does not implement engine-starting logic itself.

---

## 🔐 Encapsulation

The classes use private fields:

    private int engineNumber;

    private String brand;
    private String model;
    private Engine engine;

Access is provided through getter methods.

This protects the internal state of the objects.

---

## ⚠️ Null Validation

The `Car` constructor validates the required `Engine` dependency.

If the engine is `null`, the constructor throws:

    IllegalArgumentException

This prevents a `Car` object from being created without an Engine.

---

## 🆚 Composition vs Inheritance

Composition represents:

    HAS-A

Inheritance represents:

    IS-A

Example:

    Car HAS-A Engine

But:

    Car IS-A Engine

is incorrect.

Therefore, the following would be conceptually wrong:

    class Car extends Engine

Instead:

    class Car {
        private Engine engine;
    }

---

## 🧠 Key Concepts

### HAS-A Relationship

One class contains another class as a field.

### Constructor Injection

A required dependency is supplied through the constructor.

### Delegation

One object asks another object to perform a responsibility.

### Encapsulation

Object state is protected using private fields.

---

## 📊 Program Flow

    Create Engine
         ↓
    Engine(2345)
         ↓
    Create Car
         ↓
    Pass Engine to Car
         ↓
    Car stores Engine
         ↓
    displayCarDetails()
         ↓
    start()
         ↓
    Engine.start()

---

## 🖥️ Expected Output

    -------- Car Details --------
    Brand : BMW
    Model : M5
    Engine Number : 2345

    Engine with engine number 2345 is started.
    BMW M5 started.

---

## ⏱️ Complexity

### Time Complexity

The operations performed by the program are constant-time.

O(1)

### Space Complexity

The program creates a fixed number of objects.

O(1)

---

## 🚀 Possible Improvements

Future versions can add:

- Engine type
- Horsepower
- Fuel type
- Car registration number
- Multiple engine operations
- Start/stop engine functionality
- Engine replacement
- Service history

---

## 🎓 Concepts Practiced

- [x] Class
- [x] Object
- [x] Encapsulation
- [x] Constructor
- [x] Constructor validation
- [x] Getter methods
- [x] Composition
- [x] HAS-A relationship
- [x] Constructor injection
- [x] Delegation
- [x] Object collaboration
- [x] Null validation

---

## ⭐ Key Takeaway

Composition allows objects to be built from other objects.

The main relationship demonstrated in this project is:

    Car HAS-A Engine

Instead of using inheritance when there is no IS-A relationship, composition allows classes to collaborate while keeping their responsibilities separate.
