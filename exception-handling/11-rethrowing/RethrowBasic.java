/**
 * RethrowPractice
 * ---------------
 * This program demonstrates the concept of rethrowing an exception
 * in Java.
 *
 * Rethrowing means catching an exception in one method and then
 * using `throw e;` to pass the same exception to the calling method.
 *
 * Exception flow:
 *
 * main()
 *   ↓
 * methodB()
 *   ↓
 * methodA()
 *   ↓
 * ArithmeticException
 *   ↓
 * methodA() catches and rethrows
 *   ↓
 * methodB() catches and rethrows
 *   ↓
 * main() catches the exception
 *
 * Expected Output:
 * D
 * A
 * B
 * C
 * F
 * G
 *
 * Important:
 * E is not printed because methodB() throws an exception,
 * so control immediately moves to the catch block in main().
 */
public class RethrowPractice {

    /**
     * Demonstrates catching and rethrowing an exception.
     *
     * The ArithmeticException occurs because of division by zero.
     * methodA() catches the exception and rethrows the same exception
     * to its caller, methodB().
     */
    static void methodA() {

        try {
            System.out.println("A");

            // Causes ArithmeticException
            int x = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("B");

            // Rethrow the same exception to methodB()
            throw e;
        }
    }

    /**
     * Calls methodA() and catches the rethrown exception.
     *
     * After handling it partially, methodB() rethrows the same
     * exception to its caller, main().
     */
    static void methodB() {

        try {

            // Call methodA()
            methodA();

        } catch (ArithmeticException e) {

            System.out.println("C");

            // Rethrow the same exception to main()
            throw e;
        }
    }

    /**
     * Program entry point.
     *
     * Calls methodB() inside a try-catch block and handles the
     * ArithmeticException rethrown by methodB().
     */
    public static void main(String[] args) {

        System.out.println("D");

        try {

            // Calls methodB()
            methodB();

            // This statement is skipped when an exception occurs
            System.out.println("E");

        } catch (ArithmeticException e) {

            // Final handling of the rethrown exception
            System.out.println("F");
        }

        // Execution continues after the catch block
        System.out.println("G");
    }
}
