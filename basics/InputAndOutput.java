/**
 * ------------------------------------------------------------
 * Program Name : InputOutputDemo
 * Topic        : User Input & Output
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how to:
 * - take user input using Scanner
 * - store values in variables
 * - display formatted output
 *
 * Inputs Taken:
 * - Name
 * - Age
 * - Marks
 *
 * Concepts Used:
 * - Scanner class
 * - nextLine()
 * - nextInt()
 * - nextFloat()
 * - formatted output
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

package basics;

import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) {

        // 🔹 Create Scanner object
        Scanner sc = new Scanner(System.in);

        // 🔹 Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        // 🔹 Output
        System.out.println("\n--- Student Details ---");

        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);

        // 🔹 Close scanner
        sc.close();
    }
}
