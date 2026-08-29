package model;

/**
 * Represents a student.
 *
 * <p>This class demonstrates:
 * <ul>
 *     <li>Java packages</li>
 *     <li>Encapsulation</li>
 *     <li>Constructor initialization</li>
 *     <li>Immutable fields using {@code final}</li>
 *     <li>Getter methods</li>
 * </ul>
 */
public class Student {

    private final String studentId;
    private final String name;
    private final int age;
    private final double marks;

    /**
     * Creates a Student object.
     *
     * @param studentId unique student ID
     * @param name student name
     * @param age student age
     * @param marks student marks
     */
    public Student(
            String studentId,
            String name,
            int age,
            double marks
    ) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    /**
     * Returns the student's ID.
     *
     * @return student ID
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Returns the student's name.
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the student's age.
     *
     * @return student age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the student's marks.
     *
     * @return student marks
     */
    public double getMarks() {
        return marks;
    }
}
