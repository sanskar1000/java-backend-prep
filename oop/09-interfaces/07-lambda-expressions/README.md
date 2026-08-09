Lambda Expressions

This module demonstrates Lambda Expressions in Java and their relationship with Functional Interfaces.

📌 What is a Lambda Expression?

A lambda expression is a concise way to provide an implementation of the single abstract method of a functional interface.

Basic Syntax

(parameters) -> expression

or

(parameters) -> {
    // statements
    return value;
}

⸻

📂 Programs

Program	Concepts
CalculatorDemo.java	Functional Interface, Lambda Expressions, Parameters, Return Values, Expression Body, Block Body
StringProcessorDemo.java	One-Parameter Lambda, String Processing, Return Values

⸻

🧠 Functional Interface + Lambda

A lambda expression can be assigned to a functional interface.

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
Calculator addition = (a, b) -> a + b;

The lambda provides the implementation of:

int calculate(int a, int b);

⸻

🔹 Lambda Parameters

Zero Parameters

() -> System.out.println("Hello");

One Parameter

name -> System.out.println("Hello " + name);

Parentheses are optional for a single parameter.

Both are valid:

name -> ...
(name) -> ...

Multiple Parameters

(a, b) -> a + b;

Parentheses are required for multiple parameters.

⸻

🔹 Parameter Type Inference

Java can infer lambda parameter types from the functional interface.

Calculator c = (a, b) -> a + b;

Explicit parameter types can also be used:

Calculator c = (int a, int b) -> a + b;

Do not mix inferred and explicit types:

// Invalid
(int a, b) -> a + b;

⸻

🔹 Expression Body

For a simple expression:

Calculator c = (a, b) -> a + b;

The result of the expression is implicitly returned.

No return keyword is required.

⸻

🔹 Block Body

A lambda can contain multiple statements:

Calculator c = (a, b) -> {
    int result = a + b;
    System.out.println("Calculating...");
    return result;
};

When a block body has a return value, an explicit return statement is required.

⸻

🔹 Expression Body vs Block Body

Expression Body	Block Body
(a, b) -> a + b	(a, b) -> { return a + b; }
Concise	Multiple statements possible
Return is implicit	Return is explicit
Best for simple logic	Best for complex logic

⸻

🧮 Calculator Example

Calculator addition = (a, b) -> a + b;
Calculator subtraction = (a, b) -> a - b;
Calculator multiplication = (a, b) -> a * b;

For validation or multiple statements:

Calculator division = (a, b) -> {
    if (b == 0) {
        System.out.println("Cannot divide by zero.");
        return 0;
    }
    return a / b;
};

⸻

⭐ Maximum Example

Calculator maximum = (a, b) -> {
    if (a > b) {
        return a;
    }
    return b;
};

⸻

🎯 Key Rules

1. A lambda requires a functional interface target type.
2. A functional interface has exactly one abstract method.
3. -> is the lambda operator.
4. Zero parameters require ().
5. One parameter can be written with or without parentheses.
6. Multiple parameters require parentheses.
7. Java can infer parameter types.
8. Expression-body lambdas have an implicit return.
9. Block-body lambdas require an explicit return when the method returns a value.
10. Lambdas reduce boilerplate code and improve readability.

⸻

📊 Complexity

Lambda expressions themselves do not have a fixed time complexity.

The complexity depends on the operation performed inside the lambda.

For example:

(a, b) -> a + b

Time Complexity: O(1)

A lambda that processes every character in a string may have O(n) time complexity.

⸻

🛠️ Practice Challenge

CalculatorDemo

Implement:

* Addition
* Subtraction
* Multiplication
* Division
* Maximum

Use both:

* Expression-body lambdas
* Block-body lambdas

Handle division by zero.

StringProcessorDemo

Implement:

* Uppercase conversion
* Lowercase conversion
* Character count
* String reversal
* Trimming whitespace

⸻

📚 Concepts Covered

* Functional Interfaces
* @FunctionalInterface
* Lambda Expressions
* Lambda Parameters
* Parameter Type Inference
* Expression Body
* Block Body
* Implicit Return
* Explicit Return
* Runtime Behavior
* Basic Validation
* Concise Functional Programming

⸻

🚀 Next Topic

Built-in Functional Interfaces

Next topics:

* Predicate<T>
* Consumer<T>
* Function<T, R>
* Supplier<T>

These interfaces are heavily used with Java Collections and the Stream API.
