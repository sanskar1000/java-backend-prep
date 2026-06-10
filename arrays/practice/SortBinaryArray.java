package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SortBinaryArray
 * Topic        : Arrays
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program sorts a binary array containing
 * only 0s and 1s.
 *
 * All 0s are moved to the beginning and
 * all 1s are moved to the end.
 *
 * Concepts Used:
 * - Arrays
 * - Partition Technique
 * - Swapping
 * - In-place Modification
 * - Input Validation
 *
 * Example:
 * Input  : [1, 0, 1, 0, 1, 0]
 * Output : [0, 0, 0, 1, 1, 1]
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Sorts a binary array by moving all 0s to the front
     * and all 1s to the end.
     *
     * @param arr binary array
     */
    static void sortBinaryArray(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                if (i != index) {

                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }

                index++;
            }
        }
    }

    /**
     * Prints the array with a custom message.
     *
     * @param arr array to print
     * @param message heading message
     */
    static void printArray(int[] arr, String message) {

        System.out.print(message);

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        if (n <= 0) {

            System.out.println("Invalid size.");

            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println(
                "Enter binary array elements (0 or 1):"
        );

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] != 0 && arr[i] != 1) {

                System.out.println(
                        "Invalid input. Only 0 and 1 are allowed."
                );

                sc.close();
                return;
            }
        }

        printArray(arr, "Original Array : ");

        sortBinaryArray(arr);

        printArray(arr, "Sorted Array   : ");

        sc.close();
    }
}
