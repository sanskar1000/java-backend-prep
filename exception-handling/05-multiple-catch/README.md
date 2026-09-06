05 - Multiple Catch

📚 Lesson 5 — Multiple catch Blocks

Multiple catch blocks allow a Java program to handle different types of exceptions separately.

⸻

🎯 Learning Objectives

After completing this lesson, I should be able to:

* Understand why multiple catch blocks are needed.
* Handle different exception types separately.
* Understand how Java searches through catch blocks.
* Understand the first matching catch rule.
* Order catch blocks correctly.
* Understand specific vs general exceptions.
* Identify unreachable catch blocks.
* Understand how exception handling affects program flow.
* Use exception objects inside catch.
* Use getClass().getSimpleName().
* Use getMessage().

⸻

1. Why Multiple catch?

A single try block can potentially produce different types of exceptions.

Example:

try {
    // risky code
}
catch (ArithmeticException e) {
    // arithmetic problem
}
catch (NullPointerException e) {
    // null reference problem
}
catch (Exception e) {
    // other exceptions
}

Each catch can handle a different type of exception.

⸻

2. First Matching catch Wins

Java checks the catch blocks from top to bottom.

The first compatible catch executes.

Example:

try {
    int result = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic");
}
catch (Exception e) {
    System.out.println("Exception");
}

Output:

Arithmetic

Although Exception can also handle ArithmeticException, it does not execute because the first matching catch has already handled the exception.

⸻

3. Exception Hierarchy and Catch Ordering

Important hierarchy:

Object
   ↓
Throwable
   ↓
Exception
   ↓
RuntimeException
   ↓
ArithmeticException

Another example:

Exception
   ↓
RuntimeException
   ↓
NullPointerException

And:

Exception
   ↓
RuntimeException
   ↓
ArrayIndexOutOfBoundsException

⸻

4. Specific → General Rule

When using multiple catch blocks:

Always place the more specific exception before the more general exception.

Correct:

catch (ArithmeticException e) {
    // ...
}
catch (RuntimeException e) {
    // ...
}
catch (Exception e) {
    // ...
}

The order is:

ArithmeticException
        ↓
RuntimeException
        ↓
Exception

This is:

Specific → General

⸻

5. Incorrect Catch Ordering

This is invalid:

catch (Exception e) {
    // ...
}
catch (ArithmeticException e) {
    // ...
}

Why?

Because:

Exception
   ↑
ArithmeticException

Exception can already catch an ArithmeticException.

Therefore, the ArithmeticException catch can never be reached.

Java reports an unreachable catch block.

⸻

6. Example of Unreachable Catch

❌ Incorrect:

try {
    int x = 10 / 0;
}
catch (RuntimeException e) {
    System.out.println("Runtime");
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic");
}

ArithmeticException is a subclass of RuntimeException.

Therefore:

RuntimeException
       ↑
ArithmeticException

The first catch already catches it.

So the second catch is unreachable.

⸻

7. Correct Version

✅ Correct:

try {
    int x = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic");
}
catch (RuntimeException e) {
    System.out.println("Runtime");
}
catch (Exception e) {
    System.out.println("Exception");
}

Output:

Arithmetic

⸻

8. Only One Catch Executes

For a single thrown exception, only one catch block executes.

Example:

try {
    String name = null;
    System.out.println(name.length());
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic");
}
catch (NullPointerException e) {
    System.out.println("Null");
}
catch (RuntimeException e) {
    System.out.println("Runtime");
}
catch (Exception e) {
    System.out.println("Exception");
}

Output:

Null

Why?

NullPointerException occurs
        ↓
ArithmeticException? ❌
        ↓
NullPointerException? ✅
        ↓
Execute this catch
        ↓
Skip remaining catches

⸻

9. Exception Stops the Remaining try Block

When an exception occurs inside try, Java immediately stops normal execution of that try block.

Example:

try {
    System.out.println("A");
    int x = 10 / 0;
    System.out.println("B");
}
catch (ArithmeticException e) {
    System.out.println("C");
}
System.out.println("D");

Output:

A
C
D

B does not print.

Flow:

A
↓
10 / 0
↓
ArithmeticException
↓
Stop try
↓
catch
↓
C
↓
D

Java does not return to the try block after handling the exception.

⸻

10. Exception Object

The variable inside catch refers to the exception object.

Example:

catch (ArithmeticException e) {
    System.out.println(e);
}

Here:

e

is a reference to the thrown ArithmeticException object.

⸻

11. getClass().getSimpleName()

We can determine the exception’s class name:

catch (Exception e) {
    System.out.println(
        e.getClass().getSimpleName()
    );
}

For an ArithmeticException, this prints:

ArithmeticException

⸻

12. getMessage()

getMessage() returns the exception’s message.

Example:

catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}

For:

10 / 0

the message is typically:

/ by zero

The exact message can vary depending on the Java version and exception.

⸻

13. Multiple Catch Example

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Exception type : "
                + e.getClass().getSimpleName()
            );
            System.out.println(
                "Message : "
                + e.getMessage()
            );
        }
        catch (RuntimeException e) {
            System.out.println("Runtime exception");
        }
        catch (Exception e) {
            System.out.println("General exception");
        }
        System.out.println("Program continues");
    }
}

Possible output:

Exception type : ArrayIndexOutOfBoundsException
Message : Index 5 out of bounds for length 3
Program continues

⸻

💀 Master Challenge

The final practice program was:

MultipleCatchChallenge.java

It demonstrated:

* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException
* RuntimeException
* Exception
* Multiple catch blocks
* Correct catch ordering
* Exception object
* getClass().getSimpleName()
* getMessage()
* Program continuation

The important structure was:

try {
    // risky code
}
catch (ArithmeticException e) {
    // ...
}
catch (NullPointerException e) {
    // ...
}
catch (ArrayIndexOutOfBoundsException e) {
    // ...
}
catch (RuntimeException e) {
    // ...
}
catch (Exception e) {
    // ...
}

⸻

🧠 Key Rules

Rule 1

Only the first matching catch executes.

Rule 2

After a matching catch executes, the remaining catches are skipped.

Rule 3

An exception stops the remaining statements inside the try block.

Rule 4

After the exception is handled, execution continues after the entire try-catch structure.

Rule 5

Specific exceptions must come before general exceptions.

Specific → General

Rule 6

A child exception cannot come after its parent exception.

❌ Wrong:

catch (Exception e)
catch (RuntimeException e)

✅ Correct:

catch (RuntimeException e)
catch (Exception e)

Rule 7

A child exception cannot come after a parent such as RuntimeException.

❌ Wrong:

catch (RuntimeException e)
catch (NullPointerException e)

✅ Correct:

catch (NullPointerException e)
catch (RuntimeException e)

⸻

📊 Learning Progress

Exception Handling
[✓] 01 - Why Exceptions Exist
[✓] 02 - Exception Hierarchy
[✓] 03 - Checked vs Unchecked
[✓] 04 - Try-Catch
[✓] 05 - Multiple Catch
[ ] 06 - Finally
[ ] 07 - Throw
[ ] 08 - Throws
[ ] 09 - Exception Propagation
...

⸻

🎯 Lesson 5 Mastery Checklist

I can now:

* [✓] Explain multiple catch blocks.
* [✓] Explain the first matching catch rule.
* [✓] Identify the exception that occurs.
* [✓] Identify which catch executes.
* [✓] Explain why other catches are skipped.
* [✓] Order catches from specific to general.
* [✓] Identify unreachable catch blocks.
* [✓] Explain parent-child exception relationships.
* [✓] Predict program output.
* [✓] Explain exception control flow.
* [✓] Use getClass().getSimpleName().
* [✓] Use getMessage().
* [✓] Build a multiple-catch program independently.

⸻

🏆 Result

Lesson 5 — Multiple catch: COMPLETE ✅

The most important rule to remember:

       SPECIFIC
          ↓
   RuntimeException
          ↓
      Exception
       GENERAL

Always catch the specific exception before its parent exception.

⸻

⏭️ Next Lesson

Lesson 6 — finally

We will learn:

* What finally is
* Why finally exists
* When finally executes
* try-catch-finally
* try-finally
* return + finally
* exception + finally
* Common mistakes
* Real-world cleanup use cases
* GitHub practice
* Master challenge
