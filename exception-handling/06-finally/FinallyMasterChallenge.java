/**
 * ------------------------------------------------------------
 * Program Name : FinallyMasterChallenge
 * Topic        : try-catch-finally and Exception Hierarchy
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program simulates basic bank transaction processing
 * while demonstrating Java exception handling.
 *
 * Four transaction scenarios are tested:
 *
 * Test 1:
 * Successful transaction.
 *
 * Test 2:
 * ArithmeticException caused by division by zero.
 *
 * Test 3:
 * NullPointerException caused by accessing a null reference.
 *
 * Test 4:
 * ArrayIndexOutOfBoundsException caused by accessing an
 * invalid array index.
 *
 * Each exception is handled using an appropriate catch block.
 * The finally block executes after every transaction,
 * regardless of whether an exception occurs.
 *
 * Concepts Used:
 * - try-catch-finally
 * - Multiple catch blocks
 * - Exception hierarchy
 * - ArithmeticException
 * - NullPointerException
 * - ArrayIndexOutOfBoundsException
 * - RuntimeException
 * - Exception
 * - Helper methods
 * - Exception object
 * - getClass().getSimpleName()
 * - getMessage()
 * - Program flow
 *
 * ------------------------------------------------------------
 */

public class FinallyMasterChallenge {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println(
                "=== Bank Transaction Simulator ==="
        );

        // Test 1: Successful transaction
        processTransaction(10000, 2000, 1);

        // Test 2: ArithmeticException
        processTransaction(10000, 0, 2);

        // Test 3: NullPointerException
        processTransaction(10000, 2000, 3);

        // Test 4: ArrayIndexOutOfBoundsException
        processTransaction(10000, 2000, 4);

        System.out.println(
                "\nProgram continues normally."
        );
    }

    /**
     * Processes a simulated bank transaction.
     *
     * Different test cases deliberately demonstrate
     * different exception scenarios.
     *
     * @param balance current account balance
     * @param amount transaction amount
     * @param testCase identifies which test to execute
     */
    public static void processTransaction(
            double balance,
            double amount,
            int testCase) {

        System.out.println(
                "\n--- Transaction Started ---"
        );

        try {

            if (testCase == 1) {

                // Successful transaction
                if (amount > 0 && amount <= balance) {

                    balance = balance - amount;

                    System.out.println(
                            "Transaction successful."
                    );

                    System.out.println(
                            "Remaining balance: "
                                    + balance
                    );

                } else {

                    System.out.println(
                            "Transaction failed: "
                                    + "Insufficient balance or invalid amount."
                    );
                }

            } else if (testCase == 2) {

                // Deliberately causes ArithmeticException
                int numerator = 100;
                int denominator = 0;

                int result = numerator / denominator;

                System.out.println(
                        "Result: " + result
                );

            } else if (testCase == 3) {

                // Deliberately causes NullPointerException
                String accountHolder = null;

                System.out.println(
                        accountHolder.length()
                );

            } else if (testCase == 4) {

                // Deliberately causes
                // ArrayIndexOutOfBoundsException
                int[] transactionIds = {
                        101, 102, 103
                };

                System.out.println(
                        transactionIds[5]
                );

            } else {

                System.out.println(
                        "Invalid test case."
                );
            }

        } catch (ArithmeticException e) {

            // Handles arithmetic errors
            System.out.println(
                    "Transaction failed."
            );

            printException(e);

        } catch (NullPointerException e) {

            // Handles null reference errors
            System.out.println(
                    "Transaction failed."
            );

            printException(e);

        } catch (RuntimeException e) {

            // Handles other unchecked exceptions
            System.out.println(
                    "Transaction failed."
            );

            printException(e);

        } catch (Exception e) {

            // Handles other unexpected exceptions
            System.out.println(
                    "Unexpected exception."
            );

            printException(e);

        } finally {

            // Always executes after try/catch
            System.out.println(
                    "Cleanup completed."
            );
        }

        // Executes after finally when the exception
        // has been handled
        System.out.println(
                "Transaction processing finished."
        );
    }

    /**
     * Prints information about the caught exception.
     *
     * @param e exception object
     */
    public static void printException(Exception e) {

        System.out.println(
                "Exception type : "
                        + e.getClass().getSimpleName()
        );

        System.out.println(
                "Message : "
                        + e.getMessage()
        );
    }
}
