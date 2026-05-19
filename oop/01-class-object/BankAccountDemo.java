package oops.classobject;

/**
 * ------------------------------------------------------------
 * Program Name : BankAccountDemo
 * Topic        : Class and Object (OOP Basics)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 * - object state
 * - object behavior
 * - deposit operation
 * - withdrawal operation
 * - balance management
 *
 * A BankAccount class is created to
 * simulate basic banking operations.
 *
 * Concepts Used:
 * - classes
 * - objects
 * - instance variables
 * - methods
 * - validation
 * - state modification
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class BankAccount {

    // 🔹 Instance variables
    String accountHolder;

    int balance;

    /**
     * Deposits amount into account.
     *
     * @param amount deposit amount
     */
    void deposit(int amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println("₹" + amount + " deposited successfully");

        } else {

            System.out.println("Invalid deposit amount");
        }
    }

    /**
     * Withdraws amount from account.
     *
     * @param amount withdrawal amount
     */
    void withdraw(int amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            System.out.println("₹" + amount + " withdrawn successfully");

        } else {

            System.out.println("Invalid withdrawal");
        }
    }

    /**
     * Displays account details.
     */
    void displayBalance() {

        System.out.println("Account Holder : " + accountHolder);

        System.out.println("Balance        : ₹" + balance);

        System.out.println();
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        // 🔹 Object creation
        BankAccount a1 = new BankAccount();

        BankAccount a2 = new BankAccount();

        // 🔹 Assign values
        a1.accountHolder = "Raj";
        a1.balance = 40000;

        a2.accountHolder = "Simran";
        a2.balance = 80000;

        // 🔹 Display initial balance
        a1.displayBalance();

        // 🔹 Deposit operation
        a1.deposit(5000);

        a1.displayBalance();

        // 🔹 Withdraw operation
        a1.withdraw(20000);

        a1.displayBalance();

        // 🔹 Display second account
        a2.displayBalance();
    }
}
