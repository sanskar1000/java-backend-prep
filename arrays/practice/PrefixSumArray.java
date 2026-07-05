package arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PrefixSumArray
 * Topic        : Arrays - Prefix Sum
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program creates the Prefix Sum Array of a given array.
 *
 * A Prefix Sum Array stores the cumulative sum of elements
 * from index 0 to the current index.
 *
 * Example:
 * Input  : [2, 4, 6, 8]
 * Output : [2, 6, 12, 20]
 *
 * Formula:
 * prefix[0] = arr[0]
 * prefix[i] = prefix[i - 1] + arr[i]
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class PrefixSumArray {

    /**
     * Creates and returns the prefix sum array.
     *
     * @param arr input array
     * @return prefix sum array
     */
    static int[] prefixSumArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
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

        int[] prefix = prefixSumArray(arr);

        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Prefix Sum Array : " + Arrays.toString(prefix));

        sc.close();
    }
}
