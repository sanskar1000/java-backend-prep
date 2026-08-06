/**
 * ============================================================
 * Project : Runtime Polymorphism Demo
 * File    : Main.java
 * Author  : Aradhya Thakur
 *
 * Description:
 * Demonstrates Runtime Polymorphism in Java
 * using Method Overriding.
 *
 * The Animal class defines a common method,
 * while the Dog class overrides it with
 * its own implementation.
 *
 * Concepts Covered:
 * ✔ Inheritance
 * ✔ Method Overriding
 * ✔ Runtime Polymorphism
 * ✔ Dynamic Method Dispatch
 * ============================================================
 */
public class Main {

    /**
     * Entry point of the application.
     *
     * Creates a Dog object, initializes its
     * fields, and demonstrates inherited and
     * overridden methods.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Creating a Dog object.
        Dog dog = new Dog();

        // Initializing inherited field.
        dog.name = "Tommy";

        // Initializing child class field.
        dog.breed = "Labrador";

        // Display inherited property.
        dog.displayName();

        // Display child-specific property.
        dog.displayBreed();

        // Calls the overridden method.
        dog.sound();
    }
}
