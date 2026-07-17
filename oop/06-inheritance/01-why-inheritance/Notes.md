# Quick Notes — Why Inheritance

## Definition

Inheritance is an OOP mechanism that allows one class to inherit fields and methods from another class.

---

## Purpose

- Code Reuse
- Maintainability
- Logical Hierarchy
- Reduce Duplication

---

## DRY Principle

Don't Repeat Yourself.

---

## IS-A Relationship

Examples:

- Dog → Animal
- Car → Vehicle
- Developer → Employee
- Sparrow → Bird

---

## HAS-A Relationship

Examples:

- Car → Engine
- Student → Laptop
- Library → Books
- Mobile → Battery

---

## Use Inheritance When

✔ Child is a specialized version of Parent.

✔ Relationship is IS-A.

---

## Avoid Inheritance When

✘ Relationship is HAS-A.

---

## Advantages

- Reusable code
- Easy maintenance
- Better organization
- Easy extension

---

## Memory Tip

Ask one question:

"Is Child a type of Parent?"

YES → Inheritance

NO → Composition

---

## Common Mistakes

❌ Car extends Engine

❌ Student extends Book

❌ Library extends Book

---

## Correct Examples

✔ Dog extends Animal

✔ Car extends Vehicle

✔ Developer extends Employee

✔ Sparrow extends Bird

---

## Revision Formula

```
IS-A  → Inheritance

HAS-A → Composition
```
