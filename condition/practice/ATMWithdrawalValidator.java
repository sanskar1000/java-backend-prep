package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ATMWithdrawalValidator
 * Topic        : Nested if-else
 * Level        : Beginner / Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program simulates ATM withdrawal validation.
 *
 * Conditions:
 * • Correct PIN required
 * • Withdrawal amount must be positive
 * • Amount must be multiple of 100
 * • Sufficient balance required
 *
 * Key Concepts:
 * • Nested if-else
 * • Input validation
 * • Logical conditions
 *
 * Example:
 * Balance : 5000
 * Withdraw: 1500
 * PIN     : 1234
 * Output  : Transaction successful
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ATMWithdrawalValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int correctPin = 1234;

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPin) {

            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount > 0) {

                if (amount % 100 == 0) {

                    if (amount <= balance) {

                        balance -= amount;
                        System.out.println("Transaction successful ✅");
                        System.out.println("Remaining balance: " + balance);

                    } else {
                        System.out.println("Insufficient balance ❌");
                    }

                } else {
                    System.out.println("Amount must be multiple of 100 ❌");
                }

            } else {
                System.out.println("Invalid amount ❌");
            }

        } else {
            System.out.println("Incorrect PIN ❌");
        }

        sc.close();
    }
}
