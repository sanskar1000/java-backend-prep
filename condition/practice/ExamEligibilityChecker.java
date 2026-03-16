package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ExamEligibilityChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a student is eligible to
 * appear for an exam based on attendance percentage.
 *
 * Rule:
 * • Attendance ≥ 75% → Eligible for exam
 * • Attendance < 75% → Not eligible for exam
 *
 * Key Concepts:
 * • User input using Scanner
 * • Percentage calculation
 * • Conditional statements (if-else)
 *
 * Example:
 * Input:
 * Total Classes  : 100
 * Classes Attended : 80
 *
 * Output:
 * Attendance = 80%
 * Eligible for exam
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ExamEligibilityChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of classes: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attendedClasses = sc.nextInt();

        double attendance = (attendedClasses * 100.0) / totalClasses;

        System.out.println("Attendance = " + attendance + "%");

        if (attendance >= 75) {
            System.out.println("Student is eligible for the exam.");
        } else {
            System.out.println("Student is not eligible for the exam.");
        }

        sc.close();
    }
}
