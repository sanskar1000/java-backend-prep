package oops.encapsulation;
/**
 * ------------------------------------------------------------
 * Program Name : ATMManagementSystem
 * Topic        : Encapsulation and Validation
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 *
 * - Encapsulation
 * - Private instance variables
 * - Constructor validation
 * - Deposit operation
 * - Withdrawal operation
 * - PIN verification
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Encapsulation
 * - Getter Methods
 * - Validation Logic
 * - Methods
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class ATM {

    private int pin;
    private double balance;

    ATM(int pin, double balance) {

        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
        } else {
            System.out.println("Invalid PIN.");
        }

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.printf(
                    "Deposit amount : ₹%.2f%n",
                    amount
            );

        } else {

            System.out.println(
                    "Invalid amount."
            );
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 &&
                amount <= balance) {

            balance -= amount;

            System.out.printf(
                    "Withdraw amount : ₹%.2f%n",
                    amount
            );

        } else {

            System.out.println(
                    "Invalid amount or insufficient balance."
            );
        }
    }

    public boolean checkPin(int enteredPin) {
        return enteredPin == pin;
    }
}

public class Main {

    public static void main(String[] args) {

        ATM a1 =
                new ATM(
                        4567,
                        5000.0
                );

        System.out.println(
                "Balance : ₹" +
                a1.getBalance()
        );

        if (a1.checkPin(4567)) {

            System.out.println(
                    "Correct PIN"
            );

        } else {

            System.out.println(
                    "Incorrect PIN"
            );
        }

        a1.deposit(6000.89);

        System.out.println(
                "Balance : ₹" +
                a1.getBalance()
        );

        a1.withdraw(5678.90);

        System.out.println(
                "Balance : ₹" +
                a1.getBalance()
        );
    }
}
