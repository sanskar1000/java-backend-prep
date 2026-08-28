import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        StudentService studentService = new StudentService();

        studentService.displayStudent(student);
    }
}
