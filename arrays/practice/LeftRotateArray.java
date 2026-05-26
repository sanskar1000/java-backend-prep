package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RotateArray
 * Topic        : Array Rotation
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program performs:
 * - left rotation of array by one position
 * - in-place array modification
 *
 * Concepts Used:
 * - arrays
 * - shifting elements
 * - temporary variable
 * - traversal
 * - in-place algorithms
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RotateArray {

    /**
     * Rotates array left by one position.
     *
     * @param arr input array
     */
    static void rotateArray(int[] arr) {

        int temp = arr[0];

        // Shift elements left
        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }

        // Place first element at end
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

        // Original array
        System.out.print("Original Array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        System.out.println();

        // Rotate array
        rotateArray(arr);

        // Display rotated array
        System.out.print("Rotated Array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        sc.close();
    }
}
