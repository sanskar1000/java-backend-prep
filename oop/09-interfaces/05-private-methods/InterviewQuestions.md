# Interview Questions — Private Methods in Interfaces

## 1. Why were private methods introduced in Java interfaces?

Private methods were introduced in Java 9 to reduce duplicate code inside interfaces by allowing default and static methods to share common helper methods.

---

## 2. Can an implementing class call a private interface method?

No.

Private interface methods are accessible only within the interface itself.

---

## 3. Can private interface methods be overridden?

No.

Private methods are not inherited, so they cannot be overridden.

---

## 4. What is the difference between a private method and a private static method?

| Private Method | Private Static Method |
|---------------|-----------------------|
| Instance method | Static method |
| Called by default/private instance methods | Called by static/private static methods |
| Uses interface instance context | Does not use instance context |

---

## 5. Can private methods have a body?

Yes.

Every private interface method must provide its own implementation.

---

## 6. Which interface methods can call a private method?

- Default methods
- Other private instance methods

---

## 7. Which interface methods can call a private static method?

- Static methods
- Other private static methods

---

## 8. Can an interface contain abstract, default, static, and private methods together?

Yes.

Since Java 9, an interface can contain:

- Abstract methods
- Default methods
- Static methods
- Private methods
- Private static methods

---

## 9. Which Java version introduced private interface methods?

Java 9.

---

## 10. Why can't implementing classes access private interface methods?

Because private methods are implementation details of the interface and are hidden from implementing classes.

---

## 11. Can private interface methods participate in runtime polymorphism?

No.

Private methods are not inherited and therefore cannot be overridden.

---

## 12. Are static interface methods inherited?

No.

They belong to the interface itself.

---

## 13. Can a default method call a private method?

Yes.

This is one of the primary reasons private interface methods were introduced.

Example:

```java
default void recordVideo() {
    prepareCamera();
}

private void prepareCamera() {
    // Helper logic
}
```

---

## 14. What is the main advantage of private interface methods?

- Reduce duplicate code
- Improve code organization
- Improve encapsulation
- Hide implementation details

---

## 15. Explain the evolution of Java interfaces.

### Java 7

- Abstract methods only

---

### Java 8

Added:

- Default methods
- Static methods

---

### Java 9

Added:

- Private methods
- Private static methods

This made interfaces more powerful and easier to maintain while remaining backward compatible.
