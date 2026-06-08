package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PairWithGivenSum
 * Topic        : Arrays - Two Pointer Technique
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Finds whether a pair exists in a sorted array
 * whose sum equals a given target value.
 *
 * Example:
 * Array  : [1, 2, 4, 6, 8]
 * Target : 10
 *
 * Output:
 * Pair found
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Concepts Used:
 * - Arrays
 * - Two Pointer Technique
 * - Searching
 * - Boolean Return Type
 * ------------------------------------------------------------
 */
public class Main {

    /**
     * Checks whether a pair with the given sum exists.
     *
     * @param arr sorted input array
     * @param target required sum
     * @return true if pair exists, otherwise false
     */
    static boolean isPairFound(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
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

        System.out.print("Enter sorted array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        if (isPairFound(arr, target)) {

            System.out.println("Pair found");

        } else {

            System.out.println("Pair not found");
        }

        sc.close();
    }
}
