package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ReverseArrayUsingTwoPointers
 * Topic        : Arrays
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Reverses an array in-place using the
 * Two Pointer Technique.
 *
 * Example:
 * Input  : [1, 2, 3, 4, 5]
 * Output : [5, 4, 3, 2, 1]
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Concepts Used:
 * - Arrays
 * - Two Pointers
 * - Swapping
 * - In-place Modification
 * ------------------------------------------------------------
 */
public class Main {

    /**
     * Reverses the array using two pointers.
     *
     * @param arr input array
     */
    static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    /**
     * Displays array elements.
     *
     * @param arr array to display
     */
    static void printArray(int[] arr) {

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {

            System.out.println("Invalid size");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array : ");
        printArray(arr);

        reverseArray(arr);

        System.out.print("Reversed Array : ");
        printArray(arr);

        sc.close();
    }
}
