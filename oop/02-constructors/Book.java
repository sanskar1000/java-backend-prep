package oops.constructors;
/**
 * ------------------------------------------------------------
 * Class Name : Book
 * Topic      : Parameterized Constructor
 * Author     : Aradhya Thakur
 * Year       : 2026
 *
 * Description:
 * Demonstrates:
 * - parameterized constructor
 * - object initialization
 * - this keyword
 * - multiple objects
 * - object methods
 *
 * Concepts Used:
 * - constructors
 * - this keyword
 * - object state
 * - method calling
 * - formatted output
 * ------------------------------------------------------------
 */

class Book {

    String title;
    String author;
    double price;

    /**
     * Parameterized constructor.
     *
     * @param title  book title
     * @param author book author
     * @param price  book price
     */
    Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * Displays book details.
     */
    void displayBookDetails() {

        System.out.println("----- Book Details -----");

        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);

        System.out.printf("Price  : ₹%.2f%n", price);

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Object creation
        Book b1 = new Book(
                "The Psychology of Money",
                "Morgan Housel",
                299.0
        );

        Book b2 = new Book(
                "Atomic Habits",
                "James Clear",
                450.0
        );

        // Display details
        b1.displayBookDetails();

        b2.displayBookDetails();
    }
}
