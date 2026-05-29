package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DeleteElementFromArray
 * Topic        : Arrays in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program deletes a target element from an array
 * by shifting all elements to the left.
 *
 * If the element is not found,
 * the program displays an appropriate message.
 *
 * Concepts Used:
 * - Arrays
 * - Linear Search
 * - Array Traversal
 * - Element Shifting
 * - Helper Methods
 * - Input Validation
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds the index of the target element.
     *
     * @param arr    input array
     * @param target element to search
     * @return index if found, otherwise -1
     */
    static int findElementIndex(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Deletes the target element from array
     * by shifting elements left.
     *
     * @param arr    input array
     * @param target element to delete
     * @return new logical size after deletion
     */
    static int deleteElement(int[] arr, int target) {

        int index = findElementIndex(arr, target);

        // Element not found
        if (index == -1) {
            return -1;
        }

        // Shift elements left
        for (int i = index; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }

        // New logical size
        return arr.length - 1;
    }

    /**
     * Displays array elements.
     *
     * @param arr  input array
     * @param size number of elements to print
     */
    static void displayArray(int[] arr, int size) {

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        // Validation
        if (n <= 0) {

            System.out.println("Invalid size");

            sc.close();
            return;
        }

        // Array creation
        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter array elements : ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Input target element
        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        // Original array
        System.out.print("Original Array : ");
        displayArray(arr, arr.length);

        // Delete operation
        int newSize = deleteElement(arr, target);

        // Element not found
        if (newSize == -1) {

            System.out.println("Element not found");

        } else {

            System.out.print("Array after deletion : ");

            displayArray(arr, newSize);
        }

        sc.close();
    }
}
