Lesson 7 — throw

This folder contains my practice programs for Java’s throw statement.

🎯 Learning Objectives

* Understand why throw is used
* Manually throw exceptions
* Use throw for validation
* Use throw with try-catch
* Understand exception flow after throw
* Use meaningful exception messages
* Understand the difference between throw and catch
* Combine throw with finally
* Practice exception-based validation

📚 Programs

File	Topic
ThrowBasic.java	Basic throw
ThrowValidation.java	Input validation
ThrowMasterChallenge.java	Bank transaction validation

🧠 Key Concept

throw is used to explicitly throw an exception object.

throw new IllegalArgumentException("Invalid age");

The throw statement stops the current normal execution flow and transfers control toward exception handling.

🔑 Important Rules

1. throw actually throws an exception

throw new IllegalArgumentException("Invalid input");

2. throw does not automatically print the message

The message can be accessed using:

e.getMessage();

3. Remaining statements in the current flow are skipped

throw new RuntimeException();
System.out.println("This will not execute");

4. An exception can be caught

try {
    throw new IllegalArgumentException("Invalid");
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}

5. throw vs throws

throw  → actually throws an exception
throws → declares that a method may throw an exception

throws is covered in the next lesson.

🏦 Master Challenge

The master challenge implements a bank transaction validator using:

* throw
* IllegalArgumentException
* try-catch
* finally
* validation
* exception messages
* continued program execution

✅ Progress

* Why Exceptions Exist
* Exception Hierarchy
* Checked vs Unchecked
* try-catch
* Multiple catch
* finally
* throw
* throws

💡 Key Takeaway

throw is used to explicitly signal an exceptional or invalid condition in a program.
