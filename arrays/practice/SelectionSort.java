package array.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SelectionSort
 * Topic        : Sorting Algorithms
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program sorts an integer array in ascending
 * order using the Selection Sort algorithm.
 *
 * Selection Sort repeatedly finds the smallest
 * element from the unsorted portion of the array
 * and places it at its correct position.
 *
 * Example:
 * Input  : [64, 25, 12, 22, 11]
 * Output : [11, 12, 22, 25, 64]
 *
 * Time Complexity:
 * Best Case    : O(n²)
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 *
 * Space Complexity : O(1)
 * Stable Sort      : No
 * In-Place Sort    : Yes
 * ------------------------------------------------------------
 */

public class SelectionSort {

    /**
     * Sorts the given array using Selection Sort.
     *
     * @param arr input array
     */
    static void selectionSort(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Invalid array.");
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Skip swapping if already in correct position
            if (minIndex == i) {
                continue;
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    /**
     * Prints the array.
     *
     * @param arr array to print
     */
    static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
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

        System.out.print("Original Array : ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted Array   : ");
        printArray(arr);

        sc.close();
    }
}
