package operators;

/**
 * ------------------------------------------------------------
 * Program Name : AssignmentOperatorsDemo
 * Topic        : Assignment Operators in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of
 * assignment operators in Java.
 *
 * Operators Covered:
 * =   Assignment
 * +=  Add and Assign
 * -=  Subtract and Assign
 * *=  Multiply and Assign
 * /=  Divide and Assign
 * %=  Modulus and Assign
 *
 * Concepts Used:
 * - Variables
 * - Assignment Operators
 * - Arithmetic Operations
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class AssignmentOperatorsDemo {

    public static void main(String[] args) {

        int number = 10;

        System.out.println(
                "Initial Value : " + number
        );

        number += 5;
        System.out.println(
                "After += 5    : " + number
        );

        number -= 3;
        System.out.println(
                "After -= 3    : " + number
        );

        number *= 2;
        System.out.println(
                "After *= 2    : " + number
        );

        number /= 4;
        System.out.println(
                "After /= 4    : " + number
        );

        number %= 3;
        System.out.println(
                "After %= 3    : " + number
        );
    }
}
