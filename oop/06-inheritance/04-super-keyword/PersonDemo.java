/**
 * =============================================================
 * Program Name : PersonDemo
 * Author       : Aradhya Thakur
 * Language     : Java
 * Topic        : Inheritance & Method Overriding
 *
 * Description:
 * Demonstrates single inheritance in Java using a Person
 * superclass and a Student subclass.
 *
 * Concepts Covered:
 * - Inheritance
 * - Constructor Chaining using super()
 * - Method Overriding
 * - Calling Parent Methods using super
 * - Encapsulation
 * - Getters
 * - Input Validation
 * - Constructor Execution Order
 *
 * Execution Order:
 * 1. Person constructor executes.
 * 2. Student constructor executes.
 * =============================================================
 */

/**
 * Represents a generic person.
 */
class Person {

    /** Name of the person. */
    private String name;

    /** Age of the person. */
    private int age;

    /**
     * Constructs a Person object.
     *
     * @param name Name of the person
     * @param age  Age of the person
     */
    Person(String name, int age) {

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid name. Default value assigned.");
        }

        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
            System.out.println("Invalid age. Default value assigned.");
        }

        System.out.println("Person constructor executed.\n");
    }

    /**
     * Returns the person's name.
     *
     * @return person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the person's age.
     *
     * @return person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Displays the person's details.
     */
    public void displayDetails() {

        System.out.println("------- Person Details -------");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }
}

/**
 * Represents a student.
 *
 * Inherits common properties from Person and adds
 * student-specific information.
 */
class Student extends Person {

    /** Student roll number. */
    private int rollNumber;

    /** Course enrolled by the student. */
    private String course;

    /**
     * Constructs a Student object.
     *
     * @param name       Student name
     * @param age        Student age
     * @param rollNumber Student roll number
     * @param course     Student course
     */
    Student(String name, int age, int rollNumber, String course) {

        super(name, age);

        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        } else {
            this.rollNumber = 0;
            System.out.println("Invalid roll number. Default value assigned.");
        }

        if (course != null && !course.isBlank()) {
            this.course = course;
        } else {
            this.course = "Unknown";
            System.out.println("Invalid course. Default value assigned.");
        }

        System.out.println("Student constructor executed.\n");
    }

    /**
     * Returns the student's roll number.
     *
     * @return roll number
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * Returns the student's course.
     *
     * @return course name
     */
    public String getCourse() {
        return course;
    }

    /**
     * Displays complete student details.
     *
     * Overrides the displayDetails() method of the
     * Person class and reuses the parent's implementation
     * using super.displayDetails().
     */
    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Roll Number : " + getRollNumber());
        System.out.println("Course      : " + getCourse());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Student s1 = new Student(
                "Aradhya",
                20,
                18,
                "Java"
        );

        Student s2 = new Student(
                "Yasir",
                21,
                19,
                "Python"
        );

        System.out.println("========== STUDENT 1 ==========\n");
        s1.displayDetails();

        System.out.println("========== STUDENT 2 ==========\n");
        s2.displayDetails();
    }
}
