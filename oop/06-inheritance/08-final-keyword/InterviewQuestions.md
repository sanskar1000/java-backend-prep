# Interview Questions — Final Keyword

## Basic Questions

### 1. What is the `final` keyword in Java?

### 2. Where can the `final` keyword be used?

### 3. What is a final variable?

### 4. Can a final variable be reassigned?

### 5. What happens if you try to reassign a final variable?

### 6. Why are constants declared using `final`?

### 7. What is the Java naming convention for constants?

---

# Final Reference Variables

### 8. What is a final reference variable?

### 9. Can a final reference point to another object?

### 10. Can the object itself be modified?

Explain with an example.

### 11. What is the difference between these two statements?

```java
final Student s = new Student();
```

```java
Student s = new Student();
```

### 12. Why does this compile?

```java
final StringBuilder sb = new StringBuilder("Java");

sb.append(" Backend");
```

### 13. Why does this fail?

```java
sb = new StringBuilder("Python");
```

---

# Output Questions

### Question 1

```java
final int x = 10;

System.out.println(x);
```

**Predict the output.**

---

### Question 2

```java
final String name = "Aradhya";

name = "Yasir";
```

- Does it compile?
- Why?

---

### Question 3

```java
final StringBuilder sb = new StringBuilder("Java");

sb.append(" Backend");

System.out.println(sb);
```

- What is the output?
- Why?

---

### Question 4

```java
final Student s = new Student("Rahul", "Java");

s.setCourse("Spring Boot");
```

- Does it compile?
- Why?

---

# Conceptual Questions

### 1. Does `final` make an object immutable?

### 2. What is the difference between a final variable and a final reference variable?

### 3. Why are constants usually declared as `public static final`?

### 4. What are the advantages of using the `final` keyword?

### 5. When should you use `final` in real-world projects?

---

# Common Interview Trap

Consider the following code:

```java
final Student s = new Student("Rahul", "Java");

s.setCourse("Python");
```

Will this compile?

Explain why.

---

# Quick Revision

- `final` variable → Assigned only once.
- `final` reference → Cannot point to another object.
- Object state → Can still change.
- Constants → Use UPPER_SNAKE_CASE.
- Reassigning a final variable → Compile-time error.
