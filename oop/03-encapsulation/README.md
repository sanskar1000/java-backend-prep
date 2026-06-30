🔒 Encapsulation in Java

📘 Introduction

Encapsulation is one of the four fundamental principles of Object-Oriented Programming (OOP).

It is the process of combining data (variables) and the methods that operate on that data into a single unit (class), while restricting direct access to the data.

Instead of allowing anyone to modify object data directly, encapsulation provides controlled access through public methods.

⸻

🔹 What is Encapsulation?

Encapsulation is the technique of hiding an object’s internal data and allowing access only through controlled methods.

In Java, encapsulation is achieved by:

* declaring instance variables as private
* providing public getter methods to read data
* providing public setter methods to modify data

Syntax

class Student {
    private String name;
    private int marks;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

⸻

🔹 Important Rules

* Instance variables should usually be private
* Access data using getter methods
* Modify data using setter methods
* Perform validation inside setter methods
* Never expose sensitive data directly

⸻

🔹 Why Encapsulation is Needed

Without encapsulation:

Student s = new Student();
s.marks = -50;

Anyone can assign invalid values.

⸻

With encapsulation:

Student s = new Student();
s.setMarks(85);

The setter validates the value before storing it.

⸻

🔹 Advantages of Encapsulation

* Protects object data
* Prevents invalid values
* Improves security
* Makes debugging easier
* Improves maintainability
* Reduces unexpected errors
* Makes classes easier to modify
* Encourages clean code

⸻

🔹 Access Modifiers Used

Encapsulation mainly uses:

* private → hide data
* public → provide controlled access

Example:

class BankAccount {
    private double balance;
}

The balance cannot be accessed directly from outside the class.

⸻

🔹 Getter Methods

Getter methods are used to read private data.

Example

class Student {
    private String name;
    public String getName() {
        return name;
    }
}

Usage

System.out.println(student.getName());

⸻

🔹 Setter Methods

Setter methods are used to update private data.

Example

class Student {
    private int marks;
    public void setMarks(int marks) {
        this.marks = marks;
    }
}

Usage

student.setMarks(90);

⸻

🔹 Validation using Setters

One of the biggest advantages of encapsulation is validation.

Example

class Student {
    private int marks;
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }
}

Now invalid values cannot enter the object.

⸻

🔹 Complete Example

class Student {
    private String name;
    private int marks;
    Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }
}

⸻

🔹 Data Hiding

Data hiding means preventing direct access to variables.

Example

private double salary;

Outside the class:

employee.salary = 50000;

❌ Not allowed

Instead

employee.setSalary(50000);

✔ Allowed

⸻

🔹 Controlled Access

Encapsulation allows us to decide:

* who can read data
* who can modify data
* which values are acceptable

Example

public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    }
}

⸻

🔹 Getter vs Setter

Feature	Getter	Setter
Purpose	Read data	Modify data
Return Type	Returns value	Usually void
Parameters	No	Yes
Validation	No	Yes

⸻

🔹 Access Modifier Comparison

Modifier	Same Class	Same Package	Subclass	Other Package
private	✅	❌	❌	❌
default	✅	✅	❌	❌
protected	✅	✅	✅	❌
public	✅	✅	✅	✅

⸻

🔹 Encapsulation vs Public Variables

Without Encapsulation

class Student {
    public int marks;
}

Anyone can modify

student.marks = -10;

⸻

With Encapsulation

class Student {
    private int marks;
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
}

Now only valid marks are stored.

⸻

🔹 Real-World Analogy

Think of an ATM.

You cannot directly access the money inside.

Instead, you interact through buttons like:

* Withdraw
* Deposit
* Check Balance

The ATM validates every operation before changing the balance.

Encapsulation works in exactly the same way.

The object’s data is hidden, and all operations go through controlled methods.

⸻

🔹 Programs Practiced

* BankAccount.java
* StudentEncapsulationDemo.java
* ATMManagementSystem.java

⸻

🔹 Key Concepts Learned

* Encapsulation
* Data Hiding
* Private Variables
* Public Methods
* Getter Methods
* Setter Methods
* Validation
* Controlled Access
* Access Modifiers
* Secure Object Design

⸻

🔹 Memory Understanding

When:

Student s = new Student("Aradhya", 90);

Java performs:

1. creates a reference variable in stack memory
2. creates the object in heap memory
3. initializes private fields using the constructor
4. fields can only be accessed through public methods
5. object is ready for use

⸻

Complexity

Getter Method

* Time Complexity: O(1)
* Space Complexity: O(1)

Setter Method

* Time Complexity: O(1)
* Space Complexity: O(1)

Validation logic may increase complexity if additional operations are performed.

⸻

🔹 Common Mistakes Beginners Make

* Making every variable public
* Forgetting to make fields private
* Writing setters without validation
* Returning the wrong variable in getters
* Accessing private variables directly from another class
* Forgetting to use this when parameter names match field names
* Creating setters for values that should never change

⸻

🔹 Object Interaction Flow

Create Object
↓
Constructor initializes private fields
↓
User calls setter()
↓
Validation happens
↓
Valid value stored
↓
User calls getter()
↓
Getter returns value

⸻

Folder Structure

03-encapsulation/
│
├── ATMManagementSystem.java
├── BankAccount.java
├── StudentEncapsulationDemo.java
└── README.md

⸻

🔹 Conclusion

Encapsulation is one of the most important principles of Object-Oriented Programming because it protects object data and provides controlled access.

It helps make code:

* secure
* reliable
* maintainable
* reusable
* flexible
* professional

Mastering encapsulation builds a strong foundation for advanced Java concepts like:

* inheritance
* polymorphism
* abstraction
* composition
* object relationships
