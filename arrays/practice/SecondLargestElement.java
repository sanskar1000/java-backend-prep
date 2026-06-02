package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SecondLargestElement
 * Topic        : Arrays in Java
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the second largest
 * element in an array using a single traversal.
 *
 * Concepts Used:
 * - Arrays
 * - Searching
 * - Maximum tracking
 * - Conditional logic
 * - Input validation
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds the second largest element.
     *
     * @param arr input array
     * @return second largest element
     */
    static int findSecondLargestElement(int[] arr) {

        int max = Integer.MIN_VALUE;

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                secondMax = max;

                max = arr[i];

            } else if (
                    arr[i] < max
                            && arr[i] > secondMax
            ) {

                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");

        int n = sc.nextInt();

        // Input validation
        if (n <= 1) {

            System.out.println(
                    "At least 2 elements are required."
            );

            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int secondLargest =
                findSecondLargestElement(arr);

        // Check if second largest exists
        if (secondLargest == Integer.MIN_VALUE) {

            System.out.println(
                    "No second largest element exists."
            );

        } else {

            System.out.println(
                    "Second Largest Element : "
                            + secondLargest
            );
        }

        sc.close();
    }
}
