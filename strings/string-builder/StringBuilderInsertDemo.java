package strings.stringbuilder;

/*
------------------------------------------------------------
Program Name : StringBuilderInsertDemo
Topic        : StringBuilder insert() Method
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the insert() method of StringBuilder.
The insert() method inserts characters or strings at a specified
position in the existing string.

Key Points:
• insert(index, value) inserts text at the given index
• Index starts from 0
• StringBuilder is mutable (content can be modified)

Syntax:
sb.insert(index, "text");

Example:
"HelloWorld" → insert(5, " ") → "Hello World"

Time Complexity : O(n)
Space Complexity: O(1)
------------------------------------------------------------
*/

public class StringBuilderInsertDemo {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("HelloWorld");

        System.out.println("Original String : " + sb);

        // Insert space at index 5
        sb.insert(5, " ");

        System.out.println("After Insert : " + sb);
    }
}
