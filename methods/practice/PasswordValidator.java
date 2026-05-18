package methods.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PasswordValidator
 * Topic        : String Validation & Helper Methods
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program validates a password using:
 *
 * Rules:
 * - Minimum 8 characters
 * - At least one uppercase letter
 * - At least one lowercase letter
 * - At least one digit
 * - At least one special character
 *
 * Concepts Used:
 * - String traversal
 * - Character class methods
 * - helper methods
 * - boolean methods
 * - validation systems
 * - method composition
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    // Minimum password length
    static final int MIN_LENGTH = 8;

    /**
     * Checks minimum length.
     *
     * @param password user password
     * @return true if length >= 8
     */
    static boolean hasMinLength(String password) {
        return password.length() >= MIN_LENGTH;
    }

    /**
     * Checks for uppercase letter.
     *
     * @param password user password
     * @return true if uppercase exists
     */
    static boolean hasUppercase(String password) {

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks for lowercase letter.
     *
     * @param password user password
     * @return true if lowercase exists
     */
    static boolean hasLowercase(String password) {

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isLowerCase(ch)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks for digit.
     *
     * @param password user password
     * @return true if digit exists
     */
    static boolean hasDigit(String password) {

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks for special character.
     *
     * @param password user password
     * @return true if special character exists
     */
    static boolean hasSpecialChar(String password) {

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Validates password using all rules.
     *
     * @param password user password
     * @return true if password is valid
     */
    static boolean isValidPassword(String password) {

        return hasMinLength(password)
                && hasUppercase(password)
                && hasLowercase(password)
                && hasDigit(password)
                && hasSpecialChar(password);
    }

    /**
     * Displays password validation report.
     *
     * @param password user password
     */
    static void displayReport(String password) {

        System.out.println("----- Password Validation Report -----");

        if (hasMinLength(password)) {
            System.out.println("✔ Minimum 8 characters");
        } else {
            System.out.println("✘ Minimum 8 characters");
        }

        if (hasUppercase(password)) {
            System.out.println("✔ Contains uppercase letter");
        } else {
            System.out.println("✘ Missing uppercase letter");
        }

        if (hasLowercase(password)) {
            System.out.println("✔ Contains lowercase letter");
        } else {
            System.out.println("✘ Missing lowercase letter");
        }

        if (hasDigit(password)) {
            System.out.println("✔ Contains digit");
        } else {
            System.out.println("✘ Missing digit");
        }

        if (hasSpecialChar(password)) {
            System.out.println("✔ Contains special character");
        } else {
            System.out.println("✘ Missing special character");
        }

        System.out.println();

        if (isValidPassword(password)) {
            System.out.println("Password Status : VALID");
        } else {
            System.out.println("Password Status : INVALID");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password : ");
        String password = sc.nextLine();

        System.out.println();

        displayReport(password);

        sc.close();
    }
}
