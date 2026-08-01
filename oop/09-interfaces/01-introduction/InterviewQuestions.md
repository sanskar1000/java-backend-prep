Interview Questions — Java Interfaces

Basic Questions

1. What is an interface?

An interface is a blueprint that defines a contract for classes. It specifies what a class must do without providing the implementation (except for default and static methods introduced in later Java versions).

⸻

2. Why do we use interfaces?

Interfaces allow unrelated classes to share the same behavior while keeping the implementation separate. They also support runtime polymorphism and loose coupling.

⸻

3. Which keyword is used to implement an interface?

implements

⸻

4. Can we create an object of an interface?

No.

Interfaces cannot be instantiated because they do not represent complete objects.

⸻

5. Can an interface have constructors?

No.

Interfaces cannot have constructors because objects of interfaces cannot be created.

⸻

6. Are interface methods public by default?

Yes.

Every interface method is automatically public.

⸻

7. Are interface methods abstract by default?

Yes.

Every interface method is automatically abstract (unless declared as default, static, or private in newer Java versions).

⸻

8. Are interface variables final?

Yes.

Every interface variable is automatically public static final.

⸻

9. Are interface variables static?

Yes.

Interface variables belong to the interface itself rather than to objects.

⸻

10. What is the difference between extends and implements?

extends	implements
Used for class inheritance or interface inheritance	Used when a class implements an interface
Represents an IS-A relationship	Represents a CAN-DO relationship

⸻

11. What is an interface reference?

An interface reference is a variable whose type is an interface but which refers to an object of a class implementing that interface.

Example:

Flyable f = new Bird("Eagle", 2.3);

⸻

12. What is the compile-time type in the following statement?

Flyable f = new Bird("Eagle", 2.3);

Answer: Flyable

⸻

13. What is the runtime type?

Answer: Bird

⸻

14. Which method executes when f.fly() is called?

The overridden fly() method of the runtime object (Bird) executes.

⸻

15. Why is this an example of runtime polymorphism?

Because the method that executes is determined by the actual object created at runtime rather than by the reference type.

⸻

16. Why can’t we write the following?

Flyable f = new Bird("Eagle", 2.3);
f.displayBirdDetails();

Because displayBirdDetails() is not declared in the Flyable interface. An interface reference can access only the methods declared in the interface.

⸻

17. What are the advantages of interfaces?

* Achieve abstraction
* Support runtime polymorphism
* Promote loose coupling
* Allow multiple interface implementation
* Improve code reusability
* Make applications easier to maintain and extend

⸻

18. Difference between an Abstract Class and an Interface

Abstract Class	Interface
Uses extends	Uses implements
Can have constructors	Cannot have constructors
Can have instance variables	Can have only constants (public static final)
Can have both concrete and abstract methods	Methods are abstract by default
Supports shared state	Defines behavior without object state

⸻

19. Can one interface be implemented by multiple classes?

Yes.

Many different classes can implement the same interface while providing different implementations of its methods.

⸻

20. Can one class implement multiple interfaces?

Yes.

A Java class can implement multiple interfaces.

Example:

class Robot implements Flyable, Runnable {
    // implementation
}

This is one of the biggest advantages of interfaces in Java.
