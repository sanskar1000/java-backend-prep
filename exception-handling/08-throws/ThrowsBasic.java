import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Program: ThrowsBasic
 * Topic: Exception Handling - throws
 * Level: Beginner
 *
 * Description:
 * Demonstrates the use of the throws keyword with a checked exception.
 *
 * The openFile() method attempts to open "bank-data.txt" using
 * FileReader. Since FileReader can throw FileNotFoundException,
 * the method declares this exception using the throws keyword.
 *
 * The exception is not handled inside openFile(). Instead, it is
 * propagated to the calling method, main(), where it is handled
 * using a try-catch block.
 *
 * Exception Flow:
 *
 *     main()
 *       ↓
 *     openFile()
 *       ↓
 *     FileNotFoundException
 *       ↓
 *     throws
 *       ↓
 *     main() catch
 *
 * Concepts Used:
 * - Checked Exception
 * - throws keyword
 * - FileReader
 * - FileNotFoundException
 * - Exception propagation
 * - try-catch-finally
 *
 * Note:
 * FileNotFoundException is a checked exception, so Java requires
 * it to be either handled using try-catch or declared using throws.
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */
public class ThrowsBasic {

    /**
     * Program entry point.
     *
     * Calls openFile() and handles the FileNotFoundException
     * propagated from that method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        try {

            openFile();

        } catch (FileNotFoundException e) {

            System.out.println(
                    "File error : " + e.getMessage()
            );

        } finally {

            System.out.println("Cleanup done.");
        }
    }

    /**
     * Attempts to open the bank data file.
     *
     * This method does not handle FileNotFoundException itself.
     * Instead, the exception is declared using throws and
     * propagated to the calling method, main().
     *
     * @throws FileNotFoundException if bank-data.txt cannot be found
     */
    static void openFile() throws FileNotFoundException {

        FileReader fileReader =
                new FileReader("bank-data.txt");

        System.out.println("File opened successfully.");
    }
}
