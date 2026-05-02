/**
 * Program Name: ContinueExample
 * Package: controlstatementsadvanced
 *
 * Description:
 * This program demonstrates the use of the 'continue' statement in Java.
 * The 'continue' statement is used to skip the current iteration of a loop
 * and move directly to the next iteration.
 *
 * In this example:
 * - A for loop runs from 1 to 5.
 * - When the value of 'i' becomes 3, the 'continue' statement is executed.
 * - This skips printing the value 3.
 *
 * Output:
 * 1
 * 2
 * 4
 * 5
 *
 * Author: Aradhya thakur 
 * Date: (2-52025)
 */

package controlstatementsadvanced;

public class ContinueExample {

    /**
     * Main method - entry point of the program
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {

            // Check if i is equal to 3
            if (i == 3) {
                continue;   // Skip the rest of the loop when i = 3
            }

            // Print the value of i
            System.out.println(i);
        }
    }
}
