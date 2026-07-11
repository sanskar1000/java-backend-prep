package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : BubbleSort
 * Topic        : Sorting Algorithms
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program sorts an integer array in ascending
 * order using the Bubble Sort algorithm.
 *
 * Bubble Sort repeatedly compares adjacent elements
 * and swaps them if they are in the wrong order.
 *
 * After each pass, the largest unsorted element
 * moves to its correct position.
 *
 * Example:
 * Input  : [5, 2, 8, 1, 3]
 * Output : [1, 2, 3, 5, 8]
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

public class BubbleSort {

    /**
     * Sorts the given array using Bubble Sort.
     *
     * @param arr input array
     */
    static void bubbleSort(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Invalid array.");
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if array is already sorted
            if (!swapped) {
                break;
            }
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

        bubbleSort(arr);

        System.out.print("Sorted Array   : ");
        printArray(arr);

        sc.close();
    }
}
