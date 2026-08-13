# Java Functional Interfaces — Interview Questions

## Table of Contents

- [Functional Interfaces](#functional-interfaces)
- [Lambda Expressions](#lambda-expressions)
- [Predicate](#predicate)
- [Consumer](#consumer)
- [Function](#function)
- [Supplier](#supplier)
- [Combined Concepts](#combined-concepts)
- [Quick Revision](#quick-revision)

---

# Functional Interfaces

## 1. What is a Functional Interface?

A Functional Interface is an interface that contains exactly **one abstract method**.

Example:

    @FunctionalInterface
    interface Printer {
        void print();
    }

---

## 2. What is `@FunctionalInterface`?

`@FunctionalInterface` is an annotation used to tell the compiler that an interface is intended to contain exactly one abstract method.

Example:

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

---

## 3. Can a Functional Interface have default methods?

Yes.

A Functional Interface can have:

- Exactly one abstract method
- Multiple default methods
- Multiple static methods

---

## 4. Can a Functional Interface have static methods?

Yes.

Example:

    @FunctionalInterface
    interface Calculator {

        int calculate(int a, int b);

        static void info() {
            System.out.println("Calculator");
        }
    }

---

## 5. Why are Functional Interfaces important?

Functional Interfaces are mainly used with:

- Lambda Expressions
- Method References
- Stream API
- Functional Programming

---

## 6. Name some built-in Functional Interfaces.

Important built-in Functional Interfaces:

- Predicate<T>
- Consumer<T>
- Function<T, R>
- Supplier<T>
- UnaryOperator<T>
- BinaryOperator<T>
- BiPredicate<T, U>
- BiConsumer<T, U>
- BiFunction<T, U, R>

---

# Lambda Expressions

## 7. What is a Lambda Expression?

A Lambda Expression is a concise way to provide an implementation of a Functional Interface.

Example:

    @FunctionalInterface
    interface Printer {
        void print();
    }

    Printer printer =
            () -> System.out.println("Hello");

---

## 8. What is the syntax of a Lambda Expression?

Basic syntax:

    (parameters) -> expression

Block syntax:

    (parameters) -> {
        statements;
    }

Example:

    (a, b) -> a + b

---

## 9. Why are Lambda Expressions used?

Lambda Expressions reduce boilerplate code and make Java code shorter and easier to read.

---

## 10. Can a Lambda Expression exist without a Functional Interface?

A lambda expression needs a target functional type.

Example:

    Calculator calculator =
            (a, b) -> a + b;

Here, `Calculator` provides the target type.

---

# Predicate

## 11. What is `Predicate<T>`?

`Predicate<T>` is a built-in Functional Interface used to test a condition.

It accepts one input and returns a `boolean`.

Example:

    Predicate<Integer> isEven =
            number -> number % 2 == 0;

---

## 12. Which method does Predicate use?

The main abstract method is:

    boolean test(T t);

Example:

    Predicate<Integer> isEven =
            number -> number % 2 == 0;

    System.out.println(isEven.test(10));

Output:

    true

---

## 13. What does Predicate return?

Predicate returns:

    boolean

It is commonly used for questions such as:

- Is the number even?
- Is the number positive?
- Is the age valid?
- Is the string valid?

---

## 14. Write a Predicate to check whether a number is positive.

    Predicate<Integer> isPositive =
            number -> number > 0;

---

## 15. Write a Predicate to validate a String.

    Predicate<String> isValidName =
            name -> name != null
                    && !name.isBlank()
                    && name.length() >= 3;

---

## 16. What is the difference between Predicate and Function?

| Predicate | Function |
|---|---|
| Tests a condition | Transforms data |
| Returns boolean | Returns a result |
| Method: test() | Method: apply() |

Example:

    Predicate<Integer> isEven =
            number -> number % 2 == 0;

Function:

    Function<Integer, Integer> square =
            number -> number * number;

---

# Consumer

## 17. What is `Consumer<T>`?

`Consumer<T>` is a built-in Functional Interface that accepts one input and performs an action without returning a result.

Example:

    Consumer<String> printName =
            name -> System.out.println(name);

---

## 18. Which method does Consumer use?

The main abstract method is:

    void accept(T t);

Example:

    Consumer<String> printName =
            name -> System.out.println("Name: " + name);

    printName.accept("Aradhya");

---

## 19. Does Consumer return a value?

No.

Consumer returns:

    void

It consumes a value and performs an action.

---

## 20. Give an example of Consumer.

    Consumer<String> print =
            text -> System.out.println(text);

    print.accept("Java");

---

## 21. What is the difference between Consumer and Predicate?

| Consumer | Predicate |
|---|---|
| Performs an action | Tests a condition |
| Returns void | Returns boolean |
| Method: accept() | Method: test() |

---

# Function

## 22. What is `Function<T, R>`?

`Function<T, R>` is a built-in Functional Interface that accepts one input of type `T` and returns a result of type `R`.

Example:

    Function<String, String> upperCase =
            text -> text.toUpperCase();

---

## 23. Which method does Function use?

The main abstract method is:

    R apply(T t);

Example:

    Function<Integer, Integer> square =
            number -> number * number;

    System.out.println(square.apply(5));

Output:

    25

---

## 24. What do T and R mean in Function<T, R>?

    T = Input Type
    R = Return Type

Example:

    Function<String, Integer> length =
            text -> text.length();

Here:

    Input  = String
    Output = Integer

---

## 25. Write a Function to convert text to uppercase.

    Function<String, String> upperCase =
            text -> text.toUpperCase();

---

## 26. Write a Function to calculate square.

    Function<Integer, Integer> square =
            number -> number * number;

---

## 27. What is the difference between Function and Consumer?

| Function | Consumer |
|---|---|
| Accepts input | Accepts input |
| Returns a result | Returns nothing |
| Method: apply() | Method: accept() |

---

# Supplier

## 28. What is `Supplier<T>`?

`Supplier<T>` is a built-in Functional Interface that does not take any input but produces and returns a value.

Example:

    Supplier<String> message =
            () -> "Welcome to Java Backend!";

---

## 29. Which method does Supplier use?

The main abstract method is:

    T get();

Example:

    Supplier<String> message =
            () -> "Hello Java";

    System.out.println(message.get());

---

## 30. Does Supplier accept parameters?

No.

Supplier takes:

    0 inputs

and returns:

    1 value

---

## 31. Give an example of Supplier.

    Supplier<String> welcomeMessage =
            () -> "Welcome to Java Backend!";

    System.out.println(welcomeMessage.get());

---

## 32. What is the difference between Supplier and Function?

| Supplier | Function |
|---|---|
| Takes no input | Takes one input |
| Produces a value | Transforms an input |
| Method: get() | Method: apply() |

---

# Combined Concepts

## 33. Can Predicate, Consumer, Function and Supplier be combined?

Yes.

They can be combined to create a simple data-processing pipeline.

Example:

    import java.util.function.Consumer;
    import java.util.function.Function;
    import java.util.function.Predicate;
    import java.util.function.Supplier;

    public class Main {

        public static void main(String[] args) {

            Supplier<String> generateName =
                    () -> "Aradhya";

            Predicate<String> isValidName =
                    name -> name != null
                            && !name.isBlank()
                            && name.length() >= 3;

            Function<String, String> upperCase =
                    name -> name.trim().toUpperCase();

            Consumer<String> printName =
                    name -> System.out.println(
                            "Name: " + name
                    );

            String name = generateName.get();

            if (isValidName.test(name)) {

                String result =
                        upperCase.apply(name);

                printName.accept(result);

            } else {

                System.out.println("Invalid Name");
            }
        }
    }

Flow:

    Supplier
       ↓
    Generate Data
       ↓
    Predicate
       ↓
    Validate Data
       ↓
    Function
       ↓
    Transform Data
       ↓
    Consumer
       ↓
    Perform Action

---

## 34. Difference between Predicate, Consumer, Function and Supplier

| Interface | Input | Output | Method | Purpose |
|---|---:|---|---|---|
| Predicate<T> | 1 | boolean | test() | Test |
| Consumer<T> | 1 | void | accept() | Perform Action |
| Function<T,R> | 1 | R | apply() | Transform |
| Supplier<T> | 0 | T | get() | Produce |

---

## 35. How can you remember them?

### Predicate → Test

    predicate.test(value);

### Consumer → Do

    consumer.accept(value);

### Function → Transform

    function.apply(value);

### Supplier → Give

    supplier.get();

Memory trick:

    Predicate  → Ask
    Consumer   → Do
    Function   → Transform
    Supplier   → Give

---

# Quick Revision

## Functional Interface

    Exactly one abstract method

---

## Lambda Expression

    (parameters) -> expression

---

## Predicate

    Predicate<Integer> isEven =
            number -> number % 2 == 0;

    isEven.test(10);

Returns:

    boolean

---

## Consumer

    Consumer<String> print =
            text -> System.out.println(text);

    print.accept("Java");

Returns:

    void

---

## Function

    Function<Integer, Integer> square =
            number -> number * number;

    square.apply(5);

Returns:

    R

---

## Supplier

    Supplier<String> message =
            () -> "Java Backend";

    message.get();

Takes:

    No input

Returns:

    T

---

# Interview Rapid-Fire Questions

## Q1. How many abstract methods can a Functional Interface have?

Answer: Exactly one.

---

## Q2. Which annotation is used for Functional Interfaces?

Answer:

    @FunctionalInterface

---

## Q3. Which method does Predicate use?

Answer:

    test()

---

## Q4. Which method does Consumer use?

Answer:

    accept()

---

## Q5. Which method does Function use?

Answer:

    apply()

---

## Q6. Which method does Supplier use?

Answer:

    get()

---

## Q7. Which Functional Interface returns boolean?

Answer:

    Predicate<T>

---

## Q8. Which Functional Interface returns nothing?

Answer:

    Consumer<T>

---

## Q9. Which Functional Interface transforms an input?

Answer:

    Function<T, R>

---

## Q10. Which Functional Interface takes no input?

Answer:

    Supplier<T>

---

## Q11. Can a Functional Interface have default methods?

Answer: Yes.

---

## Q12. Can a Functional Interface have static methods?

Answer: Yes.

---

## Q13. Can a lambda expression be used with an interface having two abstract methods?

Answer: No.

A lambda expression requires a Functional Interface with exactly one abstract method.

---

## Q14. What is the difference between Predicate and Supplier?

Answer:

    Predicate → Takes input and returns boolean
    Supplier  → Takes no input and returns a value

---

## Q15. What is the difference between Consumer and Function?

Answer:

    Consumer → Takes input but returns nothing
    Function → Takes input and returns a result

---

# Final Cheat Sheet

    Interface       Input    Output      Method

    Predicate<T>    1        boolean     test()
    Consumer<T>     1        void        accept()
    Function<T,R>   1        R           apply()
    Supplier<T>     0        T           get()

---

# One-Line Memory Trick

    Predicate  → Test
    Consumer   → Do
    Function   → Transform
    Supplier   → Give

---

# Practice Checklist

- [x] Functional Interface
- [x] @FunctionalInterface
- [x] Lambda Expressions
- [x] Predicate
- [x] Consumer
- [x] Function
- [x] Supplier
- [x] Combining Functional Interfaces
- [ ] Predicate.and()
- [ ] Predicate.or()
- [ ] Predicate.negate()
- [ ] Function.andThen()
- [ ] Function.compose()
- [ ] Method References
- [ ] UnaryOperator
- [ ] BinaryOperator
- [ ] BiPredicate
- [ ] BiConsumer
- [ ] BiFunction
