import java.util.HashSet;
import java.util.Set;

/*
 * Program Name : HashSetMasteryChallenge
 * Topic        : Java Collections - HashSet
 * Level        : Intermediate / Advanced Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Comprehensive HashSet challenge demonstrating uniqueness,
 * duplicate detection, custom object equality, hash collisions,
 * equals()/hashCode(), and mutable-key safety.
 *
 * Key Concepts:
 * - HashSet
 * - Set interface
 * - add()
 * - contains()
 * - remove()
 * - equals()
 * - hashCode()
 * - Hash collisions
 * - Immutable identity field
 * - Custom objects
 * - Duplicate detection
 *
 * Average Time Complexity:
 * - add()      : O(1)
 * - contains() : O(1)
 * - remove()   : O(1)
 * - size()     : O(1)
 *
 * Iteration:
 * - O(n)
 *
 * Auxiliary Space:
 * - O(n)
 */

public class HashSetMasteryChallenge {

    public static void main(String[] args) {

        /*
         * ============================================================
         * PART 1 — BASIC HASHSET OPERATIONS
         * ============================================================
         */

        System.out.println("========== PART 1: BASIC OPERATIONS ==========");

        Set<Integer> numbers = new HashSet<>();

        System.out.println("Add 10  : " + numbers.add(10));
        System.out.println("Add 20  : " + numbers.add(20));
        System.out.println("Add 30  : " + numbers.add(30));
        System.out.println("Add 20  : " + numbers.add(20));
        System.out.println("Add 40  : " + numbers.add(40));
        System.out.println("Add 10  : " + numbers.add(10));
        System.out.println("Add 50  : " + numbers.add(50));

        System.out.println("Set     : " + numbers);
        System.out.println("Size    : " + numbers.size());

        System.out.println("Contains 30 : " + numbers.contains(30));
        System.out.println("Contains 99 : " + numbers.contains(99));

        System.out.println("Remove 40   : " + numbers.remove(40));
        System.out.println("Remove 99   : " + numbers.remove(99));

        System.out.println("Final Set   : " + numbers);


        /*
         * ============================================================
         * PART 2 — DUPLICATE DETECTION
         * ============================================================
         */

        System.out.println("\n========== PART 2: DUPLICATE DETECTION ==========");

        int[] values = {
                10, 20, 30, 20, 40, 10,
                50, 30, 60, 20, 70, 40
        };

        Set<Integer> seen = new HashSet<>();

        System.out.println("Duplicate occurrences:");

        for (int value : values) {

            boolean added = seen.add(value);

            if (!added) {
                System.out.println(value + " is a duplicate");
            }
        }


        /*
         * ============================================================
         * PART 3 — UNIQUE DUPLICATE VALUES
         * ============================================================
         */

        System.out.println("\n========== PART 3: UNIQUE DUPLICATES ==========");

        Set<Integer> seenValues = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int value : values) {

            if (!seenValues.add(value)) {
                duplicates.add(value);
            }
        }

        System.out.println("Unique duplicate values: " + duplicates);


        /*
         * ============================================================
         * PART 4 — CUSTOM OBJECTS
         * ============================================================
         */

        System.out.println("\n========== PART 4: CUSTOM OBJECTS ==========");

        Set<Student> students = new HashSet<>();

        Student s1 = new Student(101, "Aradhya");
        Student s2 = new Student(102, "Rahul");
        Student s3 = new Student(101, "Aman");
        Student s4 = new Student(103, "Priya");
        Student s5 = new Student(102, "Neha");
        Student s6 = new Student(104, "Rohit");

        System.out.println("Add s1 : " + students.add(s1));
        System.out.println("Add s2 : " + students.add(s2));
        System.out.println("Add s3 : " + students.add(s3));
        System.out.println("Add s4 : " + students.add(s4));
        System.out.println("Add s5 : " + students.add(s5));
        System.out.println("Add s6 : " + students.add(s6));

        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Student Set size: " + students.size());


        /*
         * ============================================================
         * PART 5 — LOGICAL EQUALITY
         * ============================================================
         */

        System.out.println("\n========== PART 5: LOGICAL EQUALITY ==========");

        Student searchStudent =
                new Student(101, "Someone");

        Student missingStudent =
                new Student(999, "Someone");

        System.out.println(
                "Contains Student ID 101 : "
                        + students.contains(searchStudent)
        );

        System.out.println(
                "Contains Student ID 999 : "
                        + students.contains(missingStudent)
        );


        /*
         * ============================================================
         * PART 6 — FORCED HASH COLLISION
         * ============================================================
         */

        System.out.println("\n========== PART 6: HASH COLLISION ==========");

        Set<CollisionStudent> collisionSet = new HashSet<>();

        CollisionStudent c1 =
                new CollisionStudent(101);

        CollisionStudent c2 =
                new CollisionStudent(102);

        CollisionStudent c3 =
                new CollisionStudent(103);

        CollisionStudent c4 =
                new CollisionStudent(101);

        CollisionStudent c5 =
                new CollisionStudent(102);

        CollisionStudent c6 =
                new CollisionStudent(104);

        System.out.println("Add 101 : " + collisionSet.add(c1));
        System.out.println("Add 102 : " + collisionSet.add(c2));
        System.out.println("Add 103 : " + collisionSet.add(c3));
        System.out.println("Add 101 : " + collisionSet.add(c4));
        System.out.println("Add 102 : " + collisionSet.add(c5));
        System.out.println("Add 104 : " + collisionSet.add(c6));

        System.out.println("Collision Set size: "
                + collisionSet.size());


        /*
         * ============================================================
         * PART 7 — MUTABLE OBJECT TRAP
         * ============================================================
         */

        System.out.println("\n========== PART 7: MUTABLE OBJECT TRAP ==========");

        Set<MutableStudent> mutableStudents = new HashSet<>();

        MutableStudent mutableStudent =
                new MutableStudent(101);

        mutableStudents.add(mutableStudent);

        System.out.println(
                "Before mutation:"
        );

        System.out.println(
                "Contains student: "
                        + mutableStudents.contains(mutableStudent)
        );

        System.out.println(
                "Set size: "
                        + mutableStudents.size()
        );

        /*
         * ID participates in equals() and hashCode().
         * Changing it while the object is inside the HashSet
         * can make hash-based lookup fail.
         */

        mutableStudent.setId(999);

        System.out.println(
                "\nAfter mutation:"
        );

        System.out.println(
                "Contains student: "
                        + mutableStudents.contains(mutableStudent)
        );

        System.out.println(
                "Set size: "
                        + mutableStudents.size()
        );


        /*
         * ============================================================
         * PART 8 — COMPLEXITY REFERENCE
         * ============================================================
         */

        System.out.println("\n========== PART 8: COMPLEXITY ==========");

        System.out.println("add()      -> O(1) average");
        System.out.println("contains() -> O(1) average");
        System.out.println("remove()   -> O(1) average");
        System.out.println("size()     -> O(1)");
        System.out.println("iteration  -> O(n)");


        /*
         * ============================================================
         * PART 9 — INTERVIEW KNOWLEDGE
         * ============================================================
         */

        System.out.println("\n========== PART 9: KEY RULES ==========");

        System.out.println(
                "1. HashSet stores unique elements."
        );

        System.out.println(
                "2. HashSet does not guarantee insertion order."
        );

        System.out.println(
                "3. HashSet does not guarantee sorted order."
        );

        System.out.println(
                "4. hashCode() helps locate the candidate area."
        );

        System.out.println(
                "5. equals() determines logical equality."
        );

        System.out.println(
                "6. Same hashCode() does not mean equal objects."
        );

        System.out.println(
                "7. Different objects can have the same hashCode()."
        );

        System.out.println(
                "8. Fields used by equals()/hashCode() should not "
                        + "be mutated while inside a HashSet."
        );

        System.out.println(
                "9. Immutable identity fields are safer."
        );

        System.out.println(
                "10. HashSet operations are O(1) on average."
        );
    }
}


/*
 * ================================================================
 * STUDENT
 * ================================================================
 *
 * Student identity is based only on id.
 *
 * id is final because it participates in equals() and hashCode().
 */

class Student {

    private final int id;
    private String name;

    Student(int id, String name) {

        if (id <= 0) {
            throw new IllegalArgumentException(
                    "Invalid id."
            );
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Invalid name."
            );
        }

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

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

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + ", name='" + name + "'}";
    }
}


/*
 * ================================================================
 * COLLISION STUDENT
 * ================================================================
 *
 * hashCode() intentionally returns the same value
 * for every object to demonstrate a hash collision.
 */

class CollisionStudent {

    private final int id;

    CollisionStudent(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CollisionStudent)) {
            return false;
        }

        CollisionStudent other =
                (CollisionStudent) obj;

        return this.id == other.id;
    }

    @Override
    public int hashCode() {

        // Intentionally creates collisions.
        return 1;
    }

    @Override
    public String toString() {
        return "CollisionStudent{id=" + id + "}";
    }
}


/*
 * ================================================================
 * MUTABLE STUDENT
 * ================================================================
 *
 * This class intentionally demonstrates the danger of
 * mutating a field used by equals() and hashCode()
 * while the object is inside a HashSet.
 */

class MutableStudent {

    private int id;

    MutableStudent(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MutableStudent)) {
            return false;
        }

        MutableStudent other =
                (MutableStudent) obj;

        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "MutableStudent{id=" + id + "}";
    }
}
