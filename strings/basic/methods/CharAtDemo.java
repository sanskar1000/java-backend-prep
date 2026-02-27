package strings.method;

import java.util.scanner;

/**
* ----------------------------------------------------------------
* Program Name : CharAtDemo
* Topic        : Java Strings
* Level        : Beginner
* Author       : Aradhya Thakur
* Year         ; 2026
*
* Description:
* This program demonstrates the use of the String charAt()
* method to access a character at a specific index.
*
* Notes:
* • Index starts from 0.
* • If index is invalid -> StringIndexOutOfBoundsExpextion.
*
* Example:
* Input  : Java
* Index  : 2
* Output : Character at index 2 = v
* Time Complexity   : O(1)
* Space Complexity  : O(1)
* ----------------------------------------------------------------
*/

public class CharAtDemo {

  Public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("Character at index " + index + " = " + ch);
        } else {
            System.out.println("Invalid index!");
        }

        sc.close();
    }
}
