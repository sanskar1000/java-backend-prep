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
 * - parameterized constructor
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
     * Parameterized constructor.
     *
     * @param b car brand
     * @param m car model
     * @param p car price
     */
    Car(String b, String m, double p) {

        brand = b;
        model = m;
        price = p;
    }

    /**
     * Displays car details.
     */
    void displayCarDetails() {

        System.out.println("----- Car Details -----");

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);

        System.out.printf("Price : ₹%.2f%n", price);

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Object creation
        Car c1 = new Car("BMW", "M4", 9000000.0);

        // Display details
        c1.displayCarDetails();
    }
}
