/**
 * ------------------------------------------------------------
 * Program Name : FinalMethodDemo
 * Topic        : Final Method in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of the final method in Java.
 *
 * The Animal class contains a final method eat(), which provides
 * common behavior for all animals. Since the method is declared
 * final, it cannot be overridden by any subclass.
 *
 * The Dog class extends Animal by adding its own field and
 * behavior while inheriting the final eat() method.
 *
 * Concepts Covered:
 * - Inheritance
 * - final Method
 * - Constructor Chaining
 * - super Keyword
 * - Encapsulation
 * - Method Inheritance
 * - Getters
 * - Object-Oriented Programming (OOP)
 *
 * Expected Output:
 *
 * Animal constructor executed.
 * Dog constructor executed.
 *
 * ------- Animal Details -------
 * Name  : Bruno
 * Age   : 6
 * Breed : Labrador Retriever
 *
 * Animal is eating.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Represents a generic Animal.
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

        System.out.println("Animal constructor executed.\n");
    }

    /**
     * Returns the animal's name.
     *
     * @return animal name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the animal's age.
     *
     * @return animal age
     */
    public int getAge() {
        return age;
    }

    /**
     * Displays a common eating behavior.
     *
     * This method is declared final, so it cannot be
     * overridden by any subclass.
     */
    public final void eat() {
        System.out.println("Animal is eating.");
    }

    /**
     * Displays the animal details.
     */
    public void displayAnimalDetails() {

        System.out.println("------- Animal Details -------");
        System.out.println("Name  : " + getName());
        System.out.println("Age   : " + getAge());
    }
}

/**
 * Represents a Dog, which is a type of Animal.
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

        System.out.println("Dog constructor executed.\n");
    }

    /**
     * Returns the dog's breed.
     *
     * @return dog breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Displays complete dog details.
     *
     * The inherited final eat() method is also called.
     */
    public void displayDogDetails() {

        displayAnimalDetails();
        System.out.println("Breed : " + getBreed());
        System.out.println();

        eat();

        System.out.println();
    }

    /*
     * The following method is NOT allowed because eat()
     * is declared final in the Animal class.
     *
     * @Override
     * public void eat() {
     *     System.out.println("Dog is eating.");
     * }
     */
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * Demonstrates:
     * - final method
     * - inheritance
     * - constructor chaining
     * - encapsulation
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Dog d1 = new Dog("Bruno", 6, "Labrador Retriever");
        Dog d2 = new Dog("Rocky", 8, "German Shepherd");

        System.out.println("========== DOG 1 ==========\n");
        d1.displayDogDetails();

        System.out.println("========== DOG 2 ==========\n");
        d2.displayDogDetails();
    }
}
