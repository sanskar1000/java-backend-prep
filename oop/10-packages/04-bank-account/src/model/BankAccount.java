package model;

/**
 * Represents a bank account.
 *
 * <p>This class demonstrates encapsulation by keeping
 * account details private and providing public methods
 * to access and modify account data safely.</p>
 */
public class BankAccount {

    private final String accountNumber;
    private final String accountHolderName;
    private double balance;

    /**
     * Creates a new bank account.
     *
     * @param accountNumber unique account number
     * @param accountHolderName name of the account holder
     * @param balance initial account balance
     */
    public BankAccount(
            String accountNumber,
            String accountHolderName,
            double balance
    ) {

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Account number cannot be null or blank."
            );
        }

        if (accountHolderName == null ||
                accountHolderName.isBlank()) {
            throw new IllegalArgumentException(
                    "Account holder name cannot be null or blank."
            );
        }

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative."
            );
        }

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    /**
     * Returns the account number.
     *
     * @return account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returns the account holder's name.
     *
     * @return account holder name
     */
    public String getAccountHolderName() {
        return accountHolderName;
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
     * Deposits money into the account.
     *
     * @param amount amount to deposit
     */
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Deposit amount must be greater than 0."
            );
            return;
        }

        balance += amount;

        System.out.printf(
                "Deposited: ₹%.2f%n",
                amount
        );
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount amount to withdraw
     * @return true if withdrawal is successful, otherwise false
     */
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Withdrawal amount must be greater than 0."
            );
            return false;
        }

        if (amount > balance) {
            System.out.println(
                    "Insufficient balance."
            );
            return false;
        }

        balance -= amount;

        System.out.printf(
                "Withdrawn: ₹%.2f%n",
                amount
        );

        return true;
    }
}
