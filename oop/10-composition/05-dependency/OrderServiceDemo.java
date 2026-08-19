package oop.practice;

/**
 * ------------------------------------------------------------
 * Program Name : OrderServiceDemo
 * Topic        : Object Interaction / Service Dependency
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how two Java objects can interact.
 *
 * OrderService depends on PaymentService to process the
 * payment when an order is placed.
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Encapsulation
 * - Private Fields
 * - Getter Method
 * - Instance Methods
 * - Object as Constructor Parameter
 * - Object Interaction
 * - Validation
 * - IllegalArgumentException
 *
 * ------------------------------------------------------------
 */

/**
 * Responsible for processing payments.
 */
class PaymentService {

    /**
     * Processes a payment for the given amount.
     *
     * @param amount payment amount
     */
    public void processPayment(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Invalid payment amount."
            );
            return;
        }

        System.out.printf(
                "Payment of ₹%.2f processed successfully.%n%n",
                amount
        );
    }
}


/**
 * Responsible for placing orders.
 */
class OrderService {

    private String orderId;
    private PaymentService paymentService;

    /**
     * Creates an OrderService.
     *
     * @param orderId unique order ID
     * @param paymentService payment service used to process payment
     */
    public OrderService(
            String orderId,
            PaymentService paymentService
    ) {

        if (orderId != null && !orderId.isBlank()) {

            this.orderId = orderId;

        } else {

            this.orderId = "Unknown";

            System.out.println(
                    "Invalid order ID. Default value assigned."
            );
        }

        if (paymentService == null) {

            throw new IllegalArgumentException(
                    "PaymentService cannot be null."
            );
        }

        this.paymentService = paymentService;
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
     * @param amount order payment amount
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

        paymentService.processPayment(amount);

        System.out.println(
                "Order " + orderId
                        + " placed successfully."
        );
    }
}


/**
 * Demonstrates interaction between OrderService
 * and PaymentService.
 */
public class OrderPaymentDemo {

    public static void main(String[] args) {

        // Create PaymentService object
        PaymentService paymentService =
                new PaymentService();

        // Pass PaymentService object to OrderService
        OrderService orderService =
                new OrderService(
                        "ORD101",
                        paymentService
                );

        // Place an order
        orderService.placeOrder(5000);
    }
}
