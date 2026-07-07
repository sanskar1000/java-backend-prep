package arrays.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : EquilibriumIndex
 * Topic        : Arrays - Prefix Sum
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the Equilibrium Index of an array.
 *
 * An equilibrium index is an index where the sum of all
 * elements on the left is equal to the sum of all
 * elements on the right.
 *
 * Example:
 * Array : [1, 7, 3, 6, 5, 6]
 * Output: 3
 *
 * Explanation:
 * Left Sum  = 1 + 7 + 3 = 11
 * Right Sum = 5 + 6 = 11
 *
 * Algorithm:
 * 1. Calculate the total sum of the array.
 * 2. Traverse the array while maintaining the left sum.
 * 3. Compute the right sum using:
 *      rightSum = totalSum - leftSum - currentElement
 * 4. If left sum equals right sum, return the index.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class EquilibriumIndex {

    /**
     * Finds the equilibrium index of the array.
     *
     * @param arr input array
     * @return equilibrium index if found, otherwise -1
     */
    static int equilibriumIndex(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int totalSum = 0;

        for (int value : arr) {
            totalSum += value;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int index = equilibriumIndex(arr);

        if (index == -1) {
            System.out.println("Equilibrium index does not exist.");
        } else {
            System.out.println("Equilibrium Index = " + index);
        }

        sc.close();
    }
}
