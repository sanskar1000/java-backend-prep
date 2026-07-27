/**
 * ------------------------------------------------------------
 * Program Name : VehicleManagementSystem
 * Topic        : Abstract Class in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates abstraction using an abstract
 * Vehicle class. Different vehicle types (Car and Bike)
 * provide their own implementation of the startEngine()
 * method while sharing common properties and behaviors.
 *
 * Concepts Covered:
 * - Abstract Class
 * - Abstract Method
 * - Inheritance
 * - Method Overriding
 * - Runtime Polymorphism
 * - Constructors
 * - Encapsulation
 * - Input Validation
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Represents a generic vehicle.
 *
 * Every vehicle has a brand and model.
 * Each vehicle must provide its own implementation
 * of the startEngine() method.
 */
abstract class Vehicle {

    /** Brand of the vehicle */
    private String brand;

    /** Model of the vehicle */
    private String model;

    /**
     * Constructs a Vehicle object.
     *
     * @param brand Vehicle brand
     * @param model Vehicle model
     */
    public Vehicle(String brand, String model) {

        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Unknown";
            System.out.println("Invalid brand. Default value assigned.");
        }

        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Unknown";
            System.out.println("Invalid model. Default value assigned.");
        }

        System.out.println("Vehicle constructor executed.\n");
    }

    /**
     * Returns the vehicle brand.
     *
     * @return brand name
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Returns the vehicle model.
     *
     * @return model name
     */
    public String getModel() {
        return model;
    }

    /**
     * Starts the vehicle engine.
     *
     * Each subclass provides its own implementation.
     */
    abstract void startEngine();

    /**
     * Displays common vehicle details.
     */
    public void displayDetails() {

        System.out.println("======= Vehicle Details =======");
        System.out.println("Brand : " + getBrand());
        System.out.println("Model : " + getModel());
    }
}

/**
 * Represents a Car.
 *
 * Extends the Vehicle class and provides
 * its own implementation of the engine start behavior.
 */
class Car extends Vehicle {

    /** Number of doors in the car */
    private int numberOfDoors;

    /**
     * Constructs a Car object.
     *
     * @param brand Brand name
     * @param model Model name
     * @param numberOfDoors Number of doors
     */
    public Car(String brand, String model, int numberOfDoors) {

        super(brand, model);

        if (numberOfDoors > 0) {
            this.numberOfDoors = numberOfDoors;
        } else {
            this.numberOfDoors = 0;
            System.out.println("Invalid number of doors. Default value assigned.");
        }

        System.out.println("Car constructor executed.\n");
    }

    /**
     * Returns the number of doors.
     *
     * @return number of doors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Starts the car engine.
     */
    @Override
    public void startEngine() {
        System.out.println("Car engine started using push button.");
    }

    /**
     * Displays complete car details.
     */
    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("Number of Doors : " + getNumberOfDoors());
        System.out.println();
    }
}

/**
 * Represents a Bike.
 *
 * Extends the Vehicle class and provides
 * its own implementation of the engine start behavior.
 */
class Bike extends Vehicle {

    /** Indicates whether ABS is available */
    private boolean hasABS;

    /**
     * Constructs a Bike object.
     *
     * @param brand Brand name
     * @param model Model name
     * @param hasABS ABS availability
     */
    public Bike(String brand, String model, boolean hasABS) {

        super(brand, model);

        this.hasABS = hasABS;

        System.out.println("Bike constructor executed.\n");
    }

    /**
     * Returns whether ABS is available.
     *
     * @return true if ABS is available, otherwise false
     */
    public boolean hasABS() {
        return hasABS;
    }

    /**
     * Starts the bike engine.
     */
    @Override
    public void startEngine() {
        System.out.println("Bike engine started using self start.");
    }

    /**
     * Displays complete bike details.
     */
    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("ABS Status : " + hasABS());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 *
 * Demonstrates abstraction and runtime polymorphism
 * by storing Car and Bike objects using Vehicle references.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("Toyota", "Fortuner", 5);
        Vehicle vehicle2 = new Bike("Yamaha", "R15", true);

        System.out.println("========== CAR ==========");
        vehicle1.displayDetails();
        vehicle1.startEngine();

        System.out.println();

        System.out.println("========== BIKE ==========");
        vehicle2.displayDetails();
        vehicle2.startEngine();
    }
}
