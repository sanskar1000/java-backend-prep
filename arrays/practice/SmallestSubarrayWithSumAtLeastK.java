package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SmallestSubarrayWithSumAtLeastK
 * Topic        : Sliding Window Technique
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the length of the smallest
 * contiguous subarray whose sum is greater than
 * or equal to a given value k.
 *
 * Note:
 * This algorithm works correctly only for
 * positive integers.
 *
 * Concepts Used:
 * - Arrays
 * - Sliding Window
 * - Two Pointers
 * - Variable Size Window
 * - Input Validation
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds the length of the smallest subarray
     * having sum greater than or equal to k.
     *
     * @param arr input array
     * @param k target sum
     * @return minimum length
     */
    static int findSmallestSubarrayLength(
            int[] arr,
            int k
    ) {

        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0;
             right < arr.length;
             right++) {

            currentSum += arr[right];

            while (currentSum >= k) {

                minLength = Math.min(
                        minLength,
                        right - left + 1
                );

                currentSum -= arr[left];
                left++;
            }
        }

        return minLength;
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
                "Enter target sum (k) : "
        );

        int k = sc.nextInt();

        int minLength =
                findSmallestSubarrayLength(
                        arr,
                        k
                );

        if (minLength ==
                Integer.MAX_VALUE) {

            System.out.println(
                    "No valid subarray found."
            );

        } else {

            System.out.println(
                    "Smallest subarray length : "
                            + minLength
            );
        }

        sc.close();
    }
}
