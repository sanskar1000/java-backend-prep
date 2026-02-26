package strings.basic;
/*
Title: Reverse a String
Topic: Strings
Level: Beginner
Author: Aradhya Thakur
Date: 2026

Problem Statement:
Write a Java program to reverse a given string.

Example:
Input  : Java
Output : avaJ

Approach:
Start from last character and append to new string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ReverseString {
    public static void main(String[] args) {

        String str = "Java";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
