package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MinimumElement
 * Topic        : Arrays (Minimum Element)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - stores elements in an array
 * - finds the minimum element
 * using linear traversal
 *
 * Concepts Used:
 * - arrays
 * - loops
 * - comparison logic
 * - methods
 * - indexing
 * - Scanner class
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class MinimumElement {

    /**
     * Finds minimum element in array.
     *
     * @param arr input array
     * @return minimum element
     */
    static int calculateMinimum(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {

                min = arr[i];
            }
        }

        return min;
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

        // 🔹 Find minimum
        int min = calculateMinimum(arr);

        // 🔹 Output
        System.out.println("Minimum element in array: " + min);

        sc.close();
    }
}
