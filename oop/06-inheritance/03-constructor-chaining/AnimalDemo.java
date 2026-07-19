/**
 * ============================================================
 * Program: Animal Inheritance Example
 * Author : Aradhya Thakur
 * Language: Java
 * Topic   : Inheritance
 *
 * Description:
 * Demonstrates single inheritance in Java using an Animal
 * superclass and a Dog subclass.
 *
 * Concepts Covered:
 * - Inheritance
 * - Constructors
 * - Constructor Chaining using super()
 * - Encapsulation
 * - Getters
 * - Input Validation
 * - Method Reuse
 * ============================================================
 */

/**
 * Represents a generic Animal.
 */
class Animal {

    /** Name of the animal. */
    private String name;

    /** Age of the animal in years. */
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
     * Displays animal information.
     */
    public void displayAnimalDetails() {

        System.out.println("------------ Animal Details ------------");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }
}

/**
 * Represents a Dog that extends Animal.
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
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Displays complete dog information.
     */
    public void displayDogDetails() {

        displayAnimalDetails();
        System.out.println("Breed : " + breed);
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

        Dog d1 = new Dog("Bruno", 5, "French Bulldog");
        Dog d2 = new Dog("Rocky", 6, "Golden Retriever");

        System.out.println("=========== DOG 1 ===========");
        d1.displayDogDetails();

        System.out.println("=========== DOG 2 ===========");
        d2.displayDogDetails();
    }
}
