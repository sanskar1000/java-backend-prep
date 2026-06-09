package methods.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : AddTwoNumbers
 * Topic        : Methods in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 * - method creation
 * - method calling
 * - method parameters
 * - return values
 * - user input using Scanner
 *
 * Concepts Used:
 * - Methods
 * - Parameters
 * - Return Type
 * - Scanner Class
 * - Arithmetic Operations
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class AddTwoNumbers {

    /**
     * Returns the sum of two numbers.
     *
     * @param x first number
     * @param y second number
     * @return sum of x and y
     */
    static int add(int x, int y) {

        return x + y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();

        int sum = add(firstNumber, secondNumber);

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
