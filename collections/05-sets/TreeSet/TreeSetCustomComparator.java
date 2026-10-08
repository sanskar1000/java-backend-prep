import java.util.Comparator;
import java.util.TreeSet;

/**
 * ------------------------------------------------------------
 * Program Name : TreeSet with Custom Comparator
 * Topic        : Java Collections - TreeSet + Comparator
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates how TreeSet uses a Comparator to determine the
 * ordering and uniqueness of custom objects.
 *
 * This program demonstrates:
 * • TreeSet with custom objects
 * • Comparator.comparingInt()
 * • thenComparing()
 * • Sorting students by marks
 * • Sorting students by marks and then name
 * • How comparator result 0 affects TreeSet uniqueness
 * • add() returning false for comparator-equivalent elements
 *
 * Important:
 * In a TreeSet, if comparator.compare(a, b) returns 0,
 * the TreeSet considers a and b duplicates, even when their
 * other fields are different.
 *
 * Example:
 *
 * Comparator by marks:
 * Rahul 85
 * Neha  85
 *
 * Both have the same marks, so the comparator returns 0 and
 * TreeSet considers them duplicates.
 *
 * Comparator by marks and name:
 * Students are first compared by marks.
 * If marks are equal, their names are compared.
 *
 * Time Complexity:
 * • add()      : O(log n)
 * • contains() : O(log n)
 * • remove()   : O(log n)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

class Student {

    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

public class TreeSetCustomComparator {

    public static void main(String[] args) {

        // --------------------------------------------------------
        // TreeSet sorted only by marks
        // --------------------------------------------------------

        Comparator<Student> byMarks =
                Comparator.comparingInt(Student::getMarks);

        TreeSet<Student> students = new TreeSet<>(byMarks);

        students.add(new Student(101, "Rahul", 85));
        students.add(new Student(102, "Aradhya", 70));
        students.add(new Student(103, "Priya", 92));
        students.add(new Student(104, "Aman", 78));
        students.add(new Student(105, "Neha", 85));

        /*
         * Rahul and Neha both have 85 marks.
         *
         * Because the comparator compares ONLY marks,
         * the comparator returns 0 for Rahul and Neha.
         *
         * Therefore TreeSet treats them as duplicates.
         */
        System.out.println("Students sorted by marks:");
        System.out.println(students);

        // Try adding another student with 85 marks.
        Student karan = new Student(106, "Karan", 85);

        System.out.println(
                "Add Karan (85 marks): " + students.add(karan)
        );

        /*
         * Expected:
         * false
         *
         * Reason:
         * Karan has the same marks as an existing student.
         * The comparator compares only marks, so compare() returns 0.
         */

        // --------------------------------------------------------
        // TreeSet sorted by marks and then name
        // --------------------------------------------------------

        Comparator<Student> byMarksThenName =
                Comparator.comparingInt(Student::getMarks)
                        .thenComparing(Student::getName);

        TreeSet<Student> studentsByMarksThenName =
                new TreeSet<>(byMarksThenName);

        studentsByMarksThenName.add(
                new Student(101, "Rahul", 85)
        );

        studentsByMarksThenName.add(
                new Student(102, "Aradhya", 70)
        );

        studentsByMarksThenName.add(
                new Student(103, "Priya", 92)
        );

        studentsByMarksThenName.add(
                new Student(104, "Aman", 85)
        );

        studentsByMarksThenName.add(
                new Student(105, "Neha", 85)
        );

        studentsByMarksThenName.add(
                new Student(106, "Karan", 85)
        );

        System.out.println(
                "\nStudents sorted by marks, then name:"
        );

        System.out.println(studentsByMarksThenName);

        // --------------------------------------------------------
        // Same marks + same name
        // --------------------------------------------------------

        /*
         * Existing:
         * 101 - Rahul - 85
         *
         * New:
         * 107 - Rahul - 85
         *
         * Marks are equal.
         * Names are also equal.
         *
         * Therefore the comparator returns 0.
         * ID is NOT compared by this comparator.
         */
        System.out.println(
                "\nAdd another Rahul with 85 marks: "
                        + studentsByMarksThenName.add(
                        new Student(107, "Rahul", 85)
                )
        );

        /*
         * Expected:
         * false
         *
         * The different ID does not matter because the comparator
         * compares only marks and name.
         */
    }
}
