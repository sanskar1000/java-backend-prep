# Composition vs Aggregation — Interview Questions

## Basic Questions

### 1. What is a HAS-A relationship?

A HAS-A relationship means one class contains or uses an object of another class.

Example:

Car HAS-A Engine.

---

### 2. What is composition?

Composition is a strong HAS-A relationship where one object strongly owns another object.

Example:

Car → Engine

---

### 3. What is aggregation?

Aggregation is a weak HAS-A relationship where the contained object can exist independently of the containing object.

Example:

University → Student

---

### 4. What is the main difference between composition and aggregation?

Composition represents strong ownership.

Aggregation represents weaker ownership where the contained object can exist independently.

---

### 5. Give an example of composition.

Car HAS-A Engine.

The Car creates and strongly owns its Engine.

---

### 6. Give an example of aggregation.

University HAS-A Student.

A Student can exist independently of a particular University.

---

### 7. Is composition a Java keyword?

No.

Composition is an Object-Oriented Design concept.

---

### 8. Is aggregation a Java keyword?

No.

Aggregation is also an Object-Oriented Design concept.

---

## Intermediate Questions

### 9. How is composition represented in Java?

Composition can be represented by having one class contain another class as a field and creating the contained object as part of the owner's construction or lifecycle.

Example concept:

Car creates its own Engine.

---

### 10. How is aggregation represented in Java?

Aggregation can be represented by passing an existing object into another object and storing its reference.

Example:

Student student = new Student(...);

University university = new University(...);

university.addStudent(student);

---

### 11. Why is University → Student considered aggregation?

Because the Student object can exist independently of the University.

The Student is created outside the University and then supplied to it.

---

### 12. Why is Car → Engine considered composition in our example?

Because the Car creates its own Engine inside its constructor.

The Engine is strongly associated with that Car.

---

### 13. What is object ownership?

Object ownership describes which object is responsible for managing another object's relationship and lifecycle.

Strong ownership is associated with composition.

---

### 14. What is object lifecycle?

Object lifecycle refers to the period from an object's creation until it is no longer reachable or needed.

Composition usually represents a stronger lifecycle relationship between the whole and its part.

---

### 15. Does constructor injection automatically mean aggregation?

No.

Constructor injection only means that an object is supplied through a constructor.

The relationship depends on ownership and lifecycle semantics.

---

## Advanced Questions

### 16. Can composition exist without constructor injection?

Yes.

A class can create its contained object internally using a field initializer, constructor, or another controlled creation mechanism.

---

### 17. Can aggregation use constructor injection?

Yes.

For example:

Student student = new Student(...);

University university = new University(student);

The University receives an independently created Student.

---

### 18. Can an object be shared in aggregation?

Yes.

Because the contained object has an independent lifecycle, it can potentially be referenced by multiple objects.

---

### 19. Does Java automatically enforce composition and aggregation?

No.

Java provides classes, objects, fields, references, constructors, and access modifiers.

Composition and aggregation are design concepts implemented using these language features.

---

### 20. What is the difference between inheritance and composition?

Inheritance represents an IS-A relationship.

Composition represents a HAS-A relationship.

Example:

Dog IS-A Animal.

Car HAS-A Engine.

---

### 21. Why is composition often preferred over inheritance?

Composition can provide more flexibility because behavior can be delegated to contained objects rather than being tightly coupled through an inheritance hierarchy.

---

### 22. What is delegation?

Delegation means an object passes responsibility for a particular operation to another object.

Example:

Car delegates engine-starting behavior to Engine:

engine.start();

---

### 23. What is loose coupling?

Loose coupling means classes have minimal dependency on the internal implementation of other classes.

Composition and aggregation can be used to design loosely coupled systems.

---

### 24. Can a class have both composition and aggregation?

Yes.

A class can strongly own one type of object while maintaining a weaker relationship with another type.

---

### 25. What should you ask when deciding between composition and aggregation?

Ask:

1. Who creates the contained object?
2. Who owns the object?
3. Can the contained object exist independently?
4. Can it be shared?
5. What is the intended lifecycle relationship?

---

# 🧠 Rapid-Fire Interview Round

### Q1. IS-A means?

Inheritance.

### Q2. HAS-A means?

Composition or aggregation.

### Q3. Strong HAS-A?

Composition.

### Q4. Weak HAS-A?

Aggregation.

### Q5. Can a Student exist without a University?

Yes.

### Q6. Can a University contain a Student created elsewhere?

Yes.

### Q7. Can composition be implemented using object references?

Yes.

### Q8. Are composition and aggregation Java keywords?

No.

### Q9. What does `private Engine engine;` represent?

A HAS-A relationship.

### Q10. What does `this.engine = new Engine(engineNumber);` demonstrate in our example?

Composition and strong ownership.

---

# ⭐ Interview Answer

If an interviewer asks:

"Explain composition and aggregation with an example."

A strong answer is:

"Both represent HAS-A relationships. Composition is a strong ownership relationship where the contained object is strongly associated with the owner, such as a Car having an Engine. Aggregation is a weaker relationship where the contained object can exist independently, such as a University having Students. In Java, neither is a keyword; they are design relationships implemented using object references and appropriate object-creation and ownership strategies."
