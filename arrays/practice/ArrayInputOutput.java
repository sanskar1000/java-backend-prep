package arrays.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayInputOutput
 * Topic        : Arrays (Input & Traversal)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 * - array creation
 * - user input in arrays
 * - array traversal
 * - enhanced for-loop
 *
 * The user enters the size of the array
 * and its elements, then the program
 * displays all elements.
 *
 * Concepts Used:
 * - arrays
 * - loops
 * - Scanner class
 * - enhanced for-loop
 * - input validation
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ArrayInputOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Input array size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // 🔹 Validation
        if (n <= 0) {

            System.out.println("Invalid size");

            sc.close();
            return;
        }

        // 🔹 Array declaration
        int[] arr = new int[n];

        // 🔹 Input elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // 🔹 Display elements
        System.out.print("Array elements: ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        sc.close();
    }
}
