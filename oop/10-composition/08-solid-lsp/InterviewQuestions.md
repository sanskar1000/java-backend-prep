# Liskov Substitution Principle — Interview Questions

## Basic Questions

### 1. What is the Liskov Substitution Principle?

Answer:

LSP states that objects of a subclass should be replaceable for objects of the parent class without breaking the correctness or expected behavior of the program.

---

### 2. What is the "L" in SOLID?

Answer:

L stands for Liskov Substitution Principle.

---

### 3. What is the main idea behind LSP?

Answer:

A child class should properly behave like its parent class and should not break the expectations created by the parent class.

---

### 4. Does "IS-A" automatically guarantee LSP?

Answer:

No.

A class may logically be a subtype but still violate LSP if it cannot correctly support the behavior promised by the parent type.

---

### 5. Why can the Bird example violate LSP?

Answer:

If Bird contains fly(), Penguin would inherit a behavior that it cannot perform.

Calling fly() through a Bird reference pointing to Penguin could break the expected behavior.

---

## Code-Based Questions

### 6. Is this valid?

Bird bird = new Sparrow("Sparrow");

Answer:

Yes.

Sparrow extends Bird, so a Sparrow can be referenced by a Bird reference.

---

### 7. Is this valid?

Bird bird = new Penguin("Penguin");

Answer:

Yes.

Penguin extends Bird, so a Penguin can be referenced by a Bird reference.

---

### 8. Is this valid?

Flyable bird = new Sparrow("Sparrow");

Answer:

Yes.

Sparrow implements Flyable.

---

### 9. Should Penguin implement Flyable?

Answer:

No.

Penguins cannot fly, so implementing Flyable would create an incorrect abstraction.

---

### 10. Why was Flyable separated from Bird?

Answer:

Because flying is not a behavior common to every bird.

Only birds that can fly should implement Flyable.

---

### 11. What happens if Penguin extends Bird and Bird has fly()?

Answer:

Penguin inherits fly() even though it cannot fly.

If Penguin overrides fly() by throwing an exception, the design can violate LSP because a Bird reference can no longer safely perform the behavior promised by Bird.

---

### 12. How does an interface help with LSP?

Answer:

An interface allows us to represent a specific capability separately from the general parent class.

For example:

Bird represents common bird behavior.

Flyable represents the ability to fly.

---

## Scenario Questions

### 13. A parent class has a method that some subclasses cannot meaningfully implement. What should you consider?

Answer:

The parent abstraction may be too broad.

The behavior should potentially be moved into a separate interface or more appropriate abstraction.

---

### 14. Is throwing UnsupportedOperationException always an LSP violation?

Answer:

Not automatically.

It depends on the contract of the parent type.

However, if the parent type promises that the operation is supported and a subclass cannot honor that promise, throwing UnsupportedOperationException is a strong sign that the hierarchy violates LSP.

---

### 15. What is the relationship between LSP and polymorphism?

Answer:

LSP helps ensure that polymorphism is safe.

When a subclass is substituted for its parent, the program should continue behaving correctly.

---

## Quick Revision

LSP:

Subclass
↓
Must safely replace
↓
Parent

Bad design:

Bird
└── fly()
    ├── Sparrow → works
    └── Penguin → cannot work

Better design:

Bird
├── Sparrow ── Flyable
└── Penguin ── swim()

---

## Interview One-Liner

LSP means a subclass should be substitutable for its parent without changing the correctness or expected behavior of the program.
