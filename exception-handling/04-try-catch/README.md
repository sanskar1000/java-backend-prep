04 - Try-Catch

This folder contains my Java practice programs for understanding and implementing try-catch exception handling.

🎯 Objective

The purpose of this practice is to understand:

* try block
* catch block
* ArithmeticException
* Exception object
* getMessage()
* Exception control flow
* Program continuation after handling an exception

⸻

📚 Concepts Practiced

1. try Block

The try block contains code that may throw an exception.

try {
    int result = num1 / num2;
}

2. catch Block

The catch block handles a matching exception thrown from the try block.

catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}

3. Exception Control Flow

When an exception occurs inside a try block:

try
 ↓
Exception occurs
 ↓
Remaining try statements are skipped
 ↓
Matching catch executes
 ↓
Execution continues after try-catch

4. Exception Object

The variable inside catch is a reference to the exception object.

catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}

5. getMessage()

Returns the message associated with the exception.

Example:

e.getMessage();

For division by zero, the message is typically:

/ by zero

⸻

💻 Practice Programs

1. TryCatchPractice.java

A safe division calculator that:

* Takes two numbers from the user
* Performs division inside a try block
* Handles ArithmeticException
* Displays the exception message
* Continues program execution after the exception

2. TryCatchDebug.java

A debugging exercise focused on:

* Correct try-catch structure
* Catch placement
* Compile-time errors
* Exception-handling syntax

3. TryCatchOutput.java

An output-prediction exercise focused on:

* Exception control flow
* Statements skipped after an exception
* Execution of the matching catch
* Program continuation after try-catch

⸻

🧠 Key Rules Learned

1. Code that may throw an exception can be placed inside a try block.
2. A catch block handles a matching exception.
3. When an exception occurs, the remaining statements inside the try block are skipped.
4. Java transfers control to the matching catch block.
5. After the catch finishes, execution can continue after the try-catch.
6. ArithmeticException is an unchecked exception.
7. The variable in catch is a reference to the exception object.
8. getMessage() can be used to retrieve the exception message.
9. printStackTrace() can be used to display diagnostic information about an exception.
10. A catch block can only handle exceptions that occur within its associated try block.

⸻

🔍 Example

try {
    int result = 10 / 0;
    System.out.println("After division");
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}
System.out.println("Program continues...");

Output

Cannot divide by zero.
Program continues...

The statement:

System.out.println("After division");

does not execute because the exception occurs before Java reaches it.

⸻

📈 Learning Progress

* Understand why try-catch is needed
* Understand try block
* Understand catch block
* Handle ArithmeticException
* Understand exception control flow
* Understand exception objects
* Use getMessage()
* Understand printStackTrace()
* Practice multiple catch blocks
* Practice advanced exception handling

⸻

🏆 Result

Through these exercises, I practiced how Java handles exceptions using try-catch and how program execution changes when an exception occurs.

Next Topic: Multiple catch Blocks
