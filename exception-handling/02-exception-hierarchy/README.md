Exception Hierarchy

📌 Overview

Java uses a hierarchy of classes to represent exceptions and errors.

Understanding this hierarchy is important because it explains:

* Where exceptions come from
* How exceptions are related
* Why some exceptions can be caught by a parent type
* How polymorphism works with exceptions
* Why RuntimeException and Error are different

⸻

🧠 Java Exception Hierarchy

Object
   │
   └── Throwable
       │
       ├── Error
       │   └── StackOverflowError
       │
       └── Exception
           │
           ├── RuntimeException
           │   ├── ArithmeticException
           │   ├── NullPointerException
           │   └── NumberFormatException
           │
           └── Other Exceptions
               ├── IOException
               ├── FileNotFoundException
               └── SQLException

⸻

🔑 Throwable

Throwable is the root class for things that can be thrown and caught in Java.

It has two major branches:

Throwable
├── Error
└── Exception

⸻

🔴 Error

Error generally represents serious problems associated with the JVM or runtime environment.

Example:

StackOverflowError

Application code normally does not try to recover from most Error conditions.

⸻

🟢 Exception

Exception represents conditions that application code may handle, propagate, or translate.

Examples:

IOException
FileNotFoundException
RuntimeException

⸻

⚡ RuntimeException

RuntimeException is a subclass of Exception.

Examples:

ArithmeticException
NullPointerException
NumberFormatException

These are unchecked exceptions.

⸻

🔗 IS-A Relationships

ArithmeticException IS-A RuntimeException
RuntimeException IS-A Exception
Exception IS-A Throwable
Throwable IS-A Object

Therefore:

Throwable t = new ArithmeticException();
Exception e = new ArithmeticException();

are valid.

But:

ArithmeticException e = new Exception();

is invalid because an Exception is not necessarily an ArithmeticException.

⸻

🧩 Reference Type vs Actual Object

Example:

Throwable t = new ArithmeticException();

Here:

Reference type → Throwable
Actual object  → ArithmeticException

Therefore:

System.out.println(t.getClass().getSimpleName());

prints:

ArithmeticException

⸻

🎯 Key Takeaways

* Throwable is the root of Java’s throwable hierarchy.
* Throwable has two major branches: Error and Exception.
* RuntimeException is a subclass of Exception.
* ArithmeticException is a subclass of RuntimeException.
* Not every Exception is a RuntimeException.
* Error and Exception are different branches.
* Parent references can refer to child objects through upcasting.
* The actual object type determines what getClass() reports.

⸻

💻 Practice Program

ExceptionHierarchyDemo.java

The program demonstrates:

* Exception hierarchy
* Upcasting
* Actual object type
* getClass().getSimpleName()

⸻

📚 Lesson Status

Status: ✅ Completed

Topics covered: Exception Hierarchy, Throwable, Error, Exception, RuntimeException, reference type vs actual object type.
