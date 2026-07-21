# Method Overriding in Java

## Overview

Method overriding is an important feature of Object-Oriented Programming (OOP) that allows a child class to provide its own implementation of a method that already exists in the parent class.

It enables **runtime polymorphism**, allowing different subclasses to perform the same action in different ways.

---

## Learning Objectives

After completing this module, I learned:

- What method overriding is
- Why method overriding is used
- Rules of method overriding
- The `@Override` annotation
- Calling parent methods using `super`
- Difference between parent and child implementations
- Code reuse through inheritance
- Real-world applications of overriding

---

## Programs

### AnimalDemo.java

**Concepts Covered**

- Inheritance
- Method overriding
- `@Override`
- `super.makeSound()`
- Constructor chaining
- Encapsulation
- Input validation
- Code reuse

---

### EmployeeDemo.java

**Concepts Covered**

- Inheritance
- Method overriding
- `super.work()`
- Constructor chaining
- Encapsulation
- Input validation
- Real-world class design
- Code reuse

---

# What is Method Overriding?

Method overriding occurs when a child class provides its own implementation of a method already defined in its parent class.

The child method replaces the parent's implementation for objects of the child class.

---

## Example

```java
class Animal {

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says: Bark Bark!");
    }
}
```

Output

```text
Dog says: Bark Bark!
```

---

# Why Use Method Overriding?

Method overriding allows different child classes to perform the same operation in different ways.

Example:

- Dog → Bark
- Cat → Meow
- Cow → Moo

Each animal has its own behavior while sharing a common parent class.

---

# Rules of Method Overriding

- The method name must be the same.
- The parameter list must be the same.
- The return type must be the same or covariant.
- The access modifier cannot be more restrictive than the parent method.
- Only inherited methods can be overridden.
- Constructors cannot be overridden.
- Static methods are hidden, not overridden.
- Private methods cannot be overridden.
- Final methods cannot be overridden.

---

# The `@Override` Annotation

The `@Override` annotation tells the compiler that a method is intended to override a parent method.

Example:

```java
@Override
public void work() {

    System.out.println("Developer is writing code.");
}
```

### Advantages

- Improves code readability
- Prevents accidental mistakes
- Compiler verifies that overriding is valid

---

# Using `super`

A child class can call the parent implementation before adding its own behavior.

Example:

```java
@Override
public void work() {

    super.work();

    System.out.println("Developer is writing Java code.");
}
```

Output

```text
Employee is working.
Developer is writing Java code.
```

---

# Overriding vs Overloading

| Method Overriding | Method Overloading |
|-------------------|--------------------|
| Parent and child classes | Same class (usually) |
| Same method name | Same method name |
| Same parameter list | Different parameter list |
| Runtime polymorphism | Compile-time polymorphism |
| Requires inheritance | Inheritance not required |

---

# Benefits of Method Overriding

- Supports runtime polymorphism
- Enables specialization of behavior
- Promotes code reuse
- Improves flexibility
- Makes applications easier to maintain
- Reduces duplicate code

---

# Execution Flow

When a child object calls an overridden method:

```text
Create Child Object
        │
        ▼
Call Child Method
        │
        ▼
Child Method Executes
        │
        ▼
(Optional) super.method()
        │
        ▼
Parent Method Executes
        │
        ▼
Return to Child Method
        │
        ▼
Program Continues
```

---

# Real-World Examples

- Animal → Dog, Cat, Cow
- Employee → Developer, Tester, Manager
- Vehicle → Car, Bike, Truck
- Payment → CreditCard, UPI, PayPal
- Shape → Circle, Rectangle, Triangle

---

# Key Takeaways

- Method overriding allows a child class to redefine a parent method.
- The method name and parameter list must remain the same.
- `@Override` improves safety and readability.
- `super.method()` calls the parent implementation.
- Constructors, private methods, static methods, and final methods cannot be overridden.
- Method overriding is the foundation of runtime polymorphism.

---

# Folder Structure

```text
05-method-overriding/
├── AnimalDemo.java
├── EmployeeDemo.java
├── README.md
└── InterviewQuestions.md
```

---

# Author

**Aradhya Thakur**

Learning Java Object-Oriented Programming step by step while building an industry-ready GitHub portfolio.
