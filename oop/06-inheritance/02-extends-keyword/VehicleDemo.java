/**
 * ------------------------------------------------------------
 * Program Name : VehicleInheritanceDemo
 * Topic        : Inheritance in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates Single Inheritance in Java.
 *
 * The Vehicle class acts as the parent (superclass),
 * containing common properties and behaviors shared by
 * all vehicles.
 *
 * The Car class extends the Vehicle class and inherits
 * its fields and methods while adding its own property
 * and behavior.
 *
 * OOP Concepts Demonstrated:
 * • Classes and Objects
 * • Constructors
 * • Constructor Chaining using super()
 * • Inheritance
 * • Method Reuse
 * • Encapsulation
 *
 * Classes:
 *
 * Vehicle (Parent Class)
 * ----------------------
 * Fields:
 * • brand
 * • year
 *
 * Methods:
 * • getBrand()
 * • getYear()
 * • start()
 * • stop()
 * • displayVehicleDetails()
 *
 * Car (Child Class)
 * -----------------
 * Additional Field:
 * • fuelType
 *
 * Additional Methods:
 * • drive()
 * • displayDetail()
 *
 * Program Flow:
 * 1. Create Car objects.
 * 2. Call inherited methods from Vehicle.
 * 3. Call Car-specific methods.
 * 4. Display complete vehicle information.
 *
 * Time Complexity:
 * All methods : O(1)
 *
 * Space Complexity:
 * O(1)
 * ------------------------------------------------------------
 */
/**

 * ------------------------------------------------------------

 * Class Name   : Vehicle

 * Type         : Parent Class (Superclass)

 *

 * Description:

 * Represents a generic vehicle containing common

 * properties and behaviors shared by all vehicles.

 *

 * Features:

 * • Store vehicle brand

 * • Store manufacturing year

 * • Start vehicle

 * • Stop vehicle

 * • Display vehicle details

 * ------------------------------------------------------------

 */

class Vehicle {

    // Brand of the vehicle

    private String brand;

    // Manufacturing year

    private int year;

    /**

     * Constructs a Vehicle object.

     *

     * @param brand vehicle brand

     * @param year manufacturing year

     */

    Vehicle(String brand, int year) {

        this.brand = brand;

        this.year = year;

    }

    /**

     * Returns the vehicle brand.

     *

     * @return brand

     */

    public String getBrand() {

        return brand;

    }

    /**

     * Returns the manufacturing year.

     *

     * @return year

     */

    public int getYear() {

        return year;

    }

    /**

     * Starts the vehicle.

     */

    void start() {

        System.out.println("Vehicle started.");

    }

    /**

     * Stops the vehicle.

     */

    void stop() {

        System.out.println("Vehicle stopped.");

    }

    /**

     * Displays vehicle information.

     */

    void displayVehicleDetails() {

        System.out.println("------- Vehicle Details -------");

        System.out.println("Brand : " + brand);

        System.out.println("Year  : " + year);

    }

}
/**

 * ------------------------------------------------------------

 * Class Name   : Car

 * Type         : Child Class

 *

 * Description:

 * Represents a car that inherits all common properties

 * from the Vehicle class and adds its own fuel type.

 *

 * Additional Features:

 * • Drive the car

 * • Display complete car details

 * ------------------------------------------------------------

 */

class Car extends Vehicle {

    // Fuel used by the car

    private String fuelType;

    /**

     * Constructs a Car object.

     *

     * @param brand vehicle brand

     * @param year manufacturing year

     * @param fuelType type of fuel used

     */

    Car(String brand, int year, String fuelType) {

        super(brand, year);

        this.fuelType = fuelType;

    }

    /**

     * Simulates driving the car.

     */

    void drive() {

        System.out.println("Car is driving.");

    }

    /**

     * Displays complete car details.

     */

    void displayDetail() {

        displayVehicleDetails();

        System.out.println("Fuel Type : " + fuelType);

        System.out.println();

    }

}

/**

 * ------------------------------------------------------------

 * Class Name   : Main

 *

 * Description:

 * Entry point of the program.

 *

 * Demonstrates:

 * • Creating Car objects

 * • Calling inherited methods

 * • Calling child class methods

 * • Displaying vehicle information

 * • Understanding inheritance in Java

 * ------------------------------------------------------------

 */

public class Main {

    /**

     * Program execution starts here.

     *

     * @param args command-line arguments

     */

    public static void main(String[] args) {

        Car c1 = new Car("BMW", 2024, "Petrol");

        Car c2 = new Car("Toyota", 2022, "Hybrid");

        System.out.println("========== CAR 1 ==========\n");

        c1.displayDetail();

        c1.start();

        c1.drive();

        c1.stop();

        System.out.println("========== CAR 2 ==========\n");

        c2.displayDetail();

        c2.start();

        c2.drive();

        c2.stop();

    }

}
