import java.io.FileNotFoundException;

/**
 * Program: ThrowsMasterChallenge
 * Topic: Exception Handling - throws and Exception Propagation
 * Level: Intermediate
 *
 * Description:
 * Demonstrates the use of the throws keyword with checked
 * exceptions and the handling of both checked and unchecked
 * exceptions.
 *
 * The program simulates a bank transaction by:
 *
 * 1. Loading an account file.
 * 2. Validating the transaction amount.
 * 3. Processing the transaction.
 * 4. Handling exceptions in the caller.
 *
 * Exception Types:
 * - FileNotFoundException:
 *   Checked exception. It must be handled or declared using throws.
 *
 * - IllegalArgumentException:
 *   Unchecked exception. It does not require a throws declaration.
 *
 * Exception Flow:
 *
 *     main()
 *       ↓
 *     testTransaction()
 *       ↓
 *     processTransaction()
 *       ├── loadAccount()
 *       │       ↓
 *       │   FileNotFoundException
 *       │
 *       └── validateTransaction()
 *               ↓
 *       IllegalArgumentException
 *
 * Concepts Used:
 * - throw
 * - throws
 * - Checked exceptions
 * - Unchecked exceptions
 * - Exception propagation
 * - Multiple catch blocks
 * - try-catch-finally
 * - Exception hierarchy
 * - Helper methods
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */
public class ThrowsMasterChallenge {

    public static void main(String[] args) {

        testTransaction(5000, "File1.txt");
        System.out.println();

        testTransaction(-500, "File2.txt");
        System.out.println();

        testTransaction(100000, "File3.txt");
        System.out.println();

        testTransaction(40000, " ");
    }

    /**
     * Attempts to load an account file.
     *
     * FileNotFoundException is a checked exception, so this
     * method declares it using the throws keyword.
     *
     * @param fileName name of the account file
     * @throws FileNotFoundException if the file name is null
     *         or blank
     */
    static void loadAccount(String fileName)
            throws FileNotFoundException {

        System.out.println("Loading account...");

        if (fileName == null || fileName.isBlank()) {

            throw new FileNotFoundException(
                    "Account file not found."
            );
        }

        System.out.println("Account file found.");
    }

    /**
     * Validates the transaction amount.
     *
     * IllegalArgumentException is an unchecked exception,
     * so it does not need to be declared using throws.
     *
     * @param amount transaction amount to validate
     * @throws IllegalArgumentException if the amount is zero,
     *         negative, or greater than 50000
     */
    static void validateTransaction(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Invalid amount. Amount must be greater than zero."
            );
        }

        if (amount > 50000) {

            throw new IllegalArgumentException(
                    "Invalid amount. Amount cannot exceed 50000."
            );
        }

        System.out.println("Amount is valid.");
    }

    /**
     * Processes a bank transaction.
     *
     * Calls loadAccount() and validateTransaction().
     * FileNotFoundException is propagated to the caller because
     * it is a checked exception.
     *
     * @param amount transaction amount
     * @param fileName account file name
     * @throws FileNotFoundException if the account file
     *         cannot be found
     */
    static void processTransaction(
            double amount,
            String fileName) throws FileNotFoundException {

        loadAccount(fileName);
        validateTransaction(amount);
    }

    /**
     * Tests a transaction and handles any exceptions produced
     * during transaction processing.
     *
     * @param amount transaction amount
     * @param fileName account file name
     */
    static void testTransaction(
            double amount,
            String fileName) {

        System.out.println("----- Transaction -----");
        System.out.println("Amount: " + amount);

        try {

            processTransaction(amount, fileName);

            System.out.println("Transaction successful.");

        } catch (FileNotFoundException e) {

            System.out.println("Transaction failed.");
            printException(e);

        } catch (IllegalArgumentException e) {

            System.out.println("Transaction failed.");
            printException(e);

        } catch (Exception e) {

            System.out.println("Unexpected exception.");
            printException(e);

        } finally {

            System.out.println(
                    "Transaction processing completed."
            );
        }
    }

    /**
     * Prints basic information about an exception.
     *
     * @param e exception whose information should be displayed
     */
    static void printException(Exception e) {

        System.out.println(
                "Exception : " + e.getClass().getSimpleName()
        );

        System.out.println(
                "Message   : " + e.getMessage()
        );
    }
}
