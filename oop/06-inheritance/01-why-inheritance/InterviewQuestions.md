# Interview Questions — Why Inheritance

## Beginner Level

### 1. What is inheritance?

Inheritance is an OOP feature that allows one class to acquire the properties and behaviors of another class, promoting code reuse and logical class hierarchies.

---

### 2. Why was inheritance introduced?

Inheritance was introduced to reduce code duplication, improve maintainability, and enable code reuse.

---

### 3. What problem does inheritance solve?

It eliminates repeated fields and methods across multiple classes by placing common members in a parent class.

---

### 4. What is code reusability?

Code reusability is the ability to use existing code in new classes without rewriting it.

---

### 5. What is the DRY principle?

DRY stands for **Don't Repeat Yourself**. It encourages writing common code only once.

---

### 6. What is an IS-A relationship?

An IS-A relationship means one class is a specialized version of another.

Examples:

- Dog IS-A Animal
- Car IS-A Vehicle
- Manager IS-A Employee

---

### 7. What is a HAS-A relationship?

A HAS-A relationship means one object contains or uses another object.

Examples:

- Car HAS-A Engine
- Student HAS-A Laptop
- Library HAS-A Books

---

### 8. When should inheritance be used?

Use inheritance only when there is a genuine IS-A relationship.

---

### 9. When should inheritance be avoided?

Avoid inheritance when the relationship is HAS-A. In those cases, composition is usually the better choice.

---

## Interview Trick Questions

### Car → Engine

Answer:

HAS-A

---

### Dog → Animal

Answer:

IS-A

---

### Student → Person

Answer:

IS-A

---

### Person → Student

Answer:

Not correct for inheritance. The correct relationship is:

Student IS-A Person.

---

### House → Room

Answer:

HAS-A

---

## One-Line Revision

- Inheritance represents IS-A.
- Composition represents HAS-A.
- Inheritance promotes code reuse.
- Avoid unnecessary inheritance.
