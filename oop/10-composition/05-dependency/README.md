# Dependency Injection — Order Service

## 📌 Overview

This project demonstrates **Dependency** and **Dependency Injection** in Java using an `OrderService` and a `PaymentService`.

The main goal is to understand how one class can depend on another class without creating that dependency internally.

---

## 📁 Project Structure

05-dependency/
├── OrderServiceDemo.java
├── README.md
└── InterviewQuestions.md

---

## 🎯 Learning Objectives

After completing this project, you should understand:

1. What a dependency is.
2. What Dependency Injection means.
3. What Constructor Injection is.
4. Why dependencies should be provided from outside.
5. How dependency injection reduces tight coupling.
6. How to validate injected dependencies.
7. How one class can use another class without creating it internally.
8. How Dependency Injection prepares us for interface-based design and Spring.

---

## 🧠 What Is a Dependency?

A dependency exists when one class needs another class to perform its work.

Example:

OrderService
↓
depends on
↓
PaymentService

`OrderService` cannot process a payment without `PaymentService`.

---

## 🔗 Dependency Relationship

The relationship in this project is:

OrderService
↓
uses
↓
PaymentService

`OrderService` depends on `PaymentService` to process payments.

---

## ❌ Tight Coupling

A tightly coupled design would create the dependency inside the class.

Conceptually:

OrderService
↓
creates PaymentService
↓
uses PaymentService

This makes `OrderService` directly responsible for creating its dependency.

Problems:

- Difficult to replace the dependency.
- Difficult to test.
- Higher coupling.
- Less flexible design.

---

## ✅ Dependency Injection

Instead of creating `PaymentService` inside `OrderService`, we create it outside and provide it to `OrderService`.

The flow becomes:

Main
↓
creates PaymentService
↓
injects PaymentService
↓
OrderService
↓
uses PaymentService

This is Dependency Injection.

---

## 💉 Constructor Injection

This project uses Constructor Injection.

The dependency is received through the constructor of `OrderService`.

Conceptually:

OrderService
├── orderId
└── PaymentService

The constructor receives both values and stores them.

---

## 🏗️ Classes

### PaymentService

Responsible for processing payments.

Main method:

`processPayment(double amount)`

Responsibilities:

- Receive payment amount.
- Process the payment.
- Display a successful payment message.

---

### OrderService

Responsible for processing an order.

Fields:

- `orderId`
- `paymentService`

Responsibilities:

- Validate the order ID.
- Validate the payment service.
- Validate the payment amount.
- Process the payment.
- Display order status.

---

## 🔐 Validation

The `OrderService` validates the injected dependency.

If `PaymentService` is null, the constructor throws an `IllegalArgumentException`.

This prevents the object from being created in an invalid state.

The payment amount is also validated.

If the amount is less than or equal to zero, the order is rejected.

---

## 🔄 Program Flow

Main
↓
Create PaymentService
↓
Create OrderService
↓
Inject PaymentService into OrderService
↓
Call placeOrder()
↓
Validate amount
↓
PaymentService.processPayment()
↓
Order placed successfully

---

## 🧩 Example

The dependency is created outside `OrderService`.

Then it is supplied to the constructor of `OrderService`.

This means:

- `Main` controls object creation.
- `OrderService` controls order processing.
- `PaymentService` controls payment processing.

Each class has a clear responsibility.

---

## 📊 Responsibility Separation

| Class | Responsibility |
|---|---|
| `PaymentService` | Process payment |
| `OrderService` | Process order |
| `Main` | Create and connect objects |

This is an example of **Separation of Concerns**.

---

## 🔓 Loose Coupling

Dependency Injection helps reduce coupling.

Without Dependency Injection:

OrderService
↓
creates PaymentService
↓
strong dependency

With Dependency Injection:

Main
↓
creates PaymentService
↓
injects it
↓
OrderService

The object creation responsibility is moved outside `OrderService`.

---

## ⭐ Why Dependency Injection Is Useful

Dependency Injection provides several benefits:

- Loose coupling
- Better testability
- Easier replacement of dependencies
- Better maintainability
- Better separation of responsibilities
- More flexible architecture

---

## 🧪 Testing Advantage

Because `PaymentService` is injected, another implementation can later be supplied without changing the basic structure of `OrderService`.

For example:

PaymentService
├── RealPaymentService
└── TestPaymentService

This becomes especially useful when writing unit tests.

---

## 🚀 Next Step

The next improvement is to depend on an interface rather than a concrete payment implementation.

Current design:

OrderService
↓
PaymentService

Next design:

OrderService
↓
Payment interface
├── UPIPayment
├── CardPayment
└── CashPayment

This will combine:

- Interfaces
- Abstraction
- Polymorphism
- Dependency Injection
- Loose Coupling

---

## 🎓 Concepts Practiced

- [x] Classes
- [x] Objects
- [x] Encapsulation
- [x] Constructor
- [x] Dependency
- [x] Dependency Injection
- [x] Constructor Injection
- [x] Validation
- [x] Separation of Concerns
- [x] Loose Coupling
- [x] Object Creation Outside Dependent Class

---

## 🧠 Interview Quick Revision

Dependency:

A relationship where one class requires another class to perform its work.

Dependency Injection:

Providing a required dependency to a class from outside instead of creating it inside the class.

Constructor Injection:

Providing the dependency through the class constructor.

Loose Coupling:

Designing classes so they have minimal direct dependency on concrete implementations.

---

## 💡 Key Takeaway

Do not make a class responsible for creating every object it needs.

Instead:

Create the dependency outside.
↓
Inject the dependency.
↓
Use the dependency.

This makes Java applications more flexible, testable, and maintainable.

The next step is to combine Dependency Injection with an interface and runtime polymorphism.
