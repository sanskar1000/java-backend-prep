package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DifferenceArrayBasics
 * Topic        : Arrays - Difference Array
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the Difference Array
 * technique for performing efficient range updates.
 *
 * Instead of updating every element in a range,
 * only two positions in the difference array are
 * modified, reducing the update operation to O(1).
 *
 * Steps:
 * 1. Build the Difference Array.
 * 2. Apply the range update.
 * 3. Reconstruct the updated array using Prefix Sum.
 *
 * Example:
 * Original Array : [10, 20, 30, 40, 50]
 * Update Range   : 1 to 3 (+5)
 * Updated Array  : [10, 25, 35, 45, 50]
 *
 * Time Complexity:
 * Build Difference Array : O(n)
 * Range Update           : O(1)
 * Rebuild Array          : O(n)
 *
 * Overall Time Complexity : O(n)
 * Space Complexity        : O(n)
 * ------------------------------------------------------------
 */

public class DifferenceArrayBasics {

    /**
     * Builds the difference array.
     *
     * @param arr Original array
     * @return Difference array
     */
    static int[] buildDifferenceArray(int[] arr) {

        int n = arr.length;
        int[] diff = new int[n];

        diff[0] = arr[0];

        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        return diff;
    }

    /**
     * Applies a range update.
     *
     * @param diff Difference array
     * @param left Starting index
     * @param right Ending index
     * @param value Value to add
     */
    static void rangeUpdate(
            int[] diff,
            int left,
            int right,
            int value
    ) {

        diff[left] += value;

        if (right + 1 < diff.length) {
            diff[right + 1] -= value;
        }
    }

    /**
     * Reconstructs the updated array.
     *
     * @param diff Difference array
     * @return Updated array
     */
    static int[] buildUpdatedArray(int[] diff) {

        int[] updated = new int[diff.length];

        updated[0] = diff[0];

        for (int i = 1; i < diff.length; i++) {
            updated[i] = updated[i - 1] + diff[i];
        }

        return updated;
    }

    /**
     * Prints an array.
     */
    static void printArray(int[] arr, String message) {

        System.out.print(message);

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {

            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] diff = buildDifferenceArray(arr);

        System.out.print("Enter left index: ");
        int left = sc.nextInt();

        System.out.print("Enter right index: ");
        int right = sc.nextInt();

        if (left < 0 || right >= size || left > right) {

            System.out.println("Invalid range.");
            sc.close();
            return;
        }

        System.out.print("Enter value to add: ");
        int value = sc.nextInt();

        rangeUpdate(diff, left, right, value);

        int[] updated = buildUpdatedArray(diff);

        System.out.println();

        printArray(arr, "Original Array      : ");
        printArray(diff, "Difference Array    : ");
        printArray(updated, "Updated Array       : ");

        sc.close();
    }
}
