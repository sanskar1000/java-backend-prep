# Reference Variables in Java

## 📖 Introduction

A reference variable stores the memory address (reference) of an object.

It **does not store the object itself**.

The object is stored in the Heap, while the reference variable is stored in the Stack.

---

# Example

```java
Student s = new Student();
```

Here:

- `Student` → Class
- `new Student()` → Creates an object in the Heap
- `s` → Reference variable stored in the Stack

---

# Memory Diagram

```text
STACK

s ----------------┐
                  │
                  ▼

HEAP

Student Object
--------------
name = null
marks = 0
```

---

# Accessing Object Members

```java
s.name = "Aradhya";
s.marks = 95;
```

The dot (`.`) operator uses the reference variable to access the object.

---

# Important Points

- A reference variable points to an object.
- A reference variable does not contain the object.
- Multiple references can point to the same object.
- If a reference becomes `null`, it no longer points to any object.

---

# Interview Questions

### What is a reference variable?

A variable that stores the reference (address) of an object.

---

### Where is a reference variable stored?

Stack Memory.

---

### Where is the object stored?

Heap Memory.

---

### Does a reference variable store the object?

No.

It stores only the reference to the object.

---

# Summary

- Objects live in the Heap.
- Reference variables live in the Stack.
- References allow us to access objects using the dot (`.`) operator.
