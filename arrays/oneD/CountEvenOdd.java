package arrays.oneD;
/*
 Program: CountEvenOdd
 Purpose: Count even and odd numbers in an array
 Concept: Array input, loops, conditional statements
*/

import java.util.Scanner;

public class CountEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Enter 6 numbers:");

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        // Logic
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
