# Association — Teacher & Student

## 📌 Overview

This project demonstrates the **Association** relationship in Object-Oriented Programming using Java.

Association represents a relationship where one object **uses, knows about, or interacts with another object**, without necessarily owning it.

In this project:

Teacher interacts with Student.

The Teacher does not create, store, or own the Student.

---

## 📁 Project Structure

09-composition/
└── 04-association/
    ├── TeacherStudentDemo.java
    ├── README.md
    └── InterviewQuestions.md

---

## 🎯 Learning Objectives

After completing this project, you should understand:

1. What Association means in OOP.
2. How two independent objects can interact.
3. How an object can be passed as a method parameter.
4. How Association differs from Aggregation.
5. How Association differs from Composition.
6. How to design classes with minimal coupling.
7. How one object can use another object without owning it.

---

## 🔗 What is Association?

Association is a relationship between two independent objects where one object interacts with or uses another object.

Example:

Teacher → Student

A Teacher can teach a Student.

However:

- Teacher does not create Student.
- Teacher does not own Student.
- Student can exist without Teacher.
- Teacher can interact with many Students.
- Student can interact with many Teachers.

---

## 🧠 Relationship Demonstrated

Teacher
   |
   | uses
   ↓
Student

This represents:

Teacher HAS A relationship with Student through interaction.

More precisely, the Teacher is associated with the Student.

---

## 👨‍🎓 Student Class

The Student class contains:

- `studentId`
- `name`
- `course`

All fields are private to demonstrate encapsulation.

### Student Responsibilities

The Student is responsible for:

- Storing student information.
- Validating constructor input.
- Providing getter methods.
- Performing the `study()` behavior.

The Student does not depend on the Teacher to exist.

---

## 👨‍🏫 Teacher Class

The Teacher class contains:

- `teacherId`
- `name`
- `subject`

All fields are private.

### Teacher Responsibilities

The Teacher is responsible for:

- Storing teacher information.
- Validating constructor input.
- Providing getter methods.
- Teaching a Student.

The important method is:

`teach(Student student)`

The Student is received as a method parameter.

---

## 🔄 How Association Works

The objects are created independently.

Student
   ↓
created independently

Teacher
   ↓
created independently

Then:

Teacher
   ↓
teach(Student)
   ↓
Student.study()

The Teacher temporarily uses the Student object to perform its behavior.

---

## 💡 Important Design Point

The Teacher does not contain:

`private Student student;`

and does not create:

`new Student(...)`

Instead, the Student is supplied when the `teach()` method is called.

This keeps the objects independent.

---

## 🆚 Association vs Aggregation

### Association

Teacher interacts with Student.

The Student is passed to a method.

Teacher does not own Student.

### Aggregation

Library contains references to Book objects.

The Books are created independently and stored by the Library.

Example:

Library
   ↓
Book[]

Aggregation is a stronger structural relationship than simple temporary interaction.

---

## 🆚 Association vs Composition

### Association

Teacher → Student

The Teacher uses the Student.

There is no ownership.

### Composition

Car → Engine

The Car creates and strongly owns its Engine.

Composition represents strong HAS-A ownership.

---

## 📊 OOP Relationship Comparison

| Relationship | Meaning | Example |
|---|---|---|
| Inheritance | IS-A | Dog → Animal |
| Composition | Strong HAS-A | Car → Engine |
| Aggregation | Weak HAS-A | Library → Book |
| Association | Uses / interacts with | Teacher → Student |

---

## 🧠 Memory Trick

IS-A
→ Inheritance

Strong HAS-A
→ Composition

Weak HAS-A
→ Aggregation

USES / KNOWS-A
→ Association

---

## 🔐 Encapsulation Used

The fields are declared private:

- Student fields are private.
- Teacher fields are private.

Access is provided through getters.

This prevents direct modification of the internal state.

---

## 🛡️ Validation

The constructors validate:

- Student ID
- Student name
- Course
- Teacher ID
- Teacher name
- Subject

Invalid values receive default values.

The `teach()` method also checks:

`student == null`

before using the Student object.

---

## 🖥️ Expected Output

Teacher Yasir is teaching Java to student Rahul.

Rahul is studying Java.

---

## 🎓 Concepts Practiced

- [x] Class
- [x] Object
- [x] Encapsulation
- [x] Constructor
- [x] Constructor validation
- [x] Getters
- [x] Object interaction
- [x] Method parameters
- [x] Association
- [x] Loose coupling
- [x] Object collaboration
- [x] Defensive null checking

---

## ⭐ Key Takeaway

Association means:

"One object uses or interacts with another object."

In this project:

Teacher uses Student.

The Teacher does not create or own the Student.

This is different from:

Inheritance → IS-A

Composition → Strong HAS-A

Aggregation → Weak HAS-A

Association → USES / INTERACTS WITH

Understanding these relationships is essential for designing maintainable Java applications.
