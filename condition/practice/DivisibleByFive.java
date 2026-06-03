// Practice Program : Check Number Divisible by 5

package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DivisibleByFive
 * Topic        : If-Else Condition in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether the entered number
 * is divisible by 5 or not.
 *
 * A number is divisible by 5 if:
 *
 * remainder when divided by 5 == 0
 *
 * Concepts Used:
 * - Scanner Class
 * - User Input
 * - if-else condition
 * - Modulus Operator (%)
 * - Relational Operator
 * - Conditional Logic
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DivisibleByFive {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Check divisibility
        if (num % 5 == 0) {

            System.out.println(
                    num + " is divisible by 5."
            );

        } else {

            System.out.println(
                    num + " is not divisible by 5."
            );
        }

        // Close Scanner
        sc.close();
    }
}
