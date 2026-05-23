package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ReplaceNegatives
 * Topic        : Arrays (Array Modification)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - replaces all negative elements with 0
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

public class ReplaceNegatives {

    /**
     * Replaces negative elements with 0.
     *
     * @param arr input array
     */
    static void replaceNegatives(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {

                arr[i] = 0;
            }
        }
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

        // 🔹 Replace negatives
        replaceNegatives(arr);

        // 🔹 Output updated array
        System.out.print("Updated array: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        sc.close();
    }
}
