import java.util.Comparator;
import java.util.TreeSet;

/**
 * ------------------------------------------------------------
 * Program Name : TreeSet Mastery Challenge
 * Topic        : Java Collections - TreeSet
 * Level        : Advanced
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates TreeSet operations with both primitive wrapper
 * types and custom Student objects.
 *
 * This program covers:
 * • TreeSet natural ordering
 * • Duplicate prevention
 * • add() return value
 * • first() and last()
 * • contains()
 * • higher(), lower()
 * • ceiling(), floor()
 * • Comparable
 * • Comparator
 * • Multi-level sorting
 * • Comparator-based uniqueness
 *
 * Important:
 * TreeSet determines the uniqueness of custom objects using
 * compareTo() or the supplied Comparator.
 *
 * If comparison returns 0, TreeSet considers the objects
 * duplicates, even if other fields are different.
 *
 * Time Complexity:
 * • add()      : O(log n)
 * • contains() : O(log n)
 * • first()    : O(log n)
 * • last()     : O(log n)
 * • higher()   : O(log n)
 * • lower()    : O(log n)
 * • ceiling()  : O(log n)
 * • floor()    : O(log n)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

class Student implements Comparable<Student> {

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

    /**
     * Natural ordering:
     * Students are sorted by ID.
     */
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}

public class TreeSetMasteryChallenge {

    public static void main(String[] args) {

        // ========================================================
        // PART 1: TreeSet with Integer
        // ========================================================

        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.println("Add 50 : " + numbers.add(50));
        System.out.println("Add 20 : " + numbers.add(20));
        System.out.println("Add 40 : " + numbers.add(40));
        System.out.println("Add 20 : " + numbers.add(20));
        System.out.println("Add 10 : " + numbers.add(10));
        System.out.println("Add 30 : " + numbers.add(30));
        System.out.println("Add 70 : " + numbers.add(70));
        System.out.println("Add 60 : " + numbers.add(60));
        System.out.println("Add 50 : " + numbers.add(50));

        System.out.println("\nNumbers : " + numbers);
        System.out.println("Size : " + numbers.size());

        // Smallest and largest
        System.out.println("Smallest : " + numbers.first());
        System.out.println("Largest : " + numbers.last());

        // Search
        System.out.println("Contains 40 : " + numbers.contains(40));

        // ========================================================
        // PART 2: TreeSet Navigation
        // ========================================================

        System.out.println("\n--- Navigation ---");

        System.out.println("Higher than 30 : " + numbers.higher(30));
        System.out.println("Lower than 30 : " + numbers.lower(30));
        System.out.println("Ceiling of 30 : " + numbers.ceiling(30));
        System.out.println("Floor of 30 : " + numbers.floor(30));

        System.out.println("Higher than 35 : " + numbers.higher(35));
        System.out.println("Lower than 35 : " + numbers.lower(35));
        System.out.println("Ceiling of 35 : " + numbers.ceiling(35));
        System.out.println("Floor of 35 : " + numbers.floor(35));

        // ========================================================
        // PART 3: TreeSet with Comparable
        // ========================================================

        System.out.println("\n--- TreeSet with Comparable ---");

        Student s1 = new Student(101, "Rahul", 85);
        Student s2 = new Student(103, "Priya", 92);
        Student s3 = new Student(102, "Aradhya", 78);
        Student s4 = new Student(105, "Aman", 92);
        Student s5 = new Student(104, "Neha", 85);

        TreeSet<Student> students = new TreeSet<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        /*
         * Student implements Comparable.
         *
         * compareTo() compares IDs.
         * Therefore students are sorted by ID.
         */
        System.out.println("Students sorted by ID : " + students);

        /*
         * ID 105 already exists.
         *
         * The new student's name and marks are different,
         * but compareTo() compares only ID.
         *
         * Therefore add() returns false.
         */
        System.out.println(
                "Add student with existing ID : "
                        + students.add(
                        new Student(105, "Raj", 89)
                )
        );

        // ========================================================
        // PART 4: TreeSet with Comparator
        // ========================================================

        System.out.println("\n--- Comparator: Marks Then Name ---");

        Comparator<Student> byMarksThenName =
                Comparator.comparingInt(Student::getMarks)
                        .thenComparing(Student::getName);

        TreeSet<Student> studentsByMarksThenName =
                new TreeSet<>(byMarksThenName);

        studentsByMarksThenName.add(s1);
        studentsByMarksThenName.add(s2);
        studentsByMarksThenName.add(s3);
        studentsByMarksThenName.add(s4);
        studentsByMarksThenName.add(s5);

        /*
         * First compare marks.
         * If marks are equal, compare names.
         */
        System.out.println(
                "Students sorted by marks, then name : "
                        + studentsByMarksThenName
        );

        /*
         * Existing student:
         * Rahul - 85
         *
         * New student:
         * Rahul - 85
         *
         * Marks are equal and names are equal.
         * Comparator returns 0.
         *
         * Therefore TreeSet considers them duplicates.
         */
        System.out.println(
                "Add duplicate marks + name : "
                        + studentsByMarksThenName.add(
                        new Student(106, "Rahul", 85)
                )
        );

        // ========================================================
        // PART 5: Comparator: Marks -> Name -> ID
        // ========================================================

        System.out.println("\n--- Comparator: Marks -> Name -> ID ---");

        Comparator<Student> byMarksThenNameThenId =
                Comparator.comparingInt(Student::getMarks)
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId);

        TreeSet<Student> studentsByMarksNameAndId =
                new TreeSet<>(byMarksThenNameThenId);

        studentsByMarksNameAndId.add(
                new Student(101, "Rahul", 85)
        );

        studentsByMarksNameAndId.add(
                new Student(103, "Priya", 92)
        );

        studentsByMarksNameAndId.add(
                new Student(102, "Aradhya", 78)
        );

        studentsByMarksNameAndId.add(
                new Student(105, "Aman", 92)
        );

        studentsByMarksNameAndId.add(
                new Student(104, "Neha", 85)
        );

        studentsByMarksNameAndId.add(
                new Student(106, "Rahul", 85)
        );

        studentsByMarksNameAndId.add(
                new Student(107, "Rahul", 85)
        );

        System.out.println(
                "Students sorted by marks, name, and ID : "
                        + studentsByMarksNameAndId
        );
    }
}
