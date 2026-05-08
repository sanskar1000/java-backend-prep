package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : RepeatNameDemo
 * Topic        : Methods with Parameters & Loops
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how to create
 * and use a method with multiple parameters.
 *
 * The method repeatName(String name, int times)
 * prints the given name multiple times using a loop.
 *
 * Example Output:
 * Sanskar
 * Sanskar
 * Sanskar
 * ...
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RepeatNameDemo {

    /**
     * Prints a name multiple times.
     *
     * @param name  the name to print
     * @param times number of repetitions
     */
    static void repeatName(String name, int times) {

        // 🔹 Validation
        if (times <= 0) {
            System.out.println("Invalid repetition count");
            return;
        }

        // 🔹 Print name multiple times
        for (int i = 1; i <= times; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        // 🔹 Method call
        repeatName("Sanskar", 10);
    }
}
