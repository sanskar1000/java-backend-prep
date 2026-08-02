/**
 * ============================================================
 * Project: Duck Interface Demonstration
 * File: Main.java
 * Author: Aradhya Singh Thakur
 *
 * Description:
 * Demonstrates multiple interface implementation in Java.
 *
 * Concepts Covered:
 * - Interface
 * - Multiple Interface Implementation
 * - Encapsulation
 * - Constructor Validation
 * - Method Overriding
 * - Runtime Polymorphism
 *
 * A Duck implements both Flyable and Swimmable interfaces.
 * ============================================================
 */

/**
 * Represents the ability to fly.
 */
interface Flyable {

    /**
     * Performs flying behavior.
     */
    void fly();
}

/**
 * Represents the ability to swim.
 */
interface Swimmable {

    /**
     * Performs swimming behavior.
     */
    void swim();
}

/**
 * Represents a Duck that can both fly and swim.
 */
class Duck implements Flyable, Swimmable {

    /** Name of the duck. */
    private String name;

    /** Color of the duck. */
    private String color;

    /** Weight of the duck in kilograms. */
    private double weight;

    /**
     * Constructs a Duck object.
     *
     * @param name   Name of the duck
     * @param color  Color of the duck
     * @param weight Weight of the duck
     */
    public Duck(String name, String color, double weight) {

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid name. Default value assigned.\n");
        }

        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "Unknown";
            System.out.println("Invalid color. Default value assigned.\n");
        }

        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0.0;
            System.out.println("Invalid weight. Default value assigned.\n");
        }

        System.out.println("Duck constructor executed.\n");
    }

    /**
     * Returns the duck's name.
     *
     * @return duck name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the duck's color.
     *
     * @return duck color
     */
    public String getColor() {
        return color;
    }

    /**
     * Returns the duck's weight.
     *
     * @return duck weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Displays flying behavior.
     */
    @Override
    public void fly() {
        System.out.println(getName() + " is flying.\n");
    }

    /**
     * Displays swimming behavior.
     */
    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.\n");
    }

    /**
     * Displays complete information about the duck.
     */
    public void displayDuckDetails() {

        System.out.println("------- Duck Details -------");

        System.out.println("Name   : " + getName());
        System.out.println("Color  : " + getColor());
        System.out.printf("Weight : %.2f kg%n", getWeight());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Creates a Duck object and demonstrates
     * multiple interface implementation using
     * Flyable and Swimmable references.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Duck duck = new Duck("Donald", "White", 3.2);

        // Runtime polymorphism using interface references
        Flyable flyable = duck;
        Swimmable swimmable = duck;

        duck.displayDuckDetails();

        flyable.fly();

        swimmable.swim();
    }
}
