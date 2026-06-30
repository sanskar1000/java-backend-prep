
package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MaximumConsecutiveOnes
 * Topic        : Sliding Window / Array Traversal
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the maximum number of
 * consecutive 1s present in a binary array.
 *
 * Example:
 * Input  : 1 1 0 1 1 1
 * Output : 3
 *
 * Concepts Used:
 * - Arrays
 * - Linear Traversal
 * - Counting Consecutive Elements
 * - Input Validation
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds the maximum number of consecutive 1s.
     *
     * @param arr binary array
     * @return maximum consecutive ones
     */
    static int findMaximumConsecutiveOnes(int[] arr) {

        int currentCount = 0;
        int maximumCount = 0;

        for (int value : arr) {

            if (value == 1) {

                currentCount++;
                maximumCount = Math.max(
                        maximumCount,
                        currentCount
                );

            } else {

                currentCount = 0;
            }
        }

        return maximumCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        if (size <= 0) {

            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter binary array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maximumConsecutiveOnes =
                findMaximumConsecutiveOnes(arr);

        System.out.println(
                "Maximum consecutive ones : "
                        + maximumConsecutiveOnes
        );

        sc.close();
    }
}
