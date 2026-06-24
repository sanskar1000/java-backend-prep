package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LongestSubarrayWithSumAtMostK
 * Topic        : Sliding Window Technique
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the length of the longest
 * contiguous subarray whose sum is less than
 * or equal to a given value k.
 *
 * Note:
 * This algorithm works correctly only for
 * non-negative array elements.
 *
 * Concepts Used:
 * - Arrays
 * - Sliding Window
 * - Two Pointers
 * - Variable Size Window
 * - Input Validation
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class Main {

    /**
     * Finds the length of the longest subarray
     * whose sum is less than or equal to k.
     *
     * @param arr input array
     * @param k maximum allowed sum
     * @return maximum subarray length
     */
    static int findLongestSubarrayLength(
            int[] arr,
            int k
    ) {

        if (k <= 0 || arr.length == 0) {
            return 0;
        }

        int left = 0;
        int currentSum = 0;
        int maxLength = 0;

        for (int right = 0;
             right < arr.length;
             right++) {

            currentSum += arr[right];

            while (currentSum > k) {

                currentSum -= arr[left];
                left++;
            }

            maxLength = Math.max(
                    maxLength,
                    right - left + 1
            );
        }

        return maxLength;
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
                "Enter maximum sum (k) : "
        );

        int k = sc.nextInt();

        int longestLength =
                findLongestSubarrayLength(
                        arr,
                        k
                );

        System.out.println(
                "Longest subarray length : "
                        + longestLength
        );

        sc.close();
    }
}
