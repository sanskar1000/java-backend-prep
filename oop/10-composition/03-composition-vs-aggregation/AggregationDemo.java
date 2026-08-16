/*
 * Program: AggregationDemo
 *
 * Purpose:
 * Demonstrates a simple university management system
 * using Object-Oriented Programming concepts in Java.
 *
 * Concepts Demonstrated:
 * - Class and Object
 * - Constructors
 * - Encapsulation
 * - Getter Methods
 * - Constructor Validation
 * - Object Arrays
 * - HAS-A Relationship
 * - Static Final Constant
 * - Capacity Management
 *
 * Relationship:
 *
 * University HAS-A collection of Student objects.
 */


// Represents a student in the university.
class Student {

    // Private fields demonstrate encapsulation.
    private String studentId;
    private String name;
    private String course;


    /*
     * Constructor:
     * Initializes a Student object.
     *
     * @param studentId unique ID of the student
     * @param name      name of the student
     * @param course    course pursued by the student
     */
    public Student(
            String studentId,
            String name,
            String course
    ) {

        // Validate student ID.
        if (studentId != null && !studentId.isBlank()) {

            this.studentId = studentId;

        } else {

            this.studentId = "Unknown";

            System.out.println(
                    "Invalid student ID. "
                            + "Default value assigned."
            );
        }


        // Validate student name.
        if (name != null && !name.isBlank()) {

            this.name = name;

        } else {

            this.name = "Unknown";

            System.out.println(
                    "Invalid name. "
                            + "Default value assigned."
            );
        }


        // Validate course.
        if (course != null && !course.isBlank()) {

            this.course = course;

        } else {

            this.course = "Unknown";

            System.out.println(
                    "Invalid course. "
                            + "Default value assigned."
            );
        }
    }


    /*
     * Returns the student ID.
     *
     * @return student ID
     */
    public String getStudentId() {

        return studentId;
    }


    /*
     * Returns the student's name.
     *
     * @return student name
     */
    public String getName() {

        return name;
    }


    /*
     * Returns the student's course.
     *
     * @return course name
     */
    public String getCourse() {

        return course;
    }


    /*
     * Displays complete student details.
     */
    public void displayStudentDetails() {

        System.out.println(
                "------- Student Details -------"
        );

        System.out.println(
                "Student ID : " + getStudentId()
        );

        System.out.println(
                "Name       : " + getName()
        );

        System.out.println(
                "Course     : " + getCourse()
        );

        System.out.println();
    }
}


// Represents a university that manages Student objects.
class University {

    /*
     * Default capacity used when an invalid
     * student capacity is provided.
     */
    private static final int DEFAULT_STUDENT_CAPACITY = 5;


    // Private fields demonstrate encapsulation.
    private String universityName;
    private Student[] students;
    private int studentCount;


    /*
     * Constructor:
     * Creates a University object.
     *
     * @param universityName name of the university
     * @param capacity       maximum number of students
     */
    public University(
            String universityName,
            int capacity
    ) {

        // Validate university name.
        if (universityName != null
                && !universityName.isBlank()) {

            this.universityName = universityName;

        } else {

            this.universityName = "Unknown";

            System.out.println(
                    "Invalid university name. "
                            + "Default value assigned."
            );
        }


        // Validate student capacity.
        if (capacity > 0) {

            this.students = new Student[capacity];

        } else {

            this.students =
                    new Student[DEFAULT_STUDENT_CAPACITY];

            System.out.println(
                    "Invalid student capacity. "
                            + "Default capacity (5) assigned."
            );
        }


        // Initially, there are no students.
        this.studentCount = 0;
    }


    /*
     * Returns the university name.
     *
     * @return university name
     */
    public String getUniversityName() {

        return universityName;
    }


    /*
     * Returns the current number of students.
     *
     * @return number of students
     */
    public int getStudentCount() {

        return studentCount;
    }


    /*
     * Adds a Student object to the university.
     *
     * @param student student object to add
     */
    public void addStudent(Student student) {

        // Validate student object.
        if (student == null) {

            System.out.println(
                    "Invalid student. "
                            + "Student cannot be null."
            );

            return;
        }


        // Check whether university capacity is reached.
        if (studentCount >= students.length) {

            System.out.println(
                    "University capacity reached. "
                            + "Cannot add more students."
            );

            return;
        }


        // Add student to the array.
        students[studentCount] = student;

        studentCount++;


        System.out.println(
                student.getName()
                        + " successfully added."
        );

        System.out.println();
    }


    /*
     * Displays all students currently registered
     * in the university.
     */
    public void displayStudents() {

        System.out.println(
                "University Name : "
                        + getUniversityName()
        );

        System.out.println(
                "------ Student List ------"
        );


        if (studentCount == 0) {

            System.out.println(
                    "No students registered."
            );

            return;
        }


        for (int i = 0; i < studentCount; i++) {

            students[i].displayStudentDetails();
        }
    }
}


/*
 * Main class:
 * Demonstrates the University and Student classes.
 */
public class UniversityManagementDemo {

    public static void main(String[] args) {

        // Create Student objects.
        Student s1 = new Student(
                "S101",
                "Aradhya",
                "BCA"
        );

        Student s2 = new Student(
                "S102",
                "Rahul",
                "MCA"
        );

        Student s3 = new Student(
                "S103",
                "Uday",
                "MCA"
        );


        // Create University object with capacity for 5 students.
        University university =
                new University(
                        "Central University",
                        5
                );


        // Add students to the university.
        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);


        // Display all registered students.
        university.displayStudents();


        /*
         * Student objects can still be accessed independently.
         *
         * This demonstrates that the University stores
         * references to Student objects rather than
         * creating the Student objects itself.
         */
        System.out.println(
                "\nAccessing Student Independently:"
        );

        s1.displayStudentDetails();
    }
}
