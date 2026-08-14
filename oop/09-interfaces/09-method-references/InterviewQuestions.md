# Method References — Interview Questions

## Basic Questions

### 1. What is a method reference?

A method reference is a shorter and more readable alternative to a lambda expression when the lambda only calls an existing method or constructor.

---

### 2. Which symbol is used for method references?

The double-colon operator:

::

Example:

String::length

---

### 3. What are the main types of method references?

There are four main forms:

1. Reference to a static method
2. Reference to an instance method of a particular object
3. Reference to an instance method of an arbitrary object of a particular type
4. Reference to a constructor

---

### 4. What is the syntax for a static method reference?

ClassName::staticMethod

Example:

Math::abs

---

### 5. What is the syntax for an instance method reference of a particular object?

object::instanceMethod

Example:

System.out::println

---

### 6. What is the syntax for an instance method reference where the input object is the receiver?

ClassName::instanceMethod

Example:

String::toUpperCase

---

### 7. What is the syntax for a constructor reference?

ClassName::new

Example:

Employee::new

---

## Lambda vs Method Reference

### 8. Convert this lambda into a method reference:

number -> Math.abs(number)

Answer:

Math::abs

---

### 9. Convert this lambda into a method reference:

text -> System.out.println(text)

Answer:

System.out::println

---

### 10. Convert this lambda into a method reference:

text -> text.toUpperCase()

Answer:

String::toUpperCase

---

### 11. Convert this lambda into a constructor reference:

name -> new Employee(name)

Answer:

Employee::new

---

## Functional Interfaces

### 12. Can method references be used with functional interfaces?

Yes.

A method reference can be assigned to a compatible functional interface.

Example:

Function<String, Integer> length = String::length;

---

### 13. Why can method references be used with functional interfaces?

Because a functional interface has exactly one abstract method, which provides the target method signature for the lambda or method reference.

---

### 14. Which method executes a Function?

apply()

Example:

length.apply("Java");

---

### 15. Which method executes a Consumer?

accept()

Example:

printer.accept("Hello");

---

### 16. Which method executes a Predicate?

test()

Example:

isValid.test("Java");

---

### 17. Which method executes a Supplier?

get()

Example:

message.get();

---

## Static Method References

### 18. Is Math::abs a static method reference?

Yes.

Math.abs() is a static method, so:

Math::abs

is a static method reference.

---

### 19. What is the equivalent lambda of Math::abs?

number -> Math.abs(number)

---

### 20. Does a static method reference require an object?

No.

A static method is referenced using its class name.

Example:

Math::abs

---

## Instance Method References

### 21. Is System.out::println an instance method reference?

Yes.

System.out is an existing PrintStream object, and println() is an instance method.

---

### 22. What is the equivalent lambda of System.out::println?

text -> System.out.println(text)

---

### 23. Is String::toUpperCase an instance method reference?

Yes.

The input String becomes the object on which toUpperCase() is called.

---

### 24. What is the equivalent lambda of String::toUpperCase?

text -> text.toUpperCase()

---

### 25. What is the difference between System.out::println and String::toUpperCase?

System.out::println refers to a method of a specific existing object.

String::toUpperCase refers to an instance method where the input object becomes the receiver.

---

## Constructor References

### 26. What does ClassName::new represent?

It represents a constructor reference.

Example:

Employee::new

---

### 27. What is the equivalent lambda of Employee::new?

name -> new Employee(name)

---

### 28. Can constructor references be used with Function?

Yes, if the constructor's parameter and return types match the Function.

Example:

Function<String, Employee> creator = Employee::new;

---

### 29. What is the equivalent lambda of StringBuilder::new?

text -> new StringBuilder(text)

---

### 30. Should parentheses be written after ::new?

No.

Correct:

Employee::new

Incorrect:

Employee::new()

---

## Syntax Questions

### 31. Is this correct?

String::length()

Answer:

No.

Correct:

String::length

---

### 32. Is this correct?

String::length

Answer:

Yes.

---

### 33. Is this correct?

Employee::new

Answer:

Yes.

---

### 34. Is this correct?

Employee::new()

Answer:

No.

---

### 35. What is wrong with this?

Function<String, Integer> length = String::length();

Answer:

Method references do not use parentheses.

Correct:

Function<String, Integer> length = String::length;

---

## Output and Prediction Questions

### 36. What is the output?

Function<Integer, Integer> absoluteValue = Math::abs;

System.out.println(absoluteValue.apply(-25));

Answer:

25

---

### 37. What is the output?

Function<String, Integer> length = String::length;

System.out.println(length.apply("Java"));

Answer:

4

---

### 38. What is the output?

Function<String, String> upper = String::toUpperCase;

System.out.println(upper.apply("java"));

Answer:

JAVA

---

### 39. What is the output?

Consumer<String> printer = System.out::println;

printer.accept("Hello Java");

Answer:

Hello Java

---

### 40. What is the output?

Function<String, StringBuilder> builderCreator =
        StringBuilder::new;

StringBuilder builder =
        builderCreator.apply("Hello");

System.out.println(builder);

Answer:

Hello

---

## Important Rules

### 41. Can every lambda be converted into a method reference?

No.

A method reference is appropriate when an existing method or constructor directly matches the lambda's required behavior.

---

### 42. What is the main advantage of method references?

They can make code shorter, cleaner, and more readable when an existing method already performs the required operation.

---

### 43. Does a method reference execute the method immediately?

No.

A method reference represents a method. The functional interface's method executes it later.

Example:

Function<String, Integer> length = String::length;

The method executes when:

length.apply("Java");

is called.

---

### 44. What does :: mean in Java?

The :: operator is used for method references and constructor references.

---

## Quick Revision

### Static Method

Math::abs

### Specific Object Instance Method

System.out::println

### Instance Method of Input Object

String::toUpperCase

### Constructor

Employee::new

### Functional Interface Methods

Predicate  → test()
Consumer   → accept()
Function   → apply()
Supplier   → get()

---

## Final Interview Challenge

Identify the type of each method reference:

1. Math::abs
2. System.out::println
3. String::toUpperCase
4. Employee::new

Answers:

1. Static method reference
2. Specific object instance method reference
3. Instance method reference using the input object
4. Constructor reference
