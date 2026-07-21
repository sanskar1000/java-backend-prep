/**
 * =============================================================
 * Program Name : AnimalDemo
 * Author       : Aradhya Thakur
 * Language     : Java
 * Topic        : Inheritance & Method Overriding
 *
 * Description:
 * Demonstrates inheritance in Java using an Animal
 * superclass and a Dog subclass.
 *
 * The Dog class extends the Animal class by:
 * - Reusing common properties through inheritance
 * - Calling the parent constructor using super()
 * - Overriding the makeSound() method
 * - Displaying both parent and child class details
 *
 * Concepts Covered:
 * - Inheritance
 * - Constructor Chaining
 * - Method Overriding
 * - super Keyword
 * - Encapsulation
 * - Input Validation
 * - Getters
 *
 * Execution Order:
 * 1. Animal constructor executes.
 * 2. Dog constructor executes.
 * 3. Dog details are displayed.
 * 4. Overridden makeSound() method executes.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * =============================================================
 */

/**
 * Represents a generic animal.
 */
class Animal {

    /** Name of the animal. */
    private String name;

    /** Age of the animal. */
    private int age;

    /**
     * Constructs an Animal object.
     *
     * @param name Name of the animal
     * @param age  Age of the animal
     */
    Animal(String name, int age) {

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid name. Default value assigned.");
        }

        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
            System.out.println("Invalid age. Default value assigned.");
        }

        System.out.println("Animal constructor executed for " + this.name + ".\n");
    }

    /**
     * Returns the animal name.
     *
     * @return animal name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the animal age.
     *
     * @return animal age
     */
    public int getAge() {
        return age;
    }

    /**
     * Displays the generic sound made by animals.
     */
    public void makeSound() {

        System.out.println("Some generic animal sound");
    }

    /**
     * Displays animal details.
     */
    public void displayAnimalDetails() {

        System.out.println("----- Animal Details -----");
        System.out.println("Name : " + getName());
        System.out.println("Age  : " + getAge());
        System.out.println();
    }
}

/**
 * Represents a Dog.
 *
 * Dog inherits common properties from Animal
 * and overrides the makeSound() method.
 */
class Dog extends Animal {

    /** Breed of the dog. */
    private String breed;

    /**
     * Constructs a Dog object.
     *
     * @param name  Dog name
     * @param age   Dog age
     * @param breed Dog breed
     */
    Dog(String name, int age, String breed) {

        super(name, age);

        if (breed != null && !breed.isBlank()) {
            this.breed = breed;
        } else {
            this.breed = "Unknown";
            System.out.println("Invalid breed. Default value assigned.");
        }

        System.out.println("Dog constructor executed for " + getName() + ".\n");
    }

    /**
     * Returns the dog's breed.
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Displays the sound produced by a dog.
     *
     * Overrides the parent implementation and extends
     * its behavior by invoking super.makeSound().
     */
    @Override
    public void makeSound() {

        super.makeSound();
        System.out.println("Dog says: Bark Bark!");
    }

    /**
     * Displays complete dog information.
     */
    public void displayDogDetails() {

        displayAnimalDetails();
        System.out.println("Breed : " + getBreed());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Dog d1 = new Dog(
                "Bruno",
                4,
                "French Bulldog"
        );

        Dog d2 = new Dog(
                "Rocky",
                6,
                "Golden Retriever"
        );

        System.out.println("========== DOG 1 ==========\n");

        d1.displayDogDetails();
        d1.makeSound();

        System.out.println();

        System.out.println("========== DOG 2 ==========\n");

        d2.displayDogDetails();
        d2.makeSound();
    }
}
