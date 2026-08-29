# Package Practice — Student Management System

A beginner-friendly Java project created to practice **packages, encapsulation, constructors, getters, validation, and separation of responsibilities**.

## 📌 Concepts Practiced

- Java Packages
- Classes and Objects
- Constructors
- `private` fields
- `final` fields
- Getter methods
- Object validation
- Service classes
- Utility classes
- Constructor Dependency Injection
- Basic separation of responsibilities

---

## 📂 Project Structure

```text
package-practice/
│
├── model/
│   └── Student.java
│
├── util/
│   └── StudentValidator.java
│
├── service/
│   └── StudentService.java
│
└── Main.java

🧩 Package Responsibilities

model

Contains classes that represent application data.

Student.java stores:

* Student ID
* Name
* Age
* Marks

The fields are private and accessed through getter methods.

⸻

util

Contains utility/helper classes.

StudentValidator.java validates:

* Student is not null
* Student ID is not blank
* Name is not blank
* Age is between 16 and 100
* Marks are between 0 and 100

⸻

service

Contains classes responsible for student-related operations.

StudentService.java performs:

* Student validation
* Student information display
* Pass/Fail calculation
* Grade calculation
* Scholarship eligibility check

⸻

🔐 Encapsulation

The Student class keeps its fields private:

private final String studentId;
private final String name;
private final int age;
private final double marks;

The values are accessed using getter methods:

student.getStudentId();
student.getName();
student.getAge();
student.getMarks();

This prevents direct access to the object’s internal data.

🏗️ Constructor

A constructor is used to initialize the Student object:

Student student = new Student(
        "S101",
        "Aradhya",
        20,
        87
);

🔗 Dependency Injection

StudentService requires a StudentValidator.

The validator is provided through the constructor:

StudentValidator validator =
        new StudentValidator();

StudentService studentService =
        new StudentService(validator);

This is an example of Constructor Dependency Injection.

⸻

🎯 Student Result

The service calculates the result based on marks:

90–100 → A
80–89  → B
70–79  → C
60–69  → D
0–59   → F

A student with marks 40 or above is considered:

Pass

Otherwise:

Fail

🎓 Scholarship Rule

A student is eligible for a scholarship when:

Marks >= 90

Otherwise:

Not Eligible

▶️ Example

Input data:

Student ID : S101
Name       : Aradhya
Age        : 20
Marks      : 87

Output:
------- Student Details -------
Student ID   : S101
Name         : Aradhya
Age          : 20
Marks        : 87.0
Result       : Pass
Grade        : B
Scholarship  : Not Eligible

🧠 Program Flow

Main
 │
 ├── Create Student
 │
 ├── Create StudentValidator
 │
 ├── Create StudentService
 │       │
 │       └── StudentValidator injected
 │
 └── displayStudent(student)
          │
          ├── Validate Student
          │
          ├── Calculate Result
          │
          ├── Calculate Grade
          │
          ├── Check Scholarship
          │
          └── Display Details

💡 What I Learned

* How to create and use Java packages
* How to import classes from different packages
* How to organize a Java project
* How encapsulation protects object data
* How constructors initialize objects
* How final prevents reassignment
* How utility classes can handle validation
* How service classes handle business operations
* How constructor dependency injection works
* How to separate responsibilities between classes

⸻

🚀 Future Improvements

Possible improvements for future practice:

* Add setters where appropriate
* Add more student operations
* Store multiple students
* Search students by ID
* Calculate average marks
* Add attendance
* Add input using Scanner
* Introduce interfaces
* Apply SOLID principles

⸻

⭐ Key Takeaway

This project demonstrates how a Java application can be divided into packages based on responsibility:

🛠️ Technologies

* Java
* Object-Oriented Programming
* Java Packages
