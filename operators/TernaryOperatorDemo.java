package operators;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TernaryOperatorDemo
 * Topic        : Ternary Operator
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of the
 * ternary operator to determine whether
 * a number is even or odd.
 *
 * Syntax:
 * condition ? expression1 : expression2
 *
 * If the condition is true,
 * expression1 executes.
 *
 * Otherwise,
 * expression2 executes.
 *
 * Example:
 * Input  : 8
 * Output : Even Number
 *
 * Concepts Used:
 * - Ternary Operator (?:)
 * - Conditional Expressions
 * - User Input
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class TernaryOperatorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Ternary operator
        String result =
                (number % 2 == 0)
                        ? "Even Number"
                        : "Odd Number";

        System.out.println(
                "Result : " + result
        );

        sc.close();
    }
}
