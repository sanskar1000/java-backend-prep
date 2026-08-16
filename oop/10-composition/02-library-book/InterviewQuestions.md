# Interview Questions — Library–Book Aggregation

## 1. What is aggregation?

Aggregation is a weak HAS-A relationship between two classes where the contained object can exist independently of the containing object.

Example:

Library HAS-A Book.

---

## 2. What is the relationship between Library and Book in this project?

It is an aggregation relationship.

Library HAS-A Book.

---

## 3. Why is Library–Book considered aggregation?

Because the `Book` objects are created outside the `Library` and then passed to the library.

Example:

Book book = new Book(...);

Library library = new Library(...);

library.addBook(book);

The book can exist independently of that library.

---

## 4. What does HAS-A mean?

HAS-A represents a relationship where one class contains or uses an object of another class.

Example:

Library HAS-A Book.

Car HAS-A Engine.

Company HAS-A Employee.

---

## 5. What is the difference between IS-A and HAS-A?

IS-A represents inheritance.

Example:

Dog IS-A Animal.

HAS-A represents object composition or aggregation.

Example:

Car HAS-A Engine.

---

## 6. What is the difference between aggregation and composition?

Aggregation is a weak HAS-A relationship where the contained object can exist independently.

Composition is a strong HAS-A relationship where the containing object has strong ownership of the contained object.

---

## 7. Does Java have a special keyword for aggregation?

No.

Java does not have an `aggregation` keyword.

Aggregation is achieved by creating object references between classes.

Example:

private Book[] books;

---

## 8. Does Java have a special keyword for composition?

No.

Composition is also represented using object references.

Example:

private Engine engine;

The difference is based on object ownership and lifecycle design, not on a special Java keyword.

---

## 9. Where are the Book objects created in this project?

The Book objects are created outside the Library.

Example:

Book book1 = new Book(...);

Then they are passed to the Library.

library.addBook(book1);

---

## 10. Does Library create the Book objects?

No.

The books are created outside the Library.

The Library only stores references to the Book objects.

This supports the aggregation relationship.

---

## 11. Can a Book exist without a Library?

Yes.

For example:

Book book = new Book(
    "B101",
    "Effective Java",
    "Joshua Bloch"
);

The Book object exists even if it has not been added to any Library.

---

## 12. Can the same Book object be referenced by another object?

Yes.

Java objects can have multiple references.

For example:

Book book = new Book(...);

Library library1 = new Library(...);
Library library2 = new Library(...);

Both libraries could potentially hold a reference to the same Book object.

Whether that design makes sense depends on the application's business rules.

---

## 13. Why is Book[] used in this project?

`Book[]` is used to store multiple Book objects inside the Library.

Example:

private Book[] books;

It demonstrates an array of objects.

---

## 14. Why is bookCount needed?

`bookCount` keeps track of how many books have actually been added to the library.

Example:

books[bookCount] = book;
bookCount++;

Without `bookCount`, the program would not easily know which positions contain valid books.

---

## 15. Why is books declared private?

To maintain encapsulation.

Example:

private Book[] books;

External classes should not directly modify the Library's internal array.

---

## 16. Why should we be careful about returning the internal Book[] directly?

Because returning the internal array exposes the Library's internal state.

For example:

library.getBooks()[0] = null;

This allows outside code to modify the Library directly.

A better design can expose controlled methods instead.

---

## 17. What happens if addBook(null) is called?

The program checks:

if (book == null)

and rejects the invalid book instead of storing a null reference.

---

## 18. What happens when the library is full?

The program checks whether:

bookCount >= books.length

If the library is full, the new book is rejected.

---

## 19. Is aggregation a form of inheritance?

No.

Aggregation is based on object references and a HAS-A relationship.

Inheritance is based on an IS-A relationship.

---

## 20. Is aggregation the same as inheritance?

No.

Inheritance:

Dog extends Animal

This represents:

Dog IS-A Animal.

Aggregation:

Library contains Book references.

This represents:

Library HAS-A Book.

---

## 21. What is object ownership?

Object ownership describes which object is responsible for managing or controlling another object's relationship and lifecycle.

Ownership is an important factor when distinguishing composition from aggregation.

---

## 22. What is the main difference between this project and composition?

In this project:

Book objects are created outside the Library.

In a composition design:

The containing object would normally create and strongly own the contained object.

---

## 23. Can constructor injection be used with aggregation?

Yes.

Example:

Library(Student student)

The object can be created outside and supplied to another object through a constructor.

However, constructor injection by itself does not automatically mean aggregation. The ownership and lifecycle relationship must also be considered.

---

## 24. What is the simplest way to remember aggregation?

Remember:

Aggregation = Weak HAS-A

The contained object can exist independently.

---

## 25. Give a real-world example of aggregation.

University HAS-A Student.

A student can exist independently of a particular university.

Other examples can include:

- Team HAS-A Player
- Department HAS-A Employee
- Library HAS-A Book

The exact relationship depends on the business/domain model.

---

# ⭐ Top Interview Question

### What is aggregation in Java?

Aggregation is a weak HAS-A relationship where one class contains or references an object of another class, but the contained object can exist independently of the containing object.

Example:

Library HAS-A Book.

The Book is created independently and then added to the Library.

---

# 🧠 Quick Revision

IS-A
→ Inheritance

HAS-A
→ Composition / Aggregation

Strong ownership
→ Composition

Independent existence
→ Aggregation

No special Java keyword
→ Both are modeled using object references
