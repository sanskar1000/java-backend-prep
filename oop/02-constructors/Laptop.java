package oops.constructors;

/**
 * ------------------------------------------------------------
 * Class Name : Laptop
 * Topic      : Constructor Overloading
 * Author     : Aradhya Thakur
 * Year       : 2026
 *
 * Description:
 * Demonstrates:
 * - constructor overloading
 * - constructor chaining using this()
 * - object initialization
 * - multiple object creation
 * - instance variables and methods
 * ------------------------------------------------------------
 */

class Laptop {

    String brand;
    String ram;
    double price;

    /**
     * Default constructor.
     */
    Laptop() {

        this("Unknown", "Unknown", 0.0);
    }

    /**
     * Constructor with brand only.
     *
     * @param brand laptop brand
     */
    Laptop(String brand) {

        this(brand, "Unknown", 0.0);
    }

    /**
     * Constructor with brand and RAM.
     *
     * @param brand laptop brand
     * @param ram laptop RAM
     */
    Laptop(String brand, String ram) {

        this(brand, ram, 0.0);
    }

    /**
     * Main constructor.
     *
     * @param brand laptop brand
     * @param ram laptop RAM
     * @param price laptop price
     */
    Laptop(String brand, String ram, double price) {

        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    /**
     * Displays laptop details.
     */
    void displayLaptopDetails() {

        System.out.println("----- Laptop Details -----");

        System.out.println("Brand : " + brand);
        System.out.println("RAM   : " + ram);

        System.out.printf("Price : ₹%.2f%n", price);

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Object creation
        Laptop l1 = new Laptop();

        Laptop l2 = new Laptop("ASUS");

        Laptop l3 = new Laptop("ASUS", "8GB DDR4");

        Laptop l4 = new Laptop(
                "ASUS",
                "8GB DDR4",
                45000.0
        );

        // Display details
        l1.displayLaptopDetails();

        l2.displayLaptopDetails();

        l3.displayLaptopDetails();

        l4.displayLaptopDetails();
    }
}
