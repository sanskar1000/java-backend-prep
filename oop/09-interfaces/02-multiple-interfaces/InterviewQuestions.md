# Interview Questions — Multiple Interface Implementation

## 1. Why doesn't Java support multiple inheritance of classes?

Java does not support multiple inheritance of classes to avoid ambiguity and complexity, especially the **Diamond Problem**, where a child class could inherit conflicting implementations from multiple parent classes.

---

## 2. What is the Diamond Problem?

The Diamond Problem occurs when a class inherits from two parent classes that both inherit from the same superclass and contain a method with the same signature. The child class would not know which implementation to inherit.

Example:

```
        Animal
       /      \
     Dog     Robot
       \      /
      RobotDog
```

If both `Dog` and `Robot` implement the same method, `RobotDog` faces ambiguity.

---

## 3. How do interfaces solve the Diamond Problem?

Interfaces define behavior through method declarations rather than inherited implementations (ignoring default methods for now). The implementing class provides its own implementation, eliminating ambiguity.

---

## 4. Can a class implement multiple interfaces?

Yes.

A Java class can implement two or more interfaces.

Example:

```java
class Smartphone implements Camera, MusicPlayer {
    // implementation
}
```

---

## 5. Can one object have multiple interface references?

Yes.

Example:

```java
Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 256);

Camera c = phone;
MusicPlayer m = phone;
```

All three references point to the same object.

---

## 6. Explain the following statement.

```java
Camera c = new Smartphone();
```

A `Smartphone` object is created and stored in heap memory.

The reference variable `c` has the compile-time type `Camera`, while the actual object is of type `Smartphone`.

Only the methods declared in the `Camera` interface can be accessed through `c`.

---

## 7. What is the compile-time type?

The compile-time type is the type of the reference variable.

Example:

```java
Camera c = new Smartphone();
```

Compile-time type: `Camera`

---

## 8. What is the runtime type?

The runtime type is the actual type of the object created with `new`.

Example:

```java
Camera c = new Smartphone();
```

Runtime type: `Smartphone`

---

## 9. Why is this an example of runtime polymorphism?

At compile time, the reference type is `Camera`, but at runtime Java executes the overridden method from the actual object (`Smartphone`). The method call is resolved based on the object's runtime type.

---

## 10. What is the difference between `extends` and `implements`?

| extends | implements |
|----------|------------|
| Used with classes and interfaces | Used only with interfaces |
| Inherits an existing class or interface | Implements the contract of an interface |
| A class can extend only one class | A class can implement multiple interfaces |

---

## 11. What is an interface?

An interface is a blueprint that defines a set of behaviors (methods) that implementing classes must provide. It specifies **what** a class can do, not **how** it does it.

---

## 12. What is the purpose of an interface?

Interfaces promote abstraction, flexibility, loose coupling, and runtime polymorphism. They allow unrelated classes to share common behavior through a common contract.

---

## 13. Which keyword is used to implement an interface?

The `implements` keyword.

Example:

```java
class Bird implements Flyable {
}
```

---

## 14. Can an interface be instantiated?

No.

Interfaces cannot be instantiated because they do not represent complete objects.

Invalid example:

```java
Flyable f = new Flyable(); // Compile-time error
```

---

## 15. Must a class implement all interface methods?

Yes.

A concrete class must implement every abstract method declared in the interface. Otherwise, the class itself must be declared `abstract`.

---

## 16. Can a class extend one class and implement multiple interfaces?

Yes.

Example:

```java
class Smartphone extends Device implements Camera, MusicPlayer {
}
```

A class may extend one superclass and implement multiple interfaces simultaneously.

---

## 17. What are the advantages of multiple interface implementation?

- Supports multiple behaviors.
- Promotes loose coupling.
- Enables runtime polymorphism.
- Improves code reusability.
- Avoids the problems of multiple inheritance.

---

## Key Takeaways

- Java does not support multiple inheritance of classes.
- Java supports multiple interface implementation.
- A class can implement multiple interfaces using the `implements` keyword.
- One object can have multiple interface references.
- Runtime polymorphism works with interface references.
- Interfaces define behavior through contracts.
- Multiple interface implementation makes Java applications more flexible and maintainable.
