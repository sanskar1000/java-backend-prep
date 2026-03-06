package strings.stringbuffer;

/*
------------------------------------------------------------
Program Name : StringBufferDeleteDemo
Topic        : StringBuffer
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the delete() method of StringBuffer.
delete() removes characters from a specified range of the string.

Key Concept:
• delete(int start, int end)
• start index is inclusive
• end index is exclusive
• StringBuffer is mutable, so the same object is modified.

Example Output:
Original String : Java Programming
After Delete : Java

Time Complexity  : O(n)
Space Complexity : O(1)
------------------------------------------------------------
*/

public class StringBufferDeleteDemo {

    public static void main(String[] args) {

        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Java Programming");

        System.out.println("Original String : " + sb);

        // Delete characters from index 4 to 16
        sb.delete(4, 16);

        System.out.println("After Delete : " + sb);

    }
}
