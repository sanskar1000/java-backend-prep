package strings.stringbuffer;

/*
------------------------------------------------------------
Program Name : StringBufferReplaceDemo
Topic        : StringBuffer
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the replace() method of StringBuffer.
replace() is used to replace characters between two indexes
with a new string.

Key Concept:
• replace(int start, int end, String str)
• start index is inclusive
• end index is exclusive
• The original StringBuffer object is modified (mutable)

Example Output:
Original String : Java Programming
After Replace : Java Language

Time Complexity  : O(n)
Space Complexity : O(1)
------------------------------------------------------------
*/

public class StringBufferReplaceDemo {

    public static void main(String[] args) {

        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Java Programming");

        System.out.println("Original String : " + sb);

        // Replace characters from index 5 to 16
        sb.replace(5, 16, "Language");

        System.out.println("After Replace : " + sb);
    }
}
