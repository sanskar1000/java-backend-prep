# Functional Interface Interview Questions

## 1. What is a Functional Interface?

A Functional Interface is an interface that contains exactly one abstract method. It may also contain default, static, and private methods.

---

## 2. What is the Single Abstract Method (SAM) rule?

A Functional Interface must contain exactly one abstract method.

---

## 3. Which annotation is used for a Functional Interface?

```java
@FunctionalInterface
```

---

## 4. Is the @FunctionalInterface annotation mandatory?

No.

An interface can still be functional without it.

However, the annotation provides compile-time checking.

---

## 5. Why do we use @FunctionalInterface?

It tells the compiler that the interface must always contain exactly one abstract method.

If another abstract method is added accidentally, the compiler reports an error.

---

## 6. Can a Functional Interface contain default methods?

Yes.

Default methods do not count as abstract methods.

---

## 7. Can a Functional Interface contain static methods?

Yes.

Static methods belong to the interface and do not affect the SAM rule.

---

## 8. Can a Functional Interface contain private methods?

Yes.

Private methods are helper methods introduced in Java 9.

---

## 9. Can a Functional Interface contain private static methods?

Yes.

Private static methods are helper methods for static interface methods.

---

## 10. What happens if we add a second abstract method?

The interface is no longer a Functional Interface.

If `@FunctionalInterface` is used, the compiler reports an error.

---

## 11. Can a Functional Interface extend another interface?

Yes.

It can extend another interface as long as the resulting interface still has exactly one abstract method.

---

## 12. Can a Functional Interface have constructors?

No.

Interfaces cannot have constructors.

---

## 13. Can we create an object of a Functional Interface?

No.

Interfaces cannot be instantiated directly.

---

## 14. Why are Functional Interfaces important?

Functional Interfaces are the foundation of:

- Lambda Expressions
- Streams API
- Method References
- CompletableFuture
- Modern Java Programming

---

## 15. Name some built-in Functional Interfaces.

- Predicate<T>
- Function<T, R>
- Consumer<T>
- Supplier<T>
- UnaryOperator<T>
- BinaryOperator<T>

---

## 16. Difference between a normal interface and a Functional Interface

| Normal Interface | Functional Interface |
|------------------|----------------------|
| Can have multiple abstract methods | Must have exactly one abstract method |
| Used for general abstraction | Used mainly with Lambda Expressions |
| Annotation optional | Usually uses @FunctionalInterface |

---

## 17. Does overriding a default method affect the SAM rule?

No.

Only abstract methods are counted.

---

## 18. Which methods are NOT counted as abstract methods?

- Default methods
- Static methods
- Private methods
- Private static methods
- Methods inherited from Object

---

## 19. Which Java version introduced Functional Interfaces?

Java 8

---

## 20. Which Java feature depends on Functional Interfaces?

Lambda Expressions.
