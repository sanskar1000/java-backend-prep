package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : LibraryFineSystem
 * Topic        : Methods & Real-World Logic
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program simulates a
 * simple library fine system.
 *
 * Features:
 * - Checks if book is returned late
 * - Calculates fine amount
 * - Displays receipt
 *
 * Fine Rule:
 * ₹5 per late day
 *
 * Concepts Used:
 * - methods
 * - boolean methods
 * - conditional statements
 * - method reuse
 * - real-world problem solving
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LibraryFineSystem {

    /**
     * Checks whether the book
     * was returned late.
     *
     * @param lateDays number of late days
     * @return true if late, otherwise false
     */
    static boolean isLate(int lateDays) {
        return lateDays > 0;
    }

    /**
     * Calculates fine amount.
     *
     * Fine = ₹5 per late day
     *
     * @param lateDays number of late days
     * @return fine amount
     */
    static int calculateFine(int lateDays) {

        if (isLate(lateDays)) {
            return lateDays * 5;
        }

        return 0;
    }

    /**
     * Displays library receipt.
     *
     * @param lateDays number of late days
     */
    static void displayReceipt(String bookName , int lateDays) {

        // 🔹 Validation
        if (lateDays < 0) {
            System.out.println("Invalid late days");
            return;
        }

        int fine = calculateFine(lateDays);
        boolean late = isLate(lateDays);

        System.out.println("----- Library Receipt -----");
        System.out.println("Book Name : " + bookName);

        if (late) {

            System.out.println("Book Returned Late");

            System.out.println("Late Days : " + lateDays);

            System.out.println("Fine      : ₹" + fine);

        } else {

            System.out.println("Book Returned On Time");

            System.out.println("Fine      : ₹0");
        }
    }

    public static void main(String[] args) {

        // 🔹 Method call
        displayReceipt("Java Programming",9);
    }
}
