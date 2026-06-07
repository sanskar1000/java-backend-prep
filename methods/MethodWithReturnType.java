package methods;

/**
 * ------------------------------------------------------------
 * Program Name : MethodWithReturnType
 * Topic        : Methods in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates a method that returns a value.
 *
 * The program calculates the square of a number
 * and returns the result to the calling method.
 *
 * Example:
 * Input  : 5
 * Output : 25
 *
 * Concepts Used:
 * - Method Creation
 * - Return Type
 * - Method Calling
 * - Parameters
 * - Local Variables
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */
public class MethodWithReturnType {

    /**
     * Calculates the square of a number.
     *
     * @param number input number
     * @return square of the number
     */
    static int getSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int result = getSquare(5);

        System.out.println("Square = " + result);
    }
}
