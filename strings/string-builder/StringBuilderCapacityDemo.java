package strings.stringbuilder;

/*
------------------------------------------------------------
Program Name : StringBuilderCapacityDemo
Topic        : StringBuilder capacity() Method
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates the capacity() method of StringBuilder.
The capacity represents the amount of storage available before
the StringBuilder needs to allocate more memory.

Key Points:
• capacity() returns the current capacity of the object
• Default capacity = 16 + length of initial string
• Capacity increases automatically when needed

Syntax:
sb.capacity();

Example:
StringBuilder sb = new StringBuilder("Java");
Capacity = 16 + 4 = 20

Time Complexity : O(1)
Space Complexity: O(1)
------------------------------------------------------------
*/

public class StringBuilderCapacityDemo {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("String : " + sb);

        // Checking capacity
        int capacity = sb.capacity();

        System.out.println("Capacity : " + capacity);
    }
}
