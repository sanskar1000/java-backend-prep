# Method Overriding - Interview Questions

## Beginner Level

### 1. What is method overriding?

Method overriding is a feature of inheritance where a child class provides its own implementation of a method that already exists in the parent class.

---

### 2. Why is method overriding used?

It allows child classes to provide specialized behavior while reusing the parent class structure.

---

### 3. Is inheritance required for method overriding?

**Yes.**

Method overriding is only possible when there is an inheritance relationship.

---

### 4. Which annotation is commonly used with method overriding?

```java
@Override
```

---

### 5. Is the `@Override` annotation mandatory?

No.

However, it is highly recommended because it helps the compiler detect mistakes.

---

### 6. Can constructors be overridden?

No.

Constructors are **not inherited**, so they cannot be overridden.

---

### 7. Can a child class completely replace a parent method?

Yes.

The child class can provide a completely different implementation of the inherited method.

---

### 8. Can the child class still use the parent implementation?

Yes.

Using:

```java
super.methodName();
```

---

### 9. Which method executes when a child object calls an overridden method?

The **child class method** executes.

---

### 10. What is the relationship required for overriding?

An **IS-A** relationship.

Example:

```text
Dog IS-A Animal
Developer IS-A Employee
```

---

# Intermediate Level

### 11. What are the rules of method overriding?

- Same method name
- Same parameter list
- Same or covariant return type
- Access modifier cannot be more restrictive
- Inheritance is required

---

### 12. Can the return type change?

Yes.

Only if it is a **covariant return type** (a subclass of the original return type).

---

### 13. Can the access modifier become more restrictive?

No.

Example:

```java
public
```

cannot become

```java
private
```

---

### 14. Can the access modifier become less restrictive?

Yes.

Example:

```java
protected
```

can become

```java
public
```

---

### 15. What is an overridden method?

The method in the **parent class** that is replaced by the child class implementation.

---

### 16. What is an overriding method?

The method in the **child class** that provides the new implementation.

---

### 17. Why is `@Override` useful?

It allows the compiler to verify that a method is actually overriding a parent method, helping prevent accidental mistakes.

---

### 18. Can a static method be overridden?

No.

Static methods are **hidden**, not overridden.

---

### 19. Can a private method be overridden?

No.

Private methods are not inherited.

---

### 20. Can a final method be overridden?

No.

A `final` method cannot be overridden.

---

# Overriding vs Overloading

### 21. What is the difference between overriding and overloading?

| Method Overriding | Method Overloading |
|-------------------|--------------------|
| Requires inheritance | Inheritance not required |
| Same method name | Same method name |
| Same parameter list | Different parameter list |
| Runtime polymorphism | Compile-time polymorphism |
| Parent and child classes | Usually the same class |

---

### 22. Is changing only the parameter list overriding?

No.

It is **method overloading**.

---

### 23. Is changing only the return type enough to overload a method?

No.

Changing only the return type does not create a valid overloaded method.

---

# Output-Based Questions

### 24. Predict the output.

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

        Dog d = new Dog();

        d.sound();
    }
}
```

**Answer**

```text
Dog
```

---

### 25. Predict the output.

```java
class Animal {

    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        super.sound();

        System.out.println("Dog");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
```

**Answer**

```text
Animal
Dog
```

---

### 26. Which method executes first?

```java
class A {

    void show() {
        System.out.println("A");
    }
}

class B extends A {

    @Override
    void show() {

        super.show();

        System.out.println("B");
    }
}
```

**Answer**

The parent method executes first because `super.show()` is called before printing `"B"`.

---

# Common Pitfalls

### 27. What happens if the method name is different?

It is **not overriding**.

It becomes a completely new method.

---

### 28. What happens if the parameter list changes?

It becomes **method overloading**, not overriding.

---

### 29. What happens if `@Override` is used but no matching parent method exists?

The compiler reports an error.

---

### 30. Why can't private methods be overridden?

Because they are accessible only within their own class and are **not inherited** by child classes.

---

### 31. Why can't final methods be overridden?

Because the `final` keyword prevents subclasses from changing the implementation.

---

### 32. Why are static methods not overridden?

Static methods belong to the class, not to individual objects. They are **hidden**, not overridden.

---

# Frequently Asked Interview Questions

### Q1. What is method overriding?

---

### Q2. Why is method overriding important?

---

### Q3. What are the rules of method overriding?

---

### Q4. What is the difference between overriding and overloading?

---

### Q5. What is runtime polymorphism?

---

### Q6. What is the purpose of the `@Override` annotation?

---

### Q7. What is the difference between an overridden method and an overriding method?

---

### Q8. Can constructors be overridden?

---

### Q9. Can final methods be overridden?

---

### Q10. Can private methods be overridden?

---

### Q11. Can static methods be overridden?

---

### Q12. Why is `super.method()` used in an overriding method?

---

### Q13. Which method executes when a child object calls an overridden method?

---

### Q14. What happens if the access modifier becomes more restrictive?

---

### Q15. Give three real-world examples where method overriding is useful.

- Animal → Dog, Cat
- Employee → Developer, Tester
- Vehicle → Car, Bike

---

# Quick Revision

- Method overriding requires inheritance.
- The method name and parameter list must be the same.
- `@Override` helps detect mistakes.
- `super.method()` calls the parent implementation.
- Constructors cannot be overridden.
- Private methods cannot be overridden.
- Static methods are hidden, not overridden.
- Final methods cannot be overridden.
- Method overriding enables runtime polymorphism.
- Overriding is different from overloading.
