package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ReverseArrays
 * Topic        : Arrays (Two Pointer Technique)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input
 * - reverses the array in-place
 * - displays original and reversed array
 *
 * Concepts Used:
 * - arrays
 * - swapping
 * - two-pointer technique
 * - in-place modification
 * - traversal
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ReverseArray {

    /**
     * Reverses array using two-pointer technique.
     *
     * @param arr input array
     */
    static void reverseArray(int[] arr) {

        int left = 0;

        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;

            right--;
        }
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

        // 🔹 Original array
        System.out.print("Original Array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        System.out.println();

        // 🔹 Reverse array
        reverseArray(arr);

        // 🔹 Display reversed array
        System.out.print("Reversed Array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        sc.close();
    }
}
