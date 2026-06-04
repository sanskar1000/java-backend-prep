package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayPalindromeChecker
 * Topic        : Arrays
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether an array is palindrome
 * or not using the Two Pointer Technique.
 *
 * A palindrome array reads the same:
 * - from left to right
 * - and from right to left
 *
 * Example:
 * Input  : 1 2 3 2 1
 * Output : Array is palindrome
 *
 * Concepts Used:
 * - Arrays
 * - Methods
 * - Two Pointer Technique
 * - Input Validation
 * - Looping
 * - Conditional Statements
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Checks whether the given array is palindrome.
     *
     * Logic:
     * - Compare first and last element
     * - Move toward center
     * - If mismatch found → not palindrome
     *
     * @param arr input array
     * @return true if palindrome, otherwise false
     */
    static boolean isPalindrome(int[] arr) {

        int left = 0;

        int right = arr.length - 1;

        while (left < right) {

            // Compare elements
            if (arr[left] != arr[right]) {

                return false;
            }

            // Move pointers
            left++;

            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array : ");

        int n = sc.nextInt();

        // Input validation
        if (n <= 0) {

            System.out.println("Invalid size");

            sc.close();

            return;
        }

        // Array creation
        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter Array : ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Method call
        boolean palindrome = isPalindrome(arr);

        // Output result
        if (palindrome) {

            System.out.println("Array is palindrome");

        } else {

            System.out.println("Array is not palindrome");
        }

        sc.close();
    }
}
