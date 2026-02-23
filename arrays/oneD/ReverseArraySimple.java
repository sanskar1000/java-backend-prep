package arrays.oneD;

/*
 Program: ReverseArray
 Purpose: Reverse elements of an array
*/

public class ReverseArraySimple {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Reversed Array:");

        // Print array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
