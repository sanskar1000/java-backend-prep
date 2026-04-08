package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PrintReverseNumbers
 * Topic        : Loops (for loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints numbers from N to 1
 * using a reverse for loop.
 *
 * Input:
 * • A positive integer N
 *
 * Output:
 * • Numbers from N down to 1
 *
 * Example:
 * Input  : 5
 * Output : 5 4 3 2 1
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrintReverseNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Please enter a positive number");
            sc.close();
            return;
        }

        System.out.println("✔ Numbers from " + n + " to 1:");

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
