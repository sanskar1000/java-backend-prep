/**
 * ------------------------------------------------------------
 * Program Name : LabeledBreak
 * Topic        : Control Statements (Labeled break)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of a labeled break
 * statement in Java.
 *
 * Normally:
 * - A simple break statement exits only the nearest loop.
 *
 * But:
 * - A labeled break can terminate an outer loop directly.
 *
 * In this program:
 * - Two nested loops are used.
 * - When i == 2 and j == 2,
 *   the statement:
 *
 *       break outerLoop;
 *
 *   immediately exits BOTH loops.
 *
 * Execution stops completely after that condition.
 *
 * ------------------------------------------------------------
 * Concept Demonstrated:
 *
 * Label Syntax:
 *
 *      labelName:
 *      loop {
 *          ...
 *      }
 *
 * Labeled Break:
 *
 *      break labelName;
 *
 * ------------------------------------------------------------
 * Output:
 *
 * i = 1, j = 1
 * i = 1, j = 2
 * i = 1, j = 3
 * i = 2, j = 1
 *
 * Program terminates when:
 * i = 2 and j = 2
 *
 * ------------------------------------------------------------
 */

package controlstatementsadvanced;

public class LabeledBreak {

    public static void main(String[] args) {

        // Label attached to outer loop
        outerLoop:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                // Condition to terminate both loops
                if (i == 2 && j == 2) {

                    // Exits outer loop directly
                    break outerLoop;
                }

                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
