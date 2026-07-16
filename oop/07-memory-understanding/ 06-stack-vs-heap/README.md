# Stack vs Heap in Java

## 📖 Introduction

Stack and Heap are two important memory areas managed by the Java Virtual Machine (JVM).

Understanding the difference between them is essential for learning object creation, memory management, object references, and garbage collection.

---

# Stack Memory

Stack memory is used for method execution.

It stores:

- Local variables
- Method parameters
- Reference variables
- Stack frames

### Characteristics

- One stack per thread
- Follows LIFO (Last In, First Out)
- Very fast
- Automatically cleaned when a method returns

Example:

```java
int age = 20;

Student s = new Student();
```

Stored in Stack:

- `age`
- `s` (reference variable)

---

# Heap Memory

Heap memory stores objects created using the `new` keyword.

It stores:

- Objects
- Arrays
- Instance variables

### Characteristics

- Shared among all threads
- Managed by the Garbage Collector
- Slower than Stack
- Objects remain until they become unreachable

Example:

```java
Student s = new Student();
```

The `Student` object is stored in the Heap.

---

# Stack vs Heap

| Stack | Heap |
|--------|------|
| Stores local variables | Stores objects |
| Stores method parameters | Stores arrays |
| Stores reference variables | Stores instance variables |
| One stack per thread | Shared by all threads |
| Follows LIFO | Does not follow LIFO |
| Faster | Slower |
| Automatically cleaned | Managed by Garbage Collector |

---

# Memory Diagram

```
STACK

main()

age = 20

student --------┐
                │
                ▼

HEAP

Student Object
--------------
name = "Aradhya"
marks = 90
```

---

# Key Points

- Primitive local variables are stored in the Stack.
- Reference variables are stored in the Stack.
- Objects are stored in the Heap.
- Instance variables are stored inside Heap objects.
- Stack memory is automatically cleaned after method execution.
- Heap memory is reclaimed by the Garbage Collector.

---

# Interview Questions

### Where are objects stored?

**Answer:** Heap Memory.

### Where are local variables stored?

**Answer:** Stack Memory.

### Where are reference variables stored?

**Answer:** Stack Memory.

### Which memory is faster?

**Answer:** Stack Memory.

### Which memory is automatically cleaned?

**Answer:** Stack Memory.

### Which memory is managed by the Garbage Collector?

**Answer:** Heap Memory.

---

# Conclusion

Stack and Heap work together during program execution.

The Stack manages method execution and reference variables, while the Heap stores objects and their instance data. A solid understanding of these memory areas is essential for mastering Java Object-Oriented Programming and performing well in technical interviews.
