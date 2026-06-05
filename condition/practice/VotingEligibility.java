package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : VotingEligibility
 * Topic        : If-Else Conditions
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a person
 * is eligible to vote or not based on age.
 *
 * Voting Rules:
 * - Age must be between 1 and 129
 * - Age >= 18 → Eligible
 * - Age < 18  → Not Eligible
 *
 * Concepts Used:
 * - Conditional Statements
 * - if-else-if ladder
 * - Input Validation
 * - User Input using Scanner
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter age : ");

        int age = sc.nextInt();

        // Validate age
        if (age <= 0 || age >= 130) {

            System.out.println("Enter a valid age.");

        }

        // Eligible to vote
        else if (age >= 18) {

            System.out.println(
                    "Person is eligible to vote."
            );

        }

        // Not eligible
        else {

            System.out.println(
                    "Person is not eligible to vote."
            );
        }

        // Close scanner
        sc.close();
    }
}
