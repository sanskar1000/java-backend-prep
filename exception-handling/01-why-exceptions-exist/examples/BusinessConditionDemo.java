public class BusinessConditionDemo {

    static void withdraw(int balance, int amount) {

        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        withdraw(1000, 1500);

        System.out.println("Transaction finished");
    }
}
