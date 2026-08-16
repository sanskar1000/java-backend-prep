# Library–Book Aggregation

## 📌 Overview

This project demonstrates the **Aggregation** relationship in Object-Oriented Programming using Java.

Aggregation is a **weak HAS-A relationship** where one object contains or references another object, but the contained object can exist independently.

In this project:

Library HAS-A Book.

The `Book` objects are created outside the `Library` and then passed to the library using `addBook()`.

---

## 📁 Project Structure

02-library-book/
├── LibraryBookDemo.java
├── README.md
└── InterviewQuestions.md

---

## 🎯 Learning Objectives

After completing this project, you should understand:

1. What aggregation means.
2. What a HAS-A relationship is.
3. How objects can be passed from one class to another.
4. How to store objects inside an array.
5. How encapsulation works with object references.
6. How constructor validation works.
7. Why aggregation is different from composition.
8. How object ownership affects class design.

---

## 🧠 What is Aggregation?

Aggregation is a weak HAS-A relationship between two classes.

Example:

Library HAS-A Book.

A book can exist independently of a particular library.

The relationship can be represented as:

Library
   |
   | HAS-A
   ↓
 Book

---

## 📚 Classes Used

### Book

The `Book` class represents a book.

Fields:

- `isbn`
- `title`
- `author`

All fields are private to maintain encapsulation.

The class provides:

- Constructor
- Getters
- `displayBookDetails()`

---

### Library

The `Library` class represents a library containing books.

Fields:

- `libraryName`
- `Book[] books`
- `bookCount`

The library provides:

- Constructor
- Getters
- `addBook()`
- `displayBooks()`

---

## 🔗 Why is this Aggregation?

Books are created independently:

Book book1 = new Book(...);
Book book2 = new Book(...);
Book book3 = new Book(...);

Then they are supplied to the library:

library.addBook(book1);
library.addBook(book2);
library.addBook(book3);

The important point is:

The `Library` does not create these `Book` objects.

The books already exist before they are added to the library.

Therefore:

Book
   ↓
exists independently

Library
   ↓
references
   ↓
Book

This represents aggregation.

---

## 🔄 Object Flow

Book objects are created
        ↓
Book book1
Book book2
Book book3
        ↓
Library is created
        ↓
Books are passed to Library
        ↓
Library stores Book references
        ↓
Library displays books

---

## 🛡️ Encapsulation

The fields are declared private.

Example:

private String isbn;
private String title;
private String author;

The internal state is accessed through methods such as:

getIsbn()
getTitle()
getAuthor()

This prevents direct modification of the fields from outside the class.

---

## 📦 Book Storage

The library uses an array:

Book[] books;

The current number of books is tracked using:

int bookCount;

When a book is added:

books[bookCount] = book;
bookCount++;

This allows the library to keep track of how many positions are currently occupied.

---

## ✅ Validation

The program validates:

### Book

- ISBN cannot be null or blank.
- Title cannot be null or blank.
- Author cannot be null or blank.

### Library

- Library name cannot be null or blank.
- Capacity must be greater than zero.
- A null book cannot be added.
- Books cannot be added when the library is full.

---

## 🔍 Aggregation vs Composition

### Aggregation

The contained object can exist independently.

Example:

Library → Book

A book can exist without a particular library.

### Composition

The contained object has strong ownership by the containing object.

Example:

Car → Engine

If the design says the `Car` creates and exclusively manages its `Engine`, the relationship can be modeled as composition.

---

## 🧠 Important Difference

Aggregation:

Book is created outside the Library.

Book book = new Book(...);
Library library = new Library(...);
library.addBook(book);

Composition:

The containing class creates its internal object.

Car car = new Car(...);

The `Car` creates its own `Engine` internally.

---

## 💡 Key Takeaway

Aggregation means:

Object A HAS-A Object B, but Object B can exist independently.

For this project:

Library HAS-A Book.

The library stores references to books that were created outside the library.

---

## 🎓 Concepts Practiced

- [x] Classes
- [x] Objects
- [x] Encapsulation
- [x] Private fields
- [x] Constructors
- [x] Constructor validation
- [x] Getters
- [x] Object references
- [x] Arrays of objects
- [x] HAS-A relationship
- [x] Aggregation
- [x] Object ownership
- [x] Dependency through method parameters

---

## ⭐ Interview Definition

Aggregation is a weak HAS-A relationship in which one object contains or references another object, while the contained object can exist independently of the containing object.

Example:

Library HAS-A Book.
