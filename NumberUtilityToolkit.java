package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : NumberUtilityToolkit
 * Topic        : Methods & Menu-Driven Programs
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program provides multiple
 * number-related utilities using
 * separate methods.
 *
 * Features:
 * - Prime Number Check
 * - Palindrome Number Check
 * - Armstrong Number Check
 * - Factorial Calculation
 * - Reverse Number
 *
 * Concepts Used:
 * - methods
 * - switch-case
 * - loops
 * - mathematical logic
 * - menu-driven programming
 * - method reuse
 *
 * Time Complexity  : Depends on operation
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class NumberUtilityToolkit {

    /**
     * Checks whether a number is prime.
     */
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Reverses a number.
     */
    static int reverse(int n) {

        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n /= 10;
        }

        return reverse;
    }

    /**
     * Checks whether a number is palindrome.
     */
    static boolean isPalindrome(int n) {
        return reverse(n) == n;
    }

    /**
     * Returns factorial of a number.
     */
    static int factorial(int n) {

        if (n < 0) {
            return -1;
        }

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    /**
     * Checks whether a number is Armstrong.
     */
    static boolean isArmstrong(int n) {

        if (n < 0) {
            return false;
        }

        if (n == 0) {
            return true;
        }

        int original = n;
        int temp = n;

        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = n;

        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;

            sum += (int) Math.pow(digit, count);

            temp /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Menu
        System.out.println("----- Number Utility Toolkit -----");

        System.out.println("Enter P for Prime");
        System.out.println("Enter L for Palindrome");
        System.out.println("Enter A for Armstrong");
        System.out.println("Enter F for Factorial");
        System.out.println("Enter R for Reverse");

        // 🔹 Input
        System.out.print("\nEnter number : ");
        int n = sc.nextInt();

        System.out.print("Enter choice : ");
        char ch = sc.next().charAt(0);

        // 🔹 Menu-driven operations
        switch (ch) {

            case 'P':

                if (isPrime(n)) {
                    System.out.println(n + " is Prime");

                } else {
                    System.out.println(n + " is not Prime");
                }

                break;

            case 'L':

                if (isPalindrome(n)) {
                    System.out.println(n + " is Palindrome");

                } else {
                    System.out.println(n + " is not Palindrome");
                }

                break;

            case 'A':

                if (isArmstrong(n)) {
                    System.out.println(n + " is Armstrong");

                } else {
                    System.out.println(n + " is not Armstrong");
                }

                break;

            case 'F':

                if (n < 0) {
                    System.out.println("Factorial not defined");

                } else {
                    System.out.println("Factorial : " + factorial(n));
                }

                break;

            case 'R':

                System.out.println("Reverse : " + reverse(n));

                break;

            default:

                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
