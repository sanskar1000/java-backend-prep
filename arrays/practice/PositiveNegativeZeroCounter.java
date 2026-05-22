package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PositiveNegativeZeroCounter
 * Topic        : Arrays (Classification Counting)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - stores elements in an array
 * - counts positive, negative, and zero elements
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

public class PositiveNegativeZeroCounter {

    /**
     * Counts positive, negative, and zero elements.
     *
     * @param arr input array
     */
    static void countNumbers(int[] arr) {

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int element : arr) {

            if (element > 0) {

                countPositive++;

            } else if (element < 0) {

                countNegative++;

            } else {

                countZero++;
            }
        }

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zeros           : " + countZero);
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

        // 🔹 Count numbers
        countNumbers(arr);

        sc.close();
    }
}
