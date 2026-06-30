package oop.encapsulation;
/**
 * ------------------------------------------------------------
 * Program Name : MobilePhoneDemo
 * Topic        : Classes, Objects, Constructors, Encapsulation
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates a Mobile class using
 * encapsulation. A mobile phone has a brand,
 * battery percentage, and price. It can perform
 * basic operations such as making a call and
 * charging the battery.
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Encapsulation
 * - Getters
 * - Validation
 * - Methods
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Mobile {

    // Private instance variables
    private String brand;
    private double battery;
    private double price;

    /**
     * Parameterized constructor.
     *
     * @param brand mobile brand
     * @param battery battery percentage
     * @param price mobile price
     */
    Mobile(String brand, double battery, double price) {

        this.brand = brand;

        if (battery >= 0 && battery <= 100) {
            this.battery = battery;
        } else {
            System.out.println("Invalid battery percentage.");
            this.battery = 0;
        }

        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price.");
            this.price = 0;
        }
    }

    /**
     * Returns the mobile brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Returns current battery percentage.
     */
    public double getBattery() {
        return battery;
    }

    /**
     * Returns mobile price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Simulates making a phone call.
     *
     * @param batteryUsed battery consumed during the call
     */
    public void call(double batteryUsed) {

        if (batteryUsed > 0 && battery >= batteryUsed) {

            battery -= batteryUsed;

            System.out.printf(
                    "Call completed. Battery used: %.1f%%%n",
                    batteryUsed
            );

        } else {

            System.out.println(
                    "Cannot make call. Insufficient battery or invalid value."
            );
        }
    }

    /**
     * Charges the mobile battery.
     *
     * @param amount charging amount
     */
    public void charge(double amount) {

        if (amount > 0) {

            battery += amount;

            if (battery > 100) {
                battery = 100;
            }

            System.out.printf(
                    "Battery charged by %.1f%%%n",
                    amount
            );

        } else {

            System.out.println(
                    "Invalid charging amount."
            );
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Mobile mobile =
                new Mobile(
                        "Samsung",
                        89.8,
                        8000.0
                );

        System.out.println("Brand   : " + mobile.getBrand());
        System.out.println("Battery : " + mobile.getBattery() + "%");
        System.out.println("Price   : ₹" + mobile.getPrice());

        System.out.println();

        mobile.call(4);

        System.out.println(
                "Battery after call : "
                        + mobile.getBattery() + "%"
        );

        System.out.println();

        mobile.charge(10);

        System.out.println(
                "Battery after charging : "
                        + mobile.getBattery() + "%"
        );
    }
}
