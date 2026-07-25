/**
 * ------------------------------------------------------------
 * Program Name : FinalClassDemo
 * Topic        : Final Class in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of the final class in Java.
 *
 * Concepts Covered:
 * - final class
 * - Parameterized constructor
 * - Encapsulation
 * - Input validation
 * - Getter method
 * - Object creation
 *
 * Key Learning:
 * - A final class cannot be inherited.
 * - Objects of a final class can be created normally.
 * - final is commonly used for utility, security, and immutable classes.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Represents a company utility.
 *
 * This class is declared as final, which means
 * no other class can extend it.
 */
final class Utility {

    /** Company name */
    private String companyName;

    /**
     * Constructs a Utility object.
     *
     * @param companyName Name of the company
     */
    Utility(String companyName) {

        if (companyName != null && !companyName.isBlank()) {
            this.companyName = companyName;
        } else {
            this.companyName = "Unknown";
            System.out.println("Invalid company name. Default value assigned.");
        }

        System.out.println("Utility object created.");
    }

    /**
     * Returns the company name.
     *
     * @return company name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Displays company details.
     */
    public void displayCompany() {

        System.out.println("========= Company =========");
        System.out.println("Company : " + getCompanyName());
        System.out.println();
    }
}

/*
 * ------------------------------------------------------------
 * Attempting to inherit from a final class
 * ------------------------------------------------------------
 *
 * class Demo extends Utility {
 *
 *     Demo() {
 *         super("Demo");
 *     }
 * }
 *
 * Compilation Error:
 * Cannot inherit from final class 'Utility'
 *
 * Reason:
 * A class declared as final cannot be extended.
 * ------------------------------------------------------------
 */

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("      Final Class Demonstration");
        System.out.println("===================================\n");

        Utility u1 = new Utility("OpenAI Technologies");
        Utility u2 = new Utility("Google");

        System.out.println();

        u1.displayCompany();
        u2.displayCompany();
    }
}
