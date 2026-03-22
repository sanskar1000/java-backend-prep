package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TriangleValidityChecker
 * Topic        : Nested if-else
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether three sides can form a
 * valid triangle using nested if-else statements.
 *
 * Triangle Condition:
 * • Sum of any two sides must be greater than third
 *
 * Key Concepts:
 * • Nested if-else
 * • Triangle inequality theorem
 *
 * Example:
 * Input  : 3, 4, 5
 * Output : Triangle is valid
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class TriangleValidityChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {

            if (a + b > c) {

                if (a + c > b) {

                    if (b + c > a) {
                        System.out.println("Triangle is valid");
                    } else {
                        System.out.println("Triangle is not valid");
                    }

                } else {
                    System.out.println("Triangle is not valid");
                }

            } else {
                System.out.println("Triangle is not valid");
            }

        } else {
            System.out.println("Sides must be positive");
        }

        sc.close();
    }
}
