
package arrays.practice; 
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RemoveDuplicatesFromSortedArray
 * Topic        : Arrays
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Removes duplicate elements from a sorted array
 * using the Two Pointer Technique.
 *
 * Example:
 * Input  : 1 1 2 2 3 4 4
 * Output : 1 2 3 4
 *
 * Note:
 * This algorithm works only for sorted arrays.
 *
 * Concepts Used:
 * - Arrays
 * - Two Pointer Technique
 * - In-place Modification
 * - Array Traversal
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Removes duplicates from a sorted array.
     *
     * @param arr sorted input array
     * @return size of array after removing duplicates
     */
    static int removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int index = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[index - 1]) {

                arr[index] = arr[i];
                index++;
            }
        }

        return index;
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

        System.out.print("Enter sorted array : ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int newSize = removeDuplicates(arr);

        System.out.print(
                "Array after removing duplicates : "
        );

        for (int i = 0; i < newSize; i++) {

            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
