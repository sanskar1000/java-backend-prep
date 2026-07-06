package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RangeSumUsingPrefix
 * Topic        : Arrays - Prefix Sum
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the sum of elements
 * within a given range [left, right] using the
 * Prefix Sum technique.
 *
 * Formula:
 * If left == 0:
 *      sum = prefix[right]
 * Else:
 *      sum = prefix[right] - prefix[left - 1]
 *
 * Example:
 * Array : [2, 4, 6, 8, 10]
 * Left  : 1
 * Right : 3
 * Sum   : 18
 *
 * Time Complexity:
 * Prefix Construction : O(n)
 * Range Query         : O(1)
 *
 * Space Complexity:
 * O(n)
 * ------------------------------------------------------------
 */

public class RangeSumUsingPrefix {

    /**
     * Builds the prefix sum array.
     *
     * @param arr input array
     * @return prefix sum array
     */
    static int[] buildPrefixSum(int[] arr) {

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    /**
     * Returns the sum of elements between
     * left and right indices (inclusive).
     *
     * @param prefix prefix sum array
     * @param left starting index
     * @param right ending index
     * @return range sum
     */
    static int rangeSumUsingPrefix(
            int[] prefix,
            int left,
            int right
    ) {

        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
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

        int[] prefix = buildPrefixSum(arr);

        System.out.print("Enter left index: ");
        int left = sc.nextInt();

        System.out.print("Enter right index: ");
        int right = sc.nextInt();

        if (left < 0 || right >= size || left > right) {
            System.out.println("Invalid range.");
            sc.close();
            return;
        }

        int sum =
                rangeSumUsingPrefix(
                        prefix,
                        left,
                        right
                );

        System.out.println("Range Sum = " + sum);

        sc.close();
    }
}
