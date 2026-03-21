package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LeapYearChecker
 * Topic        : Nested if-else
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given year is a leap year
 * using nested if-else statements.
 *
 * Leap Year Rules:
 * • Divisible by 4 → Leap year
 * • Divisible by 100 → Not leap year
 * • Divisible by 400 → Leap year
 *
 * Key Concepts:
 * • Nested if-else
 * • Modulus operator (%)
 *
 * Example:
 * Input  : 2000
 * Output : It is a leap year
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LeapYearChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year");
            return;
        }

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }

            } else {
                System.out.println("It is a leap year");
            }

        } else {
            System.out.println("It is not a leap year");
        }

        sc.close();
    }
}
