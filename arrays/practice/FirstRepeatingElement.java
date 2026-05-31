package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : FirstRepeatingElement
 * Topic        : Arrays in Java
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the first repeating
 * element in an array.
 *
 * Example:
 * Array : 1 5 3 4 3 5 6
 *
 * Output:
 * First repeating element : 5
 *
 * Concepts Used:
 * - Arrays
 * - Nested loops
 * - Duplicate detection
 * - Input validation
 * - Method creation
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds the first repeating element.
     *
     * @param arr input array
     */
    static void firstRepeatingElement(int[] arr) {

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            // Check future elements
            for (int j = i + 1; j < arr.length; j++) {

                // Repeating element found
                if (arr[i] == arr[j]) {

                    System.out.println(
                            "First repeating element : "
                                    + arr[i]
                    );

                    return;
                }
            }
        }

        // No repeating element found
        System.out.println(
                "No repeating element found."
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "===== First Repeating Element ====="
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

        // Input array elements
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

        // Find repeating element
        firstRepeatingElement(arr);

        sc.close();
    }
}
