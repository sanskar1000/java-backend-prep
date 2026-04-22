package loops;

/**
 * ------------------------------------------------------------
 * Program Name : WhileLoopDemo
 * Topic        : While Loop (Iteration Control Structure)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of a while loop in Java.
 * A while loop executes a block of code repeatedly as long as
 * the given condition evaluates to true.
 *
 * In this example:
 * - The loop starts from 0
 * - It continues until the value becomes 5
 * - Each value is printed on a new line
 *
 * Example Output:
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 * Key Concept:
 * while(condition) {
 *     // code to execute
 * }
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class WhileLoopDemo {

    public static void main(String[] args) {

        // 🔹 Initialization
        int i = 0;

        // 🔹 Loop runs while condition is true
        while (i < 6) {

            // 🔹 Print current value
            System.out.println(i);

            // 🔹 Increment to avoid infinite loop
            i++;
        }
    }
}
