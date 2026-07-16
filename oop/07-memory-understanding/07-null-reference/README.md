# Null Reference in Java

## 📖 Introduction

`null` is a special literal in Java that represents the absence of an object reference.

When a reference variable is assigned `null`, it means the variable does not point to any object in memory.

Understanding `null` is important because it is one of the most common causes of `NullPointerException` in Java.

---

# What is null?

```java
Student s = null;
```

In this example:

- `s` is a reference variable.
- No object is created.
- `s` points to nothing.

Memory:

```
STACK

s = null

HEAP

(No Student object)
```

---

# Difference Between Declaration and Initialization

### Declaration Only

```java
Student s;
```

- Variable is declared.
- Not initialized.
- Cannot be used before assigning a value.

Attempting to use it causes a compile-time error.

---

### Initialized with null

```java
Student s = null;
```

- Variable is declared.
- Initialized with `null`.
- Can be printed or compared with `null`.

```java
System.out.println(s);
```

Output:

```
null
```

---

# NullPointerException

Example:

```java
Student s = null;

System.out.println(s.name);
```

Output:

```
Exception in thread "main"
java.lang.NullPointerException
```

Reason:

Java tries to access the `name` field through a reference that points to no object.

---

# Safe Null Check

Always check a reference before accessing its members.

```java
if (s != null) {
    System.out.println(s.name);
}
```

---

# Important Points

- `null` is not an object.
- `null` does not create an object.
- A reference can store `null`.
- Accessing members through a `null` reference throws `NullPointerException`.
- Comparing a reference with `null` is safe.

---

# Interview Questions

### What does `null` mean?

A reference variable does not point to any object.

---

### Is `null` an object?

No.

---

### Does `Student s = null;` create an object?

No.

---

### Difference between:

```java
Student s;
```

and

```java
Student s = null;
```

- `Student s;` → Declared but not initialized.
- `Student s = null;` → Declared and initialized with `null`.

---

### Why does `s == null` work but `s.name` throws an exception?

- `s == null` only checks the reference.
- `s.name` tries to access an object.
- Since no object exists, Java throws `NullPointerException`.

---

# Key Takeaways

- `null` represents the absence of an object reference.
- It is safe to compare references with `null`.
- Never access methods or fields through a `null` reference.
- Use null checks to prevent `NullPointerException`.
