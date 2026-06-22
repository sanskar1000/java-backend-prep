package oops.practice;
/**
 * ------------------------------------------------------------
 * Program Name : BankAccountManagementSystem
 * Topic        : Constructor Overloading & Constructor Chaining
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 *
 * - Classes and Objects
 * - Constructor Overloading
 * - Constructor Chaining using this()
 * - Account Operations
 * - Object-to-Object Interaction
 * - Validation Logic
 *
 * Features:
 * - Create bank accounts
 * - Deposit money
 * - Withdraw money
 * - Transfer money between accounts
 * - Display account details
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class BankAccount {

    // Instance Variables
    String accountHolder;
    long accountNumber;
    double balance;
    String bankName;

    /**
     * Default Constructor
     */
    BankAccount() {

        this("Unknown", 0L, 0.0, "Unknown");
    }

    /**
     * One Parameter Constructor
     *
     * @param accountHolder account holder name
     */
    BankAccount(String accountHolder) {

        this(accountHolder, 0L, 0.0, "Unknown");
    }

    /**
     * Parameterized Constructor
     *
     * @param accountHolder account holder name
     * @param accountNumber account number
     * @param balance initial balance
     * @param bankName bank name
     */
    BankAccount(String accountHolder,
                long accountNumber,
                double balance,
                String bankName) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.bankName = bankName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    /**
     * Displays account details.
     */
    void displayAccountDetails() {

        System.out.println(
                "----- Bank Account Details -----"
        );

        System.out.println(
                "Account Holder : " + accountHolder
        );

        System.out.println(
                "Account Number : " + accountNumber
        );

        System.out.println(
                "Bank Name      : " + bankName
        );

        System.out.printf(
                "Balance        : ₹%.2f%n",
                balance
        );

        System.out.println();
    }

    /**
     * Deposits money into the account.
     *
     * @param amount amount to deposit
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
     * Withdraws money from the account.
     *
     * @param amount amount to withdraw
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
     * Transfers money to another account.
     *
     * @param other receiving account
     * @param amount transfer amount
     */
    void transferMoney(BankAccount other,
                       double amount) {

        if (amount <= 0) {

            System.out.println(
                    "Invalid transfer amount."
            );

        } else if (amount > balance) {

            System.out.println(
                    "Insufficient balance."
            );

        } else {

            this.balance -= amount;
            other.balance += amount;

            System.out.printf(
                    "%s transferred ₹%.2f to %s%n",
                    this.accountHolder,
                    amount,
                    other.accountHolder
            );
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Default Constructor
        BankAccount a1 = new BankAccount();

        // One Parameter Constructor
        BankAccount a2 =
                new BankAccount(
                        "Rajendra"
                );

        // Parameterized Constructor
        BankAccount a3 =
                new BankAccount(
                        "Adhara",
                        34567845L,
                        40000.50,
                        "State Bank Of India"
                );

        System.out.println(
                "===== Account 1 ====="
        );
        a1.displayAccountDetails();

        System.out.println(
                "===== Account 2 ====="
        );
        a2.displayAccountDetails();

        System.out.println(
                "===== Account 3 ====="
        );
        a3.displayAccountDetails();

        // Deposit Money
        System.out.println(
                "===== Deposit ====="
        );

        a3.deposit(500000.70);

        a3.displayAccountDetails();

        // Withdraw Money
        System.out.println(
                "===== Withdrawal ====="
        );

        a3.withdraw(300000.40);

        a3.displayAccountDetails();

        // Transfer Money
        System.out.println(
                "===== Money Transfer ====="
        );

        a3.transferMoney(a2, 50000);

        System.out.println(
                "===== Receiver Account ====="
        );
        a2.displayAccountDetails();

        System.out.println(
                "===== Sender Account ====="
        );
        a3.displayAccountDetails();
    }
}
