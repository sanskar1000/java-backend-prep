Lambda Expressions — Interview Questions

Beginner Level

1. What is a lambda expression?

A lambda expression is a concise way to provide an implementation of the single abstract method of a functional interface.

⸻

2. What is the basic syntax of a lambda expression?

(parameters) -> expression

or:

(parameters) -> {
    // statements
}

⸻

3. Which symbol is used in a lambda expression?

The lambda operator:

->

⸻

4. Can a lambda expression be used with any interface?

No.

A lambda expression can be assigned only to a functional interface type.

⸻

5. What is a functional interface?

A functional interface is an interface that contains exactly one abstract method.

Example:

@FunctionalInterface
interface Printer {
    void print();
}

⸻

6. Why do lambda expressions require functional interfaces?

Because a lambda provides the implementation of the functional interface’s single abstract method. Java therefore knows exactly which method the lambda represents.

⸻

7. What is the main advantage of lambda expressions?

They reduce boilerplate code and make code more concise, readable, and expressive.

⸻

Lambda Parameters

8. How do you write a lambda with zero parameters?

() -> System.out.println("Hello");

⸻

9. Can parentheses be omitted when there is only one parameter?

Yes.

Both are valid:

name -> System.out.println(name);
(name) -> System.out.println(name);

⸻

10. Are parentheses required for multiple parameters?

Yes.

(a, b) -> a + b

⸻

11. Can Java infer lambda parameter types?

Yes.

For example:

Calculator c = (a, b) -> a + b;

Java infers the parameter types from the functional interface.

⸻

12. Can parameter types be explicitly specified?

Yes.

Calculator c = (int a, int b) -> a + b;

When specifying parameter types, all parameter types must be specified.

This is invalid:

(int a, b) -> a + b;

⸻

Return Values

13. When is return not required?

When using an expression-body lambda:

(a, b) -> a + b

The expression result is implicitly returned.

⸻

14. When is return required?

When using a block-body lambda and the functional interface method has a return value.

(a, b) -> {
    return a + b;
}

⸻

15. What is the difference between an expression body and a block body?

Expression body:

(a, b) -> a + b

Block body:

(a, b) -> {
    int result = a + b;
    return result;
}

An expression body is concise and has an implicit return.

A block body can contain multiple statements and requires an explicit return when a value must be returned.

⸻

@FunctionalInterface

16. Is @FunctionalInterface mandatory?

No.

An interface can still be functional without the annotation.

⸻

17. Why should @FunctionalInterface be used?

It provides compile-time checking.

If another abstract method is accidentally added, the compiler reports an error.

⸻

18. Can a functional interface contain default methods?

Yes.

@FunctionalInterface
interface Printer {
    void print();
    default void show() {
        System.out.println("Show");
    }
}

Default methods do not count as abstract methods.

⸻

19. Can a functional interface contain static methods?

Yes.

Static methods do not count as abstract methods.

⸻

20. Can a functional interface contain private methods?

Yes.

Private methods do not count as abstract methods.

⸻

Lambda vs Anonymous Class

21. Why were lambda expressions introduced?

They were introduced to provide a more concise way of implementing functional interfaces and to support a more functional programming style in Java.

⸻

22. Lambda vs Anonymous Class?

Anonymous class:

Printer p = new Printer() {
    @Override
    public void print() {
        System.out.println("Hello");
    }
};

Lambda:

Printer p = () -> System.out.println("Hello");

The lambda requires significantly less boilerplate code.

⸻

Code-Based Interview Questions

23. What is the output?

@FunctionalInterface
interface Printer {
    void print();
}
Printer p = () -> System.out.println("Hello Java");
p.print();

Answer:

Hello Java

⸻

24. What is the output?

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
Calculator c = (a, b) -> a + b;
System.out.println(c.calculate(10, 20));

Answer:

30

⸻

25. Is this valid?

Calculator c = (int a, b) -> a + b;

Answer: No.

Explicit and inferred parameter types cannot be mixed.

Correct:

(int a, int b) -> a + b

or:

(a, b) -> a + b

⸻

26. Is this valid?

Calculator c = (a, b) -> {
    return a + b;
};

Answer: Yes.

It is a block-body lambda with an explicit return.

⸻

27. Is this valid?

Calculator c = (a, b) -> {
    int result = a + b;
};

Answer: No.

The functional interface method returns int, but the block-body lambda does not return an int.

⸻

⭐ Interview Challenge

Question

What is the difference between these two?

(a, b) -> a + b

and:

(a, b) -> {
    return a + b;
}

Expected Answer

Both can produce the same result.

The first uses an expression body with an implicit return.

The second uses a block body with an explicit return.

⸻

Quick Revision

Lambda Expression
        ↓
Functional Interface
        ↓
Exactly one abstract method
        ↓
Lambda provides its implementation
        ↓
Less boilerplate code
        ↓
Concise and readable code

Core Syntax

() -> ...
x -> ...
(x, y) -> ...
(x, y) -> {
    return ...;
}
