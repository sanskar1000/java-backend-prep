package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LargestOfFourNumbers
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the largest among four numbers.
 *
 * It compares all values using conditional statements
 * and prints the maximum value.
 *
 * Key Concepts:
 * • if-else ladder
 * • Comparison operators
 *
 * Example:
 * Input  : 10, 20, 30, 40
 * Output : Largest number is: 40
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LargestOfFourNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Largest number is: " + max);

        sc.close();
    }
}
