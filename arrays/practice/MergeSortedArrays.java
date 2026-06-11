package arrays.practice;
java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MergeSortedArrays
 * Topic        : Two Pointer Technique
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program merges two sorted arrays into a
 * single sorted array while maintaining sorted order.
 *
 * The solution uses the Two Pointer Technique,
 * which efficiently traverses both arrays only once.
 *
 * Example:
 * Array 1 : [1, 3, 5]
 * Array 2 : [2, 4, 6]
 *
 * Merged  : [1, 2, 3, 4, 5, 6]
 *
 * Concepts Used:
 * - Arrays
 * - Methods
 * - Two Pointer Technique
 * - Array Traversal
 * - Input Validation
 *
 * Time Complexity  : O(n + m)
 * Space Complexity : O(n + m)
 *
 * where:
 * n = size of first array
 * m = size of second array
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param arr1 first sorted array
     * @param arr2 second sorted array
     * @return merged sorted array
     */
    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for result

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    /**
     * Prints array elements.
     *
     * @param arr array to print
     * @param message heading message
     */
    static void printArray(int[] arr, String message) {

        System.out.print(message);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array : ");
        int n1 = sc.nextInt();

        if (n1 <= 0) {

            System.out.println("Invalid size");
            sc.close();
            return;
        }

        int[] arr1 = new int[n1];

        System.out.print("Enter sorted first array : ");

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array : ");
        int n2 = sc.nextInt();

        if (n2 <= 0) {

            System.out.println("Invalid size");
            sc.close();
            return;
        }

        int[] arr2 = new int[n2];

        System.out.print("Enter sorted second array : ");

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println();

        printArray(arr1, "First Array  : ");
        printArray(arr2, "Second Array : ");
        printArray(mergedArray, "Merged Array : ");

        sc.close();
    }
}
