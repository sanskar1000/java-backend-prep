/**
 * ============================================================
 * Project : Runtime Polymorphism Demo
 * File    : Main.java
 * Author  : Aradhya Thakur
 *
 * Description:
 * Demonstrates Runtime Polymorphism (Method Overriding)
 * in Java using inheritance.
 *
 * The Animal class defines a common method named sound().
 * Dog, Cat, and Cow override this method with their own
 * implementations. An Animal reference is used to refer
 * to different child objects, and the appropriate sound()
 * method is invoked at runtime.
 *
 * Concepts Covered:
 * ✔ Inheritance
 * ✔ Method Overriding
 * ✔ Runtime Polymorphism
 * ✔ Dynamic Method Dispatch
 * ✔ Upcasting
 * ============================================================
 */

/**
 * Represents a generic animal.
 *
 * This is the parent class that provides a common
 * behavior shared by all animals.
 */
class Animal {

    /**
     * Produces a generic animal sound.
     *
     * Child classes override this method to provide
     * their own implementation.
     */
    void sound() {
        System.out.println("Animal makes a sound.\n");
    }
}

/**
 * Represents a Dog.
 *
 * Dog inherits from Animal and overrides
 * the sound() method.
 */
class Dog extends Animal {

    /**
     * Produces the sound made by a dog.
     */
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

/**
 * Represents a Cat.
 *
 * Cat inherits from Animal and overrides
 * the sound() method.
 */
class Cat extends Animal {

    /**
     * Produces the sound made by a cat.
     */
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

/**
 * Represents a Cow.
 *
 * Cow inherits from Animal and overrides
 * the sound() method.
 */
class Cow extends Animal {

    /**
     * Produces the sound made by a cow.
     */
    @Override
    void sound() {
        System.out.println("Cow moos.");
    }
}

/**
 * ============================================================
 * Main class of the application.
 *
 * Demonstrates Runtime Polymorphism by assigning
 * different child objects (Dog, Cat, and Cow)
 * to the same Animal reference.
 *
 * At runtime, Java determines which overridden
 * sound() method should be executed based on
 * the actual object type.
 * ============================================================
 */
public class Main {

    /**
     * Program entry point.
     *
     * Creates different Animal objects using
     * upcasting and demonstrates dynamic
     * method dispatch.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Parent reference pointing to a Dog object.
        Animal animal = new Dog();
        animal.sound();

        // Parent reference pointing to a Cat object.
        animal = new Cat();
        animal.sound();

        // Parent reference pointing to a Cow object.
        animal = new Cow();
        animal.sound();
    }
}
