/**
 * ------------------------------------------------------------
 * Program Name : CalculatorLambdaDemo
 * Topic        : Lambda Expressions with Multiple Operations
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how multiple lambda expressions
 * can implement the same functional interface to perform
 * different operations.
 *
 * Operations:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Division
 * - Finding Maximum
 *
 * Concepts Used:
 * - Functional Interface
 * - @FunctionalInterface annotation
 * - Lambda Expressions
 * - Lambda Parameters
 * - Expression Lambda
 * - Block Lambda
 * - Return Value
 * - Basic Validation
 * ------------------------------------------------------------
 */

/**
 * Functional interface containing one abstract method.
 */
@FunctionalInterface
interface Calculator {

    /**
     * Performs a calculation using two integers.
     *
     * @param a first number
     * @param b second number
     * @return calculated result
     */
    int calculate(int a, int b);
}

public class CalculatorLambdaDemo {

    public static void main(String[] args) {

        // Lambda expression for addition
        Calculator addition =
                (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator subtraction =
                (a, b) -> a - b;

        // Lambda expression for multiplication
        Calculator multiplication =
                (a, b) -> a * b;

        // Block lambda for division
        Calculator division = (a, b) -> {

            if (b == 0) {
                System.out.println(
                        "Cannot divide by zero."
                );
                return 0;
            }

            return a / b;
        };

        // Block lambda for finding maximum
        Calculator maximum = (a, b) -> {

            if (a > b) {
                return a;
            }

            return b;
        };

        int a = 20;
        int b = 5;

        System.out.println(
                "Addition       : "
                        + addition.calculate(a, b)
        );

        System.out.println(
                "Subtraction    : "
                        + subtraction.calculate(a, b)
        );

        System.out.println(
                "Multiplication : "
                        + multiplication.calculate(a, b)
        );

        System.out.println(
                "Division       : "
                        + division.calculate(a, b)
        );

        System.out.println(
                "Maximum        : "
                        + maximum.calculate(a, b)
        );
    }
}
