/**
 * Custom unchecked exception used when a bank account
 * does not have enough balance to complete a withdrawal.
 */
class InsufficientBalanceException extends RuntimeException {

    /**
     * Creates an InsufficientBalanceException with
     * the specified message.
     *
     * @param message explanation of the exception
     */
    public InsufficientBalanceException(String message) {

        super(message);
    }
}

/**
 * Represents a simple bank account.
 *
 * Demonstrates encapsulation, validation, and custom
 * exception handling.
 */
class BankAccount {

    private double balance;

    /**
     * Creates a BankAccount with the specified balance.
     *
     * @param balance initial account balance
     * @throws IllegalArgumentException if the balance is
     *         zero or negative
     */
    public BankAccount(double balance) {

        if (balance <= 0) {

            throw new IllegalArgumentException(
                    "Invalid balance."
            );
        }

        this.balance = balance;
    }

    /**
     * Returns the current account balance.
     *
     * @return current balance
     */
    public double getBalance() {

        return balance;
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * The method validates the withdrawal amount and checks
     * whether sufficient balance is available.
     *
     * @param amount amount to withdraw
     * @throws IllegalArgumentException if the amount is
     *         zero or negative
     * @throws InsufficientBalanceException if the withdrawal
     *         amount is greater than the available balance
     */
    public void withdraw(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Invalid amount."
            );
        }

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Balance is insufficient."
            );
        }

        balance -= amount;

        System.out.printf(
                "Remaining balance : %,.2f%n",
                balance
        );
    }
}

/**
 * Program: ExceptionPractice2
 * Topic: Custom Unchecked Exception with OOP
 * Level: Beginner / Intermediate
 *
 * Description:
 * Demonstrates how to create and use a custom unchecked
 * exception in a bank account withdrawal scenario.
 *
 * The program uses InsufficientBalanceException when a
 * withdrawal amount exceeds the available account balance.
 *
 * Exception Hierarchy:
 *
 *     RuntimeException
 *          ↓
 *     InsufficientBalanceException
 *
 * Exception Handling Flow:
 *
 *     withdraw()
 *        ↓
 *     Validation
 *        ↓
 *     Insufficient balance?
 *        ↓
 *       YES
 *        ↓
 *     throw InsufficientBalanceException
 *        ↓
 *     catch in main()
 *        ↓
 *     finally
 *
 * Concepts Used:
 * - Custom unchecked exception
 * - RuntimeException
 * - throw keyword
 * - try-catch-finally
 * - Multiple catch blocks
 * - Exception hierarchy
 * - Encapsulation
 * - Constructor validation
 * - Getters
 * - Object state modification
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */
public class ExceptionPractice2 {

    /**
     * Program entry point.
     *
     * Creates a bank account, performs a successful
     * withdrawal, and then attempts a withdrawal that
     * exceeds the available balance.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        BankAccount account = new BankAccount(50000.0);

        try {

            System.out.printf(
                    "Total balance : %.2f%n",
                    account.getBalance()
            );

            account.withdraw(5000.0);

            account.withdraw(60000.0);

        } catch (InsufficientBalanceException e) {

            System.out.println(
                    "Exception : "
                            + e.getClass().getSimpleName()
            );

            System.out.println(
                    "Message   : " + e.getMessage()
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Exception : "
                            + e.getClass().getSimpleName()
            );

            System.out.println(
                    "Message   : " + e.getMessage()
            );

        } catch (Exception e) {

            System.out.println(
                    "Another Exception."
            );

        } finally {

            System.out.println("-Completed-");
        }
    }
}
