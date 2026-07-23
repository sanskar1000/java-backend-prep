# Interview Questions - Upcasting and Downcasting

## Beginner

### 1. What is Upcasting?

---

### 2. What is Downcasting?

---

### 3. Why is Upcasting automatic?

---

### 4. Why does Downcasting require an explicit cast?

---

### 5. What is Runtime Polymorphism?

---

### 6. What is the difference between compile-time type and runtime type?

---

### 7. What is a parent reference?

---

### 8. What is an actual object?

---

### 9. Can a parent reference point to a child object?

---

### 10. Can a child reference point to a parent object?

---

# Intermediate

### 11. What is `instanceof`?

---

### 12. Why should `instanceof` be used before downcasting?

---

### 13. What exception occurs during an invalid downcast?

---

### 14. Explain `ClassCastException`.

---

### 15. Can you call child-specific methods using a parent reference?

Why or why not?

---

### 16. What happens here?

```java
Animal a = new Dog();
a.sound();
```

Which method executes?

Why?

---

### 17. Predict the output.

```java
Animal a = new Dog();

if (a instanceof Dog) {
    Dog d = (Dog) a;
    d.fetch();
}
```

---

### 18. Predict the output.

```java
Animal a = new Animal();

Dog d = (Dog) a;
```

---

### 19. What is checked during runtime before a cast succeeds?

---

### 20. Why is this safe?

```java
Animal a = new Dog();

Dog d = (Dog) a;
```

---

# Advanced

### 21. Explain Dynamic Method Dispatch.

---

### 22. Difference between Upcasting and Method Overriding.

---

### 23. Difference between Runtime Type and Reference Type.

---

### 24. Why is polymorphism useful in real-world applications?

---

### 25. Explain the memory diagram of:

```java
Animal a = new Dog();
```

---

### 26. Explain the memory diagram of:

```java
Animal a = new Dog();

Dog d = (Dog) a;
```

---

### 27. Why does this throw `ClassCastException`?

```java
Animal a = new Animal();

Dog d = (Dog) a;
```

---

### 28. What is the purpose of `instanceof`?

---

### 29. What is the difference between:

```java
Animal a = new Dog();
```

and

```java
Dog d = new Dog();
```

---

### 30. Where are these stored?

- Reference variable
- Object
- Instance variables
- Local variables

---

# Coding Questions

- Create a program demonstrating Upcasting.
- Create a program demonstrating Downcasting.
- Demonstrate safe Downcasting using `instanceof`.
- Demonstrate `ClassCastException`.
- Create three child classes and store them using one parent reference.
- Demonstrate Runtime Polymorphism using an array of parent references.
- Create a real-world example using Employee, Manager, and Developer.
- Create a real-world example using Animal, Dog, and Cat.
