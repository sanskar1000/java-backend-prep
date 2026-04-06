package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TimeFormatChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given time
 * is in AM or PM format.
 *
 * Time Format:
 * • Hour   : 0–23
 * • Minute : 0–59
 *
 * Rules:
 * • 00:00 → 11:59 → AM
 * • 12:00 → 23:59 → PM
 *
 * Examples:
 * 09:30 → AM
 * 14:45 → PM
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class TimeFormatChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0–23): ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes (0–59): ");
        int minute = sc.nextInt();

        // Validate input
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("❌ Invalid time");
            sc.close();
            return;
        }

        // AM / PM classification
        if (hour < 12) {
            System.out.println("✔ Time is in AM");
        } else {
            System.out.println("✔ Time is in PM");
        }

        sc.close();
    }
}
