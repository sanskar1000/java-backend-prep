// Practice Program : Check Number is Zero or Not

package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ZeroChecker
 * Topic        : If-Else Condition in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether the entered number is:
 *
 * - Positive
 * - Negative
 * - Zero
 *
 * The program demonstrates basic conditional logic
 * using if-else-if statements in Java.
 *
 * Concepts Used:
 * - Scanner Class
 * - User Input
 * - if-else-if ladder
 * - Relational Operators
 * - Equality Operator
 * - Conditional Logic
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ZeroChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Check number type
        if (num > 0) {

            System.out.println(
                    "The number is Positive."
            );

        } else if (num < 0) {

            System.out.println(
                    "The number is Negative."
            );

        } else {

            System.out.println(
                    "The number is Zero."
            );
        }

        // Close Scanner
        sc.close();
    }
}
