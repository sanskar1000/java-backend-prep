package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : LargestOfTwoNumbers
 * Topic        : Methods & Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program compares two numbers
 * and prints the larger number.
 *
 * If both numbers are equal,
 * it displays an equality message.
 *
 * Example:
 * Input  : 56, 78
 * Output : Greater : 78
 *
 * Logic:
 * - Compare first number with second
 * - Print greater value
 * - Handle equality case separately
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LargestOfTwoNumbers {

    /**
     * Compares two integers and prints the larger value.
     *
     * @param a first number
     * @param b second number
     */
    static void printLargest(int a, int b) {

        if (a > b) {
            System.out.println("Greater : " + a);

        } else if (a < b) {
            System.out.println("Greater : " + b);

        } else {
            System.out.println("Both are equal");
        }
    }

    public static void main(String[] args) {

        // 🔹 Method call
        printLargest(56, 78);
    }
}
