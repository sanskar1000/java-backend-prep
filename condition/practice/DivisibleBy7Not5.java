package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DivisibleBy7Not5
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a number is:
 * • Divisible by 7
 * • NOT divisible by 5
 *
 * Condition:
 * num % 7 == 0 AND num % 5 != 0
 *
 * Example:
 * Input  : 14
 * Output : Condition satisfied
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DivisibleBy7Not5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 7 == 0 && num % 5 != 0) {
            System.out.println("Condition satisfied ✔ (Divisible by 7 but not by 5)");
        } else {
            System.out.println("Condition NOT satisfied ❌");
        }

        sc.close();
    }
}
