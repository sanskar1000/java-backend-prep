package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayCopyDemo
 * Topic        : Arrays (Copying Arrays)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input
 * - creates a copy of the array
 * - displays original and copied arrays
 *
 * Concepts Used:
 * - arrays
 * - array traversal
 * - returning arrays
 * - memory allocation
 * - methods
 * - enhanced for-loop
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ArrayCopyDemo {

    /**
     * Creates and returns a copy of an array.
     *
     * @param arr original array
     * @return copied array
     */
    static int[] copyArray(int[] arr) {

        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            copy[i] = arr[i];
        }

        return copy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Input size
        System.out.print("Enter size of array: ");

        int n = sc.nextInt();

        // 🔹 Validation
        if (n <= 0) {

            System.out.println("Invalid size");

            sc.close();

            return;
        }

        // 🔹 Array declaration
        int[] arr = new int[n];

        // 🔹 Input array
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // 🔹 Display original array
        System.out.print("Original array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        System.out.println();

        // 🔹 Copy array
        int[] copy = copyArray(arr);

        // 🔹 Display copied array
        System.out.print("Copied array: ");

        for (int element : copy) {

            System.out.print(element + " ");
        }

        sc.close();
    }
}
