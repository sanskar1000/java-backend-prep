package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StudentPassChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a student has passed
 * all subjects based on marks.
 *
 * Passing Criteria:
 * • Minimum 33 marks required in each subject
 *
 * Key Concepts:
 * • Conditional statements
 * • Logical AND (&&)
 *
 * Example:
 * Input  : 50, 60, 40
 * Output : Student has passed all subjects
 *
 * Input  : 50, 20, 40
 * Output : Student has failed
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StudentPassChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks in subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks in subject 3: ");
        int s3 = sc.nextInt();

        // validation
        if (s1 < 0 || s2 < 0 || s3 < 0) {
            System.out.println("Invalid marks");
            return;
        }

        if (s1 >= 33 && s2 >= 33 && s3 >= 33) {
            System.out.println("Student has passed all subjects");
        } else {
            System.out.println("Student has failed");
        }

        sc.close();
    }
}
