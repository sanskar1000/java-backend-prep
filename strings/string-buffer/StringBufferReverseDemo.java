package strings.stringbuffer;

/*
------------------------------------------------------------
Program Name : StringBufferReverseDemo
Topic        : StringBuffer
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the reverse() method of StringBuffer.
reverse() is used to reverse the characters of the string.

Key Concept:
• reverse() reverses the sequence of characters
• It modifies the same StringBuffer object (mutable)
• Very useful for string manipulation

Example Output:
Original String : Java
Reversed String : avaJ

Time Complexity  : O(n)
Space Complexity : O(1)
------------------------------------------------------------
*/

public class StringBufferReverseDemo {

    public static void main(String[] args) {

        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original String : " + sb);

        // Reversing the string
        sb.reverse();

        System.out.println("Reversed String : " + sb);
    }
}
