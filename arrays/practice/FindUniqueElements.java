package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : FindUniqueElements
 * Topic        : Arrays in Java
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds all unique elements
 * in an array.
 *
 * A unique element appears exactly once.
 *
 * Example:
 * Array : 1 2 2 3 4 4 5
 *
 * Unique Elements:
 * 1 3 5
 *
 * Concepts Used:
 * - Arrays
 * - Nested loops
 * - Frequency counting
 * - Input validation
 * - Method creation
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds and displays unique elements.
     *
     * @param arr input array
     */
    static void findUniqueElements(int[] arr) {

        boolean found = false;

        System.out.print("Unique Elements : ");

        for (int i = 0; i < arr.length; i++) {

            int frequency = 0;

            // Count frequency
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    frequency++;
                }
            }

            // Unique element
            if (frequency == 1) {

                System.out.print(arr[i] + " ");

                found = true;
            }
        }

        // No unique element found
        if (!found) {

            System.out.print("None");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "===== Find Unique Elements ====="
        );

        // Input size
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        // Validation
        if (n <= 0) {

            System.out.println("Invalid size");

            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.print("\nOriginal Array : ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        System.out.println("\n");

        // Find unique elements
        findUniqueElements(arr);

        sc.close();
    }
}
