# Constructor Chaining in Inheritance

## Overview

This module demonstrates how constructors work in an inheritance hierarchy.

When a child object is created, Java first executes the parent class constructor and then the child class constructor. This process is known as **constructor chaining**.

Java performs constructor chaining using the `super()` keyword.

---

## Learning Objectives

After completing this module, I learned:

- Constructor chaining in inheritance
- Why the parent constructor executes first
- How `super()` works
- Automatic and explicit `super()`
- Constructor execution order
- Parent and child object initialization
- Reusing parent constructors
- Designing inheritance hierarchies

---

## Programs

### AnimalDemo.java

**Concepts Covered**

- Parent and child classes
- Constructor chaining
- `super(...)`
- Constructor execution order
- Displaying inherited and child-specific data

---

### PersonDemo.java

**Concepts Covered**

- Constructor chaining
- Parameterized constructors
- Input validation
- Encapsulation
- Code reuse through inheritance
- Parent and child object initialization

---

## Constructor Execution Order

When a child object is created:

```java
Student s = new Student("Aradhya", 20, 101, "Java");
```

Java executes constructors in the following order:

```text
1. Child constructor is called
2. super(...) is executed
3. Parent constructor executes
4. Parent constructor finishes
5. Child constructor continues
6. Child constructor finishes
7. Object reference is assigned
```

---

## Automatic `super()`

If a child constructor does not explicitly call a parent constructor, Java automatically inserts:

```java
super();
```

This happens only if the parent has a no-argument constructor.

---

## Explicit `super(...)`

When the parent constructor requires parameters:

```java
class Student extends Person {

    Student(String name, int age) {

        super(name, age);
    }
}
```

The call to `super(...)` must be the **first statement** inside the constructor.

---

## Important Rules

- Every constructor calls another constructor.
- A constructor can call either `super(...)` or `this(...)`.
- `super(...)` or `this(...)` must be the first statement.
- Constructors are **not inherited**.
- Parent constructors initialize the parent part of the object.
- Child constructors initialize the child part.

---

## Constructor Flow

```text
Create Child Object
        │
        ▼
Child Constructor
        │
        ▼
super(...)
        │
        ▼
Parent Constructor
        │
        ▼
Parent Initialization
        │
        ▼
Return to Child Constructor
        │
        ▼
Child Initialization
        │
        ▼
Object Ready
```

---

## Advantages

- Proper object initialization
- Code reuse
- Better class organization
- Cleaner inheritance hierarchy
- Easier maintenance

---

## Key Takeaways

- Parent constructors always execute before child constructors.
- Java automatically inserts `super()` when required.
- `super(...)` must be the first statement in a constructor.
- Constructors are chained from parent to child.
- Constructor chaining ensures every part of an object is initialized correctly.

---

## Folder Structure

```text
06-inheritance/
└── 03-constructor-chaining/
    ├── AnimalDemo.java
    ├── PersonDemo.java
    ├── README.md
    └── InterviewQuestions.md
```

---

## Author

**Aradhya Thakur**

Learning Java OOP step by step with industry-level best practices.
