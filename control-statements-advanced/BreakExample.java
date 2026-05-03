//Demonstrates control-statments
package controlstatementsadvanced;

/**
 * ------------------------------------------------------------
 * Program Name : BreakExample.java
 * Topic        : control-statments
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of an break statement 
 * to classify break statement 
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class BreakExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;   // loop stops when i becomes 5
            }

            System.out.println(i);
        }
    }
}
