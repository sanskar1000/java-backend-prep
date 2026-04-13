package condition;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : NestedIfDemo
 * Topic        : Conditional Statements (Nested if)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of nested if statements
 * to validate user eligibility based on multiple conditions.
 *
 * Conditions:
 * • Age must be 18 or above
 * • User must have a valid ID card
 *
 * Logic:
 * • Outer if → checks age eligibility
 * • Inner if → checks ID availability
 *
 * Input:
 * • Integer (age)
 * • Boolean (ID status)
 *
 * Output:
 * • Displays whether the user is allowed to enter or not
 *
 * Example:
 * Input  : age = 20, hasId = true
 * Output : You are allowed to enter.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class NestedIfDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Do you have an ID card? (true/false): ");
        boolean hasId = sc.nextBoolean();

        if (age >= 18) { // Outer condition: age check

            if (hasId) { // Inner condition: ID check
                System.out.println("✔ You are allowed to enter.");
            } else {
                System.out.println("❌ ID card required.");
            }

        } else {
            System.out.println("❌ Not eligible due to age.");
        }

        sc.close();
    }
}
