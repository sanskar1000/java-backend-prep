package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArraySum
 * Topic        : Arrays (Summation)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - stores elements in an array
 * - calculates the sum of all elements
 *
 * Concepts Used:
 * - arrays
 * - loops
 * - enhanced for-loop
 * - accumulation logic
 * - Scanner class
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Input size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // 🔹 Validation
        if (n <= 0) {

            System.out.println("Invalid size");

            sc.close();
            return;
        }

        // 🔹 Array declaration
        int[] arr = new int[n];

        // 🔹 Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // 🔹 Calculate sum
        int sum = 0;

        for (int element : arr) {

            sum += element;
        }

        // 🔹 Output
        System.out.println("Sum of array: " + sum);

        sc.close();
    }
}
