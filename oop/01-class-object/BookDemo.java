package oops.classobject;

/**
 * ------------------------------------------------------------
 * Program Name : BookDemo
 * Topic        : Class and Object (OOP Basics)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 * - class creation
 * - object creation
 * - instance variables
 * - object methods
 * - independent object state
 *
 * A Book class is created to represent
 * books with title, author, and price.
 *
 * Concepts Used:
 * - classes
 * - objects
 * - methods
 * - instance variables
 * - object state
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Book {

    // 🔹 Instance variables
    String title;

    String author;

    int price;

    /**
     * Displays book details.
     */
    void displayDetails() {

        System.out.println("Book Title : " + title);

        System.out.println("Author     : " + author);

        System.out.println("Price      : ₹" + price);

        System.out.println();
    }
}

public class BookDemo {

    public static void main(String[] args) {

        // 🔹 Object creation
        Book b1 = new Book();

        Book b2 = new Book();

        // 🔹 Assign values to object 1
        b1.title = "Java: The Complete Reference";

        b1.author = "Herbert Schildt";

        b1.price = 1399;

        // 🔹 Assign values to object 2
        b2.title = "Fluent Python";

        b2.author = "Luciano Ramalho";

        b2.price = 3000;

        // 🔹 Display details
        b1.displayDetails();

        b2.displayDetails();
    }
}
