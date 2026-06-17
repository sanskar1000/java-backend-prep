package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MaximumSumSubarrayOfSizeK
 * Topic        : Sliding Window Technique
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the maximum sum of any
 * contiguous subarray of size K using the
 * Sliding Window Technique.
 *
 * Example:
 * Array : [2, 1, 5, 1, 3, 2]
 * K     : 3
 *
 * Subarrays:
 * [2, 1, 5] = 8
 * [1, 5, 1] = 7
 * [5, 1, 3] = 9
 * [1, 3, 2] = 6
 *
 * Maximum Sum = 9
 *
 * Concepts Used:
 * - Arrays
 * - Sliding Window
 * - Optimization
 * - Window Expansion & Shrinking
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds maximum sum of any subarray of size k.
     *
     * @param arr input array
     * @param k   window size
     * @return maximum window sum
     */
    static int findMaximumSumSubarray(int[] arr, int k) {

        if (k <= 0 || k > arr.length) {
            return Integer.MIN_VALUE;
        }

        int windowSum = 0;

        // Calculate first window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maximumSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum =
                    windowSum
                            - arr[i - k]
                            + arr[i];

            maximumSum =
                    Math.max(
                            maximumSum,
                            windowSum
                    );
        }

        return maximumSum;
    }

    /**
     * Prints array elements.
     *
     * @param arr array to print
     */
    static void printArray(int[] arr) {

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        if (size <= 0) {

            System.out.println(
                    "Invalid array size."
            );

            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size (k) : ");
        int k = sc.nextInt();

        int maximumSum =
                findMaximumSumSubarray(arr, k);

        if (maximumSum == Integer.MIN_VALUE) {

            System.out.println(
                    "Invalid window size."
            );

        } else {

            System.out.println();

            System.out.print("Array : ");
            printArray(arr);

            System.out.println(
                    "Maximum Sum Subarray of Size "
                            + k
                            + " : "
                            + maximumSum
            );
        }

        sc.close();
    }
}
