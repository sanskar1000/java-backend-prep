# Object Creation Process in Java

## 📖 Introduction

Creating an object in Java appears simple:

```java
Student s = new Student();
```

However, the JVM performs several internal steps before the object is ready to use.

Understanding this process helps explain constructors, initialization blocks, static blocks, memory management, and object references.

---

# Object Creation Sequence

When Java executes:

```java
Student s = new Student();
```

the JVM performs the following steps:

1. Class loading (if the class is not already loaded)
2. Static variable initialization
3. Static block execution
4. Heap memory allocation
5. Default initialization
6. Instance variable initialization
7. Instance initializer block execution
8. Constructor execution
9. Return object reference
10. Assign reference to the variable

---

# Execution Flow

```
new Student()

        │
        ▼
Class Loading (only once)
        │
        ▼
Static Variables
        │
        ▼
Static Blocks
        │
        ▼
Allocate Heap Memory
        │
        ▼
Default Initialization
        │
        ▼
Instance Variable Initialization
        │
        ▼
Instance Initializer Block
        │
        ▼
Constructor
        │
        ▼
Return Reference
        │
        ▼
Assign Reference to Variable
```

---

# Important Notes

## Class Loading

- Happens only once.
- Static members are initialized.
- Static blocks execute once.

---

## Heap Allocation

Memory is allocated for the new object.

---

## Default Initialization

Every instance variable receives a default value.

Examples:

| Type | Default Value |
|------|---------------|
| int | 0 |
| double | 0.0 |
| boolean | false |
| char | '\u0000' |
| Object | null |

---

## Instance Variable Initialization

Explicit field initializers replace default values.

Example:

```java
String name = "Unknown";
```

---

## Instance Initializer Block

Runs every time an object is created.

Executes after field initialization but before the constructor.

---

## Constructor

The constructor performs the final initialization of the object.

It may overwrite values assigned earlier.

---

# Execution Order Example

Output:

```
Static Block
Field Initialization
Instance Block
Constructor
```

---

# Interview Questions

### Does the constructor execute first?

No.

Several initialization steps occur before the constructor.

---

### Do static blocks execute for every object?

No.

They execute only once when the class is loaded.

---

### Can a constructor change instance variable values?

Yes.

The constructor executes after instance variable initialization.

---

### What does the `new` keyword return?

A reference to the newly created object.

---

# Key Takeaways

- Class loading happens only once.
- Objects are created in Heap memory.
- References are stored in Stack memory.
- Instance variables are initialized before the constructor.
- Constructors perform the final object initialization.
- `new` returns a reference, not the object itself.
