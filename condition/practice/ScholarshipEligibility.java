package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ScholarshipEligibility 
 * Topic        : Nested if-else
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program determines scholarship eligibility
 * based on marks, family income, and attendance.
 *
 * Rules:
 * • Minimum marks ≥ 75
 * • Family income ≤ ₹2,50,000
 * • Attendance ≥ 75%
 * • Marks ≥ 90 → Full Scholarship
 * • Else → Partial Scholarship
 *
 * Key Concepts:
 * • Nested conditions
 * • Input validation
 * • Real-world decision making
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ScholarshipEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        System.out.print("Enter family income: ");
        double income = sc.nextDouble();

        System.out.print("Enter attendance (%): ");
        double attendance = sc.nextDouble();

        // Input validation
        if (marks < 0 || marks > 100 || attendance < 0 || attendance > 100 || income < 0) {
            System.out.println("Invalid input ❌");
            return;
        }

        // Conditions
        if (marks < 75) {
            System.out.println("Not eligible: Low marks ❌");
            return;
        }

        if (income > 250000) {
            System.out.println("Not eligible: Income too high ❌");
            return;
        }

        if (attendance < 75) {
            System.out.println("Not eligible: Low attendance ❌");
            return;
        }

        if (marks >= 90) {
            System.out.println("Eligible for Full Scholarship 🎓");
        } else {
            System.out.println("Eligible for Partial Scholarship 🎓");
        }

        sc.close();
    }
}
