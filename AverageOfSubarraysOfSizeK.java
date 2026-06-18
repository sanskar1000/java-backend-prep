package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : AverageOfSubarraysOfSizeK
 * Topic        : Sliding Window Technique
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints the average of every
 * contiguous subarray (window) of size K.
 *
 * Example:
 * Array : [1, 3, 2, 6, -1, 4, 1, 8, 2]
 * K     : 5
 *
 * Output:
 * 2.20
 * 2.80
 * 2.40
 * 3.60
 * 2.80
 *
 * Concepts Used:
 * - Arrays
 * - Sliding Window
 * - Window Sum
 * - Average Calculation
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Prints average of every subarray of size k.
     *
     * @param arr input array
     * @param k   window size
     */
    static void printAverageOfSubarrays(
            int[] arr,
            int k
    ) {

        if (k <= 0 || k > arr.length) {

            System.out.println(
                    "Invalid window size."
            );

            return;
        }

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        System.out.println(
                "\n----- Average Of Every Window -----"
        );

        System.out.printf(
                "Window 1 Average : %.2f%n",
                (double) windowSum / k
        );

        int windowNumber = 2;

        // Slide window
        for (int i = k; i < arr.length; i++) {

            windowSum =
                    windowSum
                            - arr[i - k]
                            + arr[i];

            System.out.printf(
                    "Window %d Average : %.2f%n",
                    windowNumber++,
                    (double) windowSum / k
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter array size : "
        );

        int size = sc.nextInt();

        if (size <= 0) {

            System.out.println(
                    "Invalid array size."
            );

            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print(
                "Enter array elements : "
        );

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(
                "Enter window size (k) : "
        );

        int k = sc.nextInt();

        printAverageOfSubarrays(arr, k);

        sc.close();
    }
}
