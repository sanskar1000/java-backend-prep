package strings.stringbuffer;

/*
------------------------------------------------------------
Program Name : StringBufferLengthDemo
Topic        : StringBuffer
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the length() method of StringBuffer.
length() returns the number of characters currently stored
in the StringBuffer object.

Key Concept:
• length() returns the current length of the string
• It counts all characters including spaces
• Different from capacity() which shows total buffer size

Example Output:
String : Java Programming
Length : 16

Time Complexity  : O(1)
Space Complexity : O(1)
------------------------------------------------------------
*/

public class StringBufferLengthDemo {

    public static void main(String[] args) {

        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Java Programming");

        System.out.println("String : " + sb);

        // Getting length of the StringBuffer
        int length = sb.length();

        System.out.println("Length : " + length);
    }
}
