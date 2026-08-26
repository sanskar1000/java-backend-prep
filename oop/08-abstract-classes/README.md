Abstract Class in Java

An abstract class is a class that is declared using the abstract keyword.

It is used to provide a common base class for related classes while allowing subclasses to provide their own implementations of specific behavior.

An abstract class can contain:

* Abstract methods
* Concrete methods
* Fields
* Constructors
* Static methods
* Final methods
* Instance methods

⸻

📌 What is an Abstract Class?

An abstract class is a class that is incomplete by design.

It can define what subclasses should do without necessarily defining how they should do it.

Basic Syntax

abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Animal is eating");
    }
}

Here:

Animal
  ↓
Abstract Class
  ↓
Contains abstract + concrete methods

⸻

Why Do We Need Abstract Classes?

Suppose we have different types of animals.

Every animal can eat, but different animals make different sounds.

Instead of providing one generic implementation of sound(), we can force every concrete subclass to define its own sound.

             Animal
          /          \
        Dog          Cat
         ↓            ↓
      bark()        meow()

The parent class defines the common structure.

The child classes provide the specific implementation.

⸻

Abstract Class Syntax

abstract class Parent {
    abstract void abstractMethod();
    void concreteMethod() {
        System.out.println("Concrete method");
    }
}

A child class must implement all inherited abstract methods unless the child class is also declared abstract.

⸻

Abstract Method

An abstract method is a method declared without a body.

Syntax

abstract void sound();

There is no method body:

abstract void sound();

Not:

abstract void sound() {
    // body
}

An abstract method tells subclasses:

“You must provide an implementation for this behavior.”

⸻

Example of Abstract Class

abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Animal is eating");
    }
}

Now create a subclass:

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

Usage:

Dog dog = new Dog();
dog.sound();
dog.eat();

Output:

Dog barks
Animal is eating

⸻

Abstract Class Can Have Concrete Methods

An abstract class does not have to contain only abstract methods.

It can contain normal methods with implementations.

abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Eating");
    }
    void sleep() {
        System.out.println("Sleeping");
    }
}

A subclass can use the concrete methods directly:

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barking");
    }
}
Dog dog = new Dog();
dog.sound();
dog.eat();
dog.sleep();

⸻

Abstract Class Can Have Fields

An abstract class can contain instance variables.

abstract class Employee {
    String name;
    double salary;
    abstract void work();
}

A child class can use the inherited fields:

class Developer extends Employee {
    @Override
    void work() {
        System.out.println(name + " is writing code");
    }
}

⸻

Abstract Class Can Have Constructors

An abstract class can have constructors.

However, you cannot directly create an object of the abstract class.

The constructor is called when a concrete subclass object is created.

Example:

abstract class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
    abstract void sound();
}
class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

Now:

Dog dog = new Dog();

Output:

Animal constructor
Dog constructor

⸻

❌ Cannot Create an Object of an Abstract Class

This is invalid:

Animal animal = new Animal();

It results in a compilation error because Animal is abstract.

Why?

An abstract class represents an incomplete/general concept.

For example:

Animal

is a general category.

A concrete animal such as:

Dog
Cat
Horse

can provide the specific implementation.

⸻

✅ Abstract Class Reference Is Allowed

Although we cannot create an object of an abstract class, we can create a reference of its type.

Animal animal = new Dog();

This is valid.

Here:

Animal → Reference Type
Dog    → Object Type

This is also an example of runtime polymorphism.

⸻

Abstract Class + Polymorphism

Abstract classes are commonly used with runtime polymorphism.

abstract class Animal {
    abstract void sound();
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

Output:

Dog barks
Cat meows

The reference remains:

Animal

but the actual implementation changes based on the object.

⸻

Abstract Class and Method Overriding

If an abstract class contains an abstract method:

abstract class Animal {
    abstract void sound();
}

A concrete subclass must implement it:

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

This creates the relationship:

Abstract Class
      ↓
Abstract Method
      ↓
Subclass
      ↓
Method Overriding

⸻

What Happens If a Child Does Not Implement the Abstract Method?

Suppose:

abstract class Animal {
    abstract void sound();
}

Then:

class Dog extends Animal {
}

This is invalid because Dog does not implement sound().

The compiler will require either:

Option 1 — Implement the method

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

Option 2 — Make the child class abstract

abstract class Dog extends Animal {
}

An abstract subclass can leave inherited abstract methods unimplemented.

⸻

Multiple Levels of Abstract Classes

Abstract classes can participate in inheritance hierarchies.

             Animal
          abstract class
               |
             Mammal
          abstract class
               |
              Dog
        concrete class

Example:

abstract class Animal {
    abstract void sound();
}
abstract class Mammal extends Animal {
    abstract void walk();
}
class Dog extends Mammal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    @Override
    void walk() {
        System.out.println("Dog walks");
    }
}

Dog must implement all inherited abstract methods because it is concrete.

⸻

Abstract Class with super

An abstract class can contain concrete methods that subclasses can invoke using super.

abstract class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    abstract void sound();
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void display() {
        super.eat();
        sound();
    }
}

⸻

Abstract Class Can Have Static Methods

An abstract class can contain static methods.

abstract class Utility {
    static void display() {
        System.out.println("Static method");
    }
}

It can be called using the class name:

Utility.display();

The fact that the class is abstract does not prevent static members from existing.

⸻

Abstract Class Can Have Final Methods

An abstract class can contain final methods.

abstract class Animal {
    final void breathe() {
        System.out.println("Animal breathes");
    }
    abstract void sound();
}

A subclass cannot override:

breathe()

because it is final.

⸻

Abstract Class Cannot Be Final

This is invalid:

final abstract class Animal {
}

Why?

Because:

abstract → designed to be extended
final    → cannot be extended

These two concepts conflict.

⸻

Abstract Method Rules

An abstract method:

* Has no method body.
* Must be declared using abstract.
* Must be implemented by a concrete subclass.
* Can exist only in an abstract class or interface.
* Cannot be private.
* Cannot be final.
* Cannot be static.

Example

abstract void sound();

⸻

Access Modifiers with Abstract Methods

Abstract methods can use access modifiers such as:

public
protected

or package-private access.

Example:

abstract class Animal {
    protected abstract void sound();
}

The overriding method cannot reduce visibility.

⸻

Abstract Class vs Concrete Class

Feature	Abstract Class	Concrete Class
Can contain abstract methods	Yes	No
Can contain concrete methods	Yes	Yes
Can have constructors	Yes	Yes
Can have fields	Yes	Yes
Can create object directly	No	Yes
Can have static methods	Yes	Yes
Can have final methods	Yes	Yes
Can be extended	Yes	Yes

⸻

Abstract Class vs Interface

Both abstract classes and interfaces support abstraction, but they are designed for different purposes.

Feature	Abstract Class	Interface
Keyword	abstract class	interface
Inheritance	extends	implements
Multiple inheritance	One class	Multiple interfaces
Instance fields	Yes	No ordinary instance fields
Constructors	Yes	No
Abstract methods	Yes	Yes
Concrete methods	Yes	Yes, including default/static methods
Instance state	Yes	Not as ordinary instance fields
Main purpose	Shared base + abstraction	Contract/capability

⸻

When Should You Use an Abstract Class?

Use an abstract class when related classes share:

* Common state
* Common behavior
* Common implementation
* A common base identity
* Some behavior that should be mandatory for subclasses

Example

              Employee
          abstract class
             /       \
            /         \
      Developer      Manager

All employees may have:

name
salary
employeeId

and:

displayDetails()

But their work may differ:

Developer → writeCode()
Manager   → manageTeam()

An abstract class is a natural fit.

⸻

Real-World Example

Consider a payment system.

                 Payment
             abstract class
                /      \
               /        \
            UPI        CreditCard

The parent can contain common data:

abstract class Payment {
    protected double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    void printAmount() {
        System.out.println("Amount: " + amount);
    }
    abstract void pay();
}

UPI:

class UPIPayment extends Payment {
    UPIPayment(double amount) {
        super(amount);
    }
    @Override
    void pay() {
        System.out.println("Processing UPI payment");
    }
}

Credit Card:

class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }
    @Override
    void pay() {
        System.out.println("Processing Credit Card payment");
    }
}

Usage:

Payment payment = new UPIPayment(1000);
payment.printAmount();
payment.pay();

Output:

Amount: 1000.0
Processing UPI payment

The parent provides the common functionality while the child provides specialized behavior.

⸻

Abstraction vs Encapsulation

These concepts are related but different.

Encapsulation

Focuses on:

How data is protected and controlled.

Common tools:

private fields
getters
setters
methods

Abstraction

Focuses on:

What should be exposed while hiding unnecessary implementation details.

Common tools:

abstract classes
interfaces

Easy Way to Remember

Encapsulation → Protect data
Abstraction   → Hide implementation complexity

⸻

Abstract Class Mental Model

Think of an abstract class as a partially completed blueprint.

             Abstract Class
                   |
       -------------------------
       |                       |
   Common Code            Abstract Rules
       |                       |
   shared methods          must implement
       |                       |
       -----------+------------
                  |
              Subclass
                  |
         Complete implementation

Example:

abstract class Animal {
    void eat() {
        System.out.println("Eating");
    }
    abstract void sound();
}

The parent says:

Every Animal can eat.
Every Animal must define its sound.

Then:

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

Dog completes the missing behavior.

⸻

Common Mistakes

❌ Mistake 1: Creating an Abstract Class Object

Animal animal = new Animal();

Invalid.

⸻

❌ Mistake 2: Giving an Abstract Method a Body

abstract void sound() {
    System.out.println("Sound");
}

Invalid.

An abstract method has no body.

⸻

❌ Mistake 3: Forgetting to Implement Abstract Methods

abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
}

Invalid if Dog is concrete.

⸻

❌ Mistake 4: Making an Abstract Method final

abstract final void sound();

Invalid because:

abstract → must be overridden
final    → cannot be overridden

⸻

❌ Mistake 5: Making an Abstract Method private

private abstract void sound();

Invalid because a private method cannot be overridden by subclasses.

⸻

Important Rules

1. An abstract class is declared using abstract.
2. An abstract class cannot be instantiated directly.
3. An abstract class can contain abstract and concrete methods.
4. An abstract class can have constructors.
5. An abstract class can have fields.
6. An abstract class can have static methods.
7. An abstract class can have final methods.
8. A concrete subclass must implement all inherited abstract methods.
9. An abstract subclass may leave abstract methods unimplemented.
10. An abstract class cannot be final.
11. An abstract method cannot be private.
12. An abstract method cannot be final.
13. An abstract method cannot be static.
14. Abstract classes can be used as reference types.
15. Abstract classes work naturally with runtime polymorphism.

⸻

Key Mental Model

Remember:

ABSTRACT CLASS
      ↓
Common State
      +
Common Behavior
      +
Abstract Behavior
      ↓
Concrete Subclass
      ↓
Complete Implementation

Example:

abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barking");
    }
}

Think:

Animal
  ↓
"What is common?"
  ↓
eat()
"What must every subclass provide?"
  ↓
sound()
Dog
  ↓
Provides sound()

⸻

🔥 Abstract Class + Inheritance + Polymorphism

These three concepts often work together.

        Abstract Class
             Animal
                |
             extends
                ↓
              Dog
                |
         overrides sound()
                ↓
       Runtime Polymorphism

Code:

abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
Animal animal = new Dog();
animal.sound();

Output:

Dog barks

Here:

Abstract Class  → defines the contract
Inheritance     → connects Dog with Animal
Overriding      → provides Dog's implementation
Polymorphism    → Animal reference points to Dog

⸻

🎯 Practice Tasks

Beginner

Create:

Animal
   ↓
Dog

Animal should have:

abstract void sound();

Dog should implement:

sound()

⸻

Intermediate

Create:

Shape
 /   \
Circle Rectangle

Make Shape abstract.

Add:

abstract double area();

Implement area() in both subclasses.

⸻

Advanced

Create:

                 Payment
              abstract class
                 /      \
                /        \
             UPI       CreditCard

The Payment class should contain:

amount
pay()
printReceipt()

Make pay() abstract.

Then implement different payment behavior in each subclass.

⸻

🔥 Challenge

Create an employee management system:

                 Employee
              abstract class
                /        \
               /          \
        Developer        Manager

Employee

Fields:

employeeId
name
salary

Methods:

abstract void work();
void displayDetails();

Developer

Implement:

work()

Output:

Developer is writing code.

Manager

Implement:

work()

Output:

Manager is managing the team.

Then test runtime polymorphism:

Employee employee;
employee = new Developer(...);
employee.work();
employee = new Manager(...);
employee.work();

⸻

🧠 Interview Questions

1. What is an abstract class?
2. Why do we use abstract classes?
3. Can we create an object of an abstract class?
4. Can an abstract class have constructors?
5. Can an abstract class have concrete methods?
6. Can an abstract class have fields?
7. Can an abstract class have static methods?
8. Can an abstract class have final methods?
9. Can an abstract class be final?
10. What is an abstract method?
11. Can an abstract method have a body?
12. Can an abstract method be private?
13. Can an abstract method be final?
14. Can an abstract method be static?
15. What happens if a subclass does not implement an abstract method?
16. Can an abstract class extend another abstract class?
17. Can an abstract class implement an interface?
18. What is the difference between an abstract class and an interface?
19. How does an abstract class support runtime polymorphism?
20. What is the difference between abstraction and encapsulation?

⸻

🔑 Final Takeaway

An abstract class is a partially implemented base class that defines common state and behavior while forcing concrete subclasses to provide specific implementations where required.

Remember:

Abstract Class
      ↓
Cannot be instantiated
      ↓
Can contain abstract + concrete methods
      ↓
Extended by subclasses
      ↓
Concrete subclass implements abstract methods

The most important relationship is:

Abstraction
    +
Inheritance
    +
Method Overriding
    ↓
Runtime Polymorphism

One-line definition:

An abstract class is a class that provides a common base for subclasses and can define abstract methods that concrete subclasses must implement.
