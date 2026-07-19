# Constructor Chaining in Inheritance - Interview Questions

## Beginner Level

### 1. What is constructor chaining?

Constructor chaining is the process of calling one constructor from another constructor to initialize an object completely.

---

### 2. Why is constructor chaining used?

- To initialize parent class members
- To avoid duplicate initialization code
- To ensure proper object creation

---

### 3. Which keyword is used to call the parent constructor?

```java
super(...)
```

---

### 4. Which keyword is used to call another constructor of the same class?

```java
this(...)
```

---

### 5. Which constructor executes first when creating a child object?

The **parent constructor** executes first.

---

### 6. Why does the parent constructor execute first?

Because the parent part of the object must be initialized before the child part.

---

### 7. Does Java automatically insert `super()`?

Yes.

If the child constructor does not explicitly call a parent constructor, the Java compiler automatically inserts:

```java
super();
```

provided the parent has a no-argument constructor.

---

### 8. Are constructors inherited?

No.

Constructors are **not inherited** by child classes.

---

### 9. Where must `super()` be written?

It must be the **first statement** inside a constructor.

---

### 10. Can `super()` be written after another statement?

No.

Doing so causes a **compile-time error**.

---

## Intermediate Level

### 11. Can a constructor call both `this()` and `super()`?

No.

A constructor can call **either** `this()` **or** `super()`, never both.

---

### 12. What happens if the parent class has only a parameterized constructor and the child does not call it?

Compilation fails because Java cannot insert a matching `super()` automatically.

---

### 13. What is the difference between `super()` and `this()`?

| `super()` | `this()` |
|-----------|----------|
| Calls the parent constructor | Calls another constructor in the same class |
| Used for inheritance | Used for constructor overloading |
| Must be the first statement | Must also be the first statement |

---

### 14. Why can't `super()` appear twice in a constructor?

Because a constructor can invoke only one constructor as its first statement.

---

### 15. What happens if the parent has a default constructor?

Java automatically inserts:

```java
super();
```

if you don't write it explicitly.

---

## Frequently Asked Interview Questions

### Q1

**Output?**

```java
class A {

    A() {
        System.out.println("A");
    }
}

class B extends A {

    B() {
        System.out.println("B");
    }
}

public class Main {

    public static void main(String[] args) {

        new B();
    }
}
```

**Answer**

```text
A
B
```

---

### Q2

**Will this compile?**

```java
class B extends A {

    B() {

        System.out.println("Hello");

        super();
    }
}
```

**Answer**

No.

Compile-time error because `super()` must be the first statement.

---

### Q3

**Will this compile?**

```java
class B extends A {

    B() {

        this(10);

        System.out.println("Default");
    }

    B(int x) {

        super();

        System.out.println(x);
    }
}
```

**Answer**

Yes.

**Output**

```text
A
10
Default
```

---

### Q4

Who inserts the hidden `super()` call?

**Answer**

The Java compiler.

---

### Q5

Can a child object exist without its parent part being initialized?

**Answer**

No.

The parent constructor must execute before the child constructor.

---

## Quick Revision

- Constructor chaining initializes objects correctly.
- Parent constructor executes before the child constructor.
- `super()` calls the parent constructor.
- `this()` calls another constructor in the same class.
- `super()` and `this()` must be the first statement.
- Constructors are not inherited.
- Java automatically inserts `super()` when appropriate.
- Constructor chaining is essential for inheritance.
