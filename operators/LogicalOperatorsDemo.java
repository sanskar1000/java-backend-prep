package operators;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RelationalOperatorsDemo
 * Topic        : Relational Operators in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of
 * relational operators in Java.
 *
 * Relational Operators Covered:
 * >   Greater Than
 * <   Less Than
 * >=  Greater Than or Equal To
 * <=  Less Than or Equal To
 * ==  Equal To
 * !=  Not Equal To
 *
 * Concepts Used:
 * - Variables
 * - User Input
 * - Relational Operators
 * - Boolean Expressions
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RelationalOperatorsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();

        System.out.println();
        System.out.println("----- Relational Operators -----");

        System.out.println(
                firstNumber + " > " + secondNumber +
                " : " + (firstNumber > secondNumber)
        );

        System.out.println(
                firstNumber + " < " + secondNumber +
                " : " + (firstNumber < secondNumber)
        );

        System.out.println(
                firstNumber + " >= " + secondNumber +
                " : " + (firstNumber >= secondNumber)
        );

        System.out.println(
                firstNumber + " <= " + secondNumber +
                " : " + (firstNumber <= secondNumber)
        );

        System.out.println(
                firstNumber + " == " + secondNumber +
                " : " + (firstNumber == secondNumber)
        );

        System.out.println(
                firstNumber + " != " + secondNumber +
                " : " + (firstNumber != secondNumber)
        );

        sc.close();
    }
}
