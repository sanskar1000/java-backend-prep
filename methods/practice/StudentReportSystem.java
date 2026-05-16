package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : StudentReportSystem
 * Topic        : Methods & Student Report Generation
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program generates a
 * student report card using methods.
 *
 * Features:
 * - Total marks calculation
 * - Average calculation
 * - Percentage calculation
 * - Grade generation
 *
 * Subjects:
 * - Maths
 * - English
 * - Hindi
 * - Chemistry
 * - Physics
 *
 * Concepts Used:
 * - methods
 * - method reuse
 * - conditional statements
 * - input validation
 * - formatted output
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class StudentReportSystem {

    /**
     * Returns total marks.
     */
    static int inputMarks(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    /**
     * Returns average marks.
     */
    static double calculateAverage(int a, int b, int c, int d, int e) {
        return inputMarks(a, b, c, d, e) / 5.0;
    }

    /**
     * Returns percentage.
     */
    static double calculatePercentage(int a, int b, int c, int d, int e) {
        return inputMarks(a, b, c, d, e) * 100 / 500.0;
    }

    /**
     * Returns grade based on percentage.
     */
    static String findGrade(double percentage) {

        if (percentage >= 90) {
            return "Grade A";

        } else if (percentage >= 80) {
            return "Grade B";

        } else if (percentage >= 70) {
            return "Grade C";

        } else if (percentage >= 60) {
            return "Grade D";

        } else if (percentage >= 40) {
            return "Grade E";

        } else {
            return "Failed";
        }
    }

    /**
     * Displays full student report.
     */
    static void displayReport(int a, int b, int c, int d, int e) {

        int total = inputMarks(a, b, c, d, e);

        double average = calculateAverage(a, b, c, d, e);

        double percentage = calculatePercentage(a, b, c, d, e);

        String grade = findGrade(percentage);

        System.out.println("\n------ Student Report ------");

        System.out.println("Total Marks : " + total);

        System.out.printf("Average     : %.2f%n", average);

        System.out.printf("Percentage  : %.2f%%%n", percentage);

        System.out.println("Grade       : " + grade);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Input marks
        System.out.print("Enter Maths marks : ");
        int mark1 = sc.nextInt();

        System.out.print("Enter English marks : ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Hindi marks : ");
        int mark3 = sc.nextInt();

        System.out.print("Enter Chemistry marks : ");
        int mark4 = sc.nextInt();

        System.out.print("Enter Physics marks : ");
        int mark5 = sc.nextInt();

        // 🔹 Validation
        if (mark1 < 0 || mark2 < 0 || mark3 < 0
                || mark4 < 0 || mark5 < 0) {

            System.out.println("Invalid marks");

            sc.close();
            return;
        }

        // 🔹 Display report
        displayReport(mark1, mark2, mark3, mark4, mark5);

        sc.close();
    }
}
