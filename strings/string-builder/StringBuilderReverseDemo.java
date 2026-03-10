package strings.stringbuilder;

/*
------------------------------------------------------------
Program Name : StringBuilderReverseDemo
Topic        : StringBuilder reverse() Method
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the reverse() method of StringBuilder.
The reverse() method reverses the sequence of characters in the
StringBuilder object.

Key Points:
• reverse() reverses the string in-place
• StringBuilder is mutable
• No extra memory is required

Syntax:
sb.reverse();

Example:
"Java" → "avaJ"

Time Complexity : O(n)
Space Complexity: O(1)
------------------------------------------------------------
*/

public class StringBuilderReverseDemo {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original String : " + sb);

        // Reverse the string
        sb.reverse();

        System.out.println("Reversed String : " + sb);
    }
}
