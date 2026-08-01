Flyable Interface Demonstration

Project Overview

This project demonstrates the fundamentals of Java Interfaces.

The Flyable interface defines a common flying behavior that can be implemented by different classes. Both Bird and Airplane implement this interface by providing their own implementation of the fly() method.

The project also demonstrates runtime polymorphism, method overriding, encapsulation, constructor validation, and the difference between interface references and class references.

⸻

Features

* Interface creation
* Interface implementation using implements
* Runtime polymorphism
* Method overriding
* Constructor validation
* Encapsulation using private fields
* Getter methods
* JavaDoc documentation
* Class references
* Interface references

⸻

Technologies Used

* Java
* Object-Oriented Programming (OOP)

⸻

Project Structure

08-interfaces/
└── 01-introduction/
    ├── FlyableDemo.java
    ├── README.md
    └── InterviewQuestions.md

⸻

Classes

Interface

* Flyable

Classes

* Bird
* Airplane
* Main

⸻

OOP Concepts Used

* Interface
* Encapsulation
* Method Overriding
* Runtime Polymorphism
* Validation
* Constructors
* Getter Methods

⸻

Expected Output

Bird constructor executed.
Airplane constructor executed.
========== Bird ==========
----- Bird Details -----
Name      : Eagle
Wing Span : 2.30 meters
Eagle is flying using its wings.
========== Airplane ==========
----- Airplane Details -----
Model            : Boeing 747
Maximum Altitude : 35000 feet
Boeing 747 is flying at 35000 feet.

⸻

Key Learnings

* An interface defines a contract that implementing classes must follow.
* A class implements an interface using the implements keyword.
* Interface methods are public and abstract by default.
* Interface variables are public static final by default.
* An interface cannot be instantiated.
* Different classes can implement the same interface in different ways.
* Runtime polymorphism allows the correct overridden method to execute based on the object’s runtime type.
* Interface references can access only the methods declared in the interface.

⸻

Time Complexity

Operation	Complexity
Object Creation	O(1)
Method Call	O(1)

⸻

Space Complexity

* O(1)

⸻

Author

Aradhya Thakur
