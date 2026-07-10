🔒 Static Keyword in Java

📘 Introduction

The static keyword is one of the most important keywords in Java.

It is used for members that belong to the class itself rather than to individual objects.

A static member is created only once in memory and is shared by every object of that class.

Whenever something is common to all objects, Java uses static.

⸻

🔹 What is the static Keyword?

Normally, every object has its own copy of instance variables.

But static members belong to the class, so only one copy exists regardless of how many objects are created.

Example

class Employee {

    String name;

    static String company = "OpenAI";
}

Every employee has a different name, but all employees share the same company.

⸻

🔹 Why Do We Need static?

Without static, every object stores duplicate data.

Example:

Employee e1 = new Employee();
Employee e2 = new Employee();
Employee e3 = new Employee();

Without static:

e1.company = OpenAI
e2.company = OpenAI
e3.company = OpenAI

Three identical copies are created.

With static:

Employee.company = OpenAI

Only one copy exists.

This saves memory and keeps shared data consistent.

⸻

🔹 Static Variable

A static variable belongs to the class instead of individual objects.

There is only one shared copy in memory.

Syntax

class Employee {

    static String company = "OpenAI";
}

Access

Employee.company

Although Java allows

employee.company

the recommended approach is

Employee.company

Example

class Employee {

    String name;

    static String company = "OpenAI";

    Employee(String name) {
        this.name = name;
    }
}

Employee e1 = new Employee("Aradhya");
Employee e2 = new Employee("Rahul");

System.out.println(Employee.company);

Output
OpenAI

⸻

🔹 Memory Representation

When the class loads:

Method Area (Class Area)
-------------------------

Employee Class

company = OpenAI

When objects are created:

Heap Memory

Employee Object
---------------
name = Aradhya

Employee Object
---------------
name = Rahul

Notice that only one copy of company exists.

⸻

🔹 Static Method

A static method belongs to the class.

It can be called without creating an object.

Syntax

class Employee {

    static void displayCompany() {

        System.out.println("OpenAI");
    }
}

Calling
Employee.displayCompany();

Why Use Static Methods?

Use static methods when behavior does not depend on object data.

Examples:

* Math calculations
* Utility methods
* Conversion methods
* Factory methods

Example

Math.sqrt(25);
Integer.parseInt("100");
Arrays.sort(arr);

No object creation is required.

⸻

🔹 Rules of Static Methods

A static method can directly access:

* static variables
* static methods

Example

class Student {

    static int count = 100;

    static void show() {

        System.out.println(count);
    }
}

Static Methods Cannot Directly Access Instance Members

Wrong

class Student {

    String name;

    static void display() {

        System.out.println(name);
    }
}

Compilation Error

Reason:

name belongs to an object, while the static method belongs to the class.

The compiler does not know which object’s name should be used.0

Accessing Instance Members from Static Methods

Create or receive an object.

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    static void display(Student s) {

        System.out.println(s.name);
    }
}


⸻


🔹 Why Can’t Static Methods Use this?

this always refers to the current object.

A static method belongs to the class.

Since no object exists, this cannot exist.

Wrong

static void display() {

    System.out.println(this.name);
}

Compilation Error

⸻


🔹 Why Can’t Static Methods Use super?

super refers to the parent object.

Static methods do not belong to any object.

Therefore super cannot be used.

⸻


🔹 Static Block

A static block initializes static data.

It executes only once when the class is loaded into memory.

Syntax

static {

    System.out.println("Static Block");
}

Example

class Mobile {

    static {

        System.out.println("Loading Mobile Class...");
    }

    Mobile() {

        System.out.println("Constructor");
    }
}

Output
Loading Mobile Class...
Constructor

Creating another object

Constructor

The static block executes only once.

⸻

🔹 Why Use Static Blocks?

Static blocks are useful when initialization is complex.

Examples:

* Reading configuration
* Initializing static collections
* Loading database drivers
* Performing one-time setup

⸻


🔹 Static Initialization Order

When the class loads:

1. Static variables
2. Static blocks

When execution begins:

3. main()

When an object is created:

1. Instance variables
2. Instance initializer block
3. Constructor

⸻

🔹 Why is main() Static?

Every Java program begins with

public static void main(String[] args)

The JVM calls main() directly without creating an object.

If main() were not static, the JVM would first need an object before it could even start the program.


⸻


🔹 Static Nested Class

A static nested class belongs to the outer class.

It can be created without creating the outer object.

Example

class Outer {

    static class Inner {

        void display() {

            System.out.println("Hello");
        }
    }
}

Usage
Outer.Inner obj = new Outer.Inner();

⸻


🔹 Static Import

Java allows importing static members directly.

Without static import

System.out.println(Math.PI);

With static import

import static java.lang.Math.*;

System.out.println(PI);

Use static import only when it improves readability.

⸻

2. Mention Static Final

Since static and final are commonly used together, add a short section.

🔹 Static Final Variables

A static final variable is a class-level constant.

Example

class MathConstants {

    static final double PI = 3.14159;
}

Characteristics

* One shared copy
* Cannot be modified after initialization
* Naming convention: UPPER_CASE

⸻

🔹 Real-World Examples

Company Name

Every employee belongs to the same company.

static String company = "Google";

Student Counter
static int totalStudents;

Every new student increments the same counter.

Bank Interest Rate

static double interestRate = 6.5;

All accounts use the same rate.

Utility Class
Math.max(10,20);

No object required.

⸻

🔹 Static Variable vs Instance Variable
⸻

Static Variable                    Instance Variable
⸻
Belongs to class                   Belongs to object
⸻
One shared copy                    One copy per object
⸻
Created during class loading       Created during object creation
⸻
Access using class name            Access using object
⸻
Stored with class metadata 
(Method Area / Metaspace 
implementation)                   Stored inside heap objects
⸻

⸻

🔹 Static Method vs Instance Method
⸻

Static Method                               Instance Method
⸻
Belongs to class                            Belongs to object
⸻
No object required                          Object required
⸻
Can access only static members directly     Can access both instance and static members
⸻
Cannot use this                             Can use this
⸻

⸻


🔹 Static Block vs Constructor
⸻

Static Block                           Constructor
⸻
Runs once                              Runs every time an object is created
⸻
Executes during class loading          Executes during object creation
⸻
Initializes static data                Initializes object data
⸻

⸻


🔹 Memory Understanding

When
Employee e1 = new Employee();
Employee e2 = new Employee();

Java performs:

1. Loads the class (only once)
2. Creates static variables
3. Executes static blocks
4. Calls main()
5. Creates object e1
6. Initializes instance variables
7. Executes constructor
8. Creates object e2
9. Initializes instance variables
10. Executes constructor

Static members are never recreated.

⸻

🔹 Where Can static Be Used?

static can be applied to:

* Variables
* Methods
* Blocks
* Nested Classes

static cannot be applied to:

* Constructors
* Top-level classes
* Local variables
* Parameters

⸻

🔹 Best Practices

* Access static members using the class name.

Employee.company

instead of

employee.company

* Use static only for shared data.
* Keep utility methods static.
* Avoid unnecessary static variables.
* Do not store object-specific information in static variables.

⸻

🔹 Common Beginner Mistakes

* Making object data static.
* Accessing instance variables from static methods.
* Using this inside static methods.
* Assuming each object has its own static variable.
* Expecting static blocks to execute multiple times.
* Using objects to access static members.

⸻

🔹 Programs Practiced

* StudentCounter.java
* EmployeeCompanyDemo.java
* MobileDemo.java 
* LibraryDemo.java (Static block)
* EmployeeCounter.java

⸻

🔹 Key Concepts Learned

* Static Keyword
* Static Variables
* Static Methods
* Static Blocks
* Static Nested Classes
* Static Import
* Class Loading
* Initialization Order
* Shared Memory
* Method Area
* JVM Startup
* Utility Classes

⸻

🔹 Time Complexity

Accessing Static Variable

* Time Complexity: O(1)
* Space Complexity: O(1)

Calling Static Method

* Time Complexity: O(1)
* Space Complexity: O(1)

🔹 Interview Questions

Q1. Can a static method access instance variables?

No.

⸻

Q2. Why is main() static?

So the JVM can invoke it without creating an object.

⸻

Q3. Can constructors be static?

No.

Constructors initialize objects, while static belongs to the class.

⸻

Q4. Can we overload static methods?

Yes.

⸻

Q5. Can we override static methods?

No.

Static methods are hidden, not overridden.

⸻

Q6. Can a static method call a non-static method?

Not directly. It needs an object reference.

⸻

🔹 Object Interaction Flow

Class Referenced
        ↓
Class Loaded
        ↓
Static Variables Created
        ↓
Static Block Executes
        ↓
main() Starts
        ↓
Object Created
        ↓
Instance Variables Initialized
        ↓
Constructor Executes
        ↓
Object Ready

⸻

Folder Structure

04-static-keyword/
│
├── StudentCounter.java
├── EmployeeCompanyDemo.java
├── MobileDemo.java
├── EmployeeCounter.java
├── LibraryDemo.java
└── README.md

⸻

🔹 Conclusion

The static keyword is a core feature of Java that enables class-level data and behavior.
It improves memory efficiency by sharing common data, allows methods to be invoked without 
object creation, supports one-time initialization through static blocks, and enables the JVM 
to start program execution via main(). Mastering static is essential for understanding class loading,
memory management, utility classes, and many advanced Java design patterns.
