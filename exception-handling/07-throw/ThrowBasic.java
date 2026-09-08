import java.util.Scanner;

/**
 * Program: ThrowBasic
 * Topic: Exception Handling - throw
 * Level: Beginner
 *
 * Description:
 * Demonstrates how to manually throw an unchecked exception
 * using the throw keyword when an age is outside the valid range.
 *
 * Concepts:
 * - Scanner
 * - if condition
 * - throw keyword
 * - IllegalArgumentException
 */
public class ThrowBasic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 18 || age > 100) {
            throw new IllegalArgumentException("Invalid age.");
        }

        System.out.println("Eligible");

        scanner.close();
    }
}
