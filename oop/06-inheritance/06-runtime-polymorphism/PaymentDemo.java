/**
 * ------------------------------------------------------------
 * Program Name : PaymentDemo
 * Topic        : Method Overriding (Runtime Polymorphism)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates Method Overriding in Java.
 *
 * A parent class (Payment) defines a common method pay().
 * Child classes (CreditCardPayment and UpiPayment) override
 * the pay() method to provide their own payment implementations.
 *
 * Runtime polymorphism is demonstrated by using parent class
 * references to invoke overridden methods of child classes.
 *
 * Concepts Covered:
 * - Inheritance
 * - Method Overriding
 * - Runtime Polymorphism
 * - Dynamic Method Dispatch
 * - @Override Annotation
 *
 * Expected Output:
 *
 * Payment through Credit Card.
 * Payment through UPI.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Parent class representing a generic payment.
 */
class Payment {

    /**
     * Processes a generic payment.
     */
    void pay() {
        System.out.println("Processing Payment.");
    }
}

/**
 * Child class representing payment through Credit Card.
 */
class CreditCardPayment extends Payment {

    /**
     * Processes payment using a Credit Card.
     */
    @Override
    void pay() {
        System.out.println("Payment through Credit Card.");
    }
}

/**
 * Child class representing payment through UPI.
 */
class UpiPayment extends Payment {

    /**
     * Processes payment using UPI.
     */
    @Override
    void pay() {
        System.out.println("Payment through UPI.");
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * Demonstrates runtime polymorphism by storing
     * child objects in parent class references.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Parent reference pointing to CreditCardPayment object
        Payment p1 = new CreditCardPayment();

        // Parent reference pointing to UpiPayment object
        Payment p2 = new UpiPayment();

        System.out.println("========== Payment System ==========\n");

        p1.pay();

        p2.pay();
    }
}
