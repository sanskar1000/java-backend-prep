package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayEqualityChecker
 * Topic        : Arrays
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether two arrays
 * are equal or not.
 *
 * Two arrays are equal if:
 * - both have same size
 * - corresponding elements are equal
 *
 * Example:
 * Array 1 : 1 2 3
 * Array 2 : 1 2 3
 *
 * Output:
 * Arrays are equal.
 *
 * Concepts Used:
 * - Arrays
 * - Methods
 * - Input Validation
 * - Array Traversal
 * - Conditional Statements
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Checks whether two arrays are equal.
     *
     * @param arr1 first array
     * @param arr2 second array
     * @return true if arrays are equal, otherwise false
     */
    static boolean isArrayEquals(int[] arr1, int[] arr2) {

        // Check array size
        if (arr1.length != arr2.length) {

            return false;
        }

        // Compare elements
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter size of array 1 : ");

        int size1 = sc.nextInt();

        // Validate size
        if (size1 <= 0) {

            System.out.println("Invalid size");

            sc.close();

            return;
        }

        // First array creation
        int[] arr1 = new int[size1];

        // Input first array
        System.out.print("Enter elements of array 1 : ");

        for (int i = 0; i < size1; i++) {

            arr1[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter size of array 2 : ");

        int size2 = sc.nextInt();

        // Validate size
        if (size2 <= 0) {

            System.out.println("Invalid size");

            sc.close();

            return;
        }

        // Second array creation
        int[] arr2 = new int[size2];

        // Input second array
        System.out.print("Enter elements of array 2 : ");

        for (int i = 0; i < size2; i++) {

            arr2[i] = sc.nextInt();
        }

        // Method call
        boolean equal = isArrayEquals(arr1, arr2);

        // Output result
        if (equal) {

            System.out.println("Arrays are equal.");

        } else {

            System.out.println("Arrays are not equal.");
        }

        sc.close();
    }
}
