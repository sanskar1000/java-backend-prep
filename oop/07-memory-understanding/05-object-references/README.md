# Object References in Java

## 📖 Introduction

In Java, variables of class types do not store objects directly.

Instead, they store **references** (memory addresses) that point to objects created in the Heap.

Understanding object references is essential because it explains:

- How objects are accessed
- Why two variables can refer to the same object
- Object aliasing
- Reference assignment
- Garbage Collection

---

# Creating an Object

```java
Student s1 = new Student();
```

Memory:

```
STACK

s1 --------►

HEAP

Student Object
```

- `s1` is stored in the Stack.
- The `Student` object is stored in the Heap.

---

# Copying a Reference

```java
Student s1 = new Student();
Student s2 = s1;
```

Memory:

```
STACK

s1 --------┐
           │
s2 --------┘
           │
           ▼

HEAP

Student Object
```

Important:

- Only one object exists.
- Two references point to the same object.

---

# Modifying Through One Reference

```java
s1.name = "Aradhya";

System.out.println(s2.name);
```

Output:

```
Aradhya
```

Why?

Because both references point to the same object.

---

# Object Aliasing

When two or more reference variables point to the same object, it is called **Object Aliasing**.

Example:

```java
Student s1 = new Student();
Student s2 = s1;
```

---

# Reference Assignment

```java
Student s1 = new Student();
Student s2 = new Student();

s1 = s2;
```

Result:

- `s1` now points to the second object.
- The first object becomes eligible for Garbage Collection if no references remain.

---

# Key Points

- Objects are stored in the Heap.
- References are stored in the Stack.
- Assigning one reference to another does **not** create a new object.
- Changes made through one reference are visible through all references pointing to the same object.
- Every `new` keyword creates exactly one object.

---

# Interview Questions

### How many objects?

```java
Student s1 = new Student();
Student s2 = s1;
```

**Answer:** 1 object

---

### How many references?

**Answer:** 2 references (`s1` and `s2`)

---

### Does `Student s2 = s1;` copy the object?

**Answer:** No. It copies only the reference.

---

### What is Object Aliasing?

**Answer:** Two or more reference variables pointing to the same object.

---

# Conclusion

Object references are one of the most important concepts in Java because every object is accessed through a reference. A clear understanding of references helps explain object sharing, aliasing, memory management, and garbage collection.
