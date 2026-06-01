package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MostFrequentElement
 * Topic        : Arrays in Java
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the most frequent element
 * in an array using frequency counting and
 * a visited array.
 *
 * Concepts Used:
 * - Arrays
 * - Nested loops
 * - Frequency counting
 * - visited array
 * - Searching
 * - Input validation
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds the most frequent element in array.
     *
     * @param arr input array
     * @return most frequent element
     */
    static int findMostFrequentElement(int[] arr) {

        boolean[] visited = new boolean[arr.length];

        int maxFrequency = 0;

        int mostFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {

            // Skip already counted elements
            if (visited[i]) {
                continue;
            }

            int frequency = 0;

            for (int j = i; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    frequency++;

                    visited[j] = true;
                }
            }

            // Update maximum frequency
            if (frequency > maxFrequency) {

                maxFrequency = frequency;

                mostFrequent = arr[i];
            }
        }

        System.out.println(
                "Maximum Frequency : " + maxFrequency
        );

        return mostFrequent;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");

        int n = sc.nextInt();

        // Input validation
        if (n <= 0) {

            System.out.println("Invalid size");

            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int mostFrequent =
                findMostFrequentElement(arr);

        System.out.println(
                "Most frequent element : "
                        + mostFrequent
        );

        sc.close();
    }
}
