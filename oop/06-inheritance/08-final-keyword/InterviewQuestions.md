# Interview Questions — Final Keyword in Java

## Beginner Level

### Q1. What is the `final` keyword in Java?

**Answer:**
The `final` keyword is used to restrict modification. It can be applied to variables, methods, and classes.

---

### Q2. What happens if a variable is declared `final`?

**Answer:**
A `final` variable can be assigned only once. After initialization, its value cannot be changed.

Example:

```java
final int age = 20;
```

---

### Q3. Can a `final` variable be initialized later?

**Answer:**
Yes. It can be assigned exactly once before it is used.

---

### Q4. What is a `final` reference variable?

**Answer:**
A `final` reference variable cannot point to another object after initialization, but the object's state can still change.

Example:

```java
final Dog d = new Dog();
d.setName("Bruno");      // Allowed
// d = new Dog();        // Not allowed
```

---

### Q5. Does `final` make an object immutable?

**Answer:**
No.

It only prevents the reference from pointing to another object. The object's internal data can still change unless the class itself is immutable.

---

## Intermediate Level

### Q6. What is a `final` method?

**Answer:**
A `final` method is inherited by child classes but cannot be overridden.

---

### Q7. Can a child class call a `final` method?

**Answer:**
Yes.

A `final` method is inherited normally and can be called by child classes.

---

### Q8. Why would you declare a method `final`?

**Answer:**

- Prevent overriding
- Protect important business logic
- Improve code reliability
- Maintain consistent behavior

---

### Q9. What happens if a child class overrides a `final` method?

**Answer:**
The program fails to compile because overriding a `final` method is not allowed.

---

### Q10. What is a `final` class?

**Answer:**
A `final` class cannot be inherited.

Example:

```java
final class Utility {

}
```

---

### Q11. Can a `final` class be instantiated?

**Answer:**
Yes.

A `final` class can have objects but cannot be extended.

---

### Q12. Why is the `String` class declared `final`?

**Answer:**
To prevent inheritance and ensure security, reliability, and consistent behavior throughout Java applications.

---

## Advanced Level

### Q13. Difference between a `final` variable and a `final` reference?

**Answer:**

| Final Variable | Final Reference |
|---------------|-----------------|
| Primitive value cannot change | Reference cannot point to another object |
| Value is fixed | Object state may still change |

---

### Q14. Difference between `final`, `finally`, and `finalize()`?

| Keyword/Method | Purpose |
|---------------|---------|
| `final` | Restricts modification |
| `finally` | Executes after `try`/`catch` block |
| `finalize()` | Garbage collection method (deprecated) |

---

### Q15. Can constructors be declared `final`?

**Answer:**
No.

Constructors are never inherited, so preventing overriding is unnecessary.

---

### Q16. Can abstract methods be `final`?

**Answer:**
No.

An abstract method must be overridden, while a `final` method cannot be overridden. These two concepts contradict each other.

---

### Q17. Can a class be both `abstract` and `final`?

**Answer:**
No.

An abstract class is meant to be inherited, while a final class cannot be inherited.

---

### Q18. Which Java classes are commonly declared `final`?

**Answer:**

- String
- Math
- System (cannot be instantiated and is final)

---

## Quick Revision

| Applied To | Meaning |
|------------|---------|
| `final` Variable | Cannot be reassigned |
| `final` Reference | Cannot point to another object |
| `final` Method | Cannot be overridden |
| `final` Class | Cannot be inherited |

---

# Common Interview Mistakes

❌ A final object cannot change.

✅ Correct:
A final **reference** cannot change, but the object's state can still change.

---

❌ A final method cannot be inherited.

✅ Correct:
A final method **is inherited** but **cannot be overridden**.

---

❌ A final class cannot have objects.

✅ Correct:
A final class **can be instantiated**, but **cannot be extended**.

---

# Key Takeaways

- `final` variables are assigned only once.
- `final` references cannot refer to a different object.
- `final` methods prevent overriding.
- `final` classes prevent inheritance.
- `final` improves security, reliability, and maintainability.
