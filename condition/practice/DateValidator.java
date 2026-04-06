package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DateValidator
 * Topic        : Conditional Statements
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given date is valid.
 *
 * Rules:
 * • Month must be between 1–12
 * • Day must be valid for the given month
 * • February has:
 *     - 28 days (normal year)
 *     - 29 days (leap year)
 *
 * Leap Year Logic:
 * • Divisible by 4 AND not by 100
 * • OR divisible by 400
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DateValidator {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean isValid = true;

        // Basic validation
        if (day <= 0 || month <= 0 || month > 12 || year <= 0) {
            isValid = false;
        } 
        else {
            boolean isLeap = isLeapYear(year);

            if (month == 2) {
                if ((isLeap && day > 29) || (!isLeap && day > 28)) {
                    isValid = false;
                }
            } 
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30) {
                    isValid = false;
                }
            } 
            else {
                if (day > 31) {
                    isValid = false;
                }
            }
        }

        if (isValid) {
            System.out.println("✔ Valid Date");
        } else {
            System.out.println("❌ Invalid Date");
        }

        sc.close();
    }
}
