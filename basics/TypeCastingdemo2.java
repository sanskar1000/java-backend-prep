package basics;

/**
 * ------------------------------------------------------------
 * Program Name : ExplicitTypeCastingDemo
 * Topic        : Type Casting in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates explicit type casting
 * (narrowing conversion) from double to int.
 *
 * Concepts Used:
 * - Primitive data types
 * - Explicit casting
 * - Narrowing conversion
 * - Data loss during conversion
 * ------------------------------------------------------------
 */

public class Main {

    public static void main(String[] args) {

        // Original double value
        double price = 99.99;

        // Explicit type casting (double → int)
        int intPrice = (int) price;

        // Output
        System.out.println(
                "Original Price  : " + price
        );

        System.out.println(
                "Converted Price : " + intPrice
        );
    }
}
