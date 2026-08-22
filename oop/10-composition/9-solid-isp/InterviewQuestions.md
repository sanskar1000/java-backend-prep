# Interface Segregation Principle — Interview Questions

## 1. What is the Interface Segregation Principle?

ISP states:

> A class should not be forced to depend on methods it does not need.

It is the **I** in SOLID.

---

## 2. Why is ISP important?

ISP helps us:

- Reduce unnecessary dependencies
- Reduce coupling
- Create smaller interfaces
- Improve maintainability
- Make implementations easier to understand

---

## 3. What is the problem with a large interface?

A large interface can force implementing classes to implement methods they don't actually need.

This creates unnecessary dependencies and can lead to poor design.

---

## 4. Give an example of ISP violation.

interface Worker {
    void work();
    void eat();
    void sleep();
}

If `RobotWorker` implements this interface, it is forced to implement `eat()` and `sleep()` even though a robot does not need those behaviors.

This violates ISP.

---

## 5. How can we fix the above violation?

Split the large interface into smaller interfaces:

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

Now each class implements only the interfaces it needs.

---

## 6. Which class implements all three interfaces in our example?

`HumanWorker`

It implements:

- Workable
- Eatable
- Sleepable

---

## 7. Which interface does RobotWorker implement?

`RobotWorker` implements only:

`Workable`

Because it only needs the `work()` behavior.

---

## 8. Does RobotWorker need to implement eat()?

No.

Because `RobotWorker` does not implement `Eatable`.

---

## 9. What is the main idea behind ISP?

The main idea is:

**Prefer small, focused interfaces over large, general-purpose interfaces.**

---

## 10. Is ISP related to loose coupling?

Yes.

Smaller interfaces reduce unnecessary dependencies and therefore help create loosely coupled systems.

---

## 11. What is the difference between SRP and ISP?

### SRP

Focuses mainly on **classes** and their responsibilities.

A class should have one cohesive responsibility.

### ISP

Focuses on **interfaces** and their responsibilities.

A class should not be forced to depend on methods it doesn't need.

---

## 12. What is the difference between ISP and LSP?

### ISP

Prevents classes from being forced to implement unnecessary methods.

### LSP

Ensures that subclasses can safely replace their parent types without breaking expected behavior.

---

## 13. What is the I in SOLID?

`I` stands for:

**Interface Segregation Principle**

---

## 14. What does "segregation" mean in ISP?

Segregation means **splitting a large interface into smaller, focused interfaces**.

---

## 15. What is a good interface?

A good interface should contain methods that are closely related to one specific capability or responsibility.

---

# Quick Revision

Large interface
       ↓
Unnecessary methods
       ↓
High coupling
       ↓
Poor design

Instead:

Small interfaces
       ↓
Focused capabilities
       ↓
Less coupling
       ↓
Better design

---

# Interview One-Liner

**ISP means a class should not be forced to implement methods it does not need.**
