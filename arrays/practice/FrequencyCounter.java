package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : FrequencyCounter
 * Topic        : Arrays (Frequency Counting)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - searches for a target element
 * - counts its frequency in the array
 *
 * Concepts Used:
 * - arrays
 * - enhanced for-loop
 * - counting logic
 * - methods
 * - Scanner class
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class FrequencyCounter {

    /**
     * Counts frequency of target element.
     *
     * @param arr input array
     * @param target target element
     * @return frequency count
     */
    static int findFrequency(int[] arr, int target) {

        int count = 0;

        for (int element : arr) {

            if (element == target) {

                count++;
            }
        }

        return count;
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

        // 🔹 Input target
        System.out.print("Enter target number: ");

        int target = sc.nextInt();

        // 🔹 Frequency calculation
        int frequency = findFrequency(arr, target);

        // 🔹 Output
        System.out.println("Frequency of " + target + " = " + frequency);

        sc.close();
    }
}
