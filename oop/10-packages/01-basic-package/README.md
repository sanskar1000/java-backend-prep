# Java Package — Basic Package Creation

## 📌 Overview

This practice demonstrates how to create and use a custom package in Java.

A package is used to organize related classes and provides a namespace for Java classes.

In this example:

- `Student` belongs to the `model` package.
- `Main` belongs to the default package.
- `Main` imports `Student` from the `model` package.
- An object of `Student` is created and its `study()` method is called.

---

## 📁 Project Structure

```text
01-basic-package/
│
├── src/
│   ├── model/
│   │   └── Student.java
│   │
│   └── Main.java
│
└── README.md
🧠 Concepts Covered

* Java packages
* package keyword
* import keyword
* Custom package creation
* Using a class from another package
* Fully qualified class names
* Basic project organization

🔹 Student Class

The Student class belongs to the model package.

package model;

public class Student {

    public void study() {
        System.out.println("Student is studying.");
    }
}

The statement:

package model;

declares that Student belongs to the model package.

⸻

🔹 Importing the Class

Main.java is outside the model package.

Therefore, we import Student:

import model.Student;

This allows us to use:

Student student = new Student();

instead of writing the fully qualified class name:

model.Student student = new model.Student();

🔹 Main Class

import model.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.study();
    }
}

▶️ Output

Student is studying.

🔍 How It Works

Student.java
     ↓
package model;
     ↓
Student belongs to model package
     ↓
Main.java
     ↓
import model.Student;
     ↓
Student object is created
     ↓
student.study()
     ↓
Student is studying.

📚 Key Difference

package

The package keyword specifies which package a class belongs to.

package model;

import

The import keyword allows a class from another package to be referenced using its simple name.

import model.Student;

🎯 Learning Outcome

After completing this practice, I can:

* Create a custom Java package.
* Place a class inside a package.
* Import a class from another package.
* Create an object of an imported class.
* Understand the relationship between package structure and Java source files.

⸻

🛠️ Technologies

* Java
* IntelliJ IDEA
* Git
* GitHub
