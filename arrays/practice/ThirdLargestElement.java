package arrays.practice;

/**
 * ------------------------------------------------------------
 * Program Name : ThirdLargestElement
 * Topic        : Arrays in Java
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the third largest unique element
 * in an array without sorting the array.
 *
 * The program:
 * - ignores duplicate values
 * - handles invalid array sizes
 * - checks whether third largest exists
 *
 * Concepts Used:
 * - Arrays
 * - Methods
 * - Loops
 * - Conditional Statements
 * - Integer.MIN_VALUE
 * - Input Validation
 * - Searching Logic
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class Main {

    /**
     * Finds the third largest unique element in array.
     *
     * @param arr input array
     * @return third largest unique element
     */
    static int findThirdLargestElement(int[] arr) {

        // Third largest does not exist
        if (arr.length < 3) {
            return Integer.MIN_VALUE;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Ignore duplicate values
            if (arr[i] == first ||
                    arr[i] == second ||
                    arr[i] == third) {

                continue;
            }

            // Update first largest
            if (arr[i] > first) {

                third = second;
                second = first;
                first = arr[i];
            }

            // Update second largest
            else if (arr[i] > second) {

                third = second;
                second = arr[i];
            }

            // Update third largest
            else if (arr[i] > third) {

                third = arr[i];
            }
        }

        return third;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        // Validate size
        if (n <= 0) {

            System.out.println("Invalid array size");

            sc.close();
            return;
        }

        // Create array
        int[] arr = new int[n];

        // Input elements
        System.out.print("Enter array elements : ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Find third largest element
        int thirdLargest =
                findThirdLargestElement(arr);

        // Display result
        if (thirdLargest == Integer.MIN_VALUE) {

            System.out.println(
                    "Third largest element does not exist"
            );

        } else {

            System.out.println(
                    "Third largest element : "
                            + thirdLargest
            );
        }

        // Close Scanner
        sc.close();
    }
}
