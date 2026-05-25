package oops.constructors;

/**
 * ------------------------------------------------------------
 * Class Name : BankAccount
 * Topic      : Copy Constructor
 * Author     : Aradhya Thakur
 * Year       : 2026
 *
 * Description:
 * Demonstrates:
 * - parameterized constructor
 * - copy constructor
 * - object state copying
 * - deposit and withdraw operations
 * - independent copied objects
 * - object reference comparison
 * ------------------------------------------------------------
 */

class BankAccount {

    String accountHolder;

    String accountNumber;

    double balance;

    /**
     * Parameterized constructor.
     *
     * @param accountHolder account holder name
     * @param accountNumber account number
     * @param balance initial balance
     */
    BankAccount(
            String accountHolder,
            String accountNumber,
            double balance
    ) {

        this.accountHolder = accountHolder;

        this.accountNumber = accountNumber;

        this.balance = balance;
    }

    /**
     * Copy constructor.
     *
     * @param obj object to copy
     */
    BankAccount(BankAccount obj) {

        this.accountHolder = obj.accountHolder;

        this.accountNumber = obj.accountNumber;

        this.balance = obj.balance;
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
                    "Deposited Amount : ₹%.2f%n",
                    amount
            );

        } else {

            System.out.println(
                    "Invalid deposit amount"
            );
        }
    }

    /**
     * Withdraws money from account.
     *
     * @param amount withdrawal amount
     */
    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            System.out.printf(
                    "Withdrawn Amount : ₹%.2f%n",
                    amount
            );

        } else {

            System.out.println(
                    "Insufficient balance or invalid amount"
            );
        }
    }

    /**
     * Displays account details.
     */
    void displayAccountDetails() {

        System.out.println(
                "----- Account Details -----"
        );

        System.out.println(
                "Account Holder : " + accountHolder
        );

        System.out.println(
                "Account Number : " + accountNumber
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

        // Original object
        BankAccount a1 =
                new BankAccount(
                        "Himanshi",
                        "3436445955",
                        50000.56
                );

        // Copied object
        BankAccount a2 =
                new BankAccount(a1);

        // Operations on copied object
        a2.deposit(5000);

        a2.withdraw(10000);

        // Original account
        System.out.println(
                "===== Original Account ====="
        );

        a1.displayAccountDetails();

        // Copied account
        System.out.println(
                "===== Copied Account ====="
        );

        a2.displayAccountDetails();

        // Memory check
        System.out.println(
                "Are both objects same? "
                        + (a1 == a2)
        );
    }
}
