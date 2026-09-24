import java.util.ArrayList;
/*
 * Program Name : ArrayListPractice
 * Topic        : ArrayList
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates common ArrayList operations including adding,
 * accessing, updating, removing, searching, checking size,
 * and ensuring internal capacity.
 *
 * Key Concepts:
 * - ArrayList
 * - add()
 * - get()
 * - set()
 * - remove()
 * - contains()
 * - size()
 * - ensureCapacity()
 */
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        // Ensures internal capacity without changing the list size.
        marks.ensureCapacity(20);
        // Add marks
        marks.add(85);
        marks.add(72);
        marks.add(91);
        marks.add(64);
        marks.add(78);
        System.out.println("Marks : " + marks);
        System.out.println("Size  : " + marks.size());
        // Access element by index
        System.out.println("Mark at index 2 : " + marks.get(2));
        // Update element at index 3
        marks.set(3, 70);
        // Remove element at index 1
        marks.remove(1); // removes the value 72, not the index
        // Search for an element
        System.out.println("Contains 91 : " + marks.contains(91));
        System.out.println("Final List : " + marks);
        System.out.println("Final Size : " + marks.size());
    }
}

Expected output

Marks : [85, 72, 91, 64, 78]
Size  : 5
Mark at index 2 : 91
Contains 91 : true
Final List : [85, 91, 70, 78]
Final Size : 4
