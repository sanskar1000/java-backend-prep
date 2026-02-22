package arrays.oneD

/*
 Program: ArrayMaxMinDemo
 Purpose: Find maximum and minimum element
*/

public class ArrayMaxMinDemo {

    public static void main(String[] args) {

        int[] arr = {8, 3, 15, 2, 9};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
