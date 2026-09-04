import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ------------------------------------------------------------
 * Program Name : CheckedExceptionDemo
 * Topic        : Checked Exceptions
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates how Java handles checked exceptions using
 * try-catch blocks.
 *
 * This program attempts to open a file using FileInputStream.
 *
 * FileInputStream can throw FileNotFoundException, which is a
 * checked exception and must be handled or declared.
 *
 * Concepts Used:
 * - Checked Exception
 * - try-catch
 * - FileInputStream
 * - FileNotFoundException
 * - IOException
 * - Exception handling
 *
 * ------------------------------------------------------------
 */

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        try {

            // Attempt to open the file
            FileInputStream file =
                    new FileInputStream("data.txt");

            System.out.println("File opened successfully.");

            // Close the file
            file.close();

            System.out.println("File closed successfully.");

        } catch (FileNotFoundException e) {

            // Handles missing file
            System.out.println(
                    "File not found: " + e.getMessage()
            );

        } catch (IOException e) {

            // Handles input/output problems
            System.out.println(
                    "Error while closing the file: "
                            + e.getMessage()
            );
        }
    }
}
