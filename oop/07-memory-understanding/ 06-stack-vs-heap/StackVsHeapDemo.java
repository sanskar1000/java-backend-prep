package memory.stackvsheap;

class Student {

    String name;
}

public class StackVsHeapDemo {

    public static void main(String[] args) {

        int age = 20;                  // Stored in Stack

        Student student = new Student(); // Reference in Stack, Object in Heap

        student.name = "Aradhya";

        System.out.println("Age : " + age);
        System.out.println("Student Name : " + student.name);
    }
}
