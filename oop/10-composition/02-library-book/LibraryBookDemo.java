/*
 * Program: LibraryBookDemo
 *
 * Purpose:
 * Demonstrates a simple library management system using
 * Object-Oriented Programming concepts in Java.
 *
 * Concepts:
 * - Class and Object
 * - Constructors
 * - Encapsulation
 * - Getter Methods
 * - Constructor Validation
 * - Object Arrays
 * - Has-A Relationship
 * - Array Capacity Management
 * - Static Final Constant
 *
 * Relationship:
 *
 * Library HAS-A collection of Book objects.
 */


// Represents a book in the library.
class Book {

    // Private fields demonstrate encapsulation.
    private String isbn;
    private String title;
    private String author;


    /*
     * Constructor:
     * Initializes a Book object with ISBN, title, and author.
     *
     * @param isbn   unique ISBN of the book
     * @param title  title of the book
     * @param author author of the book
     */
    public Book(String isbn, String title, String author) {

        // Validate ISBN.
        if (isbn != null && !isbn.isBlank()) {

            this.isbn = isbn;

        } else {

            this.isbn = "Unknown";

            System.out.println(
                    "Invalid ISBN. Default value assigned."
            );
        }


        // Validate title.
        if (title != null && !title.isBlank()) {

            this.title = title;

        } else {

            this.title = "Unknown";

            System.out.println(
                    "Invalid title. Default value assigned."
            );
        }


        // Validate author.
        if (author != null && !author.isBlank()) {

            this.author = author;

        } else {

            this.author = "Unknown";

            System.out.println(
                    "Invalid author. Default value assigned."
            );
        }
    }


    /*
     * Returns the ISBN of the book.
     *
     * @return ISBN
     */
    public String getIsbn() {
        return isbn;
    }


    /*
     * Returns the title of the book.
     *
     * @return book title
     */
    public String getTitle() {
        return title;
    }


    /*
     * Returns the author of the book.
     *
     * @return author name
     */
    public String getAuthor() {
        return author;
    }


    /*
     * Displays the details of the book.
     */
    public void displayBookDetails() {

        System.out.println(
                "-------- Book Details --------"
        );

        System.out.println(
                "ISBN   : " + getIsbn()
        );

        System.out.println(
                "Title  : " + getTitle()
        );

        System.out.println(
                "Author : " + getAuthor()
        );

        System.out.println();
    }
}


// Represents a library that stores Book objects.
class Library {

    // Default capacity used when an invalid capacity is provided.
    private static final int DEFAULT_BOOK_CAPACITY = 5;

    // Private fields demonstrate encapsulation.
    private String libraryName;
    private Book[] books;
    private int bookCount;


    /*
     * Constructor:
     * Creates a Library with the given name and capacity.
     *
     * @param libraryName name of the library
     * @param capacity    maximum number of books
     */
    public Library(String libraryName, int capacity) {

        // Validate library name.
        if (libraryName != null && !libraryName.isBlank()) {

            this.libraryName = libraryName;

        } else {

            this.libraryName = "Unknown";

            System.out.println(
                    "Invalid library name. Default value assigned."
            );
        }


        // Validate capacity.
        if (capacity > 0) {

            this.books = new Book[capacity];

        } else {

            this.books = new Book[DEFAULT_BOOK_CAPACITY];

            System.out.println(
                    "Invalid book capacity. "
                            + "Default capacity (5) assigned."
            );
        }


        // Initially, the library contains no books.
        this.bookCount = 0;
    }


    /*
     * Returns the library name.
     *
     * @return library name
     */
    public String getLibraryName() {
        return libraryName;
    }


    /*
     * Returns the current number of books.
     *
     * @return number of books
     */
    public int getBookCount() {
        return bookCount;
    }


    /*
     * Adds a Book object to the library.
     *
     * @param book book object to add
     */
    public void addBook(Book book) {

        // Validate the Book object.
        if (book == null) {

            System.out.println(
                    "Invalid book. Book cannot be null."
            );

            return;
        }


        // Check whether the library has reached its capacity.
        if (bookCount >= books.length) {

            System.out.println(
                    "Library capacity reached. "
                            + "Cannot add more books."
            );

            return;
        }


        // Add the book and increase the count.
        books[bookCount] = book;
        bookCount++;


        System.out.println(
                "\"" + book.getTitle()
                        + "\" added successfully."
        );
    }


    /*
     * Displays all books currently stored in the library.
     */
    public void displayBooks() {

        System.out.println();
        System.out.println(
                "======== " + getLibraryName()
                        + " - Book Collection ========"
        );

        if (bookCount == 0) {

            System.out.println(
                    "No books available."
            );

            return;
        }


        for (int i = 0; i < bookCount; i++) {

            books[i].displayBookDetails();
        }
    }
}


// Main class demonstrates the Library and Book classes.
public class LibraryManagementDemo {

    public static void main(String[] args) {

        // Create Book objects.
        Book book1 = new Book(
                "B101",
                "Effective Java",
                "Joshua Bloch"
        );

        Book book2 = new Book(
                "B102",
                "Clean Code",
                "Robert C. Martin"
        );

        Book book3 = new Book(
                "B103",
                "Head First Java",
                "Kathy Sierra"
        );


        // Create a Library object with capacity for 5 books.
        Library library = new Library(
                "Book Haven",
                5
        );


        // Add books to the library.
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        // Display the complete book collection.
        library.displayBooks();


        // Display total number of books.
        System.out.println(
                "Total Books : " + library.getBookCount()
        );
    }
}
