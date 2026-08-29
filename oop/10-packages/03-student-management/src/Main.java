import model.Student;
import service.StudentService;
import util.StudentValidator;

/**
 * Entry point of the package-practice application.
 *
 * <p>Creates a Student, initializes the validator and service,
 * and displays the student's information.</p>
 */
public class Main {

    public static void main(String[] args) {

        // Create Student object
        Student student = new Student(
                "S101",
                "Aradhya",
                20,
                87
        );

        // Create validator
        StudentValidator validator = new StudentValidator();

        // Inject validator into StudentService
        StudentService studentService =
                new StudentService(validator);

        // Display student details
        studentService.displayStudent(student);
    }
}
