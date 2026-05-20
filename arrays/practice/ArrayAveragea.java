package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayAverage
 * Topic        : Arrays and Methods
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program:
 * - takes array input from user
 * - stores elements in an array
 * - calculates the average of all elements
 * using a separate helper method
 *
 * Concepts Used:
 * - arrays
 * - methods
 * - enhanced for-loop
 * - aggregation logic
 * - parameter passing
 * - Scanner class
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ArrayAverage {

    /**
     * Calculates average of array elements.
     *
     * @param arr input array
     * @return average value
     */
    static double calculateAverage(int[] arr) {

        double sum = 0;

        for (int element : arr) {

            sum += element;
        }

        return sum / arr.length;
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

        // 🔹 Calculate average
        double avg = calculateAverage(arr);

        // 🔹 Output
        System.out.printf("Average of array: %.2f%n", avg);

        sc.close();
    }
}
