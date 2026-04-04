package loops;

/**
 * ------------------------------------------------------------
 * Program Name : DoWhileLoopDemo
 * Topic        : Java Loops
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of a do-while loop.
 *
 * A do-while loop:
 * • Executes the loop body at least once
 * • Checks the condition after execution
 *
 * Syntax:
 * do {
 *     // code block
 * } while (condition);
 *
 * In this example:
 * • The loop starts from 0
 * • Prints numbers up to 4
 *
 * Output:
 * 0
 * 1
 * 2
 * 3
 * 4
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DoWhileLoopDemo {

    public static void main(String[] args) {

        int i = 0;

        // do-while loop executes at least once
        do {
            System.out.println(i); // print current value
            i++;                   // increment counter
        } 
        while (i < 5);             // condition check

    }
}
