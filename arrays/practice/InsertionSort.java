package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : InsertionSort
 * Topic        : Sorting Algorithms
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program sorts an integer array in ascending
 * order using the Insertion Sort algorithm.
 *
 * Insertion Sort builds the sorted array one element
 * at a time by inserting each element into its
 * correct position in the already sorted portion.
 *
 * Example:
 * Input  : [5, 2, 4, 6, 1, 3]
 * Output : [1, 2, 3, 4, 5, 6]
 *
 * Time Complexity:
 * Best Case    : O(n)
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 *
 * Space Complexity : O(1)
 * Stable Sort      : Yes
 * In-Place Sort    : Yes
 * ------------------------------------------------------------
 */

public class InsertionSort {

    /**
     * Sorts the given array using Insertion Sort.
     *
     * @param arr input array
     */
    static void insertionSort(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Invalid array.");
            return;
        }

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
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

        insertionSort(arr);

        System.out.print("Sorted Array   : ");
        printArray(arr);

        sc.close();
    }
}
