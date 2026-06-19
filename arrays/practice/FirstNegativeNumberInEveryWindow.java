package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : FirstNegativeNumberInEveryWindow
 * Topic        : Sliding Window (Brute Force Approach)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds and prints the first negative
 * number in every contiguous subarray (window)
 * of size K.
 *
 * If a window does not contain any negative number,
 * the program prints 0.
 *
 * Example:
 * Array : [12, -1, -7, 8, -15, 30, 16, 28]
 * K     : 3
 *
 * Windows:
 * [12, -1, -7]      -> -1
 * [-1, -7, 8]       -> -1
 * [-7, 8, -15]      -> -7
 * [8, -15, 30]      -> -15
 * [-15, 30, 16]     -> -15
 * [30, 16, 28]      -> 0
 *
 * Output:
 * -1 -1 -7 -15 -15 0
 *
 * Concepts Used:
 * - Arrays
 * - Nested Loops
 * - Window Traversal
 * - Searching
 * - Brute Force Sliding Window
 *
 * Time Complexity  : O(n × k)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Prints the first negative number in every
     * window of size k.
     *
     * @param arr input array
     * @param k   window size
     */
    static void printFirstNegativeInEveryWindow(
            int[] arr,
            int k
    ) {

        if (k <= 0 || k > arr.length) {

            System.out.println(
                    "Invalid window size."
            );

            return;
        }

        System.out.println(
                "\nFirst Negative Number In Every Window:"
        );

        // Traverse each window
        for (int start = 0;
             start <= arr.length - k;
             start++) {

            boolean foundNegative = false;

            // Search current window
            for (int current = start;
                 current < start + k;
                 current++) {

                if (arr[current] < 0) {

                    System.out.print(
                            arr[current] + " "
                    );

                    foundNegative = true;
                    break;
                }
            }

            // No negative number found
            if (!foundNegative) {

                System.out.print("0 ");
            }
        }

        System.out.println();
    }

    /**
     * Prints array elements.
     *
     * @param arr input array
     */
    static void printArray(int[] arr) {

        for (int element : arr) {

            System.out.print(
                    element + " "
            );
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter array size : "
        );

        int size = sc.nextInt();

        if (size <= 0) {

            System.out.println(
                    "Invalid array size."
            );

            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print(
                "Enter array elements : "
        );

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.print(
                "Enter window size (k) : "
        );

        int k = sc.nextInt();

        System.out.println();

        System.out.print("Array : ");
        printArray(arr);

        printFirstNegativeInEveryWindow(
                arr,
                k
        );

        sc.close();
    }
}
