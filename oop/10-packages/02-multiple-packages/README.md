# Java Packages — Multiple Packages

## 📌 Overview

This practice demonstrates how multiple custom Java packages can work together.

The project contains two custom packages:

- `model` — contains the `Student` class.
- `service` — contains the `StudentService` class.

The `Main` class imports classes from both packages and uses them together.

---

## 📁 Project Structure

```text
02-multiple-packages/
│
├── src/
│   │
│   ├── model/
│   │   └── Student.java
│   │
│   ├── service/
│   │   └── StudentService.java
│   │
│   └── Main.java
│
└── README.md

🧠 Concepts Covered

* Creating multiple packages
* package keyword
* import keyword
* Using classes from different packages
* Passing objects between classes
* Package organization
* Separation of model and service responsibilities

🔄 Program Flow

Main
 │
 ├── creates Student
 │
 ├── creates StudentService
 │
 └── passes Student to StudentService
             │
             ↓
      displayStudent()
             │
             ↓
        student.study()
             │
             ↓
   Student is studying.

   🔗 Package Relationship

   ┌──────────────────┐
│      model       │
│                  │
│     Student      │
└────────┬─────────┘
         ↑
         │ import
         │
┌────────┴─────────┐
│     service      │
│                  │
│ StudentService   │
└──────────────────┘

        ↑
        │ import
        │
┌───────┴──────────┐
│      Main        │
└──────────────────┘

🎯 Learning Outcome

After completing this practice, I can:

* Create multiple Java packages.
* Organize classes into different packages.
* Import classes from another package.
* Use objects across packages.
* Pass objects as method arguments.
* Understand basic separation between model and service packages.

🛠️ Technologies

* Java
* IntelliJ IDEA
* Git
* GitHub
