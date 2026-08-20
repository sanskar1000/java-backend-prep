# Interview Questions — Dependency & Dependency Injection

## Basic Questions

### 1. What is a dependency in Java?

A dependency exists when one class requires another class to perform its work.

Example:

OrderService depends on PaymentService.

---

### 2. What is Dependency Injection?

Dependency Injection is a design technique where a required dependency is provided to a class from outside instead of the class creating the dependency itself.

---

### 3. What is Constructor Injection?

Constructor Injection is a form of Dependency Injection where the dependency is provided through the constructor.

Example:

OrderService(PaymentService paymentService)

---

### 4. Why is Dependency Injection used?

Dependency Injection is used to reduce tight coupling and make code more flexible, testable, and maintainable.

---

### 5. What is tight coupling?

Tight coupling occurs when one class is strongly dependent on the implementation or creation of another class.

Example:

class OrderService {

    private PaymentService paymentService;

    public OrderService() {
        paymentService = new PaymentService();
    }
}

Here, OrderService directly creates PaymentService.

---

### 6. What is loose coupling?

Loose coupling means classes have minimal dependency on concrete implementations and can work with different implementations more easily.

---

### 7. What is the difference between Dependency and Dependency Injection?

Dependency:

One class needs another class.

Dependency Injection:

The required class is provided from outside instead of being created internally.

---

### 8. Why is constructor injection generally preferred?

Constructor injection makes the dependency explicit and ensures that the object receives its required dependencies when it is created.

It also helps prevent an object from existing without required dependencies.

---

## Code-Based Questions

### 9. Does this represent Dependency Injection?

PaymentService paymentService = new PaymentService();

OrderService orderService =
        new OrderService("ORD101", paymentService);

Answer:

Yes.

PaymentService is created outside OrderService and passed through the constructor.

---

### 10. Is this Dependency Injection?

class OrderService {

    private PaymentService paymentService;

    public OrderService() {
        paymentService = new PaymentService();
    }
}

Answer:

No.

The dependency is created inside OrderService.

This creates tighter coupling.

---

### 11. What is injected in this constructor?

OrderService(String orderId, PaymentService paymentService)

Answer:

PaymentService is the injected dependency.

---

### 12. Where is the dependency stored?

It is stored in:

private PaymentService paymentService;

---

### 13. Why should PaymentService be created outside OrderService?

Because OrderService should use the dependency rather than being responsible for creating it.

This reduces coupling and improves flexibility.

---

### 14. What happens if PaymentService is null?

The constructor should reject the invalid dependency.

Example:

if (paymentService == null) {
    throw new IllegalArgumentException(
        "PaymentService cannot be null."
    );
}

---

### 15. Why validate injected dependencies?

To prevent an object from being created in an invalid state.

---

## Design Questions

### 16. What is Separation of Concerns?

Separation of Concerns means each class should have a clear and focused responsibility.

In this project:

PaymentService → payment processing

OrderService → order processing

Main → object creation and connection

---

### 17. What is the main advantage of Dependency Injection?

The major advantage is reduced coupling between classes.

It also improves:

- Testability
- Maintainability
- Flexibility
- Reusability

---

### 18. Can Dependency Injection be done without constructors?

Yes.

Dependency Injection can be implemented using different approaches, including:

- Constructor Injection
- Setter Injection
- Field Injection

Constructor Injection is commonly preferred when a dependency is required.

---

### 19. What is Setter Injection?

Setter Injection provides the dependency through a setter method.

Example:

public void setPaymentService(
        PaymentService paymentService
) {
    this.paymentService = paymentService;
}

---

### 20. What is Field Injection?

Field Injection directly injects a dependency into a field, commonly using a framework such as Spring.

It is generally less explicit than constructor injection.

---

## Important Interview Questions

### 21. Is Dependency Injection an OOP principle?

Dependency Injection is primarily a design technique/pattern used to achieve better separation of concerns and loose coupling.

It works together with OOP principles such as abstraction and polymorphism.

---

### 22. Is Dependency Injection the same as Composition?

No.

Composition describes a strong HAS-A relationship between objects.

Dependency Injection describes how a dependency is supplied to an object.

They can be used together, but they are not the same concept.

---

### 23. Is Dependency Injection the same as Aggregation?

No.

Aggregation describes a weak HAS-A relationship.

Dependency Injection describes the mechanism/design technique used to provide a dependency.

---

### 24. What is the difference between `new` and Dependency Injection?

Using `new` inside a class means the class creates its dependency itself.

Dependency Injection means the dependency is created elsewhere and provided to the class.

---

### 25. Why is Dependency Injection important in backend development?

Backend applications usually contain many interconnected services.

Dependency Injection helps keep those services loosely coupled and easier to test, replace, and maintain.

Frameworks such as Spring heavily use Dependency Injection.

---

## 🔥 Top Interview Scenario

### Question:

Why is this design better?

OrderService(PaymentService paymentService)

instead of:

OrderService()

where OrderService creates PaymentService internally?

### Answer:

Constructor injection makes the dependency explicit and allows the caller to provide different implementations or configurations.

It reduces tight coupling, improves testability, and follows the Dependency Inversion principle more effectively when the dependency is represented by an abstraction.

---

## 🧠 Quick Revision

Dependency
→ One class needs another class.

Dependency Injection
→ Provide the dependency from outside.

Constructor Injection
→ Dependency is provided through constructor.

Loose Coupling
→ Reduce direct dependency on concrete implementations.

Separation of Concerns
→ Each class has a clear responsibility.

Main
→ Creates and connects objects.

Service
→ Performs business operations.

---

## ⭐ One-Line Interview Answers

Dependency:
A class requiring another class to perform its work.

Dependency Injection:
Providing a class's dependency from outside.

Constructor Injection:
Injecting the dependency through the constructor.

Loose Coupling:
Minimizing direct dependency between classes.

Tight Coupling:
One class is strongly dependent on another concrete implementation.

Separation of Concerns:
Keeping different responsibilities separated between classes.

Main Benefit of DI:
Reduced coupling and improved testability.

Common DI Types:
Constructor, Setter, and Field Injection.
