package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayPalindromeChecker
 * Topic        : Arrays - Two Pointer Technique
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Checks whether an array is a palindrome
 * using the Two Pointer Technique.
 *
 * A palindrome array reads the same
 * from left to right and right to left.
 *
 * Example:
 * Input  : [1, 2, 3, 2, 1]
 * Output : Array is palindrome
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Concepts Used:
 * - Arrays
 * - Two Pointers
 * - Method Creation
 * - Boolean Return Type
 * ------------------------------------------------------------
 */
public class Main {

    /**
     * Checks whether the array is a palindrome.
     *
     * @param arr input array
     * @return true if palindrome, otherwise false
     */
    static boolean isPalindrome(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    /**
     * Prints array elements.
     *
     * @param arr array to print
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

        System.out.print("Array: ");
        printArray(arr);

        if (isPalindrome(arr)) {

            System.out.println("Array is palindrome");

        } else {

            System.out.println("Array is not palindrome");
        }

        sc.close();
    }
}
