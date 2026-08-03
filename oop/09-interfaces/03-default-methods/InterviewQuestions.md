# Interview Questions — Default Methods in Interfaces

## Basic Questions

### 1. What is a default method?

A default method is a method inside an interface that has an implementation. It is declared using the `default` keyword.

---

### 2. Why were default methods introduced?

Default methods were introduced in Java 8 to allow interfaces to evolve without breaking existing classes that implement them.

---

### 3. Can a default method have a body?

Yes.

---

### 4. Must a class override a default method?

No.

A class automatically inherits a default method but may override it if customized behavior is required.

---

### 5. Which keyword is used to declare a default method?

`default`

---

## Intermediate Questions

### 6. Can an interface contain both abstract and default methods?

Yes.

---

### 7. Can a default method be overridden?

Yes.

---

### 8. Can a default method participate in runtime polymorphism?

Yes.

If overridden, the runtime object determines which implementation executes.

---

### 9. Can a default method call other methods inside the interface?

Yes.

It can call abstract methods, other default methods, and static methods of the same interface.

---

### 10. Are default methods inherited?

Yes.

They are inherited unless overridden.

---

## Advanced Questions

### 11. What happens if two interfaces define the same default method?

The implementing class must override the conflicting method.

Otherwise, a compile-time error occurs.

---

### 12. How do you call a specific interface's default method?

```java
Camera.super.start();
```

---

### 13. Why does Java require overriding in case of default method conflicts?

Because Java cannot determine which default implementation should be inherited.

---

### 14. Difference between an abstract method and a default method?

| Abstract Method | Default Method |
|-----------------|----------------|
| No body | Has body |
| Must be implemented | Optional to override |
| No `default` keyword | Uses `default` keyword |

---

### 15. Difference between default methods and static methods in interfaces?

| Default Method | Static Method |
|----------------|---------------|
| Inherited | Not inherited |
| Can be overridden | Cannot be overridden |
| Called using object/reference | Called using interface name |

---

## Output-Based Questions

### Q1

```java
interface Camera {
    default void start() {
        System.out.println("Camera");
    }
}

class Phone implements Camera { }

Phone p = new Phone();
p.start();
```

**Output**

```
Camera
```

---

### Q2

```java
interface A {
    default void show() {
        System.out.println("A");
    }
}

class B implements A {

    @Override
    public void show() {
        System.out.println("B");
    }
}

A obj = new B();
obj.show();
```

**Output**

```
B
```

---

### Q3

Why does the following code fail?

```java
interface Camera {
    default void start() { }
}

interface MusicPlayer {
    default void start() { }
}

class Smartphone implements Camera, MusicPlayer {
}
```

**Answer**

Both interfaces provide the same default method, creating ambiguity. The class must override the method to resolve the conflict.

---

## Quick Revision

- Default methods were introduced in Java 8.
- Default methods have implementations.
- They are inherited automatically.
- They can be overridden.
- They support runtime polymorphism.
- Two identical default methods cause a conflict.
- Resolve conflicts using method overriding.
- Use `InterfaceName.super.method()` to invoke a specific interface's default method.
