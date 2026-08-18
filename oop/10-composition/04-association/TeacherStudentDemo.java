package oop.practice;

/**
 * ------------------------------------------------------------
 * Program Name : TeacherStudentDemo
 * Topic        : Object Interaction
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how objects of different classes
 * can interact with each other.
 *
 * A Teacher object can teach a Student object. The Teacher
 * receives a Student object as a method parameter and calls
 * the Student's study() method.
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Encapsulation
 * - Private Fields
 * - Getter Methods
 * - Instance Methods
 * - Object as Method Parameter
 * - Object Interaction
 * - Basic Input Validation
 *
 * ------------------------------------------------------------
 */

class Student {

    private String studentId;
    private String name;
    private String course;

    /**
     * Creates a Student object.
     *
     * @param studentId unique student ID
     * @param name student name
     * @param course enrolled course
     */
    public Student(
            String studentId,
            String name,
            String course
    ) {

        this.studentId = isValid(studentId)
                ? studentId
                : "Unknown";

        this.name = isValid(name)
                ? name
                : "Unknown";

        this.course = isValid(course)
                ? course
                : "Unknown";
    }

    /**
     * Checks whether a string is valid.
     *
     * @param value string to validate
     * @return true if the value is not null or blank
     */
    private boolean isValid(String value) {
        return value != null && !value.isBlank();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    /**
     * Represents the student's study action.
     */
    public void study() {

        System.out.println(
                name + " is studying " + course + "."
        );
    }
}


/**
 * Represents a Teacher.
 */
class Teacher {

    private String teacherId;
    private String name;
    private String subject;

    /**
     * Creates a Teacher object.
     *
     * @param teacherId unique teacher ID
     * @param name teacher name
     * @param subject teaching subject
     */
    public Teacher(
            String teacherId,
            String name,
            String subject
    ) {

        this.teacherId = isValid(teacherId)
                ? teacherId
                : "Unknown";

        this.name = isValid(name)
                ? name
                : "Unknown";

        this.subject = isValid(subject)
                ? subject
                : "Unknown";
    }

    /**
     * Checks whether a string is valid.
     *
     * @param value string to validate
     * @return true if the value is not null or blank
     */
    private boolean isValid(String value) {
        return value != null && !value.isBlank();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    /**
     * Teaches a Student.
     *
     * @param student student who is being taught
     */
    public void teach(Student student) {

        if (student == null) {

            System.out.println(
                    "Invalid student."
            );

            return;
        }

        System.out.println(
                "Teacher " + name
                        + " is teaching "
                        + subject
                        + " to student "
                        + student.getName()
                        + "."
        );

        student.study();
    }
}


/**
 * Main class used to demonstrate Teacher-Student interaction.
 */
public class TeacherStudentDemo {

    public static void main(String[] args) {

        Student student =
                new Student(
                        "S101",
                        "Rahul",
                        "Java"
                );

        Teacher teacher =
                new Teacher(
                        "T101",
                        "Yasir",
                        "Java"
                );

        teacher.teach(student);
    }
}
