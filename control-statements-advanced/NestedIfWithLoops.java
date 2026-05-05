/**
 * ------------------------------------------------------------
 * Program Name : NestedIfWithLoops
 * Topic        : Control Statements (Nested if + Loops)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of:
 * 1. for loop (iteration)
 * 2. nested if statements (decision making)
 *
 * The program iterates numbers from 1 to 10 and:
 * - Checks if a number is even
 * - If even, further checks whether it is divisible by 4
 *
 * Output Behavior:
 * - Only even numbers are considered
 * - Among them:
 *      • If divisible by 4 → prints special message
 *      • Otherwise → prints general even message
 *
 * Example Output:
 * 2 is even but not divisible by 4
 * 4 is divisible by 4
 * 6 is even but not divisible by 4
 * 8 is divisible by 4
 * 10 is even but not divisible by 4
 *
 * Logic Flow:
 * for i = 1 to 10
 *   └── if i % 2 == 0 (even check)
 *         └── if i % 4 == 0
 *                → divisible by 4
 *             else
 *                → even but not divisible by 4
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

package controlstatementsadvanced;

public class NestedIfWithLoops {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            // 🔹 Check if number is even
            if (i % 2 == 0) {

                // 🔹 Nested condition: check divisibility by 4
                if (i % 4 == 0) {
                    System.out.println(i + " is divisible by 4");
                } else {
                    System.out.println(i + " is even but not divisible by 4");
                }
            }
        }
    }
}
