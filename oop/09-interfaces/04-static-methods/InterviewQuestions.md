# Interview Questions – Static Methods in Interfaces

## 1. What is a static method in an interface?

A static method belongs to the interface itself rather than to objects or implementing classes.

---

## 2. Why were static methods introduced in Java 8?

They allow interfaces to provide utility methods without requiring separate helper classes.

---

## 3. Can a static interface method have a body?

Yes. Every static interface method must have a method body.

---

## 4. Are static interface methods inherited?

No.

Implementing classes do not inherit static methods.

---

## 5. Can static interface methods be overridden?

No.

Static interface methods belong to the interface and cannot be overridden.

---

## 6. Why is this illegal?

```java
Smartphone phone = new Smartphone();
phone.showPhotographyTips();
