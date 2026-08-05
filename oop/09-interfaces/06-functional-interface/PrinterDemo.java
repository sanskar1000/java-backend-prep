/**
 * ============================================================
 * Project : Printer Management System
 * File    : PrinterDemo.java
 * Author  : Aradhya Thakur
 *
 * Description:
 * Demonstrates the use of Java Functional Interfaces,
 * default methods, private interface methods,
 * private static interface methods, and static methods.
 *
 * Concepts Covered:
 * ✔ Functional Interface
 * ✔ Interface Implementation
 * ✔ Default Methods
 * ✔ Private Interface Methods (Java 9+)
 * ✔ Static Interface Methods
 * ✔ Encapsulation
 * ✔ Constructor Validation
 * ✔ Polymorphism
 * ============================================================
 */


/**
 * Functional interface representing a printer.
 *
 * Since this interface contains only one abstract method,
 * it can be implemented using either a normal class or
 * a lambda expression.
 */
@FunctionalInterface
interface Printer {

    /**
     * Prints a document.
     */
    void print();

    /**
     * Displays the printer status.
     *
     * This default method internally calls a private helper
     * method before displaying the printer status.
     */
    default void printStatus() {
        initializePrinter();
        System.out.println("Printer is ready.\n");
    }

    /**
     * Prepares the printer before printing.
     *
     * This helper method is private because it is intended
     * to be used only inside the interface.
     */
    private void initializePrinter() {
        System.out.println("""
                Initializing printer...
                Checking ink...
                Checking paper...
                """);
    }

    /**
     * Displays general printer maintenance tips.
     *
     * Static interface methods are called using
     * InterfaceName.methodName().
     */
    static void showPrinterGuide() {
        printHeader();

        System.out.println("""
                1. Load paper correctly.
                2. Keep ink cartridges full.
                3. Clean the printer regularly.
                """);
    }

    /**
     * Prints the heading for the printer guide.
     *
     * Private static helper method.
     */
    private static void printHeader() {
        System.out.println("========== Printer Guide ==========\n");
    }
}


/**
 * Represents a laser printer.
 *
 * Implements the Printer functional interface.
 */
class LaserPrinter implements Printer {

    /** Printer brand. */
    private String brand;

    /** Printer model. */
    private String model;

    /** Printing speed (pages per minute). */
    private int printSpeed;

    /**
     * Constructs a LaserPrinter object.
     *
     * @param brand printer brand
     * @param model printer model
     * @param printSpeed printing speed in pages/minute
     */
    public LaserPrinter(String brand, String model, int printSpeed) {

        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Unknown";
            System.out.println("Invalid brand. Default value assigned.\n");
        }

        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Unknown";
            System.out.println("Invalid model. Default value assigned.\n");
        }

        if (printSpeed > 0) {
            this.printSpeed = printSpeed;
        } else {
            this.printSpeed = 0;
            System.out.println("Invalid print speed. Default value assigned.\n");
        }

        System.out.println("LaserPrinter constructor executed.\n");
    }

    /**
     * @return printer brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return printer model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return printing speed in pages per minute
     */
    public int getPrintSpeed() {
        return printSpeed;
    }

    /**
     * Prints a document.
     *
     * Implementation of the abstract method declared
     * in the Printer interface.
     */
    @Override
    public void print() {
        System.out.println(
                getBrand() + " " + getModel()
                        + " printed a document at "
                        + getPrintSpeed()
                        + " pages/minute.\n");
    }

    /**
     * Displays printer information.
     */
    public void displayPrinterDetails() {

        System.out.println("------- Printer Details -------");
        System.out.println("Brand       : " + getBrand());
        System.out.println("Model       : " + getModel());
        System.out.println("Print Speed : " + getPrintSpeed() + " pages/minute");
        System.out.println();
    }
}


/**
 * ============================================================
 * Main class of the application.
 *
 * Creates a LaserPrinter object and demonstrates:
 * • Functional interface implementation
 * • Interface reference
 * • Abstract method implementation
 * • Default interface method
 * • Static interface method
 * ============================================================
 */
public class Main {

    /**
     * Program entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a LaserPrinter object.
        LaserPrinter laserPrinter =
                new LaserPrinter("HP", "LaserJet Pro", 35);

        // Upcasting to the Printer interface.
        Printer printer = laserPrinter;

        // Display printer information.
        laserPrinter.displayPrinterDetails();

        // Print a document.
        printer.print();

        // Display printer status.
        printer.printStatus();

        // Display printer maintenance guide.
        Printer.showPrinterGuide();
    }
}
