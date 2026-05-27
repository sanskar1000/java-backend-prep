package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SwapFirstLastElement
 * Topic        : Array Element Swapping
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program swaps:
 * - first element of array
 * - last element of array
 *
 * Concepts Used:
 * - arrays
 * - indexing
 * - swapping
 * - temporary variable
 * - in-place modification
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SwapFirstLastElement {

    /**
     * Swaps first and last elements of array.
     *
     * @param arr input array
     */
    static void swapFirstLastElements(int[] arr) {

        int temp = arr[0];

        arr[0] = arr[arr.length - 1];

        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");

        int n = sc.nextInt();

        // Validation
        if (n <= 0) {

            System.out.println("Invalid size");

            sc.close();

            return;
        }

        // Array creation
        int[] arr = new int[n];

        // Input array
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.print("Original Array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        System.out.println();

        // Swap elements
        swapFirstLastElements(arr);

        // Display updated array
        System.out.print("Updated Array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        sc.close();
    }
}
