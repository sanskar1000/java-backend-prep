/**
 * ============================================================================
 * Project      : Library Management System
 * File Name    : Main.java
 * Author       : Aradhya Thakur
 * Year         : 2026
 * Language     : Java
 * IDE          : IntelliJ IDEA / Eclipse / VS Code
 *
 * ----------------------------------------------------------------------------
 * Description
 * ----------------------------------------------------------------------------
 * This project demonstrates the core Object-Oriented Programming (OOP)
 * concepts in Java using a simple Library Management System.
 *
 * The program models different library items such as Books and Magazines
 * using an abstract base class and runtime polymorphism.
 *
 * It also demonstrates storing heterogeneous objects in a single collection
 * using an array of abstract type references.
 *
 * ----------------------------------------------------------------------------
 * OOP Concepts Demonstrated
 * ----------------------------------------------------------------------------
 * ✔ Abstraction
 * ✔ Inheritance
 * ✔ Runtime Polymorphism (Method Overriding)
 * ✔ Encapsulation
 * ✔ Constructor Chaining
 * ✔ Dynamic Method Dispatch
 * ✔ Object Validation
 * ✔ Array of Parent Class References
 *
 * ----------------------------------------------------------------------------
 * Class Hierarchy
 * ----------------------------------------------------------------------------
 *
 *                     LibraryItem (Abstract)
 *                    /                      \
 *                   /                        \
 *               Book                      Magazine
 *
 *                      |
 *                  Library
 *                      |
 *                    Main
 *
 * ----------------------------------------------------------------------------
 * Classes
 * ----------------------------------------------------------------------------
 *
 * LibraryItem (Abstract)
 * ----------------------
 * Fields:
 * • itemId
 * • title
 * • author
 *
 * Methods:
 * • borrowItem()        -> Abstract
 * • displayItemDetails()
 *
 *
 * Book
 * ----
 * Additional Fields:
 * • isbn
 * • totalPages
 *
 * Overrides:
 * • borrowItem()
 * • displayItemDetails()
 *
 *
 * Magazine
 * ---------
 * Additional Fields:
 * • issueNumber
 * • month
 *
 * Overrides:
 * • borrowItem()
 * • displayItemDetails()
 *
 *
 * Library
 * -------
 * Responsibilities:
 * • Store library items
 * • Add new items
 * • Prevent duplicate IDs
 * • Prevent duplicate object references
 * • Display all items
 * • Borrow all items
 *
 *
 * Main
 * ----
 * Demonstrates:
 * • Creating Book and Magazine objects
 * • Adding items to the library
 * • Displaying all items
 * • Borrowing items using polymorphism
 * • Duplicate item validation
 *
 * ----------------------------------------------------------------------------
 * Features
 * ----------------------------------------------------------------------------
 * ✔ Abstract base class
 * ✔ Method overriding
 * ✔ Runtime polymorphism
 * ✔ Constructor chaining using super()
 * ✔ Input validation
 * ✔ Duplicate Item ID checking
 * ✔ Duplicate object prevention
 * ✔ Library capacity checking
 * ✔ Clean object-oriented design
 *
 * ----------------------------------------------------------------------------
 * Sample Output
 * ----------------------------------------------------------------------------
 *
 * LibraryItem constructor executed.
 * Book constructor executed.
 *
 * 'Clean Code' added successfully.
 * 'Effective Java' added successfully.
 * 'Java Monthly' added successfully.
 *
 * --------- Item Details ---------
 * Item ID      : B101
 * Title        : Clean Code
 * Author       : Robert Martin
 * ISBN         : ISBN001
 * Total Pages  : 456
 *
 * Book borrowed successfully.
 * Magazine borrowed for 7 days.
 *
 * Duplicate Item ID is not allowed.
 *
 * ----------------------------------------------------------------------------
 * Time Complexity
 * ----------------------------------------------------------------------------
 * addItem()          : O(n)
 * displayAllItems()  : O(n)
 * borrowAllItems()   : O(n)
 *
 * ----------------------------------------------------------------------------
 * Space Complexity
 * ----------------------------------------------------------------------------
 * O(n)
 * where n is the maximum number of library items.
 *
 * ----------------------------------------------------------------------------
 * Learning Outcomes
 * ----------------------------------------------------------------------------
 * • Designing abstract classes
 * • Implementing inheritance
 * • Method overriding
 * • Runtime polymorphism
 * • Constructor chaining
 * • Managing objects in arrays
 * • Defensive programming with validation
 * • Building a small real-world OOP project
 *
 * ============================================================================
 */
/**
 * Represents an abstract library item.
 * <p>
 * This class serves as the base class for all library resources.
 * It stores common information such as item ID, title, and author,
 * and defines a common interface for borrowing library items.
 */
abstract class LibraryItem {

    /** Unique identifier of the library item. */
    private String itemId;

    /** Title of the library item. */
    private String title;

    /** Author of the library item. */
    private String author;

    /**
     * Constructs a LibraryItem object.
     *
     * @param itemId unique identifier of the item
     * @param title title of the item
     * @param author author of the item
     */
    public LibraryItem(String itemId, String title, String author) {

        if (itemId != null && !itemId.isBlank()) {
            this.itemId = itemId;
        } else {
            this.itemId = "Unknown";
            System.out.println("Invalid item ID. Default value assigned.\n");
        }

        if (title != null && !title.isBlank()) {
            this.title = title;
        } else {
            this.title = "Unknown";
            System.out.println("Invalid title. Default value assigned.\n");
        }

        if (author != null && !author.isBlank()) {
            this.author = author;
        } else {
            this.author = "Unknown";
            System.out.println("Invalid author. Default value assigned.\n");
        }

        System.out.println("LibraryItem constructor executed.\n");
    }

    /**
     * Returns the item ID.
     *
     * @return item ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Returns the title of the item.
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the item.
     *
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Borrows the library item.
     * <p>
     * Must be implemented by every subclass.
     */
    public abstract void borrowItem();

    /**
     * Displays the common details of the library item.
     */
    public void displayItemDetails() {

        System.out.println("--------- Item Details ---------");
        System.out.println("Item ID      : " + getItemId());
        System.out.println("Title        : " + getTitle());
        System.out.println("Author       : " + getAuthor());
    }
}
/**
 * Represents a book in the library.
 * <p>
 * This class extends the {@code LibraryItem} class and provides
 * additional information specific to books, such as ISBN and
 * total number of pages.
 */
class Book extends LibraryItem {

    /** International Standard Book Number (ISBN) of the book. */
    private String isbn;

    /** Total number of pages in the book. */
    private int totalPages;

    /**
     * Constructs a Book object.
     *
     * @param itemId     unique identifier of the book
     * @param title      title of the book
     * @param author     author of the book
     * @param isbn       ISBN of the book
     * @param totalPages total number of pages
     */
    public Book(String itemId,
                String title,
                String author,
                String isbn,
                int totalPages) {

        super(itemId, title, author);

        if (isbn != null && !isbn.isBlank()) {
            this.isbn = isbn;
        } else {
            this.isbn = "Unknown";
            System.out.println("Invalid ISBN. Default value assigned.\n");
        }

        if (totalPages > 0) {
            this.totalPages = totalPages;
        } else {
            this.totalPages = 0;
            System.out.println("Invalid total pages. Default value assigned.\n");
        }

        System.out.println("Book constructor executed.\n");
    }

    /**
     * Returns the ISBN of the book.
     *
     * @return ISBN number
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Returns the total number of pages in the book.
     *
     * @return total pages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Borrows the book from the library.
     */
    @Override
    public void borrowItem() {
        System.out.println("Book borrowed successfully.\n");
    }

    /**
     * Displays complete details of the book.
     */
    @Override
    public void displayItemDetails() {

        super.displayItemDetails();

        System.out.println("ISBN         : " + getIsbn());
        System.out.println("Total Pages  : " + getTotalPages());
        System.out.println();
    }
}
/**
 * Represents a magazine in the library.
 * <p>
 * This class extends the {@code LibraryItem} class and provides
 * additional information specific to magazines, such as the
 * issue number and publication month.
 */
class Magazine extends LibraryItem {

    /** Issue number of the magazine. */
    private String issueNumber;

    /** Publication month of the magazine. */
    private String month;

    /**
     * Constructs a Magazine object.
     *
     * @param itemId      unique identifier of the magazine
     * @param title       title of the magazine
     * @param author      author or publisher of the magazine
     * @param issueNumber issue number of the magazine
     * @param month       publication month
     */
    public Magazine(String itemId,
                    String title,
                    String author,
                    String issueNumber,
                    String month) {

        super(itemId, title, author);

        if (issueNumber != null && !issueNumber.isBlank()) {
            this.issueNumber = issueNumber;
        } else {
            this.issueNumber = "Unknown";
            System.out.println("Invalid issue number. Default value assigned.\n");
        }

        if (month != null && !month.isBlank()) {
            this.month = month;
        } else {
            this.month = "Unknown";
            System.out.println("Invalid month. Default value assigned.\n");
        }

        System.out.println("Magazine constructor executed.\n");
    }

    /**
     * Returns the issue number of the magazine.
     *
     * @return issue number
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Returns the publication month of the magazine.
     *
     * @return publication month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Borrows the magazine from the library.
     * <p>
     * In this example, magazines are issued for 7 days.
     */
    @Override
    public void borrowItem() {
        System.out.println("Magazine borrowed for 7 days.");
    }

    /**
     * Displays complete details of the magazine.
     */
    @Override
    public void displayItemDetails() {

        super.displayItemDetails();

        System.out.println("Issue Number : " + getIssueNumber());
        System.out.println("Month        : " + getMonth());
        System.out.println();
    }
}
/**
 * Represents a library that stores and manages library items.
 * <p>
 * This class maintains a collection of {@link LibraryItem} objects,
 * such as books and magazines. It provides operations for adding
 * items, displaying all items, and borrowing all available items.
 */
class Library {

    /** Array used to store library items. */
    private LibraryItem[] items;

    /** Current number of items stored in the library. */
    private int itemCount;

    /**
     * Constructs a Library with the specified maximum capacity.
     *
     * @param maximumItems maximum number of items the library can store
     */
    public Library(int maximumItems) {

        if (maximumItems > 0) {
            this.items = new LibraryItem[maximumItems];
        } else {
            this.items = new LibraryItem[5];
            System.out.println("Invalid maximum items. Default capacity of 5 assigned.\n");
        }

        itemCount = 0;
    }

    /**
     * Adds a library item to the collection.
     * <p>
     * This method performs the following validations:
     * <ul>
     *     <li>The item must not be {@code null}.</li>
     *     <li>The library must have available space.</li>
     *     <li>The same object cannot be added twice.</li>
     *     <li>Duplicate item IDs are not allowed.</li>
     * </ul>
     *
     * @param item the library item to add
     */
    public void addItem(LibraryItem item) {

        if (item == null) {
            System.out.println("Invalid item.\n");
            return;
        }

        if (itemCount >= items.length) {
            System.out.println("Library is full.\n");
            return;
        }

        for (int i = 0; i < itemCount; i++) {

            if (items[i] == item) {
                System.out.println("The same object cannot be added twice.\n");
                return;
            }

            if (items[i].getItemId().equals(item.getItemId())) {
                System.out.println("Duplicate Item ID is not allowed.");
                return;
            }
        }

        items[itemCount] = item;
        itemCount++;

        System.out.printf("'%s' added successfully.%n", item.getTitle());
        System.out.println();
    }

    /**
     * Displays the details of all library items.
     * <p>
     * Uses runtime polymorphism to invoke the appropriate
     * {@code displayItemDetails()} implementation.
     */
    public void displayAllItems() {

        if (itemCount == 0) {
            System.out.println("No items found.");
            return;
        }

        for (int i = 0; i < itemCount; i++) {
            items[i].displayItemDetails();
        }
    }

    /**
     * Borrows every item currently stored in the library.
     * <p>
     * Uses runtime polymorphism to call the overridden
     * {@code borrowItem()} method of each object.
     */
    public void borrowAllItems() {

        if (itemCount == 0) {
            System.out.println("No items found.");
            return;
        }

        for (int i = 0; i < itemCount; i++) {
            items[i].borrowItem();
        }
    }
}
public class Main {

    /**

     * Entry point of the Library Management System.

     * <p>

     * This method demonstrates the complete workflow of the application:

     * <ol>

     *     <li>Create a Library object.</li>

     *     <li>Create Book and Magazine objects.</li>

     *     <li>Add items to the library.</li>

     *     <li>Display all library items.</li>

     *     <li>Borrow all items using runtime polymorphism.</li>

     *     <li>Attempt to add a duplicate item to verify validation.</li>

     * </ol>

     *

     * @param args command-line arguments (not used)

     */

    public static void main(String[] args) {

        // Create a library with a maximum capacity of five items.

        Library library = new Library(5);

        // Create library items.

        LibraryItem item1 = new Book(

                "B101",

                "Clean Code",

                "Robert Martin",

                "ISBN001",

                456

        );

        LibraryItem item2 = new Book(

                "B102",

                "Effective Java",

                "Joshua Bloch",

                "ISBN002",

                416

        );

        LibraryItem item3 = new Magazine(

                "M101",

                "Java Monthly",

                "Oracle",

                "Issue 45",

                "July"

        );

        // Add items to the library.

        library.addItem(item1);

        library.addItem(item2);

        library.addItem(item3);

        // Display all available items.

        library.displayAllItems();

        // Borrow all items.

        library.borrowAllItems();

        // Attempt to add the same object again.

        // This demonstrates duplicate object validation.

        library.addItem(item1);

    }

}
