package basics;

/**
 * ------------------------------------------------------------
 * Program Name : TypeCastingDemo
 * Topic        : Type Casting in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates implicit type casting
 * (widening conversion) in Java.
 *
 * Concepts Used:
 * - Primitive data types
 * - Implicit casting
 * - Widening conversion
 * - int to double conversion
 * ------------------------------------------------------------
 */

class TypeCastingDemo {

    public static void main(String[] args) {

        // Integer value
        int a = 10;

        // Implicit casting (int → double)
        double b = a;

        System.out.println("Integer value : " + a);

        System.out.println("Double value  : " + b);
    }
}
