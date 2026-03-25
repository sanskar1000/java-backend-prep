package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LoginChecker
 * Topic        : Nested if-else
 * Level        : Beginner / Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether login is successful by
 * validating username and password using nested if-else.
 *
 * Logic:
 * • First check username
 * • If correct → check password
 *
 * Key Concepts:
 * • Nested if-else
 * • String comparison using equals()
 *
 * Example:
 * Input  : user123, pass123
 * Output : Login successful
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LoginChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // predefined credentials
        String correctUsername = "admin";
        String correctPassword = "1234";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername)) {

            if (password.equals(correctPassword)) {
                System.out.println("Login successful");
            } else {
                System.out.println("Incorrect password");
            }

        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }
}
