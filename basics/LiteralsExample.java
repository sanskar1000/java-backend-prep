/**
 * ------------------------------------------------------------
 * Program Name : LiteralsExample
 * Topic        : Java Literals
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates different
 * types of literals in Java.
 *
 * Literals are fixed values directly
 * written in source code.
 *
 * Types Covered:
 * - Integer literals
 * - Floating-point literals
 * - Character literals
 * - String literals
 * - Boolean literals
 * - Null literal
 *
 * Number System Examples:
 * - Decimal
 * - Binary
 * - Octal
 * - Hexadecimal
 *
 * Note:
 * 10, 0b1010, 012, and 0xA
 * all represent the same decimal value (10).
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

package basics;

public class LiteralsExample {

    public static void main(String[] args) {

        // 🔹 Integer literals
        int decimal = 10;
        int binary = 0b1010;
        int octal = 012;
        int hexadecimal = 0xA;

        // 🔹 Floating-point literals
        float pi = 3.14f;
        double gravity = 9.8;

        // 🔹 Character literal
        char grade = 'A';

        // 🔹 String literal
        String language = "Java";

        // 🔹 Boolean literal
        boolean isBeginnerFriendly = true;

        // 🔹 Null literal
        String reference = null;

        // 🔹 Output
        System.out.println("Decimal value: " + decimal);
        System.out.println("Binary value: " + binary);
        System.out.println("Octal value: " + octal);
        System.out.println("Hexadecimal value: " + hexadecimal);

        System.out.println("Float value: " + pi);
        System.out.println("Double value: " + gravity);

        System.out.println("Character value: " + grade);
        System.out.println("String value: " + language);

        System.out.println("Boolean value: " + isBeginnerFriendly);
        System.out.println("Null reference: " + reference);
    }
}
