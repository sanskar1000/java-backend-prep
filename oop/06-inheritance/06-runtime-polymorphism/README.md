# Runtime Polymorphism (Dynamic Method Dispatch)

## Overview

This module demonstrates **Runtime Polymorphism**, one of the four fundamental pillars of Object-Oriented Programming (OOP).

Runtime polymorphism occurs when a **parent class reference** points to a **child class object**, and Java decides which overridden method to execute at **runtime** based on the actual object type.

This mechanism is known as **Dynamic Method Dispatch**.

---

## Learning Objectives

After completing this module, I learned:

- What Runtime Polymorphism is
- Dynamic Method Dispatch
- Parent reference and child object
- Compile-time type vs Runtime type
- Method overriding
- JVM method resolution
- Real-world applications of polymorphism

---

## Programs

### ShapeDemo.java

**Concepts Covered**

- Inheritance
- Method overriding
- Parent reference
- Child object
- Runtime method selection
- Dynamic Method Dispatch

---

### PaymentDemo.java

**Concepts Covered**

- Runtime polymorphism
- Method overriding
- Parent reference
- Multiple child implementations
- Real-world payment processing example

---

## Runtime Polymorphism

Example:

```java
Payment payment = new CreditCardPayment();

payment.pay();
```

Compile-time type:

```text
Payment
```

Runtime type:

```text
CreditCardPayment
```

Method executed:

```text
CreditCardPayment.pay()
```

Although the reference type is `Payment`, Java executes the overridden method of the actual object (`CreditCardPayment`).

---

## Dynamic Method Dispatch

Java selects the method to execute **at runtime**.

Method selection depends on the **actual object type**, not the reference type.

```text
Compile Time
-------------
Reference Type

Runtime
-------------
Actual Object Type
```

---

## Compile-Time Type vs Runtime Type

| Compile-Time Type | Runtime Type |
|-------------------|--------------|
| Reference variable type | Actual object created |
| Checked by compiler | Determined by JVM |
| Used for member accessibility | Used for overridden method execution |

Example:

```java
Animal a = new Dog();
```

Compile-time type:

```text
Animal
```

Runtime type:

```text
Dog
```

---

## Method Resolution

When Java executes:

```java
a.sound();
```

The JVM follows these steps:

```text
Reference Variable
        │
        ▼
Actual Object
        │
        ▼
Find Overridden Method
        │
        ▼
Execute Child Method
```

---

## Advantages

- Flexible code
- Code reusability
- Loose coupling
- Easy maintenance
- Extensible applications
- Supports Open/Closed Principle

---

## Real-World Examples

- Payment gateways
- Notification systems
- Shape drawing applications
- Vehicle management systems
- Banking applications
- Game development

---

## Key Takeaways

- Runtime polymorphism is achieved through method overriding.
- A parent reference can point to a child object.
- Java chooses overridden methods using the runtime object type.
- The compiler checks the reference type, while the JVM executes methods based on the actual object.
- Dynamic Method Dispatch enables flexible and extensible software design.

---

## Folder Structure

```text
06-inheritance/
└── 06-runtime-polymorphism/
    ├── ShapeDemo.java
    ├── PaymentDemo.java
    ├── README.md
    └── InterviewQuestions.md
```

---

## Author

**Aradhya Thakur**

Learning Java OOP step by step with industry-level best practices.
