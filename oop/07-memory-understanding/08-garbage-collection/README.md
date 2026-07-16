# Garbage Collection in Java

## 📖 Introduction

Garbage Collection (GC) is an automatic memory management process performed by the Java Virtual Machine (JVM).

Its purpose is to reclaim heap memory occupied by objects that are no longer reachable, preventing memory leaks and reducing manual memory management.

---

# What is Garbage Collection?

Garbage Collection is the process of automatically removing objects from heap memory when they are no longer reachable by any reference.

The programmer does not explicitly free memory. The JVM decides when to run the Garbage Collector.

---

# Eligibility for Garbage Collection

An object becomes eligible for garbage collection when it is no longer reachable by any live reference.

Example:

```java
Student s = new Student();

s = null;
```

After `s` becomes `null`, the object has no references and becomes eligible for garbage collection.

---

# Important Point

**Eligible for Garbage Collection** does **not** mean the object is immediately removed.

The JVM decides the appropriate time to reclaim its memory.

---

# Ways an Object Becomes Eligible for GC

## 1. Assigning `null`

```java
Student s = new Student();

s = null;
```

---

## 2. Reassigning a Reference

```java
Student s1 = new Student();
Student s2 = new Student();

s1 = s2;
```

The first object becomes unreachable.

---

## 3. Local Reference Goes Out of Scope

```java
void test() {
    Student s = new Student();
}
```

When `test()` returns, `s` is removed from the stack. If no other references exist, the object becomes eligible for GC.

---

# System.gc()

```java
System.gc();
```

This method only requests garbage collection.

It does **not** guarantee that the Garbage Collector will run immediately.

---

# finalize()

Earlier versions of Java allowed overriding:

```java
protected void finalize()
```

to perform cleanup before an object was collected.

However, `finalize()` is deprecated because it is unreliable and can negatively affect performance.

Modern Java recommends using other resource management techniques instead.

---

# Stack vs Heap

- Stack stores reference variables.
- Heap stores objects.
- Garbage Collection only works on heap memory.

---

# Interview Questions

### What is Garbage Collection?

Automatic memory management performed by the JVM to reclaim unreachable objects.

---

### Does `System.gc()` guarantee garbage collection?

No. It only requests it.

---

### When does an object become eligible for GC?

When no reachable reference points to it.

---

### Does assigning `null` destroy an object?

No. It only removes that reference.

---

### Which memory is managed by the Garbage Collector?

Heap memory.

---

# Key Takeaways

- Objects are created in the Heap.
- References are stored in the Stack.
- Unreachable objects become eligible for Garbage Collection.
- The JVM decides when to reclaim memory.
- `System.gc()` is only a request.
- `finalize()` is deprecated.

---

# Conclusion

Garbage Collection is one of Java's most powerful features. It automatically manages heap memory, allowing developers to focus on application logic instead of manually freeing memory.
