Polymorphism in Java

Polymorphism is one of the four fundamental pillars of Object-Oriented Programming (OOP).

The word Polymorphism means “many forms.”

In Java, polymorphism allows the same reference, method, or interface to behave differently depending on the object or implementation involved.

⸻

📌 What is Polymorphism?

Polymorphism allows us to write code that works with a general type while the actual behavior is determined by the specific object.

Simple Example

Animal animal = new Dog();
animal.sound();

Although the reference type is Animal, the actual object is Dog.

Therefore, the Dog implementation of sound() is executed.

This is called Runtime Polymorphism.

⸻

Types of Polymorphism in Java

Java primarily supports two types of polymorphism:

Type	Also Known As	Resolved At
Compile-Time Polymorphism	Method Overloading	Compile Time
Runtime Polymorphism	Method Overriding	Runtime

⸻

1. Compile-Time Polymorphism

Compile-time polymorphism is achieved through method overloading.

Multiple methods can have the same name but different parameter lists.

Example

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

Java determines which add() method to call during compilation based on:

* Number of arguments
* Type of arguments
* Order of arguments

Example Usage

Calculator calculator = new Calculator();
System.out.println(calculator.add(10, 20));
System.out.println(calculator.add(10, 20, 30));
System.out.println(calculator.add(10.5, 20.5));

Key Point

Method Overloading → Compile Time

⸻

2. Runtime Polymorphism

Runtime polymorphism is achieved through method overriding.

A subclass provides its own implementation of a method that is already defined in the parent class.

Example

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

Now:

Animal animal;
animal = new Dog();
animal.sound();
animal = new Cat();
animal.sound();

Output

Dog barks
Cat meows

The same reference type:

Animal

produces different behavior depending on the actual object.

This is Runtime Polymorphism.

⸻

Upcasting

Runtime polymorphism commonly uses upcasting.

Animal animal = new Dog();

Here:

* Animal → reference type
* Dog → object type

The reference is of the parent type, but the object is of the child type.

This allows us to write flexible and loosely coupled code.

⸻

Dynamic Method Dispatch

Dynamic Method Dispatch is the mechanism by which Java determines which overridden method should execute at runtime.

Example:

Animal animal = new Dog();
animal.sound();

At compile time:

animal → Animal reference

At runtime:

actual object → Dog
             ↓
        Dog.sound()

Therefore:

Reference Type → determines what can be accessed
Object Type    → determines overridden method behavior

⸻

Important Rule

Consider:

Animal animal = new Dog();

If Animal contains:

void sound()

and Dog overrides it:

@Override
void sound()

then:

animal.sound();

calls:

Dog.sound()

because the actual object is Dog.

⸻

Reference Type vs Object Type

This is one of the most important concepts in runtime polymorphism.

Animal animal = new Dog();

Concept	Value
Reference Type	Animal
Object Type	Dog
Overridden Method	Dog implementation
Method Selection	Runtime

⸻

Polymorphism with Interfaces

Polymorphism is heavily used with interfaces.

interface Payment {
    void pay();
}

Different implementations:

class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}
class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}

Now:

Payment payment;
payment = new CreditCardPayment();
payment.pay();
payment = new UPIPayment();
payment.pay();

Output:

Payment using Credit Card
Payment using UPI

The client code depends on the abstraction:

Payment

rather than a specific implementation.

This is one of the major benefits of polymorphism.

⸻

Polymorphism in Real-World Design

Suppose an application supports multiple payment methods:

                Payment
                   |
        -----------------------
        |          |          |
      UPI       CreditCard   PayPal

All implementations follow the same contract:

interface Payment {
    void pay();
}

The application can simply do:

Payment payment = new UPIPayment();
payment.pay();

Later, we can change the implementation:

Payment payment = new CreditCardPayment();
payment.pay();

The calling code does not need to know the internal implementation.

⸻

Why Do We Use Polymorphism?

Polymorphism provides:

* Loose Coupling
* Flexibility
* Extensibility
* Maintainability
* Code Reusability
* Abstraction
* Easy substitution of implementations

It is especially important in large-scale applications where many implementations can follow the same abstraction.

⸻

Method Overloading vs Method Overriding

Feature	Overloading	Overriding
Polymorphism	Compile-Time	Runtime
Relationship	Usually same class	Parent-child
Method Name	Same	Same
Parameters	Must differ	Must be same
Return Type	May differ subject to Java rules	Same/covariant
Binding	Compile Time	Runtime
Inheritance Required?	No	Yes
Main Purpose	Multiple ways to call a method	Different implementation

⸻

Important Rules of Method Overriding

When overriding a method:

1. Method name must be the same.
2. Parameter list must be the same.
3. Return type must be the same or covariant.
4. Access level cannot be more restrictive.
5. final methods cannot be overridden.
6. static methods are hidden, not overridden.
7. private methods are not overridden.
8. Constructors cannot be overridden.
9. Use @Override to let the compiler verify your intention.

⸻

Common Mistake

❌ Wrong Understanding

Animal animal = new Dog();

Some beginners think:

“Because the reference is Animal, Animal’s method will always execute.”

That is incorrect for overridden instance methods.

✅ Correct Understanding

Animal animal = new Dog();
animal.sound();

If Dog overrides sound(), then:

Dog.sound()

executes at runtime.

⸻

Real-World Analogy

Think of a remote control.

The remote provides a common interface:

turnOn()

Different devices can implement it differently:

TV       → TV turns on
AC       → AC turns on
Speaker  → Speaker turns on

The command is the same:

turnOn()

but the behavior depends on the actual device.

That is the basic idea of polymorphism.

⸻

Polymorphism and Abstraction

Polymorphism works especially well with abstraction.

Instead of writing:

UPIPayment payment = new UPIPayment();

we can write:

Payment payment = new UPIPayment();

Now the client depends on:

Payment

rather than:

UPIPayment

This makes it easier to replace implementations.

⸻

Key Mental Model

Remember this:

POLYMORPHISM
     │
     ├── Compile-Time
     │       │
     │       └── Method Overloading
     │
     └── Runtime
             │
             └── Method Overriding
                     │
                     └── Dynamic Method Dispatch

And for runtime polymorphism:

Parent reference
       ↓
Child object
       ↓
Overridden method
       ↓
Child implementation executes

Example:

Animal animal = new Dog();
animal.sound();
Animal → Reference Type
Dog    → Object Type
sound  → Overridden Method
Dog    → Actual Implementation

⸻

Summary

Polymorphism means one interface/reference can represent multiple forms of behavior.

Remember:

Overloading  → Compile Time
Overriding   → Runtime
Animal animal = new Dog();

means:

Reference Type → Animal
Object Type    → Dog

For overridden instance methods:

Actual Object → decides the implementation at runtime

Polymorphism is one of the most important concepts for writing flexible, maintainable, extensible, and loosely coupled Java applications.

⸻

🧠 Interview Questions

1. What is polymorphism?
2. What are the types of polymorphism in Java?
3. What is compile-time polymorphism?
4. What is runtime polymorphism?
5. What is method overloading?
6. What is method overriding?
7. What is dynamic method dispatch?
8. What is upcasting?
9. What is the difference between reference type and object type?
10. Can static methods be overridden?
11. Can private methods be overridden?
12. Can final methods be overridden?
13. Can constructors be overridden?
14. Why is @Override used?
15. How does polymorphism support loose coupling?
16. How is polymorphism used with interfaces?

⸻

🎯 Practice Tasks

Beginner

* Create Animal, Dog, and Cat classes.
* Override sound() in each subclass.
* Demonstrate runtime polymorphism.

Intermediate

* Create a Shape hierarchy.
* Implement area() for Circle, Rectangle, and Triangle.
* Store them using Shape references.

Advanced

Create a payment system:

Payment
   ├── UPIPayment
   ├── CreditCardPayment
   └── CashPayment

Implement:

void pay(double amount);

Then process different payment types using only:

Payment

as the reference type.

⸻

🔑 Final Takeaway

Polymorphism allows us to program against an abstraction while allowing different implementations to provide different behavior.

Payment payment = new UPIPayment();
payment.pay(1000);

The code works with the abstraction:

Payment

while the actual behavior comes from:

UPIPayment

That’s the power of polymorphism in Java.
