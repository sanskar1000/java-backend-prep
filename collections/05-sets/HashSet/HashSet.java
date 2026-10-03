import java.util.HashSet;

/**
 * Demonstrates how HashSet handles custom objects using
 * equals() and hashCode().
 *
 * <p>Two Student objects are considered equal when they have
 * the same student ID, regardless of their names.</p>
 *
 * <p>This example demonstrates:</p>
 * <ul>
 *     <li>Creating a HashSet of custom objects</li>
 *     <li>Overriding equals() and hashCode()</li>
 *     <li>How HashSet detects duplicate objects</li>
 *     <li>How contains() uses equals() and hashCode()</li>
 *     <li>Why equals() and hashCode() must be consistent</li>
 * </ul>
 *
 * <p>Time Complexity:</p>
 * <ul>
 *     <li>add() - O(1) average</li>
 *     <li>contains() - O(1) average</li>
 *     <li>size() - O(1)</li>
 * </ul>
 *
 * <p>Space Complexity: O(n)</p>
 *
 * @author Aradhya Thakur
 * @version 1.0
 * @since 2026
 */
public class HashSetBasics {

    /**
     * Represents a student whose identity is determined by ID.
     */
    static class Student {

        private final int id;
        private final String name;

        /**
         * Creates a Student object.
         *
         * @param id   unique student ID
         * @param name student name
         * @throws IllegalArgumentException if ID is invalid
         *                                  or name is null/blank
         */
        public Student(int id, String name) {

            if (id <= 0) {
                throw new IllegalArgumentException("Invalid ID.");
            }

            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException(
                        "Name cannot be null or blank."
                );
            }

            this.id = id;
            this.name = name;
        }

        /**
         * Returns the student's ID.
         *
         * @return student ID
         */
        public int getId() {
            return id;
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
         * Determines equality based only on student ID.
         *
         * <p>Therefore, two students with the same ID are
         * considered equal even if their names are different.</p>
         *
         * @param obj object to compare
         * @return true if both objects have the same student ID
         */
        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (!(obj instanceof Student)) {
                return false;
            }

            Student other = (Student) obj;

            return this.id == other.id;
        }

        /**
         * Generates a hash code based on student ID.
         *
         * <p>The hashCode() implementation is consistent with
         * equals(), because both use the ID field.</p>
         *
         * @return hash code based on student ID
         */
        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }

        /**
         * Returns a readable representation of the student.
         *
         * @return student details
         */
        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student(101, "Aradhya");
        Student s2 = new Student(102, "Rahul");
        Student s3 = new Student(101, "Aman");   // Duplicate ID
        Student s4 = new Student(103, "Priya");
        Student s5 = new Student(102, "Neha");   // Duplicate ID

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println("Students in HashSet : " + students.size());

        Student searchStudent = new Student(101, "Someone");

        System.out.println(
                "Contains student with ID 101 : "
                        + students.contains(searchStudent)
        );

        System.out.println("\nStudents stored in HashSet:");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
