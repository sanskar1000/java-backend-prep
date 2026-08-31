package service;

import model.BankAccount;

/**
 * Provides banking operations for BankAccount objects.
 *
 * <p>This class is responsible for handling operations such as
 * deposits, withdrawals, transfers, and displaying account details.</p>
 */
public class BankService {

    /**
     * Deposits money into the specified bank account.
     *
     * @param account account receiving the deposit
     * @param amount amount to deposit
     */
    public void deposit(BankAccount account, double amount) {

        if (account == null) {
            System.out.println("Account cannot be null.");
            return;
        }

        account.deposit(amount);
    }

    /**
     * Withdraws money from the specified bank account.
     *
     * @param account account from which money is withdrawn
     * @param amount amount to withdraw
     */
    public void withdraw(BankAccount account, double amount) {

        if (account == null) {
            System.out.println("Account cannot be null.");
            return;
        }

        account.withdraw(amount);
    }

    /**
     * Transfers money from one bank account to another.
     *
     * <p>The transfer is completed only when the amount is valid
     * and the source account has sufficient balance.</p>
     *
     * @param fromAccount account from which money is transferred
     * @param toAccount account receiving the money
     * @param amount amount to transfer
     */
    public void transfer(
            BankAccount fromAccount,
            BankAccount toAccount,
            double amount
    ) {

        if (fromAccount == null || toAccount == null) {
            System.out.println(
                    "Source and destination accounts cannot be null."
            );
            return;
        }

        if (fromAccount == toAccount) {
            System.out.println(
                    "Transfer failed: Cannot transfer to the same account."
            );
            return;
        }

        if (amount <= 0) {
            System.out.println(
                    "Transfer amount must be greater than 0."
            );
            return;
        }

        if (fromAccount.getBalance() < amount) {
            System.out.println(
                    "Transfer failed: Insufficient balance."
            );
            return;
        }

        boolean withdrawn = fromAccount.withdraw(amount);

        if (withdrawn) {

            toAccount.deposit(amount);

            System.out.printf(
                    "Transferred: ₹%.2f from %s to %s%n",
                    amount,
                    fromAccount.getAccountNumber(),
                    toAccount.getAccountNumber()
            );
        }
    }

    /**
     * Displays the details of a bank account.
     *
     * @param account account whose details should be displayed
     */
    public void displayAccount(BankAccount account) {

        if (account == null) {
            System.out.println("Account cannot be null.");
            return;
        }

        System.out.println("----------------------------");
        System.out.println(
                "Account Number: "
                        + account.getAccountNumber()
        );

        System.out.println(
                "Account Holder: "
                        + account.getAccountHolderName()
        );

        System.out.printf(
                "Balance: ₹%.2f%n",
                account.getBalance()
        );

        System.out.println("----------------------------");
    }
}
