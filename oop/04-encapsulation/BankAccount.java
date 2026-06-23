/**
 * ------------------------------------------------------------
 * Program Name : BankAccountEncapsulationDemo
 * Topic        : Encapsulation and Getter Methods
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 *
 * - Classes and Objects
 * - Constructors
 * - Encapsulation
 * - Getter Methods
 * - Deposit Operation
 * - Withdrawal Operation
 * - Validation Logic
 *
 * Concepts Used:
 * - private instance variables
 * - Constructors
 * - Methods
 * - Data Hiding
 * - Validation
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class BankAccount {

    // Private instance variables
    private String accountHolder;
    private double balance;

    /**
     * Parameterized Constructor
     *
     * @param accountHolder account holder name
     * @param balance initial balance
     */
    BankAccount(String accountHolder,
                double balance) {

        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println(
                    "Invalid balance. Default balance assigned."
            );
            this.balance = 0;
        }
    }

    /**
     * Returns account holder name.
     *
     * @return account holder name
     */
    String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Returns current balance.
     *
     * @return account balance
     */
    double getBalance() {
        return balance;
    }

    /**
     * Deposits money into account.
     *
     * @param amount deposit amount
     */
    void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.printf(
                    "₹%.2f deposited successfully.%n",
                    amount
            );

        } else {

            System.out.println(
                    "Invalid deposit amount."
            );
        }

        System.out.println();
    }

    /**
     * Withdraws money from account.
     *
     * @param amount withdrawal amount
     */
    void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println(
                    "Invalid withdrawal amount."
            );

        } else if (amount > balance) {

            System.out.println(
                    "Insufficient balance."
            );

        } else {

            balance -= amount;

            System.out.printf(
                    "₹%.2f withdrawn successfully.%n",
                    amount
            );
        }

        System.out.println();
    }

    /**
     * Displays account information.
     */
    void displayAccountDetails() {

        System.out.println(
                "----- Account Details -----"
        );

        System.out.println(
                "Account Holder : " +
                accountHolder
        );

        System.out.printf(
                "Balance        : ₹%.2f%n",
                balance
        );

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount b1 =
                new BankAccount(
                        "Aradhya",
                        5000
                );

        System.out.println(
                "===== Initial Details ====="
        );

        b1.displayAccountDetails();

        System.out.println(
                "===== Deposit ====="
        );

        b1.deposit(2000);

        System.out.println(
                "===== Withdrawal ====="
        );

        b1.withdraw(3000);

        System.out.println(
                "===== Updated Details ====="
        );

        b1.displayAccountDetails();
    }
}
