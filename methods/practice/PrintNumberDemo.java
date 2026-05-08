package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : PrintNumberDemo
 * Topic        : Methods with Parameters
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how to create
 * and call a method with parameters in Java.
 *
 * The method printNum(int n) accepts an integer
 * and prints it to the console.
 *
 * Example Output:
 * 6
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrintNumberDemo {

    /**
     * Prints the given number.
     *
     * @param n integer value to print
     */
    static void printNum(int n) {
        System.out.println(n);
    }

    public static void main(String[] args) {

        // 🔹 Method call
        printNum(6);
    }
}
