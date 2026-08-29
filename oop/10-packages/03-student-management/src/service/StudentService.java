package service;

import model.Student;
import util.StudentValidator;

/**
 * Provides business operations related to Student objects.
 *
 * <p>This service is responsible for:
 * <ul>
 *     <li>Validating student data</li>
 *     <li>Displaying student information</li>
 *     <li>Calculating pass/fail result</li>
 *     <li>Determining student grade</li>
 *     <li>Checking scholarship eligibility</li>
 * </ul>
 */
public class StudentService {

    private final StudentValidator validator;

    /**
     * Creates a StudentService with a StudentValidator.
     *
     * @param validator validator used to validate student data
     * @throws IllegalArgumentException if validator is null
     */
    public StudentService(StudentValidator validator) {

        if (validator == null) {
            throw new IllegalArgumentException(
                    "StudentValidator cannot be null."
            );
        }

        this.validator = validator;
    }

    /**
     * Displays complete student information.
     *
     * @param student student whose information should be displayed
     */
    public void displayStudent(Student student) {

        if (!validator.isValid(student)) {
            System.out.println("Invalid student data.");
            return;
        }

        System.out.println("------- Student Details -------");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Name         : " + student.getName());
        System.out.println("Age          : " + student.getAge());
        System.out.println("Marks        : " + student.getMarks());
        System.out.println("Result       : " + getResult(student));
        System.out.println("Grade        : " + getGrade(student));
        System.out.println(
                "Scholarship  : " + getScholarshipStatus(student)
        );
    }

    /**
     * Determines whether the student has passed.
     *
     * @param student student whose result is checked
     * @return "Pass" if marks are 40 or above, otherwise "Fail"
     */
    public String getResult(Student student) {

        if (student.getMarks() >= 40) {
            return "Pass";
        }

        return "Fail";
    }

    /**
     * Determines the grade based on marks.
     *
     * @param student student whose grade is calculated
     * @return grade from A to F
     */
    public String getGrade(Student student) {

        double marks = student.getMarks();

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    /**
     * Checks whether the student is eligible for a scholarship.
     *
     * @param student student whose eligibility is checked
     * @return "Eligible" if the student has 90 or more marks,
     *         otherwise "Not Eligible"
     */
    public String getScholarshipStatus(Student student) {

        if (student.getMarks() >= 90) {
            return "Eligible";
        }

        return "Not Eligible";
    }
}
