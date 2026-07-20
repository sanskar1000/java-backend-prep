# `super` Keyword - Interview Questions

## Beginner Level

### 1. What is the `super` keyword?

`super` is a reference to the immediate parent class.

---

### 2. Why is the `super` keyword used?

- To call the parent constructor
- To call a parent method
- To access a parent field

---

### 3. How do you call a parent constructor?

```java
super();
```

or

```java
super(arguments);
```

---

### 4. Where must `super()` be written?

It must be the **first statement** inside a constructor.

---

### 5. Can `super()` appear after another statement?

No.

It causes a **compile-time error**.

---

### 6. How do you call a parent method?

```java
super.methodName();
```

---

### 7. How do you access a parent field?

```java
super.fieldName;
```

The field must be accessible.

---

### 8. What does `super` refer to?

The immediate parent class.

---

### 9. Is `super` a keyword or a method?

It is a **keyword**.

---

### 10. Can `super` be used inside a static method?

No.

`super` belongs to an object, while static methods belong to the class.

---

## Intermediate Level

### 11. What is the difference between `this` and `super`?

| `this` | `super` |
|---------|----------|
| Refers to the current object | Refers to the parent class |
| Accesses current class members | Accesses parent class members |
| Calls another constructor in the same class | Calls the parent constructor |

---

### 12. Why do we use `super.method()`?

To reuse the parent's implementation before or after adding child-specific behavior.

---

### 13. Why is `super()` important?

It ensures the parent part of the object is initialized before the child part.

---

### 14. Can a constructor call both `this()` and `super()`?

No.

A constructor can call only one of them, and it must be the first statement.

---

### 15. What happens if `super()` is omitted?

If the parent has a no-argument constructor, Java automatically inserts `super()`.

Otherwise, a compile-time error occurs.

---

## Frequently Asked Interview Questions

### Q1

**Output?**

```java
class A {

    void show() {
        System.out.println("A");
    }
}

class B extends A {

    void show() {

        super.show();

        System.out.println("B");
    }
}

public class Main {

    public static void main(String[] args) {

        new B().show();
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

`super()` must be the first statement.

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

What is the difference between `display()` and `super.display()`?

**Answer**

- `display()` calls the current class method.
- `super.display()` calls the parent class method.

---

### Q5

Can `super` access private members of the parent class?

**Answer**

No.

Private members are not accessible outside the parent class.

---

## Quick Revision

- `super` refers to the immediate parent class.
- `super()` calls the parent constructor.
- `super.method()` calls a parent method.
- `super.field` accesses a parent field (if accessible).
- `super()` must be the first statement in a constructor.
- `super` cannot access private members.
- `this` refers to the current object, while `super` refers to the parent.
