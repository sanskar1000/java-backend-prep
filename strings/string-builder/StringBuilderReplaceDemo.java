package strings.stringbuilder;

/*
------------------------------------------------------------
Program Name : StringBuilderReplaceDemo
Topic        : StringBuilder replace() Method
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the replace() method of StringBuilder.
The replace() method replaces characters between the specified
start index and end index with a new string.

Key Points:
• replace(startIndex, endIndex, newString)
• startIndex is inclusive
• endIndex is exclusive
• StringBuilder is mutable (modifies the same object)

Example:
"Hello World" → replace(6, 11, "Java") → "Hello Java"

Time Complexity : O(n)
Space Complexity: O(1)
------------------------------------------------------------
*/

public class StringBuilderReplaceDemo {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Hello World");

        System.out.println("Original String : " + sb);

        // Replace "World" with "Java"
        sb.replace(6, 11, "Java");

        System.out.println("After Replace : " + sb);
    }
}
