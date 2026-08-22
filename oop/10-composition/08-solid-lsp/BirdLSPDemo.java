

/**
 * ------------------------------------------------------------
 * Program Name : BirdLSPDemo
 * Topic        : Liskov Substitution Principle (LSP)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the Liskov Substitution Principle.
 *
 * LSP states:
 *
 * "Objects of a superclass should be replaceable with objects
 * of its subclasses without affecting the correctness of
 * the program."
 *
 * In this example:
 *
 * Bird
 *   ├── Sparrow
 *   └── Penguin
 *
 * All birds can eat, so eat() belongs to Bird.
 *
 * Only birds that can fly implement Flyable.
 * Therefore, Sparrow implements Flyable, while Penguin does not.
 *
 * This avoids forcing Penguin to implement a fly() method
 * that it cannot actually perform.
 *
 * Concepts Used:
 * - Inheritance
 * - Interface
 * - Abstraction
 * - Polymorphism
 * - Method Overriding
 * - Liskov Substitution Principle
 * - Encapsulation
 * - Constructor Chaining
 *
 * ------------------------------------------------------------
 */


/**
 * Represents a general bird.
 *
 * Responsibility:
 * Store common bird information and behavior.
 */
class Bird {

    private String name;

    /**
     * Creates a Bird object.
     *
     * @param name bird name
     */
    public Bird(String name) {

        if (name != null && !name.isBlank()) {

            this.name = name;

        } else {

            this.name = "Unknown";

            System.out.println(
                    "Invalid name. Default value assigned."
            );
        }
    }

    /**
     * Returns the bird's name.
     *
     * @return bird name
     */
    public String getName() {
        return name;
    }

    /**
     * Represents the eating behavior common to birds.
     */
    public void eat() {

        System.out.println(
                name + " is eating."
        );
    }
}


/**
 * Represents birds that are capable of flying.
 */
interface Flyable {

    /**
     * Represents flying behavior.
     */
    void fly();
}


/**
 * Represents a Sparrow.
 *
 * A Sparrow is a Bird and can also fly.
 */
class Sparrow extends Bird implements Flyable {

    /**
     * Creates a Sparrow object.
     *
     * @param name sparrow name
     */
    public Sparrow(String name) {

        super(name);
    }

    /**
     * Implements flying behavior.
     */
    @Override
    public void fly() {

        System.out.println(
                getName() + " is flying."
        );
    }
}


/**
 * Represents a Penguin.
 *
 * A Penguin is a Bird but does not implement Flyable
 * because penguins cannot fly.
 */
class Penguin extends Bird {

    /**
     * Creates a Penguin object.
     *
     * @param name penguin name
     */
    public Penguin(String name) {

        super(name);
    }

    /**
     * Represents the swimming behavior of a penguin.
     */
    public void swim() {

        System.out.println(
                getName() + " is swimming."
        );
    }
}


/**
 * Demonstrates the Liskov Substitution Principle.
 */
public class BirdLSPDemo {

    public static void main(String[] args) {

        // Sparrow can be treated as a Bird.
        Bird sparrow =
                new Sparrow("Sparrow");

        // Penguin can also be treated as a Bird.
        Bird penguin =
                new Penguin("Penguin");

        // Common Bird behavior.
        sparrow.eat();
        penguin.eat();

        // Only flying birds are treated as Flyable.
        Flyable flyingBird =
                new Sparrow("Sparrow");

        flyingBird.fly();

        // Penguin-specific behavior.
        Penguin penguinBird =
                new Penguin("Penguin");

        penguinBird.swim();
    }
}
