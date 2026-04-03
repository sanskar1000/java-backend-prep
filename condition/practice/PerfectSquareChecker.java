package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PerfectSquareChecker
 * Topic        : Mathematical Logic
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given number
 * is a perfect square.
 *
 * A number is a perfect square if:
 * √n × √n = n (where √n is an integer)
 *
 * Example:
 * Input  : 25
 * Output : Perfect square
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PerfectSquareChecker {

    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;

        int root = (int) Math.sqrt(num);
        return root * root == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isPerfectSquare(num)) {
            System.out.println("✔ Perfect square");
        } else {
            System.out.println("❌ Not a perfect square");
        }

        sc.close();
    }
}
