/**
 * Program: ThrowMasterChallenge
 * Topic: Exception Handling - throw, try-catch-finally
 * Level: Beginner / Intermediate
 *
 * Description:
 * Demonstrates how to use the throw keyword to validate a bank
 * withdrawal transaction and handle IllegalArgumentException
 * using try-catch-finally.
 *
 * Validation Rules:
 * 1. Withdrawal amount must be greater than zero.
 * 2. Withdrawal amount cannot exceed the available balance.
 *
 * Test Cases:
 * 1. Successful transaction.
 * 2. Zero withdrawal amount.
 * 3. Withdrawal amount greater than balance.
 * 4. Negative withdrawal amount.
 *
 * Concepts Used:
 * - throw
 * - IllegalArgumentException
 * - try-catch-finally
 * - Method creation
 * - Method parameters
 * - Exception message
 * - Exception type
 */
public class ThrowMasterChallenge {

    public static void main(String[] args) {

        System.out.println("=== Bank Transaction ===");

        // Test 1: Successful transaction
        testTransaction(10000, 2000);

        // Test 2: Invalid zero amount
        testTransaction(10000, 0);

        // Test 3: Amount greater than balance
        testTransaction(10000, 15000);

        // Test 4: Invalid negative amount
        testTransaction(10000, -500);

        System.out.println("\nAll transaction tests completed.");
    }

    /**
     * Executes a transaction and handles any validation exception.
     *
     * @param balance available account balance
     * @param amount withdrawal amount
     */
    static void testTransaction(double balance, double amount) {

        try {

            processTransaction(balance, amount);

        } catch (IllegalArgumentException e) {

            System.out.println("\nTransaction failed.");
            printException(e);

        } finally {

            System.out.println("Cleanup complete.");
        }
    }

    /**
     * Validates and processes a bank withdrawal.
     *
     * @param balance available account balance
     * @param amount withdrawal amount
     * @throws IllegalArgumentException if the amount is invalid
     *                                  or exceeds the balance
     */
    static void processTransaction(double balance, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance."
            );
        }

        System.out.println("\nTransaction successful.");
        System.out.println("Transaction amount : " + amount);
        System.out.println(
                "Remaining balance  : " + (balance - amount)
        );
    }

    /**
     * Prints basic information about an exception.
     *
     * @param e exception to display
     */
    static void printException(IllegalArgumentException e) {

        System.out.println(
                "Exception : " + e.getClass().getSimpleName()
        );

        System.out.println(
                "Message   : " + e.getMessage()
        );
    }
}
