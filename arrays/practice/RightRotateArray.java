package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RightRotateArray
 * Topic        : Array Rotation
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program performs:
 * - right rotation of array by one position
 * - in-place array modification
 *
 * Concepts Used:
 * - arrays
 * - shifting elements
 * - temporary variable
 * - reverse traversal
 * - in-place algorithms
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RightRotateArray {

    /**
     * Rotates array right by one position.
     *
     * @param arr input array
     */
    static void rotateArray(int[] arr) {

        // Store last element
        int temp = arr[arr.length - 1];

        // Shift elements right
        for (int i = arr.length - 1; i >= 1; i--) {

            arr[i] = arr[i - 1];
        }

        // Place last element at first position
        arr[0] = temp;
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
