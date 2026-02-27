package strings.basic;
import java.util.Scanner;

/*
Title: Count Vowels and Consonants
Topic: Strings
Level: Beginner
Author: Aradhya Thakur
Year: 2026

Problem Statement:
Write a Java program to count vowels and consonants in a given string.

Example:
Input  : Java
Output :
Vowels      : 2
Consonants  : 2

Approach:
1. Convert string to lowercase.
2. Traverse each character.
3. Check if character is a letter.
4. If letter is vowel → increment vowel count.
5. Else → increment consonant count.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CountVowelsConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check only alphabets
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels     : " + vowelCount);
        System.out.println("Consonants : " + consonantCount);
    }
}
