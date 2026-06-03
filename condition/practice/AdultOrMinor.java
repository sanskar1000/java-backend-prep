// Practice Program : Check Person is Adult or Minor

package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : AdultOrMinor
 * Topic        : If-Else Condition in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a person is:
 * - Adult
 * - Minor
 *
 * based on the entered age.
 *
 * Concepts Used:
 * - User Input
 * - Scanner Class
 * - if-else condition
 * - Relational Operators
 *
 * ------------------------------------------------------------
 */

public class AdultOrMinor {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take age input
        System.out.print("Enter person's age : ");
        int age = sc.nextInt();

        // Check condition
        if (age >= 18) {

            System.out.println("Person is Adult");

        } else {

            System.out.println("Person is Minor");
        }

        // Close Scanner
        sc.close();
    }
}
