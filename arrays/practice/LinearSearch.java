package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LinearSearch
 * Topic        : Arrays (Searching)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - searches for a target element
 * using linear search algorithm
 *
 * Concepts Used:
 * - arrays
 * - loops
 * - searching algorithms
 * - methods
 * - return values
 * - Scanner class
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LinearSearch {

    /**
     * Searches target element using linear search.
     *
     * @param arr input array
     * @param target element to search
     * @return index if found, otherwise -1
     */
    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                return i;
            }
        }

        return -1;
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

        // 🔹 Input array
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // 🔹 Input target
        System.out.print("Enter target element: ");

        int target = sc.nextInt();

        // 🔹 Search operation
        int index = linearSearch(arr, target);

        // 🔹 Output result
        if (index != -1) {

            System.out.println("Element found at index: " + index);

        } else {

            System.out.println("Element not found");
        }

        sc.close();
    }
}
