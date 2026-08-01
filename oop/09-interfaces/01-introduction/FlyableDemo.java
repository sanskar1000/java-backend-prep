/**
 * ============================================================================
 * Project      : Flyable Interface Demonstration
 * File Name    : Main.java
 * Author       : Aradhya Thakur
 * Language     : Java
 * Year         : 2026
 *
 * Description
 * ----------------------------------------------------------------------------
 * This program demonstrates the use of interfaces in Java.
 *
 * The Flyable interface defines a common behavior for all objects capable
 * of flying. Both Bird and Airplane implement this interface by providing
 * their own implementation of the fly() method.
 *
 * The program also demonstrates:
 * • Interface implementation
 * • Runtime Polymorphism
 * • Encapsulation
 * • Constructor validation
 * • Method overriding
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ============================================================================
 */
/**
 * Represents an object capable of flying.
 * <p>
 * Any class implementing this interface must provide
 * its own implementation of the {@code fly()} method.
 */
interface Flyable {

    /**
     * Performs the flying action.
     */
    void fly();
}
/**
 * Represents a bird that can fly.
 * <p>
 * This class implements the {@link Flyable} interface
 * and provides bird-specific flying behavior.
 */
class Bird implements Flyable {

    /** Name of the bird. */
    private String name;

    /** Wingspan of the bird in meters. */
    private double wingSpan;

    /**
     * Constructs a Bird object.
     *
     * @param name bird name
     * @param wingSpan wingspan in meters
     */
    public Bird(String name, double wingSpan){

           if (name != null && !name.isBlank()){
               this.name = name;
           }else {
               this.name = "Unknown";
               System.out.println("Invalid name, Default value assigned.\n");
           }

           if (wingSpan > 0){
               this.wingSpan = wingSpan;
           }else {
               this.wingSpan = 0.0;
               System.out.println("Invalid wingSpan, Default value assigned.\n");
           }

       System.out.println("Bird constructor executed.\n");

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
     * Returns the bird's wingspan.
     *
     * @return wingspan in meters
     */
    public double getWingSpan() {
        return wingSpan;
    }

    /**
     * Displays how the bird flies.
     */
    @Override
    public void fly() {
        System.out.println(getName() + " is flying using its wings.\n");
    }

    /**
     * Displays the bird's details.
     */
    public void displayBirdDetails() {

        System.out.println("----- Bird Details -----");
        System.out.println("Name      : " + getName());
        System.out.printf("Wing Span : %.2f meters%n", getWingSpan());
        System.out.println();
    }
}
/**
 * Represents an airplane that can fly.
 * <p>
 * This class implements the {@link Flyable} interface
 * and provides airplane-specific flying behavior.
 */
class Airplane implements Flyable {

    /** Model name of the airplane. */
    private String model;

    /** Maximum flying altitude in feet. */
    private int maxAltitude;

    /**
     * Constructs an Airplane object.
     *
     * @param model airplane model
     * @param maxAltitude maximum flying altitude in feet
     */

     public Airplane(String model, int maxAltitude){

        if (model != null && !model.isBlank()){
            this.model = model;
        }else {
            this.model = "Unknown";
            System.out.println("Invalid model, Default value assigned.\n");
        }

        if (maxAltitude > 0){
            this.maxAltitude = maxAltitude;
        }else {
            this.maxAltitude = 0;
            System.out.println("Invalid maxAltitude, Default value assigned.\n");
        }

        System.out.println("Airplane constructor executed.\n");
    }
        /**
     * Returns the airplane model.
     *
     * @return airplane model
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the maximum flying altitude.
     *
     * @return altitude in feet
     */
    public int getMaxAltitude() {
        return maxAltitude;
    }

    /**
     * Displays how the airplane flies.
     */
    @Override
    public void fly() {
        System.out.println(getModel() +
                " is flying at " +
                getMaxAltitude() +
                " feet.\n");
    }

    /**
     * Displays the airplane details.
     */
    public void displayAirplaneDetails() {

        System.out.println("----- Airplane Details -----");
        System.out.println("Model            : " + getModel());
        System.out.println("Maximum Altitude : " + getMaxAltitude() + " feet");
        System.out.println();
    }
}
/**
 * Driver class for the Flyable Interface Demonstration.
 * <p>
 * This program creates Bird and Airplane objects,
 * stores them using Flyable interface references,
 * and demonstrates runtime polymorphism by calling
 * the fly() method.
 */
public class Main {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Bird bird = new Bird("Eagle", 2.3);
        Airplane airplane = new Airplane("Boeing 747", 35000);

        // Runtime polymorphism using interface references
        Flyable f1 = bird;
        Flyable f2 = airplane;

        System.out.println("========== Bird ==========");
        bird.displayBirdDetails();
        f1.fly();

        System.out.println("========== Airplane ==========");
        airplane.displayAirplaneDetails();
        f2.fly();
    }
}
    
