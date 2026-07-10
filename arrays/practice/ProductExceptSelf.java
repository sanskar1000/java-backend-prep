package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ProductExceptSelf
 * Topic        : Arrays - Prefix Product
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program returns an array where each element
 * is the product of all other elements except itself,
 * without using division.
 *
 * It uses two auxiliary arrays:
 * 1. Left Product Array
 * 2. Right Product Array
 *
 * For every index:
 *
 * result[i] = leftProduct[i] * rightProduct[i]
 *
 * Example:
 * Input  : [1, 2, 3, 4]
 * Output : [24, 12, 8, 6]
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ProductExceptSelf {

    /**
     * Returns an array where every element contains
     * the product of all elements except itself.
     *
     * @param arr input array
     * @return product except self array
     */
    static int[] productExceptSelf(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] result = new int[n];

        // Build Left Product Array
        leftProduct[0] = 1;

        for (int i = 1; i < n; i++) {
            leftProduct[i] =
                    leftProduct[i - 1] * arr[i - 1];
        }

        // Build Right Product Array
        rightProduct[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] =
                    rightProduct[i + 1] * arr[i + 1];
        }

        // Build Result Array
        for (int i = 0; i < n; i++) {
            result[i] =
                    leftProduct[i] * rightProduct[i];
        }

        return result;
    }

    /**
     * Prints an integer array.
     *
     * @param arr array to print
     * @param message heading message
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

            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(arr);

        printArray(arr, "Original Array        : ");
        printArray(result, "Product Except Self   : ");

        sc.close();
    }
}
