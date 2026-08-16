# Composition vs Aggregation — OOP Practice

## 📌 Overview

This project demonstrates two important Object-Oriented Programming relationships:

- Composition
- Aggregation

Both represent a HAS-A relationship, but they differ in ownership and object lifecycle.

---

## 📁 Project Structure

09-composition/
└── 03-composition-vs-aggregation/
    ├── CompositionDemo.java
    ├── AggregationDemo.java
    ├── README.md
    └── InterviewQuestions.md

---

# 🔗 HAS-A Relationship

A HAS-A relationship means one class contains or uses an object of another class.

Examples:

Car HAS-A Engine

University HAS-A Student

However, HAS-A relationships can represent different levels of ownership.

---

# 1. Composition

## Definition

Composition is a strong HAS-A relationship where the containing object strongly owns the contained object.

Example:

Car HAS-A Engine

In the Composition example, the Car creates its own Engine.

Conceptually:

Car
 ↓
creates
 ↓
Engine

The caller only needs to provide the engine number:

Car car = new Car("BMW", "M5", 2345);

The Car internally creates:

new Engine(engineNumber)

---

## Composition Characteristics

- Strong ownership
- Contained object is created by the owner
- Represents a strong whole-part relationship
- The contained object is strongly associated with the owner
- Useful when the part belongs specifically to the whole

---

## Example

Car
└── Engine

A Car contains an Engine.

The Car constructor creates the Engine:

this.engine = new Engine(engineNumber);

This demonstrates composition.

---

# 2. Aggregation

## Definition

Aggregation is a weaker HAS-A relationship where the contained object can exist independently of the containing object.

Example:

University HAS-A Student

The Student is created outside the University:

Student student = new Student("S101", "Aradhya", "BCA");

Then the University receives the existing Student:

university.addStudent(student);

The University stores a reference to the Student.

---

## Aggregation Characteristics

- Weak ownership
- Contained object can exist independently
- Object is usually created outside the container
- The container stores a reference to an existing object
- Useful when objects have independent lifecycles

---

## Example

University
└── Student[]

Students are created independently and then added to the University.

The University does not create the Student objects.

---

# ⚖️ Composition vs Aggregation

| Feature | Composition | Aggregation |
|---|---|---|
| Relationship | Strong HAS-A | Weak HAS-A |
| Ownership | Strong | Weak |
| Object creation | Usually by owner | Usually outside owner |
| Independent existence | Strongly dependent | Independent |
| Example | Car → Engine | University → Student |
| Lifecycle relationship | Strong | Independent |

---

# 🧠 Simple Memory Trick

IS-A
→ Inheritance

HAS-A
→ Composition / Aggregation

Strong HAS-A
→ Composition

Weak HAS-A
→ Aggregation

---

# 🔍 Composition Example

The Car receives an engine number:

Car car = new Car("BMW", "M5", 2345);

The Car creates the Engine internally.

Therefore:

Car
 ↓
owns
 ↓
Engine

---

# 🔍 Aggregation Example

The Student is created first:

Student student = new Student("S101", "Aradhya", "BCA");

Then the University receives it:

university.addStudent(student);

Therefore:

Student
 ↓
exists independently

University
 ↓
references Student

---

# ⚠️ Important Java Point

Composition and aggregation are NOT Java keywords.

Java does not have:

composition
aggregation

keywords.

They are Object-Oriented Design concepts.

The relationship is determined by how objects are created, owned, referenced, and managed.

---

# 🔐 Encapsulation

Both examples use encapsulation.

Fields are private:

private String brand;
private Engine engine;

private String universityName;
private Student[] students;

Access is controlled through methods such as getters and business methods.

---

# 🔄 Delegation

Composition also demonstrates delegation.

Car delegates engine-specific behavior to Engine:

engine.start();

The Car does not implement the internal engine-starting logic itself.

This follows the principle:

"Assign responsibility to the class that owns the behavior."

---

# 🎯 Learning Objectives

After completing this project, you should understand:

- HAS-A relationships
- Composition
- Aggregation
- Strong ownership
- Weak ownership
- Object lifecycle
- Object references
- Constructor-based object creation
- Constructor injection
- Encapsulation
- Delegation
- Separation of responsibilities
- Object-oriented design

---

# 💻 Concepts Practiced

- [x] Classes
- [x] Objects
- [x] Encapsulation
- [x] Constructors
- [x] Validation
- [x] Getters
- [x] Arrays of Objects
- [x] Object References
- [x] Composition
- [x] Aggregation
- [x] HAS-A Relationship
- [x] Delegation
- [x] Object Ownership
- [x] Object Lifecycle

---

# 🚀 Key Takeaway

The most important distinction is:

Composition:

Car strongly owns its Engine.

Aggregation:

University has Students, but Students can exist independently.

Remember:

IS-A → Inheritance

Strong HAS-A → Composition

Weak HAS-A → Aggregation

These relationships are fundamental to designing maintainable and reusable OOP systems.
