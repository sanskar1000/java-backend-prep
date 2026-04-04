package loops;

/**
 * ------------------------------------------------------------
 * Program Name : ForLoopDemo
 * Topic        : Java Loops
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of a basic for loop.
 *
 * A for loop is used when the number of iterations
 * is known in advance.
 *
 * Syntax:
 * for (initialization; condition; update) {
 *     // code block
 * }
 *
 * In this example:
 * • Initialization : int i = 1
 * • Condition      : i <= 5
 * • Update         : i++
 *
 * The loop prints numbers from 1 to 5.
 *
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ForLoopDemo {

    public static void main(String[] args) {

        // Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i); // print current value
        }
    }
}
