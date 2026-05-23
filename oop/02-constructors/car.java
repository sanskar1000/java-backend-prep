package oops.constructors;
/**
 * ------------------------------------------------------------
 * Class Name : Car
 * Topic      : Constructors in Java
 * Author     : Aradhya Thakur
 * Year       : 2026
 *
 * Description:
 * Demonstrates:
 * - default constructor
 * - object initialization
 * - instance variables
 * - object methods
 * ------------------------------------------------------------
 */

class Car {

    String brand;
    String model;
    double price;

    /**
     * Default constructor.
     * Automatically initializes object values.
     */
    Car() {

        System.out.println("Constructor called");

        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
    }

    /**
     * Displays car details.
     */
    void displayCarDetails() {

        System.out.println("----- Car Details -----");

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Object creation
        Car c1 = new Car();

        // Display details
        c1.displayCarDetails();
    }
}
