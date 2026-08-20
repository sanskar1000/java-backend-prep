/**
 * ------------------------------------------------------------
 * Program Name : PaymentMethodDemo
 * Topic        : Interface and Polymorphism
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how an interface can define a
 * common payment operation while different classes provide
 * their own implementation.
 *
 * The Payment interface is implemented by:
 * - UPIPayment
 * - CardPayment
 * - CashPayment
 *
 * OrderService depends on the Payment interface rather than
 * a specific payment implementation.
 *
 * This allows OrderService to work with different payment
 * methods through polymorphism.
 *
 * Concepts Used:
 * - Interface
 * - Abstraction
 * - Polymorphism
 * - Method Overriding
 * - Programming to an Interface
 * - Encapsulation
 * - Constructor Validation
 * - final Fields
 * - Object Interaction
 *
 * ------------------------------------------------------------
 */


/**
 * Represents a general payment method.
 */
interface Payment {

    /**
     * Processes a payment.
     *
     * @param amount payment amount
     */
    void processPayment(double amount);
}


/**
 * Represents a UPI payment method.
 */
class UPIPayment implements Payment {

    @Override
    public void processPayment(double amount) {

        System.out.printf(
                "UPI payment of ₹%.2f processed.%n",
                amount
        );
    }
}


/**
 * Represents a card payment method.
 */
class CardPayment implements Payment {

    @Override
    public void processPayment(double amount) {

        System.out.printf(
                "Card payment of ₹%.2f processed.%n",
                amount
        );
    }
}


/**
 * Represents a cash payment method.
 */
class CashPayment implements Payment {

    @Override
    public void processPayment(double amount) {

        System.out.printf(
                "Cash payment of ₹%.2f processed.%n",
                amount
        );
    }
}


/**
 * Represents an order service that uses a Payment method.
 */
class OrderService {

    private final String orderId;
    private final Payment payment;

    /**
     * Creates an OrderService.
     *
     * @param orderId unique order ID
     * @param payment payment method used for the order
     */
    public OrderService(
            String orderId,
            Payment payment
    ) {

        if (orderId != null && !orderId.isBlank()) {

            this.orderId = orderId;

        } else {

            this.orderId = "Unknown";

            System.out.println(
                    "Invalid order ID. Default value assigned."
            );
        }

        if (payment == null) {

            throw new IllegalArgumentException(
                    "Payment cannot be null."
            );
        }

        this.payment = payment;
    }

    /**
     * Returns the order ID.
     *
     * @return order ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Places an order and processes its payment.
     *
     * @param amount order amount
     */
    public void placeOrder(double amount) {

        if (amount <= 0) {

            System.out.println(
                    "Invalid amount. Order cannot be placed."
            );

            return;
        }

        System.out.println(
                "Order " + orderId
                        + " is being processed."
        );

        payment.processPayment(amount);

        System.out.println(
                "Order " + orderId
                        + " placed successfully."
        );

        System.out.println();
    }
}


/**
 * Demonstrates interface-based polymorphism.
 */
public class PaymentMethodDemo {

    public static void main(String[] args) {

        // Different implementations referenced by Payment
        Payment upiPayment = new UPIPayment();
        Payment cardPayment = new CardPayment();
        Payment cashPayment = new CashPayment();

        // Same OrderService works with different payment methods
        OrderService upiOrder =
                new OrderService("ORD101", upiPayment);

        OrderService cardOrder =
                new OrderService("ORD102", cardPayment);

        OrderService cashOrder =
                new OrderService("ORD103", cashPayment);

        // Process different types of payments
        upiOrder.placeOrder(5000);
        cardOrder.placeOrder(7500);
        cashOrder.placeOrder(2000);
    }
}
