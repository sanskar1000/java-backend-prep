import java.util.Scanner;

/**
 * Program: ThrowValidation
 * Topic: Exception Handling - throw
 * Level: Beginner
 *
 * Description:
 * Demonstrates multiple input validations using the throw keyword.
 * If any input violates its validation rule, an
 * IllegalArgumentException is thrown with an appropriate message.
 *
 * Validation Rules:
 * - Username cannot be blank.
 * - Age must be between 0 and 100.
 * - Balance cannot be negative.
 *
 * Concepts Used:
 * - Scanner
 * - String.isBlank()
 * - if statements
 * - throw keyword
 * - IllegalArgumentException
 */
public class ThrowValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        // Validate username.
        if (username.isBlank()) {
            throw new IllegalArgumentException(
                    "Username cannot be blank."
            );
        }

        // Validate age.
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException(
                    "Age must be between 0 and 100."
            );
        }

        // Validate balance.
        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Balance cannot be negative."
            );
        }

        // Display valid information.
        System.out.println("\n--- User Details ---");
        System.out.println("Name    : " + username);
        System.out.println("Age     : " + age);
        System.out.println("Balance : " + balance);

        scanner.close();
    }
}
