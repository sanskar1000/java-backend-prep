# 07 - Method References

This module demonstrates **Method References in Java**.

A method reference is a short and readable way to refer to an existing method or constructor when a lambda expression only calls that method.

---

## 📁 Module Structure

07-method-references/
├── StaticMethodReferenceDemo.java
├── InstanceMethodReferenceDemo.java
├── ConstructorReferenceDemo.java
├── README.md
└── InterviewQuestions.md

---

## 🎯 Learning Objectives

After completing this module, you should understand:

- What a method reference is
- Why method references are used
- The `::` operator
- Static method references
- Instance method references
- Constructor references
- The relationship between lambdas and method references
- How method references work with functional interfaces

---

## 1. What is a Method Reference?

A method reference is a compact alternative to a lambda expression when the lambda simply calls an existing method.

Example lambda:

    Function<String, Integer> length =
            text -> text.length();

Equivalent method reference:

    Function<String, Integer> length =
            String::length;

Both perform the same operation.

### General Syntax

    ClassName::methodName

    object::methodName

    ClassName::new

---

# 2. Static Method Reference

A static method reference refers to a static method using the class name.

### Example

    Function<Integer, Integer> absoluteValue =
            Math::abs;

Equivalent lambda:

    Function<Integer, Integer> absoluteValue =
            number -> Math.abs(number);

### Execution

    System.out.println(absoluteValue.apply(-50));

Output:

    50

### Pattern

    ClassName::staticMethod

Example:

    Math::abs

---

# 3. Instance Method Reference

There are two important forms of instance method references.

## A. Specific Object Method Reference

Example:

    Consumer<String> printer =
            System.out::println;

Equivalent lambda:

    Consumer<String> printer =
            text -> System.out.println(text);

Here:

- `System.out` is the existing object.
- `println` is the instance method.

### Pattern

    object::instanceMethod

---

## B. Input Object Method Reference

Example:

    Function<String, String> upperCase =
            String::toUpperCase;

Equivalent lambda:

    Function<String, String> upperCase =
            text -> text.toUpperCase();

Here, the input String becomes the object on which the method is called.

### Pattern

    ClassName::instanceMethod

---

# 4. Constructor Reference

A constructor reference is used when a lambda creates an object using a constructor.

### Lambda

    Function<String, Employee> employeeCreator =
            name -> new Employee(name);

### Constructor Reference

    Function<String, Employee> employeeCreator =
            Employee::new;

The `::new` syntax represents the constructor.

### Another Example

    Function<String, StringBuilder> builderCreator =
            StringBuilder::new;

Equivalent lambda:

    Function<String, StringBuilder> builderCreator =
            text -> new StringBuilder(text);

---

# 5. Four Major Forms

| Type | Syntax | Example |
|---|---|---|
| Static method | `ClassName::method` | `Math::abs` |
| Specific object method | `object::method` | `System.out::println` |
| Input object method | `ClassName::method` | `String::toUpperCase` |
| Constructor | `ClassName::new` | `Employee::new` |

---

# 6. Lambda vs Method Reference

## Static Method

Lambda:

    number -> Math.abs(number)

Method reference:

    Math::abs

---

## Specific Object

Lambda:

    text -> System.out.println(text)

Method reference:

    System.out::println

---

## Input Object

Lambda:

    text -> text.toUpperCase()

Method reference:

    String::toUpperCase

---

## Constructor

Lambda:

    name -> new Employee(name)

Method reference:

    Employee::new

---

# 7. Functional Interfaces and Method References

Method references work with functional interfaces because a functional interface provides a target type for the referenced method.

Examples:

    Function<String, Integer> length =
            String::length;

    Consumer<String> printer =
            System.out::println;

    Function<Integer, Integer> absoluteValue =
            Math::abs;

    Function<String, Employee> employeeCreator =
            Employee::new;

The functional interface determines the expected input and return types.

---

# 8. Common Functional Interfaces

Method references are commonly used with:

    Predicate<T>  → test()
    Consumer<T>   → accept()
    Function<T,R> → apply()
    Supplier<T>   → get()

Example:

    Function<String, String> upperCase =
            String::toUpperCase;

    String result = upperCase.apply("java");

Result:

    JAVA

---

# 9. Advantages of Method References

### 1. Less Code

Method references can eliminate unnecessary lambda syntax.

### 2. Better Readability

When the lambda only calls an existing method, the method reference clearly expresses the intention.

### 3. Reuses Existing Methods

You can directly reference existing methods instead of writing another lambda.

### 4. Works With Functional Interfaces

Method references can be assigned to compatible functional-interface types.

---

# 10. Important Rules

### Rule 1 — Use `::`

Method references use the double-colon operator.

    String::length

---

### Rule 2 — Don't write parentheses

Correct:

    String::length

Incorrect:

    String::length()

---

### Rule 3 — Constructor references use `::new`

Correct:

    Employee::new

Incorrect:

    Employee::new()

---

### Rule 4 — The referenced method must be compatible with the functional interface

For example:

    Function<String, Integer> length =
            String::length;

The method reference must match the functional interface's expected input and return types.

---

# 11. Files in This Module

## StaticMethodReferenceDemo.java

Demonstrates static method references such as:

    Math::abs

---

## InstanceMethodReferenceDemo.java

Demonstrates instance method references such as:

    System.out::println

and:

    String::toUpperCase

---

## ConstructorReferenceDemo.java

Demonstrates constructor references such as:

    StringBuilder::new

and:

    Employee::new

---

# 12. Key Takeaways

Remember these four examples:

    Math::abs
    System.out::println
    String::toUpperCase
    Employee::new

And remember:

    ::     → method reference
    ::new  → constructor reference

A method reference is mainly useful when a lambda does nothing more than call an existing method or constructor.

---

## 🧠 Quick Revision

Lambda:

    text -> text.toUpperCase()

Method reference:

    String::toUpperCase

Lambda:

    text -> System.out.println(text)

Method reference:

    System.out::println

Lambda:

    number -> Math.abs(number)

Method reference:

    Math::abs

Lambda:

    name -> new Employee(name)

Constructor reference:

    Employee::new

---

## 🚀 Next Topic

After method references, the next major topic is:

**Stream API**

Streams will allow you to combine:

- Lambda expressions
- Functional interfaces
- Method references
- Collections
- Filtering
- Mapping
- Sorting
- Aggregation

These concepts are heavily used in modern Java backend development.
