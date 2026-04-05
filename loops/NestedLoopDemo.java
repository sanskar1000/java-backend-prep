package loops;

/**
 * Class: NestedLoopDemo
 * 
 * Description:
 * This program demonstrates the use of nested loops in Java.
 * A nested loop means a loop inside another loop.
 * 
 * In this example:
 * - The outer loop controls the number of rows.
 * - The inner loop controls the number of columns.
 * 
 * The program prints a rectangular pattern of stars (*).
 * 
 * Output:
 * * * * 
 * * * * 
 * * * * 
 * 
 * Concepts Covered:
 * - for loop
 * - nested loops
 * - row-column pattern logic
 * 
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 */
public class NestedLoopDemo {

    public static void main(String[] args) {

        System.out.println("Example 1: Row-Column Structure");

        // Outer loop → controls rows (runs 3 times)
        for (int i = 1; i <= 3; i++) {

            // Inner loop → controls columns (runs 4 times per row)
            for (int j = 1; j <= 4; j++) {

                // Print star without moving to next line
                System.out.print("* ");
            }

            // Move to next line after completing one row
            System.out.println();
        }
    }
}
