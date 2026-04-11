package condition;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : IfElseDemo
 * Topic        : Conditional Statements (if-else)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of an if-else statement
 * to check whether a given number is even or odd.
 *
 * Logic:
 * • If number % 2 == 0 → Even
 * • Else → Odd
 *
 * Input:
 * • An integer number
 *
 * Output:
 * • Displays whether the number is even or odd
 *
 * Example:
 * Input  : 8
 * Output : Number is even.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class IfElseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("✔ Number is even.");
        } else {
            System.out.println("✔ Number is odd.");
        }

        sc.close();
    }
}
