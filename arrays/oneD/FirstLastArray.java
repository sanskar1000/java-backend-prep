package arrays.oneD;

/*
 Program: FirstLastArray
 Purpose: Read 5 numbers into an array and display first, last, and all elements
 Concept: Array input, indexing, enhanced for-loop
*/

import java.util.Scanner;

public class FirstLastArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // First element
        System.out.println("First Element of Array: " + arr[0]);

        // Last element
        System.out.println("Last Element of Array: " + arr[arr.length - 1]);

        // All elements
        System.out.print("All Elements of Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
