import java.util.Scanner;


/**
 * ------------------------------------------------------------
 * Program Name : ExamResultClassification
 * Topic        : Conditional Statements
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program evaluates exam results based on marks
 * of 5 subjects without using arrays.
 *
 * Rules:
 * • Marks must be between 0 and 100
 * • Minimum 33 required in each subject to pass
 *
 * Categories:
 * • Distinction     → ≥ 75%
 * • First Division  → ≥ 60%
 * • Second Division → ≥ 50%
 * • Fail            → Any subject < 33
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Exam Result Classification -----");

        System.out.print("Enter marks of 5 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        // Validate marks
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100 || m4 < 0 || m4 > 100 ||
            m5 < 0 || m5 > 100) {
            System.out.println("Invalid marks");
            return;
        }

        // Check fail in any subject
        if (m1 < 33 || m2 < 33 || m3 < 33 || m4 < 33 || m5 < 33) {
            System.out.println("Fail");
            return;
        }

        double total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5;

        if (percentage >= 75) {
            System.out.println("Distinction");
        } else if (percentage >= 60) {
            System.out.println("First Division");
        } else {
            System.out.println("Second Division");
        }

        sc.close();
    }
} 
