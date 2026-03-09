package strings.stringbuilder;

/*
------------------------------------------------------------
Program Name : StringBuilderDeleteDemo
Topic        : StringBuilder delete() Method
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the delete() method of StringBuilder.
The delete() method removes characters from a specified start
index to an end index.

Key Points:
• delete(startIndex, endIndex) removes characters
• startIndex is inclusive
• endIndex is exclusive
• StringBuilder is mutable

Syntax:
sb.delete(startIndex, endIndex);

Example:
"Hello World" → delete(5, 6) → "HelloWorld"

Time Complexity : O(n)
Space Complexity: O(1)
------------------------------------------------------------
*/

public class StringBuilderDeleteDemo {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Hello World");

        System.out.println("Original String : " + sb);

        // Delete space between Hello and World
        sb.delete(5, 6);

        System.out.println("After Delete : " + sb);
    }
}
