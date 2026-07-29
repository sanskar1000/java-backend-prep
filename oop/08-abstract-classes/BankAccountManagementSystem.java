/**
 * ------------------------------------------------------------
 * Program Name : BankAccountManagementSystem
 * Topic        : Abstract Class in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates abstraction using an abstract
 * BankAccount class. Two different account types
 * (SavingsAccount and CurrentAccount) provide their own
 * implementations of withdraw() and calculateInterest().
 *
 * Concepts Covered:
 * - Abstract Class
 * - Abstract Methods
 * - Inheritance
 * - Method Overriding
 * - Runtime Polymorphism
 * - Encapsulation
 * - Constructors
 * - Input Validation
 * - Banking System Simulation
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Represents a generic bank account.
 *
 * Every bank account has an account number,
 * account holder name, and balance.
 * Each account type must define its own
 * withdrawal and interest calculation logic.
 */
abstract class BankAccount {

    /** Account number */
    private String accountNumber;

    /** Account holder name */
    private String accountHolderName;

    /** Current account balance */
    private double balance;

    /**
     * Constructs a BankAccount object.
     *
     * @param accountNumber Account number
     * @param accountHolderName Account holder name
     * @param balance Initial account balance
     */
    public BankAccount(String accountNumber,
                       String accountHolderName,
                       double balance) {

        if (accountNumber != null && !accountNumber.isBlank()) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = "Unknown";
            System.out.println("Invalid account number. Default value assigned.");
        }

        if (accountHolderName != null && !accountHolderName.isBlank()) {
            this.accountHolderName = accountHolderName;
        } else {
            this.accountHolderName = "Unknown";
            System.out.println("Invalid account holder name. Default value assigned.");
        }

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
            System.out.println("Invalid balance. Default value assigned.");
        }

        System.out.println("BankAccount constructor executed.\n");
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
     * Returns the account holder name.
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
     * Updates the account balance.
     *
     * @param balance new balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Deposits money into the account.
     *
     * @param amount deposit amount
     */
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.\n");
            return;
        }

        setBalance(getBalance() + amount);

        System.out.printf("Deposit Successful : ₹%,.2f%n", amount);
        System.out.println();
    }

    /**
     * Displays common account details.
     */
    public void displayAccountDetails() {

        System.out.println("--------- Account Details ---------");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Account Holder : " + getAccountHolderName());
        System.out.printf("Balance        : ₹%,.2f%n", getBalance());
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount withdrawal amount
     */
    public abstract void withdraw(double amount);

    /**
     * Calculates interest for the account.
     */
    public abstract void calculateInterest();
}

/**
 * Represents a savings account.
 *
 * A savings account earns interest and allows
 * withdrawals only up to the available balance.
 */
class SavingsAccount extends BankAccount {

    /** Annual interest rate (%) */
    private double interestRate;

    /**
     * Constructs a SavingsAccount object.
     *
     * @param accountNumber Account number
     * @param accountHolderName Account holder name
     * @param balance Initial balance
     * @param interestRate Interest rate
     */
    public SavingsAccount(String accountNumber,
                          String accountHolderName,
                          double balance,
                          double interestRate) {

        super(accountNumber, accountHolderName, balance);

        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            this.interestRate = 0.0;
            System.out.println("Invalid interest rate. Default value assigned.");
        }

        System.out.println("SavingsAccount constructor executed.\n");
    }

    /**
     * Returns the interest rate.
     *
     * @return interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Withdraws money from the savings account.
     *
     * @param amount withdrawal amount
     */
    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.\n");
            return;
        }

        if (amount > getBalance()) {
            System.out.println("Insufficient balance.\n");
            return;
        }

        setBalance(getBalance() - amount);

        System.out.printf("Withdrawal Successful : ₹%,.2f%n", amount);
        System.out.println();
    }

    /**
     * Calculates and displays earned interest.
     */
    @Override
    public void calculateInterest() {

        double interest =
                getBalance() * getInterestRate() / 100;

        System.out.printf("Interest Earned : ₹%,.2f%n", interest);
        System.out.println();
    }

    /**
     * Displays complete savings account details.
     */
    @Override
    public void displayAccountDetails() {

        super.displayAccountDetails();
        System.out.println("Interest Rate  : " + getInterestRate() + "%");
        System.out.println();
    }
}

/**
 * Represents a current account.
 *
 * A current account supports overdraft but
 * does not earn interest.
 */
class CurrentAccount extends BankAccount {

    /** Maximum overdraft limit */
    private double overDraftLimit;

    /**
     * Constructs a CurrentAccount object.
     *
     * @param accountNumber Account number
     * @param accountHolderName Account holder name
     * @param balance Initial balance
     * @param overDraftLimit Maximum overdraft limit
     */
    public CurrentAccount(String accountNumber,
                          String accountHolderName,
                          double balance,
                          double overDraftLimit) {

        super(accountNumber, accountHolderName, balance);

        if (overDraftLimit > 0) {
            this.overDraftLimit = overDraftLimit;
        } else {
            this.overDraftLimit = 0.0;
            System.out.println("Invalid overdraft limit. Default value assigned.");
        }

        System.out.println("CurrentAccount constructor executed.\n");
    }

    /**
     * Returns the overdraft limit.
     *
     * @return overdraft limit
     */
    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    /**
     * Withdraws money using available balance
     * and overdraft facility.
     *
     * @param amount withdrawal amount
     */
    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.\n");
            return;
        }

        double availableBalance =
                getBalance() + getOverDraftLimit();

        if (amount > availableBalance) {
            System.out.println("Insufficient balance.\n");
            return;
        }

        setBalance(getBalance() - amount);

        System.out.printf("Withdrawal Successful : ₹%,.2f%n", amount);
        System.out.println();
    }

    /**
     * Displays interest information.
     *
     * Current accounts do not earn interest.
     */
    @Override
    public void calculateInterest() {

        System.out.println("Current accounts do not earn interest.\n");
    }

    /**
     * Displays complete current account details.
     */
    @Override
    public void displayAccountDetails() {

        super.displayAccountDetails();
        System.out.printf("Overdraft Limit : ₹%,.2f%n", getOverDraftLimit());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 *
 * Demonstrates abstraction and runtime polymorphism
 * using SavingsAccount and CurrentAccount
 * through BankAccount references.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        BankAccount savingsAccount =
                new SavingsAccount(
                        "SA101",
                        "Aradhya",
                        50000.0,
                        6.5
                );

        BankAccount currentAccount =
                new CurrentAccount(
                        "CA201",
                        "Uday",
                        25000.0,
                        10000.0
                );

        System.out.println("=================================");
        System.out.println("       Savings Account");
        System.out.println("=================================\n");

        savingsAccount.deposit(5000.0);
        savingsAccount.withdraw(10000.0);
        savingsAccount.calculateInterest();
        savingsAccount.displayAccountDetails();

        System.out.println("=================================");
        System.out.println("       Current Account");
        System.out.println("=================================\n");

        currentAccount.deposit(3000.0);
        currentAccount.withdraw(32000.0);
        currentAccount.calculateInterest();
        currentAccount.displayAccountDetails();
    }
}
