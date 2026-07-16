# Java Memory Model (JVM Memory Overview)

## 📖 Introduction

Before understanding Object-Oriented Programming deeply, it is essential to understand how Java manages memory.

Whenever a Java program runs, the JVM (Java Virtual Machine) divides memory into different areas. Each area has a specific purpose.

Understanding JVM memory helps explain:

- Object creation
- Method execution
- Variable storage
- Static members
- Garbage Collection
- Stack vs Heap
- Object references

---

# JVM Memory Structure

```
                JVM Memory
+-----------------------------------+
|           Method Area             |
|  - Class Metadata                 |
|  - Static Variables               |
|  - Static Methods                 |
|-----------------------------------|
|               Heap                |
|  - Objects                        |
|  - Arrays                         |
|  - Instance Variables             |
|-----------------------------------|
|              Stack                |
|  - Method Calls                   |
|  - Local Variables                |
|  - Reference Variables            |
+-----------------------------------+
```

---

# Memory Areas

## 1. Stack Memory

Stack memory stores:

- Local variables
- Method parameters
- Reference variables
- Stack frames

Characteristics:

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
- `s` (reference)

---

## 2. Heap Memory

Heap memory stores:

- Objects
- Arrays
- Instance variables

Characteristics:

- Shared among all threads
- Managed by the Garbage Collector
- Slower than Stack
- Objects remain until unreachable

Example:

```java
Student s = new Student();
```

The `Student` object is created in the Heap.

---

## 3. Method Area

Stores:

- Class metadata
- Static variables
- Static methods
- Runtime constant pool

Example:

```java
static int count = 0;
```

`count` is stored in the Method Area.

---

# Memory Summary

| Memory Area | Stores |
|-------------|--------|
| Stack | Local variables, method parameters, references |
| Heap | Objects, arrays, instance variables |
| Method Area | Class metadata, static members |

---

# Key Points

- Objects are stored in the Heap.
- References are stored in the Stack.
- Static members belong to the class.
- Stack memory is automatically cleaned.
- Heap memory is managed by the Garbage Collector.

---

# Interview Questions

### Where are objects stored?

**Answer:** Heap Memory.

---

### Where are local variables stored?

**Answer:** Stack Memory.

---

### Where are reference variables stored?

**Answer:** Stack Memory.

---

### Where are static variables stored?

**Answer:** Method Area.

---

### Which memory is managed by the Garbage Collector?

**Answer:** Heap Memory.

---

### Which memory follows LIFO?

**Answer:** Stack Memory.

---

# Conclusion

The JVM separates memory into different regions so that method execution, object storage, and class information are managed efficiently.

Understanding the JVM memory model is the foundation for learning object references, garbage collection, inheritance, and advanced Java concepts.
