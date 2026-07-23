/**
 * ------------------------------------------------------------
 * Program Name : AnimalSoundDemo
 * Topic        : Method Overriding (Runtime Polymorphism)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates Method Overriding in Java using
 * Runtime Polymorphism.
 *
 * The parent class (Animal) provides a common method
 * makeSound(). Child classes (Lion and Elephant) override
 * this method to provide their own implementations.
 *
 * Parent class references are used to store child class
 * objects, allowing the JVM to invoke the correct overridden
 * method at runtime.
 *
 * Concepts Covered:
 * - Inheritance
 * - Method Overriding
 * - Runtime Polymorphism
 * - Dynamic Method Dispatch
 * - @Override Annotation
 *
 * Expected Output:
 *
 * Lion Roars.
 *
 * Elephant Trumpets.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Parent class representing a generic animal.
 */
class Animal {

    /**
     * Produces a generic animal sound.
     */
    void makeSound() {
        System.out.println("Animal sound.");
    }
}

/**
 * Child class representing a Lion.
 */
class Lion extends Animal {

    /**
     * Produces the sound of a lion.
     */
    @Override
    public void makeSound() {
        System.out.println("Lion Roars.");
    }
}

/**
 * Child class representing an Elephant.
 */
class Elephant extends Animal {

    /**
     * Produces the sound of an elephant.
     */
    @Override
    public void makeSound() {
        System.out.println("Elephant Trumpets.");
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * Demonstrates runtime polymorphism by storing
     * Lion and Elephant objects in Animal references.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Parent reference pointing to Lion object
        Animal a1 = new Lion();

        // Parent reference pointing to Elephant object
        Animal a2 = new Elephant();

        System.out.println("========== Animal Sound Simulator ==========\n");

        a1.makeSound();

        System.out.println();

        a2.makeSound();
    }
}
