package arrays.methods;

/*
 Program: TwoDArrayDeepToStringDemo
 Purpose: Demonstrate Arrays.deepToString() for printing 2D arrays
 Concept: Multidimensional array display using Java utility class
*/

import java.util.Arrays;

public class TwoDArrayDeepToStringDemo {

    public static void main(String[] args) {

        int[][] marks = {
            {85, 90, 78},
            {88, 76, 95},
            {92, 81, 70}
        };

        System.out.println("2D Array using deepToString:");
        System.out.println(Arrays.deepToString(marks));
    }
}
