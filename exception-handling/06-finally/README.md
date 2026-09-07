Lesson 6 — finally in Java

📚 Topic

Exception Handling — finally Block

The finally block is used for cleanup code that should normally execute whether an exception occurs or not.

⸻

🎯 Learning Objectives

After completing this lesson, I can:

* Understand why finally is used.
* Understand the execution flow of try → catch → finally.
* Use finally with and without catch.
* Understand finally when an exception is uncaught.
* Understand that finally does not handle an exception.
* Understand why cleanup operations belong in finally.
* Predict program output involving finally.
* Debug incorrect finally usage.

⸻

🧠 What is finally?

finally is a block that normally executes after the try block and any matching catch block.

Basic Structure

try {
    // Risky code
}
catch (Exception e) {
    // Handle exception
}
finally {
    // Cleanup code
}

⸻

🔄 Execution Flow

Case 1 — No Exception

try
 ↓
finally
 ↓
after try-catch-finally

Case 2 — Exception Handled

try
 ↓
exception occurs
 ↓
catch
 ↓
finally
 ↓
after try-catch-finally

Case 3 — Exception Not Handled

try
 ↓
exception occurs
 ↓
no matching catch
 ↓
finally
 ↓
exception propagates

Code after the try-catch-finally structure is not reached if the exception remains uncaught.

⸻

💡 Important Rule

finally does not catch an exception.

Example:

try {
    int result = 10 / 0;
}
finally {
    System.out.println("Cleanup");
}

Output:

Cleanup
Exception in thread "main" java.lang.ArithmeticException: / by zero

The exception still exists and propagates after finally.

⸻

🧹 Why Use finally?

finally is traditionally used for cleanup operations such as:

* Closing files
* Closing database connections
* Releasing resources
* Cleaning temporary state
* Releasing locks/resources

Example:

try {
    System.out.println("Opening resource");
}
catch (Exception e) {
    System.out.println("Handling error");
}
finally {
    System.out.println("Closing resource");
}

⸻

⚠️ Important Exception

The statement that “finally always executes” is a useful beginner rule, but technically it is not absolute.

For example:

try {
    System.out.println("Try");
    System.exit(0);
}
finally {
    System.out.println("Finally");
}

finally does not execute because System.exit(0) terminates the JVM.

⸻

🧪 Practice Programs

1. Basic Finally

Create:

FinallyBasic.java

Practice:

* No exception
* finally execution
* Code after finally

⸻

2. Exception + Finally

Create:

FinallyException.java

Practice:

* Exception occurs
* catch handles it
* finally executes
* Program continues

⸻

3. Uncaught Exception + Finally

Create:

FinallyUncaught.java

Practice:

* Exception occurs
* No matching catch
* finally executes
* Exception propagates

⸻


4. Master Challenge

Create:

FinallyMasterChallenge.java

Build a Bank Transaction Simulator using:

* try
* Multiple catch
* finally
* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException
* Cleanup logic
* Program continuation

⸻

🧠 Key Concepts

Concept	Meaning
try	Contains risky code
catch	Handles matching exceptions
finally	Performs cleanup
Exception handled	Program can continue
Exception uncaught	Exception propagates
finally	Normally executes before propagation
System.exit()	Can prevent finally from executing

⸻

🎯 Output Prediction Rules

When predicting output:

Rule 1

If no exception occurs:

try → finally → after

Rule 2

If exception is handled:

try → catch → finally → after

Rule 3

If exception is not handled:

try → finally → exception propagation

Rule 4

Statements after the exception inside try are skipped.

Rule 5

finally does not remove or handle the exception.

⸻

📂 Folder Structure

06-finally/
│
├── README.md
├── FinallyBasic.java
├── FinallyException.java
├── FinallyUncaught.java
└── FinallyMasterChallenge.java

⸻

🏆 Completion Checklist

* Understand finally
* Understand try → catch → finally
* Understand try → finally
* Understand uncaught exception + finally
* Understand cleanup
* Understand that finally does not catch exceptions
* Practice output prediction
* Complete debugging exercises
* Complete Master Challenge
* Complete reasoning challenge

⸻

🚀 Lesson Status

Lesson 6 — finally: COMPLETE ✅

Next:

Lesson 7 — throw
