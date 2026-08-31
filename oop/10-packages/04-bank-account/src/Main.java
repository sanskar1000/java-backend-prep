import model.BankAccount;
import service.BankService;

/**
 * Entry point of the Bank Account application.
 *
 * <p>Demonstrates how the BankAccount model and BankService
 * work together to perform banking operations.</p>
 */
public class Main {

    public static void main(String[] args) {

        // Create first bank account
        BankAccount accountA =
                new BankAccount(
                        "ACC101",
                        "Aradhya",
                        10000
                );

        // Create second bank account
        BankAccount accountB =
                new BankAccount(
                        "ACC102",
                        "Rahul",
                        5000
                );

        // Create banking service
        BankService bankService = new BankService();

        // Display initial account details
        System.out.println("Initial Accounts:");

        bankService.displayAccount(accountA);
        bankService.displayAccount(accountB);

        // Deposit money into account A
        System.out.println("\n--- Deposit ---");

        bankService.deposit(accountA, 2500);

        // Withdraw money from account A
        System.out.println("\n--- Withdraw ---");

        bankService.withdraw(accountA, 3000);

        // Transfer money from account A to account B
        System.out.println("\n--- Transfer ---");

        bankService.transfer(
                accountA,
                accountB,
                2000
        );

        // Display final account details
        System.out.println("\nFinal Accounts:");

        bankService.displayAccount(accountA);
        bankService.displayAccount(accountB);
    }
}
