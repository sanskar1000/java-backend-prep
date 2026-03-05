package strings.methods;

/**
 * ------------------------------------------------------------
 * Program Name : StringFormatDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of String.format() method
 * to create formatted strings.
 *
 * Key Concept:
 * • format() returns a formatted string
 * • Works similar to printf()
 * • Uses format specifiers like %s, %d, %.2f
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringFormatDemo {

    public static void main(String[] args) {

        String name = "Aradhya";
        int age = 20;
        double marks = 92.456;

        String result = String.format(
                "Name: %s | Age: %d | Marks: %.2f",
                name, age, marks
        );

        System.out.println(result);
    }
}
