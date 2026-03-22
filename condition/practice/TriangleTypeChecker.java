package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TriangleTypeChecker
 * Topic        : Nested if-else
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program determines the type of triangle based
 * on the lengths of its sides.
 *
 * Types:
 * • Equilateral → All sides equal
 * • Isosceles   → Two sides equal
 * • Scalene     → All sides different
 *
 * Note:
 * Triangle validity is checked before classification.
 *
 * Key Concepts:
 * • Nested if-else
 * • Triangle inequality theorem
 *
 * Example:
 * Input  : 3, 3, 3
 * Output : Equilateral Triangle
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class TriangleTypeChecker {

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

                        // Triangle is valid → now check type
                        if (a == b && b == c) {
                            System.out.println("Equilateral Triangle");
                        } else if (a == b || b == c || a == c) {
                            System.out.println("Isosceles Triangle");
                        } else {
                            System.out.println("Scalene Triangle");
                        }

                    } else {
                        System.out.println("Invalid Triangle");
                    }

                } else {
                    System.out.println("Invalid Triangle");
                }

            } else {
                System.out.println("Invalid Triangle");
            }

        } else {
            System.out.println("Sides must be positive");
        }

        sc.close();
    }
}
