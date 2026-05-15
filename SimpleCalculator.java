package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : SimpleCalculator
 * Topic        : Methods & Switch Case
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program implements a
 * simple menu-driven calculator.
 *
 * Operations Supported:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Division
 *
 * Concepts Used:
 * - methods
 * - switch-case
 * - user input
 * - arithmetic operations
 * - validation
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class SimpleCalculator {

    /**
     * Returns sum of two numbers.
     */
    static int add(int a, int b) {
        return a + b;
    }

    /**
     * Returns difference of two numbers.
     */
    static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Returns product of two numbers.
     */
    static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns division result.
     */
    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Input
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = sc.next().charAt(0);

        // 🔹 Menu-driven operation
        switch (ch) {

            case '+':
                System.out.println("Sum : " + add(a, b));
                break;

            case '-':
                System.out.println("Subtract : " + subtract(a, b));
                break;

            case '*':
                System.out.println("Multiply : " + multiply(a, b));
                break;

            case '/':

                if (b == 0) {
                    System.out.println("Undefined! Division by zero");
                    break;
                }

                System.out.printf("Divide : %.2f%n", divide(a, b));
                break;

            default:
                System.out.println("Invalid operator");
        }

        // 🔹 Close scanner
        sc.close();
    }
}
