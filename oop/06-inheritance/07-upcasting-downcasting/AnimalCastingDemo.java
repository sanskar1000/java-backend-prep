/**
 * ------------------------------------------------------------
 * Program Name : AnimalCastingDemo
 * Topic        : Inheritance, Method Overriding, Upcasting &
 *                Downcasting using instanceof
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how inheritance works in Java
 * along with runtime polymorphism, method overriding,
 * upcasting, downcasting, and the instanceof operator.
 *
 * The parent class (Animal) stores common properties shared
 * by all animals. Child classes (Dog and Cat) extend the
 * Animal class by adding their own unique properties and
 * behaviors.
 *
 * Animal references are used to store Dog and Cat objects
 * (upcasting). Before accessing child-specific methods,
 * instanceof is used to verify the object's type and then
 * safely perform downcasting.
 *
 * Concepts Covered:
 * - Inheritance
 * - Constructor Chaining
 * - super Keyword
 * - Encapsulation
 * - Method Overriding
 * - Runtime Polymorphism
 * - Upcasting
 * - Downcasting
 * - instanceof Operator
 * - Dynamic Method Dispatch
 *
 * Expected Output:
 *
 * Animal constructor executed.
 * Dog constructor executed.
 *
 * Animal constructor executed.
 * Cat constructor executed.
 *
 * ----- Dog Details -----
 * Name  : Bruno
 * Age   : 10
 * Breed : Golden Retriever
 *
 * Dog is fetching the ball.
 *
 * ----- Cat Details -----
 * Name  : Kitty
 * Age   : 3
 * Color : White
 *
 * Cat climbed the tree.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Parent class representing a generic animal.
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

        System.out.println("Animal constructor executed.");
    }

    /** @return Animal name */
    public String getName() {
        return name;
    }

    /** @return Animal age */
    public int getAge() {
        return age;
    }

    /**
     * Displays the common details of an animal.
     */
    public void displayDetails() {

        System.out.println("Name  : " + getName());
        System.out.println("Age   : " + getAge());
    }
}

/**
 * Child class representing a Dog.
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

    /** @return Dog breed */
    public String getBreed() {
        return breed;
    }

    /**
     * Demonstrates dog-specific behavior.
     */
    public void fetch() {
        System.out.println("Dog is fetching the ball.\n");
    }

    /**
     * Displays complete dog details.
     */
    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("Breed : " + getBreed());
        System.out.println();
    }
}

/**
 * Child class representing a Cat.
 */
class Cat extends Animal {

    /** Color of the cat. */
    private String color;

    /**
     * Constructs a Cat object.
     *
     * @param name  Cat name
     * @param age   Cat age
     * @param color Cat color
     */
    Cat(String name, int age, String color) {

        super(name, age);

        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "Unknown";
            System.out.println("Invalid color. Default value assigned.");
        }

        System.out.println("Cat constructor executed.\n");
    }

    /** @return Cat color */
    public String getColor() {
        return color;
    }

    /**
     * Demonstrates cat-specific behavior.
     */
    public void climb() {
        System.out.println("Cat climbed the tree.\n");
    }

    /**
     * Displays complete cat details.
     */
    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("Color : " + getColor());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * Demonstrates:
     * - Upcasting
     * - Downcasting
     * - instanceof
     * - Runtime Polymorphism
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Upcasting
        Animal dogPet = new Dog("Bruno", 10, "Golden Retriever");
        Animal catPet = new Cat("Kitty", 3, "White");

        System.out.println("========== DOG ==========\n");

        if (dogPet instanceof Dog) {

            Dog dog = (Dog) dogPet;

            dog.displayDetails();
            dog.fetch();

        } else {

            System.out.println("This object is not a Dog.");
        }

        System.out.println("========== CAT ==========\n");

        if (catPet instanceof Cat) {

            Cat cat = (Cat) catPet;

            cat.displayDetails();
            cat.climb();

        } else {

            System.out.println("This object is not a Cat.");
        }
    }
}
