# Association — Interview Questions

## Basic Questions

### 1. What is Association in OOP?

Association is a relationship between two independent objects where one object uses, knows about, or interacts with another object.

Example:

Teacher → Student

---

### 2. What is the relationship between Teacher and Student in this project?

Association.

The Teacher interacts with the Student through the `teach()` method.

---

### 3. Why is Teacher-Student an Association?

Because the Teacher does not create or own the Student.

The Student exists independently and is passed to the Teacher's method.

---

### 4. How is the Student passed to the Teacher?

The Student is passed as a method parameter:

`teach(Student student)`

---

### 5. Does Teacher store Student as a field?

No.

The Teacher does not have:

`private Student student;`

The Student is only used during method execution.

---

### 6. Can Student exist without Teacher?

Yes.

The Student object is created independently.

---

### 7. Can Teacher exist without Student?

Yes.

The Teacher object is also created independently.

---

## Association vs Other Relationships

### 8. What is the difference between Association and Inheritance?

Inheritance represents an IS-A relationship.

Association represents a USES or INTERACTS-WITH relationship.

Example:

Dog IS-A Animal → Inheritance

Teacher USES Student → Association

---

### 9. What is the difference between Association and Composition?

Composition represents strong ownership.

Association represents interaction without ownership.

Example:

Car HAS-A Engine → Composition

Teacher USES Student → Association

---

### 10. What is the difference between Association and Aggregation?

Aggregation is a weak HAS-A relationship where one object contains references to independently existing objects.

Association is a broader relationship where objects simply interact or know about each other.

Example:

Library HAS-A Book → Aggregation

Teacher USES Student → Association

---

### 11. Can Association be one-to-one?

Yes.

Example:

One doctor interacting with one patient.

---

### 12. Can Association be one-to-many?

Yes.

Example:

One Teacher teaching many Students.

---

### 13. Can Association be many-to-many?

Yes.

Example:

Students can enroll in multiple courses, and courses can have multiple students.

---

## Java Questions

### 14. Is Association a Java keyword?

No.

Association is an Object-Oriented Design concept.

---

### 15. Does Java have a special syntax for Association?

No.

Association can be implemented using references, method parameters, fields, collections, and other mechanisms.

---

### 16. Can Association be implemented using a method parameter?

Yes.

Example:

`public void teach(Student student)`

The Teacher uses the Student supplied to the method.

---

### 17. Why do we check `student == null`?

To prevent a `NullPointerException` when trying to use the Student object.

---

### 18. What does loose coupling mean?

Loose coupling means classes have minimal dependency on the internal implementation of other classes.

In this project, Teacher only needs a Student object to perform `teach()`.

---

## Scenario-Based Questions

### 19. A Car receives an Engine through its constructor. Is that automatically Composition?

No.

Constructor injection by itself does not determine whether a relationship is composition or aggregation.

The important question is ownership and lifecycle responsibility.

---

### 20. A Teacher receives a Student through a method parameter. What relationship is this?

Association.

The Teacher temporarily uses the Student.

---

### 21. A Library stores externally created Book objects. What relationship is this?

Aggregation.

The Books can exist independently of the Library.

---

### 22. A Car creates its own Engine. What relationship can this represent?

Composition.

The Car strongly owns the Engine.

---

## Quick Revision

Inheritance
→ IS-A

Composition
→ Strong HAS-A

Aggregation
→ Weak HAS-A

Association
→ USES / INTERACTS WITH

---

## ⭐ Interview One-Liner

Association is a relationship in which two independent objects interact with or know about each other without strong ownership.

Example:

Teacher → Student
