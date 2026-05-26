# Constructors in Java ☕

## 📘 Introduction

Constructors are one of the most important concepts in Java Object-Oriented Programming (OOP).

A constructor is used to initialize objects when they are created.

It automatically executes during object creation and helps assign initial values to instance variables.

---

# 🔹 What is a Constructor?

A constructor is a special method-like block used to initialize objects.

- has the same name as the class
- does not have a return type
- executes automatically when an object is created

## Syntax

```java
class Student {

    Student() {

    }
}
```

---

### Important Rules

- Constructor name must be same as class name

- Constructors do not have a return type

- Constructors are called automatically during object creation

---

# 🔹 Why Constructors are Needed

Constructors initialize object data at the time of object creation.

Without constructors:

```java
Student s1 = new Student();

s1.name = "Aradhya";
s1.age = 20;
```

The object is created first and initialized later.

---

With constructors:

```java
Student s1 = new Student("Aradhya", 20);
```

The object is initialized immediately.

---

# 🔹 Advantages of Constructors

- Cleaner code
- Safer object initialization
- Reduces incomplete objects
- Improves readability
- Professional object creation
- Better object management

---

# 🔹 Types of Constructors

Java mainly provides:

1. Default Constructor
2. Parameterized Constructor

---

## 1. Default Constructor

A constructor without parameters.

### Example

```java

class Rectangle {

    double length;

    double breadth;

    Rectangle() {

        length = breadth = 0.0;

    }

}

```

### Purpose

Used to assign default values to objects.

---

## 2. Parameterized Constructor

A constructor with parameters used to initialize objects with custom values.

### Example

```java

class Book {

    String title;

    double price;

    Book(String title, double price) {

        this.title = title;

        this.price = price;

    }

}

```

### Purpose

Used for custom object initialization.

---

# 🔹 Default Constructor vs Parameterized Constructor

| Feature | Default Constructor | Parameterized Constructor |
|---|---|---|
| Parameters | No | Yes |
| Initialization | Default values | Custom values |
| Flexibility | Less | More |
| Usage | Basic objects | Real-world objects |

---

# 🔹 Constructor Overloading

Constructor overloading means creating multiple constructors in the same class with different parameter lists.

## Example

```java
class Laptop {

    String brand;
    String ram;
    double price;

    Laptop() {

    }

    Laptop(String brand) {

        this.brand = brand;
    }

    Laptop(String brand, String ram) {

        this.brand = brand;
        this.ram = ram;
    }

    Laptop(String brand, String ram, double price) {

        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
}
```

---

# 🔹 Advantages of Constructor Overloading

- Multiple ways to create objects
- Flexible object initialization
- Cleaner code structure
- Better readability

---

# 🔹 `this` Keyword in Java

The `this` keyword refers to the current object.

It is commonly used to differentiate instance variables from local variables.

## Example

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;
    }
}
```

---

# 🔹 Explanation of `this`

```java
this.name
```

refers to the instance variable of the current object.

```java
name
```

refers to the constructor parameter.

Without `this`:

```java
name = name;
```



# 🔹 Constructor Chaining using `this()`

Constructors can call another constructor of the same class using `this()`.

## Example

```java
class Laptop {

    String brand;
    String ram;
    double price;

    Laptop() {

        this("Unknown", "Unknown", 0.0);
    }

    Laptop(String brand, String ram, double price) {

        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
}
```

---

# 🔹 Benefits of Constructor Chaining

- Reduces duplicate code
- Improves maintainability
- Cleaner constructor design
- Easier updates

---

# 🔹 Copy Constructor

Java does not provide a built-in copy constructor like C++, but we can create one manually.

A copy constructor copies data from one object to another object.

## Example

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) {

        this.name = s.name;
        this.age = s.age;
    }
}
```

---

# 🔹 Purpose of Copy Constructor

- Create duplicate objects
- Copy existing object data
- Avoid rewriting values manually

---

# 🔹 Constructor vs Method

| Feature | Constructor | Method |
|---|---|---|
| Purpose | Initialize object | Perform operations |
| Name | Same as class name | Any valid name |
| Return Type | No return type | Must have return type |
| Called Automatically | Yes | No |
| Invocation | During object creation | Called manually |

---

# 🔹 Real-World Analogy

Think of constructors like:

- setting up a new mobile phone
- filling a registration form
- assigning details to a newly purchased car

When the object is created, the constructor prepares it immediately.

---

# 🔹 Programs Practiced

- Book.java
- Laptop.java
- Rectangle.java
- Student.java
- BankAccount.java
- Car.java
- EmployeeDemo.java
- Students.java

---

# 🔹 Key Concepts Learned

- Object initialization
- Automatic constructor execution
- Parameter passing
- Instance variables
- Constructor execution
- Constructor overloading
- Constructor chaining
- `this` keyword
- Copy constructor
- Default vs parameterized constructor
- Constructor vs method
- Cleaner object creation

---

# Memory Understanding

When:

Car c1 = new Car("BMW", "M4", 9000000);


## Java performs:

1. creates reference variable in stack memory
2. creates object in heap memory
3. constructor initializes object fields
   

## Complexity

Constructor execution itself is generally:

- Time Complexity: O(1)
- Space Complexity: O(1)

unless additional logic is added.


| Program | Concepts |
|---|---|
| EmployeeDemo.java | Default Constructor |
| Book.java | Parameterized Constructor |
| Car.java | Parameterized Constructor |
| Laptop.java | Constructor Overloading |
| Rectangle.java | Constructor Overloading |
| BankAccount.java | Copy Constructor |
| Student.java | Default Constructor |
| Students.java | Parameterized Constructor |

---


# 🔹 Common Mistakes Beginners Make

Example:

- Giving constructors a return type
- Constructor name different from class name
- Forgetting to initialize fields
- Using methods instead of constructors
- Confusing local and instance variables

 # 🔹 Object Creation Flow

```text
new Car("BMW", "M4", 9000000)

↓
Memory allocated in heap

↓
Constructor called automatically

↓
Fields initialized

↓
Object ready for use
```

# Folder Structure
```
02-constructors/
│

├── Car.java

├── Book.java

├── Laptop.java

└── README.md


```
# 🔹 Conclusion

Constructors are essential in Java OOP because they ensure objects are properly initialized during creation.

They help make code:

- cleaner
- safer
- reusable
- maintainable
- professional

Mastering constructors builds a strong foundation for advanced Java concepts like:

- inheritance
- polymorphism
- encapsulation
- object relationships

---
