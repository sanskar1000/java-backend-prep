package strings.stringbuffer;

/*
------------------------------------------------------------
Program Name : StringBufferCapacityDemo
Topic        : StringBuffer
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the capacity() method of StringBuffer.
capacity() returns the total storage capacity of the buffer.

Key Concept:
• Default capacity of StringBuffer = 16
• If a string is added → capacity = 16 + string length
• Capacity increases automatically when needed

Example Output:
String : Java
Length : 4
Capacity : 20

Time Complexity  : O(1)
Space Complexity : O(1)
------------------------------------------------------------
*/

public class StringBufferCapacityDemo {

    public static void main(String[] args) {

        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("String : " + sb);

        // Length of the string
        System.out.println("Length : " + sb.length());

        // Total capacity of buffer
        System.out.println("Capacity : " + sb.capacity());
    }
}
