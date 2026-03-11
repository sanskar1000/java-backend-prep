package strings.stringtokenizer;

import java.util.StringTokenizer;

/*
------------------------------------------------------------
Program Name : StringTokenizerDemo
Topic        : StringTokenizer
Level        : Beginner
Author       : Aradhya Thakur
Year         : 2026

Description:
This program demonstrates how to use StringTokenizer to
split a string into tokens using space as a delimiter.

Key Points:
• StringTokenizer breaks string into tokens
• Default delimiter = space
• nextToken() returns next token
• hasMoreTokens() checks if tokens remain

Example Output:
Java
is
a
powerful
language
------------------------------------------------------------
*/

public class StringTokenizerDemo {

    public static void main(String[] args) {

        String text = "Java is a powerful language";

        StringTokenizer tokenizer = new StringTokenizer(text);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
