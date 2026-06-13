package operators;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArithmeticOperatorsDemo
 * Topic        : Arithmetic Operators in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of
 * arithmetic operators in Java.
 *
 * Operators Covered:
 * +  Addition
 * -  Subtraction
 * *  Multiplication
 * /  Division
 * %  Modulus
 *
 * Concepts Used:
 * - Variables
 * - User Input
 * - Arithmetic Operators
 * - Input Validation
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();

        System.out.println();
        System.out.println("----- Arithmetic Operations -----");

        System.out.println(
                "Addition       : "
                        + (firstNumber + secondNumber)
        );

        System.out.println(
                "Subtraction    : "
                        + (firstNumber - secondNumber)
        );

        System.out.println(
                "Multiplication : "
                        + (firstNumber * secondNumber)
        );

        if (secondNumber != 0) {

            System.out.println(
                    "Division       : "
                            + (firstNumber / secondNumber)
            );

            System.out.println(
                    "Modulus        : "
                            + (firstNumber % secondNumber)
            );

        } else {

            System.out.println(
                    "Division       : Cannot divide by zero"
            );

            System.out.println(
                    "Modulus        : Cannot divide by zero"
            );
        }

        sc.close();
    }
}
