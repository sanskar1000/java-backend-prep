package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CountDuplicateElements
 * Topic        : Arrays in Java
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts how many distinct elements
 * appear more than once in an array.
 *
 * Example:
 * Array : 1 2 2 3 4 4 4 5
 *
 * Duplicate Elements:
 * - 2
 * - 4
 *
 * Total Duplicate Numbers = 2
 *
 * Concepts Used:
 * - Arrays
 * - Nested loops
 * - Boolean visited array
 * - Duplicate detection
 * - Input validation
 * - Method creation
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Counts how many distinct numbers
     * have duplicates in the array.
     *
     * @param arr input array
     * @return number of duplicate elements
     */
    static int countDuplicates(int[] arr) {

        // Tracks already processed elements
        boolean[] visited = new boolean[arr.length];

        int duplicateCount = 0;

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            // Skip already visited elements
            if (visited[i]) {
                continue;
            }

            int count = 0;

            // Count frequency of current element
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    count++;

                    // Mark as visited
                    visited[j] = true;
                }
            }

            // If frequency > 1 → duplicate exists
            if (count > 1) {

                duplicateCount++;
            }
        }

        return duplicateCount;
    }

    /**
     * Displays duplicate elements.
     *
     * @param arr input array
     */
    static void displayDuplicateElements(int[] arr) {

        boolean[] visited = new boolean[arr.length];

        System.out.println("\nDuplicate Elements:");

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {

                System.out.println(
                        arr[i] + " appears " +
                        count + " times"
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "===== Count Duplicate Elements ====="
        );

        // Input array size
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        // Validation
        if (n <= 0) {

            System.out.println("Invalid array size");

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

        System.out.println();

        // Display duplicate elements
        displayDuplicateElements(arr);

        // Count duplicates
        int duplicateCount = countDuplicates(arr);

        System.out.println(
                "\nTotal numbers having duplicates : "
                        + duplicateCount
        );

        sc.close();
    }
}
