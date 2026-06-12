package operators;

/**
 * ------------------------------------------------------------
 * Program Name : UnaryOperatorsDemo
 * Topic        : Unary Operators in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of
 * unary operators in Java.
 *
 * Unary operators operate on a single operand.
 *
 * Operators Covered:
 * +  Unary Plus
 * -  Unary Minus
 * ++ Increment Operator
 * -- Decrement Operator
 * !  Logical NOT Operator
 *
 * Concepts Used:
 * - Unary Operators
 * - Variables
 * - Pre-Increment
 * - Post-Increment
 * - Pre-Decrement
 * - Post-Decrement
 * - Boolean Logic
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class UnaryOperatorsDemo {

    public static void main(String[] args) {

        int number = 5;

        System.out.println(
                "Initial Value = " + number
        );

        System.out.println();

        // Unary Plus
        System.out.println(
                "Unary Plus (+number) = " + (+number)
        );

        // Unary Minus
        System.out.println(
                "Unary Minus (-number) = " + (-number)
        );

        System.out.println();

        // Post Increment
        System.out.println(
                "Post Increment (number++) = "
                        + (number++)
        );

        System.out.println(
                "Value After Post Increment = "
                        + number
        );

        System.out.println();

        // Pre Increment
        System.out.println(
                "Pre Increment (++number) = "
                        + (++number)
        );

        System.out.println();

        // Post Decrement
        System.out.println(
                "Post Decrement (number--) = "
                        + (number--)
        );

        System.out.println(
                "Value After Post Decrement = "
                        + number
        );

        System.out.println();

        // Pre Decrement
        System.out.println(
                "Pre Decrement (--number) = "
                        + (--number)
        );

        System.out.println();

        boolean flag = true;

        System.out.println(
                "Original Boolean Value = "
                        + flag
        );

        System.out.println(
                "Logical NOT (!flag) = "
                        + (!flag)
        );
    }
}
