# Inheritance (`extends`) - Interview Questions

## Beginner

### 1. What is inheritance?

Inheritance is an OOP feature that allows one class to acquire the fields and methods of another class.

---

### 2. Which keyword is used for inheritance in Java?

`extends`

---

### 3. What is a parent class?

A parent (superclass) is the class whose members are inherited by another class.

---

### 4. What is a child class?

A child (subclass) is the class that inherits from a parent class.

---

### 5. Why is inheritance used?

- Code reuse
- Reduced duplication
- Easier maintenance
- Better organization

---

### 6. What relationship does inheritance represent?

An **IS-A** relationship.

Example:

- Dog IS-A Animal
- Car IS-A Vehicle

---

### 7. What relationship should not use inheritance?

A **HAS-A** relationship.

Example:

- Car HAS-A Engine
- Student HAS-A Laptop

---

### 8. Can a child class access the parent's methods?

Yes, if they are accessible.

---

### 9. Can a child class add its own fields and methods?

Yes.

---

### 10. Are constructors inherited?

No.

---

## Intermediate

### 11. Can a child class use inherited fields directly?

Yes, if they are accessible.

---

### 12. Can Java inherit from multiple classes?

No. Java supports single class inheritance.

---

### 13. What is code reusability?

Writing common code once in the parent class and reusing it in child classes.

---

### 14. Why is code duplication harmful?

It increases maintenance effort and makes software harder to modify and debug.

---

### 15. Give a real-world example of inheritance.

Parent:
- Employee

Children:
- Manager
- Developer
- Tester

---

## Quick Revision

- Inheritance uses `extends`
- Represents an IS-A relationship
- Promotes code reuse
- Reduces duplication
- Child inherits accessible members
- Constructors are not inherited
- Child classes can add their own members
