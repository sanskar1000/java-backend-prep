package strings.stringbuilder;

/*
------------------------------------------------------------
Program Name : StringBuilderAppendDemo
Topic        : StringBuilder
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the append() method of StringBuilder.
append() is used to add text at the end of the existing string.

Key Concept:
• append() adds new data to the end
• StringBuilder is mutable (modifiable)
• Faster than StringBuffer in single-threaded programs

Example Output:
Result : Hello World
------------------------------------------------------------
*/

public class StringBuilderAppendDemo {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending text
        sb.append(" World");

        System.out.println("Result : " + sb);
    }
}
