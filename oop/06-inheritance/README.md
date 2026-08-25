Inheritance in Java

Inheritance is one of the four fundamental pillars of Object-Oriented Programming (OOP).

Inheritance allows one class to acquire the properties and behaviors of another class.

It promotes:

* Code Reusability
* Extensibility
* Method Overriding
* Hierarchical Classification
* Maintainability

⸻

📌 What is Inheritance?

Inheritance is a mechanism in Java where a child class acquires accessible fields and methods from a parent class.

The parent class is also called:

* Superclass
* Base class
* Parent class

The child class is also called:

* Subclass
* Derived class
* Child class

Basic Syntax

class Parent {
    // fields and methods
}
class Child extends Parent {
    // additional fields and methods
}

The extends keyword is used to establish inheritance between classes.

⸻

Simple Example

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

Now the Dog object can use both:

Dog dog = new Dog();
dog.eat();
dog.bark();

Output

Animal is eating
Dog is barking

Here:

Animal → Parent Class
Dog    → Child Class

Dog inherits the accessible eat() method from Animal.

⸻

Why Do We Use Inheritance?

Inheritance is mainly used when there is a genuine IS-A relationship between two classes.

For example:

Dog IS-A Animal
Cat IS-A Animal
Car IS-A Vehicle
Manager IS-A Employee

Inheritance allows common functionality to be placed in a parent class instead of duplicating it across multiple child classes.

⸻

IS-A Relationship

The IS-A relationship is the key concept behind inheritance.

Example:

class Vehicle {
}
class Car extends Vehicle {
}

We can say:

Car IS-A Vehicle

Therefore:

Vehicle vehicle = new Car();

is valid.

⸻

HAS-A vs IS-A

Do not confuse inheritance with composition.

IS-A → Inheritance

Dog IS-A Animal
class Dog extends Animal {
}

HAS-A → Composition

Car HAS-A Engine
class Car {
    private Engine engine;
}

Quick Rule

IS-A  → Inheritance
HAS-A → Composition

⸻

Types of Inheritance in Java

Java supports inheritance through classes in the following forms:

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance

Java does not support multiple inheritance of classes.

⸻

1. Single Inheritance

One child class inherits from one parent class.

       Animal
          |
         Dog

Example

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

Here:

Animal → Parent
Dog    → Child

This is Single Inheritance.

⸻

2. Multilevel Inheritance

A class inherits from another class, which itself inherits from another class.

       Animal
          |
        Mammal
          |
         Dog

Example

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
class Mammal extends Animal {
    void breathe() {
        System.out.println("Breathing");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking");
    }
}

Now:

Dog dog = new Dog();
dog.eat();
dog.breathe();
dog.bark();

The Dog class can access inherited behavior from both Mammal and Animal, subject to Java’s access-control rules.

⸻

3. Hierarchical Inheritance

Multiple child classes inherit from the same parent class.

          Animal
         /      \
       Dog      Cat

Example

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}

Both Dog and Cat inherit from Animal.

⸻

Multiple Inheritance

Java does not support multiple inheritance of classes.

This is not allowed:

class A {
}
class B {
}
class C extends A, B {
}

This produces a compilation error.

Why?

One major problem is ambiguity.

Suppose:

        A
       / \
      B   C
       \ /
        D

If both B and C contain the same method, Java would have to determine which implementation D should inherit.

This is commonly called the Diamond Problem.

⸻

Multiple Inheritance Through Interfaces

Java allows a class to implement multiple interfaces.

interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}

A class can implement both:

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }
    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}

This provides a form of multiple inheritance of type/contracts without multiple inheritance of classes.

⸻

The extends Keyword

The extends keyword is used when one class inherits from another class.

class Dog extends Animal {
}

This means:

Dog
 ↓
inherits from
 ↓
Animal

A class can directly extend only one class.

class Dog extends Animal {
}

Valid.

class Dog extends Animal, Mammal {
}

Invalid.

⸻

Parent Class and Child Class

Consider:

class Employee {
    String name;
    void work() {
        System.out.println("Employee is working");
    }
}
class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing code");
    }
}

Here:

Employee → Parent Class
Developer → Child Class

The Developer class inherits the accessible members of Employee.

⸻

Access Modifiers and Inheritance

Inheritance does not mean that every field and method becomes directly accessible.

Access modifiers still apply.

Modifier	Accessible in Child Class?
public	Yes
protected	Yes
default/package-private	Yes, if same package
private	No direct access

Example:

class Parent {
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;
}

A child class cannot directly access:

d

because d is private.

However, it may access private state indirectly through appropriate methods such as getters.

⸻

The super Keyword

The super keyword refers to the immediate parent class.

It is commonly used to:

1. Access a parent field
2. Call a parent method
3. Call a parent constructor

⸻

1. Access Parent Field

class Parent {
    int value = 10;
}
class Child extends Parent {
    int value = 20;
    void display() {
        System.out.println(value);
        System.out.println(super.value);
    }
}

Output:

20
10

Here:

value       → Child field
super.value → Parent field

⸻

2. Call Parent Method

class Parent {
    void display() {
        System.out.println("Parent display");
    }
}
class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display");
        super.display();
    }
}

Output:

Child display
Parent display

super.display() explicitly calls the parent implementation.

⸻

3. Call Parent Constructor

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}
class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor");
    }
}

Output:

Parent constructor
Child constructor

If the parent constructor is accessible and no explicit constructor invocation is written, Java inserts an implicit super() call when applicable.

⸻

Constructor Execution in Inheritance

When creating a child object:

Child child = new Child();

the parent constructor executes before the child constructor.

Conceptually:

new Child()
     ↓
Parent Constructor
     ↓
Child Constructor

Example:

class Parent {
    Parent() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    Child() {
        System.out.println("Child");
    }
}

Output:

Parent
Child

⸻

Method Overriding with Inheritance

Inheritance enables method overriding.

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

Now:

Animal animal = new Dog();
animal.sound();

Output:

Dog barks

This demonstrates the connection between:

Inheritance
      +
Method Overriding
      ↓
Runtime Polymorphism

⸻

Inheritance + Polymorphism

Inheritance and polymorphism frequently work together.

Example:

class Animal {
    void sound() {
        System.out.println("Animal sound");
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

Output:

Dog barks
Cat meows

Inheritance establishes the relationship.

Polymorphism determines the runtime behavior.

⸻

Object Class

Every Java class ultimately inherits from Object, directly or indirectly.

For example:

class Animal {
}

is conceptually part of an inheritance chain:

Object
   ↓
Animal
   ↓
Dog

Therefore, methods defined in Object, such as toString(), equals(), and hashCode(), are available to Java objects subject to normal overriding/access rules.

⸻

Benefits of Inheritance

Inheritance can provide:

1. Code Reusability

Common functionality can be placed in the parent class.

2. Extensibility

Child classes can add specialized behavior.

3. Method Overriding

Child classes can provide specialized implementations.

4. Polymorphism

Parent references can refer to child objects.

5. Maintainability

Common behavior can be centralized where inheritance is genuinely appropriate.

⸻

Disadvantages of Inheritance

Inheritance should not be used simply to avoid writing duplicate code.

Potential disadvantages include:

* Tight coupling between parent and child
* Fragile base-class dependencies
* Deep inheritance hierarchies becoming difficult to understand
* Changes in the parent potentially affecting many subclasses
* Inheritance being less flexible than composition for some designs

Important Principle

Prefer composition over inheritance when there is no genuine IS-A relationship.

⸻

Inheritance vs Composition

Feature	Inheritance	Composition
Relationship	IS-A	HAS-A
Keyword	extends	Field/reference
Coupling	Generally tighter	Generally looser
Reuse	Through inheritance	Through object delegation
Flexibility	Can be restrictive	Usually more flexible
Example	Dog extends Animal	Car has Engine

⸻

Common Mistakes

❌ Mistake 1: Confusing IS-A and HAS-A

Incorrect:

Car IS-A Engine

Correct:

Car HAS-A Engine

Use composition.

⸻

❌ Mistake 2: Assuming Private Members Are Directly Inherited

class Parent {
    private int age;
}

A child class cannot directly access:

age

because it is private.

⸻

❌ Mistake 3: Thinking Constructors Are Inherited

Constructors are not inherited.

A child class has its own constructors.

However, the child constructor can invoke a parent constructor using:

super();

⸻

❌ Mistake 4: Using Inheritance Everywhere

Inheritance should represent a meaningful subtype relationship.

Do not use:

extends

just because you want to reuse a few methods.

Consider composition when the relationship is HAS-A.

⸻

Important Rules of Inheritance

1. Java classes use extends for class inheritance.
2. A class can directly extend only one class.
3. A class can implement multiple interfaces.
4. Constructors are not inherited.
5. Private members cannot be directly accessed by subclasses.
6. final classes cannot be extended.
7. final methods cannot be overridden.
8. Static methods are hidden, not overridden.
9. Every class ultimately derives from Object.
10. Inheritance represents an IS-A relationship.
11. super refers to the immediate parent class.
12. Parent constructors execute before child constructors.
13. Inheritance can enable runtime polymorphism through method overriding.

⸻

final Class

A class declared with final cannot be inherited.

final class Vehicle {
}

This is invalid:

class Car extends Vehicle {
}

because Vehicle is final.

⸻

final Method

A final method cannot be overridden.

class Parent {
    final void display() {
        System.out.println("Parent");
    }
}

This is invalid:

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child");
    }
}

⸻

Real-World Example

Consider an employee management system.

                    Employee
                       |
          -------------------------
          |           |           |
      Developer     Manager     Designer

Common properties:

employeeId
name
salary

Common behavior:

work()
displayDetails()

Specialized behavior:

Developer → writeCode()
Manager   → manageTeam()
Designer  → designUI()

This is a natural inheritance hierarchy because:

Developer IS-A Employee
Manager   IS-A Employee
Designer  IS-A Employee

⸻

Example: Employee Hierarchy

class Employee {
    protected String name;
    protected double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void work() {
        System.out.println(name + " is working.");
    }
}
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    void writeCode() {
        System.out.println(name + " is writing Java code.");
    }
}
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
    void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}

Usage:

Developer developer = new Developer("Arjun", 60000);
developer.work();
developer.writeCode();

Output:

Arjun is working.
Arjun is writing Java code.

⸻

Key Mental Model

Remember inheritance as:

              Parent
                 |
          inherited behavior
                 |
               Child
                 |
          specialized behavior

Example:

             Animal
                |
          ----------------
          |              |
         Dog            Cat
          |              |
        bark()         meow()

Common behavior:

eat()
sleep()

Specialized behavior:

Dog  → bark()
Cat  → meow()

⸻

Inheritance Flow

Parent Class
     ↓
Common Fields
     ↓
Common Methods
     ↓
Child Class
     ↓
Inherited Functionality
     +
Additional Functionality
     +
Overridden Functionality

⸻

Interview Questions

1. What is inheritance?
2. Why is inheritance used in Java?
3. What is the extends keyword?
4. What is an IS-A relationship?
5. What are the types of inheritance supported by Java?
6. Does Java support multiple inheritance through classes?
7. Why doesn’t Java support multiple inheritance of classes?
8. What is the diamond problem?
9. What is the difference between inheritance and composition?
10. What is the super keyword?
11. Can constructors be inherited?
12. Can private members be inherited?
13. Can a final class be inherited?
14. Can a final method be overridden?
15. What happens when a child object is created?
16. What is multilevel inheritance?
17. What is hierarchical inheritance?
18. How does inheritance support polymorphism?
19. What is the relationship between inheritance and method overriding?
20. What is the ultimate parent class of every Java class?

⸻

🎯 Practice Tasks

Beginner

Create:

Animal
  ↓
Dog

Add:

Animal → eat()
Dog    → bark()

Create a Dog object and call both methods.

⸻

Intermediate

Create:

Vehicle
   ↓
Car

Vehicle should contain:

start()
stop()

Car should contain:

drive()

Demonstrate inherited and specialized behavior.

⸻

Advanced

Create an employee hierarchy:

             Employee
             /       \
      Developer      Manager

Employee

Fields:

employeeId
name
salary

Methods:

work()
displayDetails()

Developer

Method:

writeCode()

Manager

Method:

manageTeam()

Then demonstrate:

* Constructor chaining
* super
* Method overriding
* Upcasting
* Runtime polymorphism

⸻

🔥 Challenge

Create this hierarchy:

                    Shape
                  /       \
              Circle    Rectangle

The Shape class should contain:

void display();

Each subclass should override:

display()

Then use:

Shape shape = new Circle();
shape.display();
shape = new Rectangle();
shape.display();

Observe how inheritance + method overriding + polymorphism work together.

⸻

🔑 Final Takeaway

Inheritance allows a child class to reuse and specialize functionality from a parent class.

The most important concepts to remember are:

Inheritance
    ↓
extends
    ↓
IS-A relationship
    ↓
Code Reuse + Specialization
    ↓
Method Overriding
    ↓
Runtime Polymorphism

Remember:

IS-A  → Inheritance
HAS-A → Composition
class Dog extends Animal {
}

means:

Dog IS-A Animal

Inheritance is powerful, but it should be used when the subclass genuinely represents a specialized form of the parent class.

Inheritance models an IS-A relationship where a subclass specializes a superclass while reusing its accessible behavior.
