package util;

import model.Student;

/**
 * Utility class responsible for validating Student objects.
 *
 * <p>Validation rules:</p>
 * <ul>
 *     <li>Student must not be null.</li>
 *     <li>Student ID must not be null or blank.</li>
 *     <li>Name must not be null or blank.</li>
 *     <li>Age must be between 16 and 100.</li>
 *     <li>Marks must be between 0 and 100.</li>
 * </ul>
 */
public class StudentValidator {

    /**
     * Validates a Student object.
     *
     * @param student student object to validate
     * @return true if the student is valid; otherwise false
     */
    public boolean isValid(Student student) {

        if (student == null) {
            return false;
        }

        String studentId = student.getStudentId();
        String name = student.getName();
        int age = student.getAge();
        double marks = student.getMarks();

        if (studentId == null || studentId.isBlank()) {
            return false;
        }

        if (name == null || name.isBlank()) {
            return false;
        }

        if (age < 16 || age > 100) {
            return false;
        }

        if (marks < 0 || marks > 100) {
            return false;
        }

        return true;
    }
}
