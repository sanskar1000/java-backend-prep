package strings.stringbuilder;

/*
------------------------------------------------------------
Program Name : StringBuilderLengthDemo
Topic        : StringBuilder length() Method
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the length() method of StringBuilder.
The length() method returns the number of characters currently
present in the StringBuilder object.

Key Points:
• length() returns the current size of the string
• It counts all characters including spaces
• StringBuilder allows modification of the string

Syntax:
sb.length();

Example:
"Hello Java" → Length = 10

Time Complexity : O(1)
Space Complexity: O(1)
------------------------------------------------------------
*/

public class StringBuilderLengthDemo {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Hello Java");

        // Finding length
        int length = sb.length();

        System.out.println("String : " + sb);
        System.out.println("Length : " + length);
    }
}
