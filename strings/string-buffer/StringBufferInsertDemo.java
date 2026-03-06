package strings.stringbuffer;

/*
------------------------------------------------------------
Program Name : StringBufferInsertDemo
Topic        : StringBuffer
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the insert() method of StringBuffer.
insert() is used to add characters or strings at a specific
position inside the existing string.

Key Concept:
• insert(int offset, String str)
• offset = position where new text will be inserted
• StringBuffer modifies the same object (mutable)

Example Output:
Original String : Java
After Insert : Java Programming

Time Complexity  : O(n)
Space Complexity : O(1)
------------------------------------------------------------
*/

public class StringBufferInsertDemo {

    public static void main(String[] args) {

        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original String : " + sb);

        // Insert text at index 4
        sb.insert(4, " Programming");

        System.out.println("After Insert : " + sb);

    }
}
