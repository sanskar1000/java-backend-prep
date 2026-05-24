package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DoubleArrayElements
 * Topic        : Arrays (Array Modification)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - doubles each array element
 * - displays updated array
 *
 * Concepts Used:
 * - arrays
 * - traversal
 * - in-place modification
 * - methods
 * - enhanced for-loop
 * - Scanner class
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DoubleArrayElements {

    /**
     * Doubles all array elements.
     *
     * @param arr input array
     */
    static void doubleElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] *= 2;
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

        // 🔹 Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // 🔹 Double elements
        doubleElements(arr);

        // 🔹 Output updated array
        System.out.print("Updated array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        sc.close();
    }
}
