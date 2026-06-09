package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SegregateEvenOdd
 * Topic        : Two Pointer Technique
 * Level        : Intermediate
 *
 * Description:
 * Segregates even and odd numbers in an array.
 *
 * Even numbers are moved to the beginning
 * and odd numbers are moved to the end.
 *
 * Concepts Used:
 * - Arrays
 * - Two Pointer Technique
 * - Swapping
 * - In-place Partitioning
 *
 * Example:
 * Input  : [1, 4, 3, 8, 5, 2]
 * Output : [4, 8, 2, 1, 5, 3]
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Segregates even and odd elements.
     *
     * @param arr input array
     */
    static void segregateEvenOdd(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                index++;
            }
        }
    }

    /**
     * Prints array elements.
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

            System.out.println("Invalid size");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.print("Enter array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr, "Original Array : ");

        segregateEvenOdd(arr);

        printArray(arr, "After Segregation : ");

        sc.close();
    }
}
