package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : EvenOddCounter
 * Topic        : Arrays (Even & Odd Counting)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - stores elements in an array
 * - counts even and odd numbers
 *
 * Concepts Used:
 * - arrays
 * - enhanced for-loop
 * - conditional statements
 * - counting logic
 * - Scanner class
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class EvenOddCounter {

    /**
     * Counts even and odd elements in array.
     *
     * @param arr input array
     */
    static void countEvenOdd(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int element : arr) {

            if (element % 2 == 0) {

                evenCount++;

            } else {

                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers : " + oddCount);
    }

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

        // 🔹 Input elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // 🔹 Count even and odd
        countEvenOdd(arr);

        sc.close();
    }
}
