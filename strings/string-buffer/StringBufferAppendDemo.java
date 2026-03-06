package strings.stringbuffer;

/*
------------------------------------------------------------
Program Name : StringBufferAppendDemo
Topic        : StringBuffer
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the append() method of StringBuffer.
append() is used to add text at the end of the existing string.

Key Concept:
• StringBuffer is mutable (can change after creation)
• append() modifies the same object
• Thread-safe (synchronized)

Example Output:
Original String : Java
After Append : Java Programming

Time Complexity  : O(n)
Space Complexity : O(1)
------------------------------------------------------------
*/

public class StringBufferAppendDemo {

    public static void main(String[] args) {

        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original String : " + sb);

        // Appending new text
        sb.append(" Programming");

        System.out.println("After Append : " + sb);
    }
}
