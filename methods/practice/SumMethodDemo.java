package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : SumMethodDemo
 * Topic        : Methods with Return Values
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how to create
 * and use a method that returns a value.
 *
 * The method sum(int a, int b)
 * calculates and returns the sum of two integers.
 *
 * Example:
 * Input  : 10, 20
 * Output : Sum of numbers: 30
 *
 * Logic:
 * - Accept two integers as parameters
 * - Return their sum
 * - Store returned value in a variable
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SumMethodDemo {

    /**
     * Returns the sum of two integers.
     *
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // 🔹 Method call
        int result = sum(10, 20);

        // 🔹 Output
        System.out.println("Sum of numbers: " + result);
    }
}
