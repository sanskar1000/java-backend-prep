package strings.methods;

/**
 * ------------------------------------------------------------
 * Program Name : StringJoinDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of String.join() method to
 * combine multiple strings using a delimiter.
 *
 * Key Concept:
 * • String.join(delimiter, elements...)
 * • Returns a new String
 * • Introduced in Java 8
 *
 * Example:
 * Input  : Java, Python, C++
 * Output : Java - Python - C++
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringJoinDemo {

    public static void main(String[] args) {

        String result = String.join(" - ", "Java", "Python", "C++");

        System.out.println("Joined String: " + result);

    }
}
