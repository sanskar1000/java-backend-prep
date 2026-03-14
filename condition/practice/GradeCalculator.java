package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : GradeCalculator
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the grade of a student based on
 * the marks entered by the user.
 *
 * Grading Criteria:
 * • Marks ≥ 90  → Grade A
 * • Marks ≥ 75  → Grade B
 * • Marks ≥ 60  → Grade C
 * • Marks ≥ 33  → Grade D
 * • Marks < 33  → Fail
 *
 * Key Concepts:
 * • User input using Scanner
 * • Conditional statements (if-else if)
 * • Logical comparison operators
 *
 * Example:
 * Input  : 82
 * Output : Grade B
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 33) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
