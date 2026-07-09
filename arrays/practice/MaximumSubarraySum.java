package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MaximumSubarraySum
 * Topic        : Arrays - Kadane's Algorithm
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the maximum sum of any
 * contiguous subarray using Kadane's Algorithm.
 *
 * Kadane's Algorithm works by maintaining:
 * 1. Current subarray sum
 * 2. Maximum subarray sum found so far
 *
 * If the current sum becomes negative,
 * it is reset to zero because a negative
 * sum cannot contribute to a larger sum.
 *
 * Example:
 * Input  : [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output : 6
 *
 * Explanation:
 * Maximum subarray = [4, -1, 2, 1]
 * Sum = 6
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MaximumSubarraySum {

    /**
     * Returns the maximum subarray sum using
     * Kadane's Algorithm.
     *
     * @param arr input array
     * @return maximum subarray sum
     */
    static int maximumSubarraySum(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int value : arr) {

            currentSum += value;

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = maximumSubarraySum(arr);

        System.out.println("Maximum Subarray Sum = " + maxSum);

        sc.close();
    }
}
