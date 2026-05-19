package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ReverseArray
 * Topic        : Arrays (Reverse Traversal)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - stores elements in an array
 * - prints array elements in reverse order
 *
 * Concepts Used:
 * - arrays
 * - reverse traversal
 * - loops
 * - indexing
 * - Scanner class
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ReverseArray {

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

        // 🔹 Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // 🔹 Reverse traversal
        System.out.print("Reverse array: ");

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
