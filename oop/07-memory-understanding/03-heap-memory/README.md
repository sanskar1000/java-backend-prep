# Heap Memory in Java

## 📖 Introduction

Heap Memory is the runtime memory area of the Java Virtual Machine (JVM) where all objects and arrays are created.

Whenever the `new` keyword is used, Java allocates memory for the object in the Heap.

Heap memory is shared among all threads and is managed automatically by the JVM through the Garbage Collector.

---

# What is Stored in Heap Memory?

Heap memory stores:

- Objects
- Arrays
- Instance variables

Example:

```java
Student s = new Student();
```

The `Student` object is created in the Heap.

The reference variable `s` is stored in the Stack.

---

# Heap Memory Diagram

```
STACK

s --------------------┐
                      │
                      ▼

HEAP

Student Object
--------------
name = null
marks = 0
```

---

# Characteristics of Heap Memory

- Stores all objects and arrays
- Shared by all threads
- Dynamically allocated
- Larger than Stack Memory
- Managed by the Garbage Collector
- Objects remain until they become unreachable

---

# Object Creation

Example:

```java
Student s = new Student();
```

Execution:

1. Heap memory is allocated.
2. Default values are assigned.
3. Instance variables are initialized.
4. Constructor executes.
5. A reference to the object is returned.
6. The reference is stored in the Stack.

---

# Multiple Objects

```java
Student s1 = new Student();
Student s2 = new Student();
```

Memory:

```
STACK

s1 ------------┐
               │
               ▼

          Student Object 1

s2 ------------┐
               │
               ▼

          Student Object 2
```

Each `new` keyword creates a separate object.

---

# Heap vs Stack

| Heap | Stack |
|------|-------|
| Stores objects | Stores local variables |
| Stores arrays | Stores references |
| Shared memory | One stack per thread |
| Managed by Garbage Collector | Automatically cleaned |

---

# Key Points

- Objects are always created in the Heap.
- Instance variables exist inside Heap objects.
- References are not stored in the Heap.
- Heap memory is managed by the Garbage Collector.
- Every `new` keyword creates a new object.

---

# Interview Questions

### Where are objects stored?

**Answer:** Heap Memory.

---

### Where are instance variables stored?

**Answer:** Inside objects in Heap Memory.

---

### Does Heap store reference variables?

**Answer:** No.

Reference variables are stored in Stack Memory.

---

### When is Heap memory cleaned?

**Answer:** By the Garbage Collector after objects become unreachable.

---

# Conclusion

Heap Memory is responsible for storing every object created during program execution.

Understanding Heap Memory is essential for learning object references, garbage collection, inheritance, and advanced Java programming.
