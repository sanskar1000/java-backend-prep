# Stack Memory in Java

## 📖 Introduction

Stack memory is a part of the JVM memory used for method execution.

Whenever a method is called, the JVM creates a **stack frame** for that method. The stack frame stores all data required during the execution of the method.

When the method finishes, its stack frame is automatically removed.

---

# What is Stored in Stack Memory?

Stack memory stores:

- Local variables
- Method parameters
- Reference variables
- Stack frames

> **Note:** Objects are **not** stored in the stack. Only references to objects are stored there.

---

# Characteristics

- One stack per thread
- Follows **LIFO (Last In, First Out)**
- Very fast memory access
- Automatically cleaned when a method returns
- Does not use the Garbage Collector

---

# Example

```java
public class StackMemoryDemo {

    static void display() {

        int number = 10;

        System.out.println(number);
    }

    public static void main(String[] args) {

        display();
    }
}
```

---

# Memory Diagram

During the execution of `display()`:

```
STACK

main()

display()

number = 10
```

After `display()` returns:

```
STACK

main()
```

The `display()` stack frame is removed automatically.

---

# Key Points

- Every method call creates a new stack frame.
- Local variables exist only while their method is executing.
- Stack memory is automatically cleaned when the method returns.
- Stack memory is faster than heap memory.

---

# Interview Questions

### 1. What is Stack Memory?

Stack memory stores method execution data such as local variables, method parameters, and reference variables.

---

### 2. What is a Stack Frame?

A stack frame is a memory block created for each method call. It stores the method's local variables and execution information.

---

### 3. What happens when a method returns?

The corresponding stack frame is automatically removed from the stack.

---

### 4. Does Stack Memory store objects?

No.

It stores only reference variables. Objects are stored in heap memory.

---

### 5. Does Stack Memory use the Garbage Collector?

No.

Stack memory is cleaned automatically when a method finishes execution.

---

# Conclusion

Stack memory is responsible for managing method execution in Java. It stores local variables, method parameters, and references, providing fast memory allocation and automatic cleanup after method execution.
