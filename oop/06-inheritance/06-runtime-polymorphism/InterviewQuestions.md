# Runtime Polymorphism - Interview Questions

## Beginner Level

### 1. What is Runtime Polymorphism?

Runtime polymorphism is the ability of Java to decide which overridden method to execute at runtime based on the actual object type.

---

### 2. What is Dynamic Method Dispatch?

Dynamic Method Dispatch is the mechanism through which Java selects the overridden method during runtime.

---

### 3. Which OOP feature enables Runtime Polymorphism?

Method Overriding.

---

### 4. Does Runtime Polymorphism happen at compile time?

No.

It happens during runtime.

---

### 5. Which type determines overridden method execution?

The runtime type (actual object type).

---

### 6. What is the compile-time type?

The type of the reference variable.

Example:

```java
Animal a = new Dog();
```

Compile-time type:

```text
Animal
```

---

### 7. What is the runtime type?

The actual object created.

Example:

```java
Animal a = new Dog();
```

Runtime type:

```text
Dog
```

---

### 8. Can a parent reference point to a child object?

Yes.

Example:

```java
Animal a = new Dog();
```

---

### 9. Can a child reference point to a parent object directly?

No.

Example:

```java
Dog d = new Animal();
```

This results in a compile-time error.

---

### 10. Why is Runtime Polymorphism useful?

It allows one reference type to work with multiple object types, making code flexible and extensible.

---

# Intermediate Level

### 11. Predict the output.

```java
class Animal {

    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
```

**Answer**

```text
Dog
```

---

### 12. Predict the output.

```java
class Animal {

    void sound() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Cat();

        a.sound();
    }
}
```

**Answer**

```text
Cat
```

---

### 13. Explain this statement.

```java
Animal a = new Dog();
```

**Answer**

- Compile-time type → Animal
- Runtime type → Dog
- Parent reference points to a child object.

---

### 14. What happens if the child does not override the method?

The parent class method executes.

---

### 15. Which methods support Runtime Polymorphism?

Only overridden instance methods.

---

# Frequently Asked Interview Questions

### Q1

Difference between compile-time type and runtime type.

| Compile-Time | Runtime |
|--------------|----------|
| Reference type | Actual object type |
| Checked by compiler | Determined by JVM |

---

### Q2

Why is Runtime Polymorphism called Dynamic Method Dispatch?

Because the JVM dynamically selects the appropriate overridden method during program execution.

---

### Q3

Can constructors be overridden?

No.

Constructors are not inherited.

---

### Q4

Can static methods be overridden?

No.

Static methods are hidden, not overridden.

---

### Q5

Can private methods be overridden?

No.

Private methods are not inherited.

---

### Q6

Can final methods be overridden?

No.

The `final` keyword prevents overriding.

---

## Quick Revision

- Runtime polymorphism uses method overriding.
- Parent references can point to child objects.
- The JVM chooses overridden methods at runtime.
- Compile-time type is the reference type.
- Runtime type is the actual object type.
- Dynamic Method Dispatch makes Java applications flexible and extensible.
