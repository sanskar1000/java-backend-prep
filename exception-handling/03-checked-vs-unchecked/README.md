Checked vs Unchecked Exceptions

📌 Overview

Java exceptions can broadly be divided into:

1. Checked Exceptions
2. Unchecked Exceptions

Understanding the difference is essential because it determines whether the Java compiler forces you to handle or declare an exception.

⸻

🧠 Basic Classification

Throwable
   │
   └── Exception
       │
       ├── RuntimeException
       │   └── Unchecked Exceptions
       │
       └── Other Exceptions
           └── Checked Exceptions

⸻

🟢 Checked Exceptions

A checked exception is an exception that the compiler requires you to either:

* Handle using try-catch
* Declare using throws

Example:

FileInputStream file =
        new FileInputStream("data.txt");

FileInputStream can throw FileNotFoundException.

Because FileNotFoundException is checked, Java requires the programmer to deal with it.

Example using try-catch:

try {
    FileInputStream file =
            new FileInputStream("data.txt");
} catch (FileNotFoundException e) {
    System.out.println("File not found");
}

⸻

⚠️ Important Point

“Checked” does not mean the exception happens during compilation.

The exception still occurs at runtime.

The compiler checks whether the programmer has handled or declared it.

Compiler
   ↓
Checks handling/declaration
   ↓
Program runs
   ↓
Exception may occur at runtime

⸻

🔴 Unchecked Exceptions

Unchecked exceptions are RuntimeException and its subclasses.

Examples:

ArithmeticException
NullPointerException
NumberFormatException

The compiler does not force you to catch or declare them.

Example:

int result = 10 / 0;

This compiles, but at runtime:

ArithmeticException

occurs.

⸻

🔍 Comparison

Feature	Checked	Unchecked
Compiler requires handling/declaration	Yes	No
Happens at runtime	Yes	Yes
Parent category	Exception, excluding RuntimeException branch	RuntimeException
Example	IOException	ArithmeticException
try-catch required by compiler	Yes	No

⸻

🧠 Mental Model

Think of the compiler as a strict teacher.

Checked

"This operation can fail in a way Java wants you to acknowledge.
Handle it or declare it."

Unchecked

"Java doesn't force you to handle this.
You are responsible for preventing/handling it when appropriate."

⸻

🎯 Key Takeaways

* Checked exceptions are checked by the compiler for handling or declaration.
* Checked exceptions still occur at runtime.
* IOException is checked.
* FileNotFoundException is checked.
* RuntimeException and its subclasses are unchecked.
* ArithmeticException is unchecked.
* NullPointerException is unchecked.
* Checked exceptions require either try-catch or throws.
* Unchecked exceptions do not require handling or declaration by the compiler.

⸻

💻 Practice Programs

CheckedExceptionDemo.java

Demonstrates handling a checked FileNotFoundException.

UncheckedExceptionDemo.java

Demonstrates handling an unchecked ArithmeticException.

⸻

📚 Lesson Status

Status: ✅ Completed

Topics covered: Checked exceptions, unchecked exceptions, compiler checking, try-catch, throws, RuntimeException.
