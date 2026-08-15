# Interview Questions — Car-Engine Composition

## 1. What is composition in Java?

Composition is an OOP relationship in which one class contains an object of another class.

Example:

Car contains Engine.

Therefore:

Car HAS-A Engine.

---

## 2. What type of relationship exists between Car and Engine?

A HAS-A relationship.

Car HAS-A Engine.

---

## 3. How is the HAS-A relationship implemented in Java?

By declaring an object of one class as a field inside another class.

Example:

    class Car {

        private Engine engine;
    }

---

## 4. Why does Car not extend Engine?

Because a Car is not an Engine.

There is no IS-A relationship between them.

The correct relationship is:

Car HAS-A Engine.

Therefore composition is more appropriate than inheritance.

---

## 5. What is constructor injection?

Constructor injection means providing a required dependency through the constructor.

Example:

    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

The `Engine` object is supplied from outside.

---

## 6. Why is constructor injection useful?

It ensures that the `Car` receives the required `Engine` when the object is created.

It also improves:

- Dependency management
- Testability
- Flexibility
- Separation of responsibilities

---

## 7. What is delegation?

Delegation occurs when one object passes responsibility to another object.

Example:

    public void start() {
        engine.start();
    }

Here, `Car` delegates engine-starting behavior to `Engine`.

---

## 8. What is the responsibility of Engine?

`Engine` is responsible for engine-specific behavior.

For example:

    start()

The `Car` should not need to implement the internal engine-starting logic.

---

## 9. What is the responsibility of Car?

`Car` is responsible for car-related behavior and coordinating with its Engine.

For example:

    start()

The Car can ask its Engine to start.

---

## 10. Why are fields private?

Private fields provide encapsulation.

They prevent direct external access to the internal state.

Example:

    private Engine engine;

Access can be controlled through methods such as:

    getEngine()

---

## 11. Why is null validation performed for Engine?

Because a Car requires an Engine.

If the Engine is null, calling:

    engine.start();

would cause a `NullPointerException`.

Therefore the constructor validates the dependency.

---

## 12. Why use IllegalArgumentException for a null Engine?

Because the caller supplied an invalid argument to the constructor.

Example:

    new Car("BMW", "M5", null);

The argument is invalid, so:

    IllegalArgumentException

is appropriate.

---

## 13. What is the difference between IS-A and HAS-A?

IS-A represents inheritance.

Example:

    Dog IS-A Animal

HAS-A represents composition or aggregation.

Example:

    Car HAS-A Engine

---

## 14. What is composition used for?

Composition is used to build complex objects from smaller, independent objects.

Example:

    Car
     ├── Engine
     ├── Transmission
     └── Battery

---

## 15. What is object collaboration?

Object collaboration occurs when multiple objects work together to accomplish a task.

In this project:

Car collaborates with Engine.

The Car asks the Engine to perform its `start()` operation.

---

## 16. Can composition exist without inheritance?

Yes.

Composition and inheritance are different mechanisms.

Composition uses object references.

Inheritance uses `extends`.

---

## 17. Which is more flexible: composition or inheritance?

Composition is often more flexible because objects can be combined and replaced without creating a rigid inheritance hierarchy.

This is related to the principle:

"Favor composition over inheritance."

---

## 18. What happens if Engine is null?

If the constructor allows a null Engine and later code calls:

    engine.start();

a `NullPointerException` can occur.

This is why the constructor validates the Engine.

---

## 19. Is Engine inherited by Car?

No.

Car does not inherit Engine.

Instead, Car contains an Engine object.

---

## 20. What is the main lesson of this project?

The main lesson is:

    Car HAS-A Engine

Composition allows one object to use another object's functionality while keeping their responsibilities separate.
