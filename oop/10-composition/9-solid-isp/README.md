# Interface Segregation Principle (ISP)

## Overview

The Interface Segregation Principle is the **I** in SOLID.

> A class should not be forced to depend on methods it does not need.

Instead of creating one large interface, we should create **small, focused interfaces** based on specific responsibilities.

---

## Bad Design

A large interface might look like this:

interface Worker {
    void work();
    void eat();
    void sleep();
}

The problem is that every class implementing `Worker` must implement all three methods.

For example, a human can:

- Work
- Eat
- Sleep

But a robot worker may only:

- Work

Forcing `RobotWorker` to implement `eat()` and `sleep()` violates ISP.

---

## Good Design

We split the large interface into smaller interfaces:

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

Now each class implements only the capabilities it actually needs.

### HumanWorker

Human workers can:

- Work
- Eat
- Sleep

Therefore:

class HumanWorker implements Workable, Eatable, Sleepable

### RobotWorker

Robot workers can:

- Work

Therefore:

class RobotWorker implements Workable

The robot is not forced to implement `eat()` or `sleep()`.

---

## Class Structure

Workable
   |
   +---- HumanWorker
   |
   +---- RobotWorker

Eatable
   |
   +---- HumanWorker

Sleepable
   |
   +---- HumanWorker

---

## Implementation

### Workable

interface Workable {
    void work();
}

### Eatable

interface Eatable {
    void eat();
}

### Sleepable

interface Sleepable {
    void sleep();
}

### HumanWorker

class HumanWorker implements Workable, Eatable, Sleepable {

    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

### RobotWorker

class RobotWorker implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}

---

## Main

HumanWorker human = new HumanWorker();
RobotWorker robot = new RobotWorker();

human.work();
human.eat();
human.sleep();

robot.work();

---

## Expected Output

Human is working.

Human is eating.

Human is sleeping.

Robot is working.

---

## Key Principle

Instead of:

Worker
    |
    +-- work()
    +-- eat()
    +-- sleep()

Use:

Workable
Eatable
Sleepable

This allows classes to choose only the capabilities they actually require.

---

## Why ISP Is Useful

ISP helps us:

- Reduce unnecessary dependencies
- Keep interfaces small and focused
- Avoid unused methods
- Reduce coupling
- Make code easier to maintain
- Make implementations easier to understand
- Improve flexibility of the design

---

## Real-World Example

Consider a payment system.

A bad interface might be:

interface Payment {
    void pay();
    void refund();
    void generateInvoice();
    void sendEmail();
}

Different classes may not need all these operations.

Instead, separate the responsibilities:

interface Payable {
    void pay();
}

interface Refundable {
    void refund();
}

interface InvoiceGeneratable {
    void generateInvoice();
}

interface EmailNotifiable {
    void sendEmail();
}

Classes can implement only the interfaces they require.

---

## ISP vs Large Interfaces

### Bad

One large interface with many unrelated methods.

### Good

Multiple small interfaces containing related methods.

---

## SOLID Progress

S - Single Responsibility Principle     ✓
O - Open/Closed Principle               ✓
L - Liskov Substitution Principle       ✓
I - Interface Segregation Principle    ✓
D - Dependency Inversion Principle      Pending

---

## Key Takeaway

**Don't force a class to implement behavior it doesn't need.**

Prefer:

Small interface → Focused responsibility → Less coupling
