package methods;

/**
 * ------------------------------------------------------------
 * Program Name : MethodWithParameters
 * Topic        : Methods in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates how to pass parameters to a method.
 *
 * The program sends two integer values to a method,
 * calculates their sum, and displays the result.
 *
 * Example:
 * Input  : 10, 20
 * Output : Sum = 30
 *
 * Concepts Used:
 * - Method Creation
 * - Method Parameters
 * - Argument Passing
 * - Local Variables
 * - Method Calling
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */
public class MethodWithParameters {

    /**
     * Calculates and displays the sum of two numbers.
     *
     * @param a first number
     * @param b second number
     */
    static void printSum(int a, int b) {

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        printSum(10, 20);
    }
}
