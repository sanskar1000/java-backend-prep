package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MoveZerosToEnd
 * Topic        : Two Pointer Technique
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program moves all zeros to the end of array
 * while maintaining the relative order of non-zero elements.
 *
 * Concepts Used:
 * - arrays
 * - two-pointer technique
 * - swapping
 * - in-place modification
 * - array traversal
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MoveZerosToEnd {

    /**
     * Moves all zeros to end of array.
     *
     * @param arr input array
     */
    static void moveZerosToEnd(int[] arr) {

        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                // Avoid unnecessary swap
                if (i != index) {

                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }

                index++;
            }
        }
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

        // Move zeros
        moveZerosToEnd(arr);

        // Display updated array
        System.out.print("Updated Array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        sc.close();
    }
}
