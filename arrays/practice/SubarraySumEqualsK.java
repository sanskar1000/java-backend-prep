package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SubarraySumEqualsK
 * Topic        : Arrays - Prefix Sum
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether there exists a
 * contiguous subarray whose sum is equal to
 * the given value k.
 *
 * It first builds a Prefix Sum array and then
 * calculates every possible subarray sum in O(1)
 * using the prefix array.
 *
 * Formula:
 * If left == 0
 *      sum = prefix[right]
 * Else
 *      sum = prefix[right] - prefix[left - 1]
 *
 * Example:
 * Array : [1, 2, 3, 4]
 * k     : 5
 * Output: Subarray Found
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class SubarraySumEqualsK {

    /**
     * Checks whether a subarray with sum k exists.
     *
     * @param arr input array
     * @param k target sum
     * @return true if found, otherwise false
     */
    static boolean subarraySumEqualsK(int[] arr, int k) {

        if (arr == null || arr.length == 0) {
            return false;
        }

        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        // Build Prefix Sum Array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Check every subarray
        for (int left = 0; left < n; left++) {

            for (int right = left; right < n; right++) {

                int sum;

                if (left == 0) {
                    sum = prefix[right];
                } else {
                    sum = prefix[right] - prefix[left - 1];
                }

                if (sum == k) {
                    return true;
                }
            }
        }

        return false;
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

        System.out.print("Enter target sum (k): ");
        int k = sc.nextInt();

        boolean found = subarraySumEqualsK(arr, k);

        if (found) {
            System.out.println("Subarray with sum " + k + " exists.");
        } else {
            System.out.println("No subarray with sum " + k + " exists.");
        }

        sc.close();
    }
}
